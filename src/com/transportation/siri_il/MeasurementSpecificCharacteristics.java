
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Characteristics which are specific to an individual measurement type (specified in a known order) at the given measurement site.
 * 
 * <p>Java class for MeasurementSpecificCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="period" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/1_0/1_0}Float" minOccurs="0"/>
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/1_0/1_0}LanesEnum" minOccurs="0"/>
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/1_0/1_0}MeasuredOrDerivedDataTypeEnum"/>
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/1_0/1_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "accuracy",
    "period",
    "smoothingFactor",
    "specificLane",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
@XmlSeeAlso({
    com.transportation.siri_il.MeasurementSiteRecord.MeasurementSpecificCharacteristics.class
})
public class MeasurementSpecificCharacteristics {

    protected Float accuracy;
    protected Float period;
    protected Float smoothingFactor;
    protected LanesEnum specificLane;
    @XmlElement(required = true)
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    protected VehicleCharacteristics specificVehicleCharacteristics;
    protected ExtensionType measurementSpecificCharacteristicsExtension;

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Gets the value of the smoothingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Sets the value of the smoothingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Gets the value of the specificLane property.
     * 
     * @return
     *     possible object is
     *     {@link LanesEnum }
     *     
     */
    public LanesEnum getSpecificLane() {
        return specificLane;
    }

    /**
     * Sets the value of the specificLane property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanesEnum }
     *     
     */
    public void setSpecificLane(LanesEnum value) {
        this.specificLane = value;
    }

    /**
     * Gets the value of the specificMeasurementValueType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Sets the value of the specificMeasurementValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    /**
     * Gets the value of the specificVehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Sets the value of the specificVehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Sets the value of the measurementSpecificCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

}