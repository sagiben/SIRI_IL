
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of percentage of vehicles whose speeds fall below a stated threshold, expressed as a percentile of the observation set.
 * 
 * <p>Java class for SpeedPercentile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threshold" type="{http://datex2.eu/schema/1_0/1_0}Percentage"/>
 *         &lt;element name="value" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour"/>
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "threshold",
    "value",
    "speedPercentileExtension"
})
public class SpeedPercentile {

    protected float threshold;
    protected float value;
    protected ExtensionType speedPercentileExtension;

    /**
     * Gets the value of the threshold property.
     * 
     */
    public float getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     */
    public void setThreshold(float value) {
        this.threshold = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * Gets the value of the speedPercentileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Sets the value of the speedPercentileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

}
