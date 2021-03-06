
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of atmospheric temperature.
 * 
 * <p>Java class for Temperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Temperature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="dewPointTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="maximumTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="minimumTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="temperatureExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "airTemperature",
    "dewPointTemperature",
    "maximumTemperature",
    "minimumTemperature",
    "temperatureExtension"
})
public class Temperature {

    protected Float airTemperature;
    protected Float dewPointTemperature;
    protected Float maximumTemperature;
    protected Float minimumTemperature;
    protected ExtensionType temperatureExtension;

    /**
     * Gets the value of the airTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAirTemperature() {
        return airTemperature;
    }

    /**
     * Sets the value of the airTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAirTemperature(Float value) {
        this.airTemperature = value;
    }

    /**
     * Gets the value of the dewPointTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Sets the value of the dewPointTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewPointTemperature(Float value) {
        this.dewPointTemperature = value;
    }

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumTemperature(Float value) {
        this.maximumTemperature = value;
    }

    /**
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumTemperature(Float value) {
        this.minimumTemperature = value;
    }

    /**
     * Gets the value of the temperatureExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureExtension() {
        return temperatureExtension;
    }

    /**
     * Sets the value of the temperatureExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureExtension(ExtensionType value) {
        this.temperatureExtension = value;
    }

}
