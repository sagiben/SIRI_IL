
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The point (called Secondary point) which is at the upstream end of a linear road section. The point is identified by a reference point.
 * 
 * <p>Java class for ReferencePointSecondaryLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePointSecondaryLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencePoint" type="{http://datex2.eu/schema/1_0/1_0}ReferencePoint"/>
 *         &lt;element name="referencePointSecondaryLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePointSecondaryLocation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "referencePoint",
    "referencePointSecondaryLocationExtension"
})
public class ReferencePointSecondaryLocation {

    @XmlElement(required = true)
    protected ReferencePoint referencePoint;
    protected ExtensionType referencePointSecondaryLocationExtension;

    /**
     * Gets the value of the referencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePoint }
     *     
     */
    public ReferencePoint getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePoint }
     *     
     */
    public void setReferencePoint(ReferencePoint value) {
        this.referencePoint = value;
    }

    /**
     * Gets the value of the referencePointSecondaryLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferencePointSecondaryLocationExtension() {
        return referencePointSecondaryLocationExtension;
    }

    /**
     * Sets the value of the referencePointSecondaryLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferencePointSecondaryLocationExtension(ExtensionType value) {
        this.referencePointSecondaryLocationExtension = value;
    }

}
