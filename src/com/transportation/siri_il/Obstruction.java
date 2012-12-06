
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Any stationary or moving obstacle of a physical nature (e.g. obstacles or vehicles from an earlier accident, shed loads on carriageway, rock fall, abnormal or dangerous loads, or animals etc.) which could disrupt or endanger traffic.
 * 
 * <p>Java class for Obstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Obstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="numberOfObstructions" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="mobilityOfObstruction" type="{http://datex2.eu/schema/1_0/1_0}Mobility" minOccurs="0"/>
 *         &lt;element name="obstructionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obstruction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "numberOfObstructions",
    "mobilityOfObstruction",
    "obstructionExtension"
})
@XmlSeeAlso({
    GeneralObstruction.class,
    VehicleObstruction.class,
    EquipmentDamageObstruction.class,
    AnimalPresenceObstruction.class,
    EnvironmentalObstruction.class
})
public abstract class Obstruction
    extends TrafficElement
{

    protected BigInteger numberOfObstructions;
    protected Mobility mobilityOfObstruction;
    protected ExtensionType obstructionExtension;

    /**
     * Gets the value of the numberOfObstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfObstructions() {
        return numberOfObstructions;
    }

    /**
     * Sets the value of the numberOfObstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfObstructions(BigInteger value) {
        this.numberOfObstructions = value;
    }

    /**
     * Gets the value of the mobilityOfObstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfObstruction() {
        return mobilityOfObstruction;
    }

    /**
     * Sets the value of the mobilityOfObstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfObstruction(Mobility value) {
        this.mobilityOfObstruction = value;
    }

    /**
     * Gets the value of the obstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getObstructionExtension() {
        return obstructionExtension;
    }

    /**
     * Sets the value of the obstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setObstructionExtension(ExtensionType value) {
        this.obstructionExtension = value;
    }

}
