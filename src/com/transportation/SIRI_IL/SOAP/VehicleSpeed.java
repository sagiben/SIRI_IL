
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurement of individual vehicle speed.
 * 
 * <p>Java class for VehicleSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleSpeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="individualVehicleSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour"/>
 *         &lt;element name="vehicleSpeedExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSpeed", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "individualVehicleSpeed",
    "vehicleSpeedExtension"
})
public class VehicleSpeed {

    protected float individualVehicleSpeed;
    protected ExtensionType vehicleSpeedExtension;

    /**
     * Gets the value of the individualVehicleSpeed property.
     * 
     */
    public float getIndividualVehicleSpeed() {
        return individualVehicleSpeed;
    }

    /**
     * Sets the value of the individualVehicleSpeed property.
     * 
     */
    public void setIndividualVehicleSpeed(float value) {
        this.individualVehicleSpeed = value;
    }

    /**
     * Gets the value of the vehicleSpeedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleSpeedExtension() {
        return vehicleSpeedExtension;
    }

    /**
     * Sets the value of the vehicleSpeedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleSpeedExtension(ExtensionType value) {
        this.vehicleSpeedExtension = value;
    }

}