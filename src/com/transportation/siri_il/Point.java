
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A single geospatial point.
 * 
 * <p>Java class for Point complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Point">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegpointLocation" type="{http://datex2.eu/schema/1_0/1_0}TPEGPointLocation" minOccurs="0"/>
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/1_0/1_0}AlertCPoint" minOccurs="0"/>
 *         &lt;element name="referencePoint" type="{http://datex2.eu/schema/1_0/1_0}ReferencePoint" minOccurs="0"/>
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/1_0/1_0}PointByCoordinates" minOccurs="0"/>
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegpointLocation",
    "alertCPoint",
    "referencePoint",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation
{

    protected TPEGPointLocation tpegpointLocation;
    protected AlertCPoint alertCPoint;
    protected ReferencePoint referencePoint;
    protected PointByCoordinates pointByCoordinates;
    protected ExtensionType pointExtension;

    /**
     * Gets the value of the tpegpointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGPointLocation }
     *     
     */
    public TPEGPointLocation getTpegpointLocation() {
        return tpegpointLocation;
    }

    /**
     * Sets the value of the tpegpointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGPointLocation }
     *     
     */
    public void setTpegpointLocation(TPEGPointLocation value) {
        this.tpegpointLocation = value;
    }

    /**
     * Gets the value of the alertCPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCPoint }
     *     
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Sets the value of the alertCPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCPoint }
     *     
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

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
     * Gets the value of the pointByCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Sets the value of the pointByCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Gets the value of the pointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Sets the value of the pointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointExtension(ExtensionType value) {
        this.pointExtension = value;
    }

}
