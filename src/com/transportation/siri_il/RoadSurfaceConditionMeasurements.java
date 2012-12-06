
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurements of the road surface condition which relate specifically to the weather.
 * 
 * <p>Java class for RoadSurfaceConditionMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/1_0/1_0}IntensityKilogrammesPerSquareMetre" minOccurs="0"/>
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/1_0/1_0}ConcentrationGramsPerCubicCentimetre" minOccurs="0"/>
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/1_0/1_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionMeasurements", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "deIcingApplicationRate",
    "deIcingConcentration",
    "depthOfSnow",
    "protectionTemperature",
    "roadSurfaceTemperature",
    "waterFilmThickness",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements {

    protected Float deIcingApplicationRate;
    protected Float deIcingConcentration;
    protected Float depthOfSnow;
    protected Float protectionTemperature;
    protected Float roadSurfaceTemperature;
    protected Float waterFilmThickness;
    protected ExtensionType roadSurfaceConditionMeasurementsExtension;

    /**
     * Gets the value of the deIcingApplicationRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingApplicationRate() {
        return deIcingApplicationRate;
    }

    /**
     * Sets the value of the deIcingApplicationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingApplicationRate(Float value) {
        this.deIcingApplicationRate = value;
    }

    /**
     * Gets the value of the deIcingConcentration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingConcentration() {
        return deIcingConcentration;
    }

    /**
     * Sets the value of the deIcingConcentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingConcentration(Float value) {
        this.deIcingConcentration = value;
    }

    /**
     * Gets the value of the depthOfSnow property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepthOfSnow() {
        return depthOfSnow;
    }

    /**
     * Sets the value of the depthOfSnow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepthOfSnow(Float value) {
        this.depthOfSnow = value;
    }

    /**
     * Gets the value of the protectionTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProtectionTemperature() {
        return protectionTemperature;
    }

    /**
     * Sets the value of the protectionTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProtectionTemperature(Float value) {
        this.protectionTemperature = value;
    }

    /**
     * Gets the value of the roadSurfaceTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadSurfaceTemperature() {
        return roadSurfaceTemperature;
    }

    /**
     * Sets the value of the roadSurfaceTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadSurfaceTemperature(Float value) {
        this.roadSurfaceTemperature = value;
    }

    /**
     * Gets the value of the waterFilmThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWaterFilmThickness() {
        return waterFilmThickness;
    }

    /**
     * Sets the value of the waterFilmThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWaterFilmThickness(Float value) {
        this.waterFilmThickness = value;
    }

    /**
     * Gets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Sets the value of the roadSurfaceConditionMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

}
