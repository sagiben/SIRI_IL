
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations alphabetically ordered between E and H.
 * 
 * <p>Java class for EtoH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EtoH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environmentalObstructionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}EnvironmentalObstructionTypeEnum"/>
 *         &lt;element name="effectOnRoadLayoutEnum" type="{http://datex2.eu/schema/1_0/1_0}EffectOnRoadLayoutEnum"/>
 *         &lt;element name="etoHExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="fuelTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}FuelTypeEnum"/>
 *         &lt;element name="equipmentDamageTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}EquipmentDamageTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EtoH", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "environmentalObstructionTypeEnum",
    "effectOnRoadLayoutEnum",
    "etoHExtension",
    "fuelTypeEnum",
    "equipmentDamageTypeEnum"
})
public abstract class EtoH {

    @XmlElement(required = true)
    protected EnvironmentalObstructionTypeEnum environmentalObstructionTypeEnum;
    @XmlElement(required = true)
    protected EffectOnRoadLayoutEnum effectOnRoadLayoutEnum;
    protected ExtensionType etoHExtension;
    @XmlElement(required = true)
    protected FuelTypeEnum fuelTypeEnum;
    @XmlElement(required = true)
    protected EquipmentDamageTypeEnum equipmentDamageTypeEnum;

    /**
     * Gets the value of the environmentalObstructionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionTypeEnum() {
        return environmentalObstructionTypeEnum;
    }

    /**
     * Sets the value of the environmentalObstructionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionTypeEnum(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionTypeEnum = value;
    }

    /**
     * Gets the value of the effectOnRoadLayoutEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EffectOnRoadLayoutEnum }
     *     
     */
    public EffectOnRoadLayoutEnum getEffectOnRoadLayoutEnum() {
        return effectOnRoadLayoutEnum;
    }

    /**
     * Sets the value of the effectOnRoadLayoutEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectOnRoadLayoutEnum }
     *     
     */
    public void setEffectOnRoadLayoutEnum(EffectOnRoadLayoutEnum value) {
        this.effectOnRoadLayoutEnum = value;
    }

    /**
     * Gets the value of the etoHExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEtoHExtension() {
        return etoHExtension;
    }

    /**
     * Sets the value of the etoHExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEtoHExtension(ExtensionType value) {
        this.etoHExtension = value;
    }

    /**
     * Gets the value of the fuelTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnum }
     *     
     */
    public FuelTypeEnum getFuelTypeEnum() {
        return fuelTypeEnum;
    }

    /**
     * Sets the value of the fuelTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnum }
     *     
     */
    public void setFuelTypeEnum(FuelTypeEnum value) {
        this.fuelTypeEnum = value;
    }

    /**
     * Gets the value of the equipmentDamageTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentDamageTypeEnum }
     *     
     */
    public EquipmentDamageTypeEnum getEquipmentDamageTypeEnum() {
        return equipmentDamageTypeEnum;
    }

    /**
     * Sets the value of the equipmentDamageTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentDamageTypeEnum }
     *     
     */
    public void setEquipmentDamageTypeEnum(EquipmentDamageTypeEnum value) {
        this.equipmentDamageTypeEnum = value;
    }

}
