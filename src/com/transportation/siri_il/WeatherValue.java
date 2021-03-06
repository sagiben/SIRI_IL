
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Measured or derived values relating to the weather at a specific location.
 * 
 * <p>Java class for WeatherValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="weatherValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "weatherValueExtension"
})
@XmlSeeAlso({
    PrecipitationInformation.class,
    PollutionInformation.class,
    RoadSurfaceConditionInformation.class,
    VisibilityInformation.class,
    WindInformation.class,
    TemperatureInformation.class
})
public abstract class WeatherValue
    extends BasicDataValue
{

    protected ExtensionType weatherValueExtension;

    /**
     * Gets the value of the weatherValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherValueExtension() {
        return weatherValueExtension;
    }

    /**
     * Sets the value of the weatherValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherValueExtension(ExtensionType value) {
        this.weatherValueExtension = value;
    }

}
