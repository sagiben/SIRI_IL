
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A linear section along a road defined between two points on the road identified by reference points.
 * 
 * <p>Java class for ReferencePointLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePointLinear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencePointPrimaryLocation" type="{http://datex2.eu/schema/1_0/1_0}ReferencePointPrimaryLocation"/>
 *         &lt;element name="referencePointSecondaryLocation" type="{http://datex2.eu/schema/1_0/1_0}ReferencePointSecondaryLocation"/>
 *         &lt;element name="referencePointLinearExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePointLinear", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "referencePointPrimaryLocation",
    "referencePointSecondaryLocation",
    "referencePointLinearExtension"
})
public class ReferencePointLinear {

    @XmlElement(required = true)
    protected ReferencePointPrimaryLocation referencePointPrimaryLocation;
    @XmlElement(required = true)
    protected ReferencePointSecondaryLocation referencePointSecondaryLocation;
    protected ExtensionType referencePointLinearExtension;

    /**
     * Gets the value of the referencePointPrimaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointPrimaryLocation }
     *     
     */
    public ReferencePointPrimaryLocation getReferencePointPrimaryLocation() {
        return referencePointPrimaryLocation;
    }

    /**
     * Sets the value of the referencePointPrimaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointPrimaryLocation }
     *     
     */
    public void setReferencePointPrimaryLocation(ReferencePointPrimaryLocation value) {
        this.referencePointPrimaryLocation = value;
    }

    /**
     * Gets the value of the referencePointSecondaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointSecondaryLocation }
     *     
     */
    public ReferencePointSecondaryLocation getReferencePointSecondaryLocation() {
        return referencePointSecondaryLocation;
    }

    /**
     * Sets the value of the referencePointSecondaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointSecondaryLocation }
     *     
     */
    public void setReferencePointSecondaryLocation(ReferencePointSecondaryLocation value) {
        this.referencePointSecondaryLocation = value;
    }

    /**
     * Gets the value of the referencePointLinearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferencePointLinearExtension() {
        return referencePointLinearExtension;
    }

    /**
     * Sets the value of the referencePointLinearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferencePointLinearExtension(ExtensionType value) {
        this.referencePointLinearExtension = value;
    }

}
