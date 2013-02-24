
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurements of precipitation.
 * 
 * <p>Java class for PrecipitationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/1_0/1_0}PrecipitationDetail"/>
 *         &lt;element name="precipitationInformationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationInformation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "precipitationDetail",
    "precipitationInformationExtension"
})
public class PrecipitationInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected PrecipitationDetail precipitationDetail;
    protected ExtensionType precipitationInformationExtension;

    /**
     * Gets the value of the precipitationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Sets the value of the precipitationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Gets the value of the precipitationInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationInformationExtension() {
        return precipitationInformationExtension;
    }

    /**
     * Sets the value of the precipitationInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationInformationExtension(ExtensionType value) {
        this.precipitationInformationExtension = value;
    }

}
