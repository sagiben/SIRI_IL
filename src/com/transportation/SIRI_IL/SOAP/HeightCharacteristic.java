
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Height characteristic of a vehicle.
 * 
 * <p>Java class for HeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/1_0/1_0}ComparisonOperatorEnum"/>
 *         &lt;element name="vehicleHeight" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat"/>
 *         &lt;element name="heightCharacteristicExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightCharacteristic", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "comparisonOperator",
    "vehicleHeight",
    "heightCharacteristicExtension"
})
public class HeightCharacteristic {

    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleHeight;
    protected ExtensionType heightCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the vehicleHeight property.
     * 
     */
    public float getVehicleHeight() {
        return vehicleHeight;
    }

    /**
     * Sets the value of the vehicleHeight property.
     * 
     */
    public void setVehicleHeight(float value) {
        this.vehicleHeight = value;
    }

    /**
     * Gets the value of the heightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeightCharacteristicExtension() {
        return heightCharacteristicExtension;
    }

    /**
     * Sets the value of the heightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeightCharacteristicExtension(ExtensionType value) {
        this.heightCharacteristicExtension = value;
    }

}
