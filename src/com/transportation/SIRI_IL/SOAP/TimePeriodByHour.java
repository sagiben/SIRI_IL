
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of a continuous period within a 24 hour period by times.
 * 
 * <p>Java class for TimePeriodByHour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TimePeriodOfDay">
 *       &lt;sequence>
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/1_0/1_0}Time"/>
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/1_0/1_0}Time"/>
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
{

    @XmlElement(required = true)
    protected Time startTimeOfPeriod;
    @XmlElement(required = true)
    protected Time endTimeOfPeriod;
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Gets the value of the startTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Sets the value of the startTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setStartTimeOfPeriod(Time value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Gets the value of the endTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Sets the value of the endTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setEndTimeOfPeriod(Time value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Gets the value of the timePeriodByHourExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Sets the value of the timePeriodByHourExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

}
