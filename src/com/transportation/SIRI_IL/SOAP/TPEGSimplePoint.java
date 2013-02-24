
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is not bounded by any other points on the road network.
 * 
 * <p>Java class for TPEGSimplePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGSimplePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPointLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegLocationType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01SimplePointLocationSubtypeEnum"/>
 *         &lt;element name="point" type="{http://datex2.eu/schema/1_0/1_0}TPEGPoint"/>
 *         &lt;element name="tpegsimplePointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGSimplePoint", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegLocationType",
    "point",
    "tpegsimplePointExtension"
})
public class TPEGSimplePoint
    extends TPEGPointLocation
{

    @XmlElement(required = true)
    protected TPEGLoc01SimplePointLocationSubtypeEnum tpegLocationType;
    @XmlElement(required = true)
    protected TPEGPoint point;
    protected ExtensionType tpegsimplePointExtension;

    /**
     * Gets the value of the tpegLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01SimplePointLocationSubtypeEnum getTpegLocationType() {
        return tpegLocationType;
    }

    /**
     * Sets the value of the tpegLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegLocationType(TPEGLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegLocationType = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGPoint }
     *     
     */
    public TPEGPoint getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGPoint }
     *     
     */
    public void setPoint(TPEGPoint value) {
        this.point = value;
    }

    /**
     * Gets the value of the tpegsimplePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegsimplePointExtension() {
        return tpegsimplePointExtension;
    }

    /**
     * Sets the value of the tpegsimplePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegsimplePointExtension(ExtensionType value) {
        this.tpegsimplePointExtension = value;
    }

}
