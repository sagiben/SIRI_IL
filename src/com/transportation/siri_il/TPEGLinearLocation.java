
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A linear section along a road defined between two points on the road by a TPEG-Loc structure.
 * 
 * <p>Java class for TPEGLinearLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGLinearLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegLocationType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01LinearLocationSubtypeEnum"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/1_0/1_0}TPEGPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/1_0/1_0}TPEGPoint"/>
 *         &lt;element name="tpeglinearLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGLinearLocation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDirection",
    "tpegLocationType",
    "to",
    "from",
    "tpeglinearLocationExtension"
})
public class TPEGLinearLocation {

    @XmlElement(required = true)
    protected TPEGLoc02DirectionTypeEnum tpegDirection;
    @XmlElement(required = true)
    protected TPEGLoc01LinearLocationSubtypeEnum tpegLocationType;
    @XmlElement(required = true)
    protected TPEGPoint to;
    @XmlElement(required = true)
    protected TPEGPoint from;
    protected ExtensionType tpeglinearLocationExtension;

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
     * Gets the value of the tpegLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01LinearLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01LinearLocationSubtypeEnum getTpegLocationType() {
        return tpegLocationType;
    }

    /**
     * Sets the value of the tpegLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01LinearLocationSubtypeEnum }
     *     
     */
    public void setTpegLocationType(TPEGLoc01LinearLocationSubtypeEnum value) {
        this.tpegLocationType = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGPoint }
     *     
     */
    public TPEGPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGPoint }
     *     
     */
    public void setTo(TPEGPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGPoint }
     *     
     */
    public TPEGPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGPoint }
     *     
     */
    public void setFrom(TPEGPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the tpeglinearLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpeglinearLocationExtension() {
        return tpeglinearLocationExtension;
    }

    /**
     * Sets the value of the tpeglinearLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpeglinearLocationExtension(ExtensionType value) {
        this.tpeglinearLocationExtension = value;
    }

}
