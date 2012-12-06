
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A pair of coordinates defining the geodetic position of a single point using the European Terrestrial Reference System 1989 (ETRS89).
 * 
 * <p>Java class for PointCoordinates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointCoordinates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://datex2.eu/schema/1_0/1_0}Float"/>
 *         &lt;element name="longitude" type="{http://datex2.eu/schema/1_0/1_0}Float"/>
 *         &lt;element name="pointCoordinatesExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "latitude",
    "longitude",
    "pointCoordinatesExtension"
})
public class PointCoordinates {

    protected float latitude;
    protected float longitude;
    protected ExtensionType pointCoordinatesExtension;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the pointCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointCoordinatesExtension() {
        return pointCoordinatesExtension;
    }

    /**
     * Sets the value of the pointCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointCoordinatesExtension(ExtensionType value) {
        this.pointCoordinatesExtension = value;
    }

}
