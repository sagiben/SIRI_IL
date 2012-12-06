
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of atmospheric pollution.
 * 
 * <p>Java class for PollutionMeasurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionMeasurement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/1_0/1_0}ConcentrationMicrogramsPerCubicMetre"/>
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/1_0/1_0}PollutantTypeEnum"/>
 *         &lt;element name="pollutionMeasurementExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionMeasurement", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "pollutantConcentration",
    "pollutantType",
    "pollutionMeasurementExtension"
})
public class PollutionMeasurement {

    protected float pollutantConcentration;
    @XmlElement(required = true)
    protected PollutantTypeEnum pollutantType;
    protected ExtensionType pollutionMeasurementExtension;

    /**
     * Gets the value of the pollutantConcentration property.
     * 
     */
    public float getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Sets the value of the pollutantConcentration property.
     * 
     */
    public void setPollutantConcentration(float value) {
        this.pollutantConcentration = value;
    }

    /**
     * Gets the value of the pollutantType property.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Sets the value of the pollutantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Gets the value of the pollutionMeasurementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionMeasurementExtension() {
        return pollutionMeasurementExtension;
    }

    /**
     * Sets the value of the pollutionMeasurementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionMeasurementExtension(ExtensionType value) {
        this.pollutionMeasurementExtension = value;
    }

}
