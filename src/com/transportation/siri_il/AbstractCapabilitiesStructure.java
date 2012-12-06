
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Capabilities of StopMonitopring Service.
 * 
 * <p>Java class for AbstractCapabilitiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralInteraction" type="{http://www.siri.org.uk/siri}CapabilityGeneralInteractionStructure" minOccurs="0"/>
 *         &lt;element name="TransportDescription" type="{http://www.siri.org.uk/siri}TransportDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCapabilitiesStructure", propOrder = {
    "generalInteraction",
    "transportDescription"
})
@XmlSeeAlso({
    VehicleMonitoringServiceCapabilitiesStructure.class,
    ConnectionTimetableServiceCapabilitiesStructure.class,
    ProductionTimetableServiceCapabilitiesStructure.class,
    FacilityMonitoringServiceCapabilitiesStructure.class,
    StopTimetableServiceCapabilitiesStructure.class,
    GeneralMessageServiceCapabilitiesStructure.class,
    SituationExchangeServiceCapabilitiesStructure.class,
    StopMonitoringServiceCapabilitiesStructure.class,
    EstimatedTimetableServiceCapabilitiesStructure.class,
    ConnectionMonitoringServiceCapabilitiesStructure.class
})
public class AbstractCapabilitiesStructure {

    @XmlElement(name = "GeneralInteraction")
    protected CapabilityGeneralInteractionStructure generalInteraction;
    @XmlElement(name = "TransportDescription")
    protected TransportDescriptionStructure transportDescription;

    /**
     * Gets the value of the generalInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public CapabilityGeneralInteractionStructure getGeneralInteraction() {
        return generalInteraction;
    }

    /**
     * Sets the value of the generalInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public void setGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        this.generalInteraction = value;
    }

    /**
     * Gets the value of the transportDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public TransportDescriptionStructure getTransportDescription() {
        return transportDescription;
    }

    /**
     * Sets the value of the transportDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public void setTransportDescription(TransportDescriptionStructure value) {
        this.transportDescription = value;
    }

}
