
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Description of the monitoring conditions (frequency of mesurement, etc): an automatic monitoring of the satus of a lift with pushed alert in case of incident is very different from a daily manual/visual check ....
 * 
 * <p>Java class for MonitoringValidityConditionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringValidityConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Timeband" type="{http://www.siri.org.uk/siri}HalfOpenTimeRangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DayType" type="{http://www.siri.org.uk/siri}DaysOfWeekEnumerationx" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HolidayType" type="{http://www.siri.org.uk/siri}HolidayTypeEnumerationx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringValidityConditionStructure", propOrder = {
    "period",
    "timeband",
    "dayType",
    "holidayType"
})
public class MonitoringValidityConditionStructure {

    @XmlElement(name = "Period")
    protected List<HalfOpenTimestampRangeStructure> period;
    @XmlElement(name = "Timeband")
    protected List<HalfOpenTimeRangeStructure> timeband;
    @XmlElement(name = "DayType")
    protected List<DaysOfWeekEnumerationx> dayType;
    @XmlElement(name = "HolidayType")
    protected List<HolidayTypeEnumerationx> holidayType;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampRangeStructure> getPeriod() {
        if (period == null) {
            period = new ArrayList<HalfOpenTimestampRangeStructure>();
        }
        return this.period;
    }

    /**
     * Gets the value of the timeband property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeband property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeband().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimeRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimeRangeStructure> getTimeband() {
        if (timeband == null) {
            timeband = new ArrayList<HalfOpenTimeRangeStructure>();
        }
        return this.timeband;
    }

    /**
     * Gets the value of the dayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeekEnumerationx }
     * 
     * 
     */
    public List<DaysOfWeekEnumerationx> getDayType() {
        if (dayType == null) {
            dayType = new ArrayList<DaysOfWeekEnumerationx>();
        }
        return this.dayType;
    }

    /**
     * Gets the value of the holidayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holidayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumerationx }
     * 
     * 
     */
    public List<HolidayTypeEnumerationx> getHolidayType() {
        if (holidayType == null) {
            holidayType = new ArrayList<HolidayTypeEnumerationx>();
        }
        return this.holidayType;
    }

}