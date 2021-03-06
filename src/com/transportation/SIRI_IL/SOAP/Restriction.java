
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a restriction which qualifies the operator's management action.
 * 
 * <p>Java class for Restriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restriction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipmentRequirement" type="{http://datex2.eu/schema/1_0/1_0}WinterEquipmentRequirementEnum" minOccurs="0"/>
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="restrictionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "equipmentRequirement",
    "minimumCarOccupancy",
    "sequentialRampNumber",
    "restrictionExtension"
})
public class Restriction {

    protected WinterEquipmentRequirementEnum equipmentRequirement;
    protected BigInteger minimumCarOccupancy;
    protected BigInteger sequentialRampNumber;
    protected ExtensionType restrictionExtension;

    /**
     * Gets the value of the equipmentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentRequirementEnum }
     *     
     */
    public WinterEquipmentRequirementEnum getEquipmentRequirement() {
        return equipmentRequirement;
    }

    /**
     * Sets the value of the equipmentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentRequirementEnum }
     *     
     */
    public void setEquipmentRequirement(WinterEquipmentRequirementEnum value) {
        this.equipmentRequirement = value;
    }

    /**
     * Gets the value of the minimumCarOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCarOccupancy() {
        return minimumCarOccupancy;
    }

    /**
     * Sets the value of the minimumCarOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCarOccupancy(BigInteger value) {
        this.minimumCarOccupancy = value;
    }

    /**
     * Gets the value of the sequentialRampNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialRampNumber() {
        return sequentialRampNumber;
    }

    /**
     * Sets the value of the sequentialRampNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequentialRampNumber(BigInteger value) {
        this.sequentialRampNumber = value;
    }

    /**
     * Gets the value of the restrictionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRestrictionExtension() {
        return restrictionExtension;
    }

    /**
     * Sets the value of the restrictionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRestrictionExtension(ExtensionType value) {
        this.restrictionExtension = value;
    }

}
