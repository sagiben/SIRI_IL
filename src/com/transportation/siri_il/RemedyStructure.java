
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the remedy to the change of a facility status (mainly when it becomes partially or totally anavailable)
 * 
 * <p>Java class for RemedyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemedyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemedyType" type="{http://www.siri.org.uk/siri}RemedyTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemedyStructure", propOrder = {
    "remedyType",
    "description",
    "extensions"
})
public class RemedyStructure {

    @XmlElement(name = "RemedyType")
    protected RemedyTypeEnumeration remedyType;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the remedyType property.
     * 
     * @return
     *     possible object is
     *     {@link RemedyTypeEnumeration }
     *     
     */
    public RemedyTypeEnumeration getRemedyType() {
        return remedyType;
    }

    /**
     * Sets the value of the remedyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyTypeEnumeration }
     *     
     */
    public void setRemedyType(RemedyTypeEnumeration value) {
        this.remedyType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
