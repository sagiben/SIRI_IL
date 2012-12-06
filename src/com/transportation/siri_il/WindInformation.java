
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurements of wind conditions.
 * 
 * <p>Java class for WindInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="wind" type="{http://datex2.eu/schema/1_0/1_0}Wind"/>
 *         &lt;element name="windInformationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindInformation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "wind",
    "windInformationExtension"
})
public class WindInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected Wind wind;
    protected ExtensionType windInformationExtension;

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Gets the value of the windInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindInformationExtension() {
        return windInformationExtension;
    }

    /**
     * Sets the value of the windInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindInformationExtension(ExtensionType value) {
        this.windInformationExtension = value;
    }

}
