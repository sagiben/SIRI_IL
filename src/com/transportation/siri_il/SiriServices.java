package com.transportation.siri_il;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-06T09:58:00.293+02:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "SiriServices", 
                  wsdlLocation = "/tmp/SIRI_IL/SIRI-ISRAEL/SIRI/siri_wsProducer-Israel.wsdl",
                  targetNamespace = "http://new.webservice.namespace") 
public class SiriServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://new.webservice.namespace", "SiriServices");
    public final static QName SiriWSPort = new QName("http://new.webservice.namespace", "SiriWSPort");
    static {
        URL url = SiriServices.class.getResource("file:///tmp/SIRI_IL/SIRI-ISRAEL/SIRI/siri_wsProducer-Israel.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SiriServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/tmp/SIRI_IL/SIRI-ISRAEL/SIRI/siri_wsProducer-Israel.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public SiriServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SiriServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SiriServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiriServices(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiriServices(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SiriServices(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns SOAPPort
     */
    @WebEndpoint(name = "SiriWSPort")
    public SOAPPort getSiriWSPort() {
        return super.getPort(SiriWSPort, SOAPPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOAPPort
     */
    @WebEndpoint(name = "SiriWSPort")
    public SOAPPort getSiriWSPort(WebServiceFeature... features) {
        return super.getPort(SiriWSPort, SOAPPort.class, features);
    }

}