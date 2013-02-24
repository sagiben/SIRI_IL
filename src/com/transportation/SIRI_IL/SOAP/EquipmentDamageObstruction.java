
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road resulting from the failure of equipment on, under, above or close to the road.
 * 
 * <p>Java class for EquipmentDamageObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDamageObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="equipmentDamageType" type="{http://datex2.eu/schema/1_0/1_0}EquipmentDamageTypeEnum"/>
 *         &lt;element name="equipmentDamageObstructionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDamageObstruction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "equipmentDamageType",
    "equipmentDamageObstructionExtension"
})
public class EquipmentDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    protected EquipmentDamageTypeEnum equipmentDamageType;
    protected ExtensionType equipmentDamageObstructionExtension;

    /**
     * Gets the value of the equipmentDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentDamageTypeEnum }
     *     
     */
    public EquipmentDamageTypeEnum getEquipmentDamageType() {
        return equipmentDamageType;
    }

    /**
     * Sets the value of the equipmentDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentDamageTypeEnum }
     *     
     */
    public void setEquipmentDamageType(EquipmentDamageTypeEnum value) {
        this.equipmentDamageType = value;
    }

    /**
     * Gets the value of the equipmentDamageObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEquipmentDamageObstructionExtension() {
        return equipmentDamageObstructionExtension;
    }

    /**
     * Sets the value of the equipmentDamageObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEquipmentDamageObstructionExtension(ExtensionType value) {
        this.equipmentDamageObstructionExtension = value;
    }

}
