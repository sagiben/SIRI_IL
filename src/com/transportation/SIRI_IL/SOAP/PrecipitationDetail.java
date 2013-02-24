
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of precipitation (rain, snow etc.).
 * 
 * <p>Java class for PrecipitationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecipitationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depositionDepth" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="precipitationIntensity" type="{http://datex2.eu/schema/1_0/1_0}IntensityMillimetresPerHour" minOccurs="0"/>
 *         &lt;element name="precipitationType" type="{http://datex2.eu/schema/1_0/1_0}PrecipitationTypeEnum" minOccurs="0"/>
 *         &lt;element name="precipitationDetailExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationDetail", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "depositionDepth",
    "precipitationIntensity",
    "precipitationType",
    "precipitationDetailExtension"
})
public class PrecipitationDetail {

    protected Float depositionDepth;
    protected Float precipitationIntensity;
    protected PrecipitationTypeEnum precipitationType;
    protected ExtensionType precipitationDetailExtension;

    /**
     * Gets the value of the depositionDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepositionDepth() {
        return depositionDepth;
    }

    /**
     * Sets the value of the depositionDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepositionDepth(Float value) {
        this.depositionDepth = value;
    }

    /**
     * Gets the value of the precipitationIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    /**
     * Sets the value of the precipitationIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrecipitationIntensity(Float value) {
        this.precipitationIntensity = value;
    }

    /**
     * Gets the value of the precipitationType property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationType() {
        return precipitationType;
    }

    /**
     * Sets the value of the precipitationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationType(PrecipitationTypeEnum value) {
        this.precipitationType = value;
    }

    /**
     * Gets the value of the precipitationDetailExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrecipitationDetailExtension() {
        return precipitationDetailExtension;
    }

    /**
     * Sets the value of the precipitationDetailExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrecipitationDetailExtension(ExtensionType value) {
        this.precipitationDetailExtension = value;
    }

}
