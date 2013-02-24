
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A continuous time period or a set of discontinuous time periods defined by the intersection of a set of criteria all within an overall delimiting interval.
 * 
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startOfPeriod" type="{http://datex2.eu/schema/1_0/1_0}DateTime" minOccurs="0"/>
 *         &lt;element name="endOfPeriod" type="{http://datex2.eu/schema/1_0/1_0}DateTime" minOccurs="0"/>
 *         &lt;element name="periodName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/1_0/1_0}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/1_0/1_0}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDay",
    "recurringDayWeekMonthPeriod",
    "periodExtension"
})
public class Period {

    protected DateTime startOfPeriod;
    protected DateTime endOfPeriod;
    protected Period.PeriodName periodName;
    protected List<TimePeriodOfDay> recurringTimePeriodOfDay;
    protected List<DayWeekMonth> recurringDayWeekMonthPeriod;
    protected ExtensionType periodExtension;

    /**
     * Gets the value of the startOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Sets the value of the startOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartOfPeriod(DateTime value) {
        this.startOfPeriod = value;
    }

    /**
     * Gets the value of the endOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Sets the value of the endOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndOfPeriod(DateTime value) {
        this.endOfPeriod = value;
    }

    /**
     * Gets the value of the periodName property.
     * 
     * @return
     *     possible object is
     *     {@link Period.PeriodName }
     *     
     */
    public Period.PeriodName getPeriodName() {
        return periodName;
    }

    /**
     * Sets the value of the periodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period.PeriodName }
     *     
     */
    public void setPeriodName(Period.PeriodName value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the recurringTimePeriodOfDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringTimePeriodOfDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTimePeriodOfDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodOfDay }
     * 
     * 
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDay() {
        if (recurringTimePeriodOfDay == null) {
            recurringTimePeriodOfDay = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDay;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringDayWeekMonthPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayWeekMonthPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayWeekMonth }
     * 
     * 
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriod() {
        if (recurringDayWeekMonthPeriod == null) {
            recurringDayWeekMonthPeriod = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriod;
    }

    /**
     * Gets the value of the periodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPeriodExtension() {
        return periodExtension;
    }

    /**
     * Sets the value of the periodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPeriodExtension(ExtensionType value) {
        this.periodExtension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="value" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PeriodName {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<Period.PeriodName.Value> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Period.PeriodName.Value }
         * 
         * 
         */
        public List<Period.PeriodName.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Period.PeriodName.Value>();
            }
            return this.value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Value {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
