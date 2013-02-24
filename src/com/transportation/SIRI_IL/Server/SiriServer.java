package com.transportation.SIRI_IL.Server;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.transportation.SIRI_IL.SOAP.MessageQualifierStructure;
import com.transportation.SIRI_IL.SOAP.ParticipantRefStructure;
import com.transportation.SIRI_IL.SOAP.SOAPPort;
import com.transportation.SIRI_IL.SOAP.ServiceDeliveryStructure;
import com.transportation.SIRI_IL.SOAP.ServiceRequestStructure;
import com.transportation.SIRI_IL.SOAP.SiriServices;
import com.transportation.SIRI_IL.SOAP.StopMonitoringRequestStructure;

/**
 * Servlet implementation class SiriServer
 */
@WebServlet("/SiriServer")
public class SiriServer extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiriServer() {
        super();
        siriSoapInit();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/plain");
	out.println("Hello World");
	out.println(m_siriServices.getWSDLDocumentLocation());
		
	out.println(request.getParameterMap());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	ServletOutputStream out = response.getOutputStream();
	ServletInputStream in = request.getInputStream();

	int len = request.getContentLength();       
	String strRequest = SiriServerUtils.InputStreamToString(in,len);    

	ObjectMapper mapper = new ObjectMapper();
	JsonNode rootNode = mapper.readTree(strRequest);
        
	ServiceRequestStructure SRRequest = createServiceRequestHeader();
	StopMonitoringRequestStructure stopMonitoring = createStopMonitoringRequest(rootNode.path("stopMonitoring"));
	if ( stopMonitoring != null ){
	    SRRequest.getStopMonitoringRequest().add(stopMonitoring);
	}
        	
	out.println("Request :");
	out.println(SRRequest.toString());
	out.println("\n\n");
	out.flush();
        
	try {
	    ServiceDeliveryStructure siriResponse = m_port.getStopMonitoringService(SRRequest);
        	
	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
	    mapper.configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, false);
	        
	    ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
	    String strResponse = writer.writeValueAsString(siriResponse);
	    out.println("Response :");
	    out.println(strResponse);
	    out.flush();
	}
	catch (Exception e) {
	    out.println(e.getMessage());
	}        
    }

    private ServiceRequestStructure createServiceRequestHeader() {
	ServiceRequestStructure request = new ServiceRequestStructure();
	ParticipantRefStructure requestorRef = new ParticipantRefStructure();
	requestorRef.setValue("HM391083");
	request.setRequestorRef(requestorRef);
	request.setRequestTimestamp(new XMLGregorianCalendarImpl(new GregorianCalendar()));
	MessageQualifierStructure messageId = new MessageQualifierStructure();
	messageId.setValue(String.valueOf(System.currentTimeMillis()));
	request.setMessageIdentifier(messageId);
	return request;
    }
	
    private StopMonitoringRequestStructure createStopMonitoringRequest(JsonNode node){
		
	if ( node == null )
	    return null;
		
	ObjectMapper mapper = new ObjectMapper();
	StopMonitoringRequestStructure SMRequest = null;
		
	try {
	    SMRequest = mapper.readValue(node.toString(), StopMonitoringRequestStructure.class);
	    SMRequest.setVersion("IL2.6");
	    SMRequest.setRequestTimestamp(new XMLGregorianCalendarImpl(new GregorianCalendar()));
	    MessageQualifierStructure messageId = new MessageQualifierStructure();
	    messageId.setValue(String.valueOf(System.currentTimeMillis()));
	    SMRequest.setMessageIdentifier(messageId);
	    //SMRequest.setPreviewInterval(DatatypeFactory.newInstance().newDuration(1000 * 60 * 60));
	} catch (Exception e) {
	    e.getMessage();
	}		
	return SMRequest;
    }
	
    private void siriSoapInit() {
	m_siriServices = new SiriServices();
	m_port = m_siriServices.getSiriWSPort();  		
    }
    private static SiriServices m_siriServices;
    private static SOAPPort m_port;
    private static final long serialVersionUID = 1L;	
}
