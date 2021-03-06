
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for stop timetable deliveries. Used in WSDL.
 * 
 * <p>Java class for StopTimetableDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableDelivery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimetableDeliveriesStructure", propOrder = {
    "stopTimetableDelivery"
})
public class StopTimetableDeliveriesStructure {

    @XmlElement(name = "StopTimetableDelivery", required = true)
    protected StopTimetableDeliveryStructure stopTimetableDelivery;

    /**
     * Gets the value of the stopTimetableDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public StopTimetableDeliveryStructure getStopTimetableDelivery() {
        return stopTimetableDelivery;
    }

    /**
     * Sets the value of the stopTimetableDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public void setStopTimetableDelivery(StopTimetableDeliveryStructure value) {
        this.stopTimetableDelivery = value;
    }

}
