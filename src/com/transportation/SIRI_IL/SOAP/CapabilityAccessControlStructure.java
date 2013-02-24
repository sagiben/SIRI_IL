
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Access control capabilities.
 * 
 * <p>Java class for CapabilityAccessControlStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestChecking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityAccessControlStructure", propOrder = {
    "requestChecking"
})
@XmlSeeAlso({
    com.transportation.SIRI_IL.SOAP.VehicleMonitoringServiceCapabilitiesStructure.AccessControl.class,
    com.transportation.SIRI_IL.SOAP.FacilityMonitoringServiceCapabilitiesStructure.AccessControl.class,
    com.transportation.SIRI_IL.SOAP.StopTimetableServiceCapabilitiesStructure.AccessControl.class,
    com.transportation.SIRI_IL.SOAP.SituationExchangeServiceCapabilitiesStructure.AccessControl.class,
    ConnectionCapabilityAccessControlStructure.class,
    MonitoringCapabilityAccessControlStructure.class,
    GeneralMessageCapabilityAccessControlStructure.class
})
public class CapabilityAccessControlStructure {

    @XmlElement(name = "RequestChecking", defaultValue = "false")
    protected boolean requestChecking;

    /**
     * Gets the value of the requestChecking property.
     * 
     */
    public boolean isRequestChecking() {
        return requestChecking;
    }

    /**
     * Sets the value of the requestChecking property.
     * 
     */
    public void setRequestChecking(boolean value) {
        this.requestChecking = value;
    }

}
