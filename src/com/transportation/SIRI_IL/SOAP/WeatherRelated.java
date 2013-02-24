
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Weather related information.
 * 
 * <p>Java class for WeatherRelated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherRelated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weatherRelatedExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelated", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "weatherRelatedExtension"
})
public class WeatherRelated {

    protected ExtensionType weatherRelatedExtension;

    /**
     * Gets the value of the weatherRelatedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherRelatedExtension() {
        return weatherRelatedExtension;
    }

    /**
     * Sets the value of the weatherRelatedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherRelatedExtension(ExtensionType value) {
        this.weatherRelatedExtension = value;
    }

}
