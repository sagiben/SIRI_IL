
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Elements  for Abstract equipment type
 * 
 * <p>Java class for AbstractEquipmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}DataManagedObjectStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEquipmentStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "equipmentId",
    "equipmentName",
    "typeOfEquipment"
})
@XmlSeeAlso({
    InstalledEquipmentStructure.class
})
public abstract class AbstractEquipmentStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "EquipmentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String equipmentId;
    @XmlElement(name = "EquipmentName")
    protected NaturalLanguageStringStructure equipmentName;
    @XmlElement(name = "TypeOfEquipment")
    protected EquipmentTypeRefStructure typeOfEquipment;

    /**
     * Gets the value of the equipmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Sets the value of the equipmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Gets the value of the equipmentName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEquipmentName() {
        return equipmentName;
    }

    /**
     * Sets the value of the equipmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEquipmentName(NaturalLanguageStringStructure value) {
        this.equipmentName = value;
    }

    /**
     * Gets the value of the typeOfEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Sets the value of the typeOfEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setTypeOfEquipment(EquipmentTypeRefStructure value) {
        this.typeOfEquipment = value;
    }

}
