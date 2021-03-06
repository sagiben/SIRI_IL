
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road resulting from the presence of animals.
 * 
 * <p>Java class for AnimalPresenceObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalPresenceObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="alive" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="animalPresenceType" type="{http://datex2.eu/schema/1_0/1_0}AnimalPresenceTypeEnum"/>
 *         &lt;element name="animalPresenceObstructionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalPresenceObstruction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "alive",
    "animalPresenceType",
    "animalPresenceObstructionExtension"
})
public class AnimalPresenceObstruction
    extends Obstruction
{

    protected Boolean alive;
    @XmlElement(required = true)
    protected AnimalPresenceTypeEnum animalPresenceType;
    protected ExtensionType animalPresenceObstructionExtension;

    /**
     * Gets the value of the alive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlive() {
        return alive;
    }

    /**
     * Sets the value of the alive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlive(Boolean value) {
        this.alive = value;
    }

    /**
     * Gets the value of the animalPresenceType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Sets the value of the animalPresenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    /**
     * Gets the value of the animalPresenceObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAnimalPresenceObstructionExtension() {
        return animalPresenceObstructionExtension;
    }

    /**
     * Sets the value of the animalPresenceObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAnimalPresenceObstructionExtension(ExtensionType value) {
        this.animalPresenceObstructionExtension = value;
    }

}
