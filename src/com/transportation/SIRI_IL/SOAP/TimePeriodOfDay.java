
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of a continuous period of time within a 24 hour period.#NOTES#
 * 
 * 
 * <p>Java class for TimePeriodOfDay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodOfDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timePeriodOfDayExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodOfDay", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "timePeriodOfDayExtension"
})
@XmlSeeAlso({
    TimePeriodByHour.class
})
public abstract class TimePeriodOfDay {

    protected ExtensionType timePeriodOfDayExtension;

    /**
     * Gets the value of the timePeriodOfDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodOfDayExtension() {
        return timePeriodOfDayExtension;
    }

    /**
     * Sets the value of the timePeriodOfDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodOfDayExtension(ExtensionType value) {
        this.timePeriodOfDayExtension = value;
    }

}
