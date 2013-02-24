
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is framed between two other points on the same road.
 * 
 * <p>Java class for TPEGFramedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGFramedPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPointLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegLocationType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01FramedPointLocationSubtypeEnum"/>
 *         &lt;element name="framedPoint" type="{http://datex2.eu/schema/1_0/1_0}TPEGNonJunctionPoint"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/1_0/1_0}TPEGPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/1_0/1_0}TPEGPoint"/>
 *         &lt;element name="tpegframedPointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGFramedPoint", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegLocationType",
    "framedPoint",
    "to",
    "from",
    "tpegframedPointExtension"
})
public class TPEGFramedPoint
    extends TPEGPointLocation
{

    @XmlElement(required = true)
    protected TPEGLoc01FramedPointLocationSubtypeEnum tpegLocationType;
    @XmlElement(required = true)
    protected TPEGNonJunctionPoint framedPoint;
    @XmlElement(required = true)
    protected TPEGPoint to;
    @XmlElement(required = true)
    protected TPEGPoint from;
    protected ExtensionType tpegframedPointExtension;

    /**
     * Gets the value of the tpegLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01FramedPointLocationSubtypeEnum getTpegLocationType() {
        return tpegLocationType;
    }

    /**
     * Sets the value of the tpegLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegLocationType(TPEGLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegLocationType = value;
    }

    /**
     * Gets the value of the framedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGNonJunctionPoint }
     *     
     */
    public TPEGNonJunctionPoint getFramedPoint() {
        return framedPoint;
    }

    /**
     * Sets the value of the framedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGNonJunctionPoint }
     *     
     */
    public void setFramedPoint(TPEGNonJunctionPoint value) {
        this.framedPoint = value;
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
     * Gets the value of the tpegframedPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegframedPointExtension() {
        return tpegframedPointExtension;
    }

    /**
     * Sets the value of the tpegframedPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegframedPointExtension(ExtensionType value) {
        this.tpegframedPointExtension = value;
    }

}
