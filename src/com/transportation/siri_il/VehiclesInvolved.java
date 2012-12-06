
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Overview of the vehicles involved.
 * 
 * <p>Java class for VehiclesInvolved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehiclesInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfVehicles" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/1_0/1_0}VehicleStatusEnum" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/1_0/1_0}VehicleTypeEnum" minOccurs="0"/>
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/1_0/1_0}VehicleUsageEnum" minOccurs="0"/>
 *         &lt;element name="vehiclesInvolvedExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclesInvolved", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "numberOfVehicles",
    "vehicleStatus",
    "vehicleType",
    "vehicleUsage",
    "vehiclesInvolvedExtension"
})
public class VehiclesInvolved {

    protected BigInteger numberOfVehicles;
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleTypeEnum vehicleType;
    protected VehicleUsageEnum vehicleUsage;
    protected ExtensionType vehiclesInvolvedExtension;

    /**
     * Gets the value of the numberOfVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Sets the value of the numberOfVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicles(BigInteger value) {
        this.numberOfVehicles = value;
    }

    /**
     * Gets the value of the vehicleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Sets the value of the vehicleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public VehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public void setVehicleType(VehicleTypeEnum value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Sets the value of the vehicleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    /**
     * Gets the value of the vehiclesInvolvedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehiclesInvolvedExtension() {
        return vehiclesInvolvedExtension;
    }

    /**
     * Sets the value of the vehiclesInvolvedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehiclesInvolvedExtension(ExtensionType value) {
        this.vehiclesInvolvedExtension = value;
    }

}
