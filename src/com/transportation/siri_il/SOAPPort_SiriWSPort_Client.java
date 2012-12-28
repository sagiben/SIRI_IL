
package com.transportation.siri_il;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-06T09:58:00.230+02:00
 * Generated source version: 2.7.0
 * 
 */
public final class SOAPPort_SiriWSPort_Client {

    private static final QName SERVICE_NAME = new QName("http://new.webservice.namespace", "SiriServices");

    private SOAPPort_SiriWSPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SiriServices.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        SiriServices ss = new SiriServices(wsdlURL, SERVICE_NAME);
        SOAPPort port = ss.getSiriWSPort();  
        
        System.out.println("Invoking getStopMonitoringService...");
        ServiceRequestStructure request = new ServiceRequestStructure();
        
        ParticipantRefStructure requestorRef = new ParticipantRefStructure();
        requestorRef.setValue("HM391083");
        request.setRequestorRef(requestorRef);
        request.setRequestTimestamp(new XMLGregorianCalendarImpl(new GregorianCalendar()));
        MessageQualifierStructure messageId = new MessageQualifierStructure();
        messageId.setValue(new XMLGregorianCalendarImpl(new GregorianCalendar()).toString());
        request.setMessageIdentifier(messageId);
        
        StopMonitoringRequestStructure newRequest = new StopMonitoringRequestStructure();
        newRequest.setVersion("IL2.6");
        newRequest.setRequestTimestamp(new XMLGregorianCalendarImpl(new GregorianCalendar()));
        newRequest.setMessageIdentifier(messageId);
        MonitoringRefStructure monitoringRef =  new MonitoringRefStructure();
        monitoringRef.setValue(args[3]);
        newRequest.setMonitoringRef(monitoringRef);      
        OperatorRefStructure operatorRef = new OperatorRefStructure();
        operatorRef.setValue(args[1]);
		newRequest.setOperatorRef(operatorRef);
        LineRefStructure lineRef = new LineRefStructure();
        lineRef.setValue(args[2]);
        newRequest.setLineRef(lineRef);
        request.getStopMonitoringRequest().add(newRequest);      
        System.out.println("REQUEST\n-------\n" + request);
        
        ServiceDeliveryStructure response = port.getStopMonitoringService(request);   
        System.out.println("\nRESPONSE\n-------\n" + response);
        
        System.exit(0);
    }

}
