
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Any stationary or moving obstacle of a physical nature, other than of an animal, vehicle, environmental, or damaged equipment nature.
 * 
 * <p>Java class for GeneralObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="obstructionType" type="{http://datex2.eu/schema/1_0/1_0}ObstructionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="generalObstructionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralObstruction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "obstructionType",
    "generalObstructionExtension"
})
public class GeneralObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    protected List<ObstructionTypeEnum> obstructionType;
    protected ExtensionType generalObstructionExtension;

    /**
     * Gets the value of the obstructionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstructionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObstructionTypeEnum }
     * 
     * 
     */
    public List<ObstructionTypeEnum> getObstructionType() {
        if (obstructionType == null) {
            obstructionType = new ArrayList<ObstructionTypeEnum>();
        }
        return this.obstructionType;
    }

    /**
     * Gets the value of the generalObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralObstructionExtension() {
        return generalObstructionExtension;
    }

    /**
     * Sets the value of the generalObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralObstructionExtension(ExtensionType value) {
        this.generalObstructionExtension = value;
    }

}
