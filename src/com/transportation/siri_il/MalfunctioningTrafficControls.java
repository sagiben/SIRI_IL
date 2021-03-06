
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Malfunctioning or failed traffic control equipments.
 * 
 * <p>Java class for MalfunctioningTrafficControls complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MalfunctioningTrafficControls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="malfunctioningTrafficControlEquipmentType" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlEquipmentTypeEnum" minOccurs="0"/>
 *         &lt;element name="numberOfMalfunctioningTrafficControlEquipments" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="malfunctioningTrafficControlsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MalfunctioningTrafficControls", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "malfunctioningTrafficControlEquipmentType",
    "numberOfMalfunctioningTrafficControlEquipments",
    "malfunctioningTrafficControlsExtension"
})
public class MalfunctioningTrafficControls {

    protected TrafficControlEquipmentTypeEnum malfunctioningTrafficControlEquipmentType;
    protected BigInteger numberOfMalfunctioningTrafficControlEquipments;
    protected ExtensionType malfunctioningTrafficControlsExtension;

    /**
     * Gets the value of the malfunctioningTrafficControlEquipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlEquipmentTypeEnum }
     *     
     */
    public TrafficControlEquipmentTypeEnum getMalfunctioningTrafficControlEquipmentType() {
        return malfunctioningTrafficControlEquipmentType;
    }

    /**
     * Sets the value of the malfunctioningTrafficControlEquipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlEquipmentTypeEnum }
     *     
     */
    public void setMalfunctioningTrafficControlEquipmentType(TrafficControlEquipmentTypeEnum value) {
        this.malfunctioningTrafficControlEquipmentType = value;
    }

    /**
     * Gets the value of the numberOfMalfunctioningTrafficControlEquipments property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMalfunctioningTrafficControlEquipments() {
        return numberOfMalfunctioningTrafficControlEquipments;
    }

    /**
     * Sets the value of the numberOfMalfunctioningTrafficControlEquipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMalfunctioningTrafficControlEquipments(BigInteger value) {
        this.numberOfMalfunctioningTrafficControlEquipments = value;
    }

    /**
     * Gets the value of the malfunctioningTrafficControlsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMalfunctioningTrafficControlsExtension() {
        return malfunctioningTrafficControlsExtension;
    }

    /**
     * Sets the value of the malfunctioningTrafficControlsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMalfunctioningTrafficControlsExtension(ExtensionType value) {
        this.malfunctioningTrafficControlsExtension = value;
    }

}
