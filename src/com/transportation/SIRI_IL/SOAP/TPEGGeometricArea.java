
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A geometric area defined by a centre point and a radius.
 * 
 * <p>Java class for TPEGGeometricArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGGeometricArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGAreaLocation">
 *       &lt;sequence>
 *         &lt;element name="radius" type="{http://datex2.eu/schema/1_0/1_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="centrePoint" type="{http://datex2.eu/schema/1_0/1_0}PointCoordinates"/>
 *         &lt;element name="name" type="{http://datex2.eu/schema/1_0/1_0}TPEGAreaDescriptor" minOccurs="0"/>
 *         &lt;element name="tpeggeometricAreaExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGGeometricArea", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "radius",
    "centrePoint",
    "name",
    "tpeggeometricAreaExtension"
})
public class TPEGGeometricArea
    extends TPEGAreaLocation
{

    @XmlElement(required = true)
    protected BigInteger radius;
    @XmlElement(required = true)
    protected PointCoordinates centrePoint;
    protected TPEGAreaDescriptor name;
    protected ExtensionType tpeggeometricAreaExtension;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadius(BigInteger value) {
        this.radius = value;
    }

    /**
     * Gets the value of the centrePoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getCentrePoint() {
        return centrePoint;
    }

    /**
     * Sets the value of the centrePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setCentrePoint(PointCoordinates value) {
        this.centrePoint = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGAreaDescriptor }
     *     
     */
    public TPEGAreaDescriptor getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGAreaDescriptor }
     *     
     */
    public void setName(TPEGAreaDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the tpeggeometricAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpeggeometricAreaExtension() {
        return tpeggeometricAreaExtension;
    }

    /**
     * Sets the value of the tpeggeometricAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpeggeometricAreaExtension(ExtensionType value) {
        this.tpeggeometricAreaExtension = value;
    }

}
