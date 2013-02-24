
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A single point on the road network defined by a TPEG-Loc structure and which has an associated direction of traffic flow.
 * 
 * <p>Java class for TPEGPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegpointLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGPointLocation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDirection",
    "tpegpointLocationExtension"
})
@XmlSeeAlso({
    TPEGFramedPoint.class,
    TPEGSimplePoint.class
})
public abstract class TPEGPointLocation {

    @XmlElement(required = true)
    protected TPEGLoc02DirectionTypeEnum tpegDirection;
    protected ExtensionType tpegpointLocationExtension;

    /**
     * Gets the value of the tpegDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc02DirectionTypeEnum }
     *     
     */
    public TPEGLoc02DirectionTypeEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Sets the value of the tpegDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc02DirectionTypeEnum }
     *     
     */
    public void setTpegDirection(TPEGLoc02DirectionTypeEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Gets the value of the tpegpointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegpointLocationExtension() {
        return tpegpointLocationExtension;
    }

    /**
     * Sets the value of the tpegpointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegpointLocationExtension(ExtensionType value) {
        this.tpegpointLocationExtension = value;
    }

}
