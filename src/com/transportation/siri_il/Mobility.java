
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicating whether an activity or a roadwork is mobile (e.g..  a march or parade) or static (e.g. a crowd, or sign-post maintenance).
 * 
 * <p>Java class for Mobility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mobility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/1_0/1_0}MobilityEnum"/>
 *         &lt;element name="mobilityExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "mobilityType",
    "mobilityExtension"
})
public class Mobility {

    @XmlElement(required = true)
    protected MobilityEnum mobilityType;
    protected ExtensionType mobilityExtension;

    /**
     * Gets the value of the mobilityType property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Sets the value of the mobilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityType(MobilityEnum value) {
        this.mobilityType = value;
    }

    /**
     * Gets the value of the mobilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMobilityExtension() {
        return mobilityExtension;
    }

    /**
     * Sets the value of the mobilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMobilityExtension(ExtensionType value) {
        this.mobilityExtension = value;
    }

}
