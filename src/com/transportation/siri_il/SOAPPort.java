package com.transportation.siri_il;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-12-06T09:58:00.283+02:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://new.webservice.namespace", name = "SOAP-Port")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SOAPPort {

    @WebResult(name = "Answer", targetNamespace = "http://new.webservice.namespace", partName = "Answer")
    @WebMethod(operationName = "GetStopMonitoringService", action = "GetStopMonitoringService")
    public ServiceDeliveryStructure getStopMonitoringService(
        @WebParam(partName = "Request", name = "Request")
        ServiceRequestStructure request
    );
}
