
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Gross weight characteristic of a vehicle.
 * 
 * <p>Java class for GrossWeightCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrossWeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/1_0/1_0}ComparisonOperatorEnum"/>
 *         &lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/1_0/1_0}Tonnes"/>
 *         &lt;element name="grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "grossWeightCharacteristicExtension"
})
public class GrossWeightCharacteristic {

    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    protected ExtensionType grossWeightCharacteristicExtension;

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
     * Gets the value of the grossVehicleWeight property.
     * 
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Sets the value of the grossVehicleWeight property.
     * 
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Gets the value of the grossWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGrossWeightCharacteristicExtension() {
        return grossWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the grossWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGrossWeightCharacteristicExtension(ExtensionType value) {
        this.grossWeightCharacteristicExtension = value;
    }

}
