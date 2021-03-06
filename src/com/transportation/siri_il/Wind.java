
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Wind conditions on the road. 
 * 
 * <p>Java class for Wind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumWindSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="windDirectionBearing" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="windDirectionCompass" type="{http://datex2.eu/schema/1_0/1_0}DirectionCompassEnum" minOccurs="0"/>
 *         &lt;element name="windMeasurementHeight" type="{http://datex2.eu/schema/1_0/1_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="windExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "maximumWindSpeed",
    "windDirectionBearing",
    "windDirectionCompass",
    "windMeasurementHeight",
    "windSpeed",
    "windExtension"
})
public class Wind {

    protected Float maximumWindSpeed;
    protected BigInteger windDirectionBearing;
    protected DirectionCompassEnum windDirectionCompass;
    protected BigInteger windMeasurementHeight;
    protected Float windSpeed;
    protected ExtensionType windExtension;

    /**
     * Gets the value of the maximumWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    /**
     * Sets the value of the maximumWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumWindSpeed(Float value) {
        this.maximumWindSpeed = value;
    }

    /**
     * Gets the value of the windDirectionBearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindDirectionBearing() {
        return windDirectionBearing;
    }

    /**
     * Sets the value of the windDirectionBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindDirectionBearing(BigInteger value) {
        this.windDirectionBearing = value;
    }

    /**
     * Gets the value of the windDirectionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * Sets the value of the windDirectionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setWindDirectionCompass(DirectionCompassEnum value) {
        this.windDirectionCompass = value;
    }

    /**
     * Gets the value of the windMeasurementHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindMeasurementHeight() {
        return windMeasurementHeight;
    }

    /**
     * Sets the value of the windMeasurementHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindMeasurementHeight(BigInteger value) {
        this.windMeasurementHeight = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWindSpeed(Float value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindExtension() {
        return windExtension;
    }

    /**
     * Sets the value of the windExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindExtension(ExtensionType value) {
        this.windExtension = value;
    }

}
