
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains optional characteristics for the specific measured value (ordered/indexed to correspond with that of the referenced measurement point) which override the static characteristics defined for the measurement point.
 * 
 * <p>Java class for MeasuredValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementEquipmentTypeUsed" minOccurs="0">
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
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/1_0/1_0}LocationCharacteristicsOverride" minOccurs="0"/>
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/1_0/1_0}BasicDataValue"/>
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "basicDataValue",
    "measuredValueExtension"
})
@XmlSeeAlso({
    com.transportation.siri_il.SiteMeasurements.MeasuredValue.class
})
public class MeasuredValue {

    protected MeasuredValue.MeasurementEquipmentTypeUsed measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType measuredValueExtension;

    /**
     * Gets the value of the measurementEquipmentTypeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredValue.MeasurementEquipmentTypeUsed }
     *     
     */
    public MeasuredValue.MeasurementEquipmentTypeUsed getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Sets the value of the measurementEquipmentTypeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredValue.MeasurementEquipmentTypeUsed }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MeasuredValue.MeasurementEquipmentTypeUsed value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Gets the value of the locationCharacteristicsOverride property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Sets the value of the locationCharacteristicsOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    /**
     * Gets the value of the basicDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Sets the value of the basicDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Gets the value of the measuredValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Sets the value of the measuredValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(ExtensionType value) {
        this.measuredValueExtension = value;
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
    public static class MeasurementEquipmentTypeUsed {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<MeasuredValue.MeasurementEquipmentTypeUsed.Value> value;

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
         * {@link MeasuredValue.MeasurementEquipmentTypeUsed.Value }
         * 
         * 
         */
        public List<MeasuredValue.MeasurementEquipmentTypeUsed.Value> getValue() {
            if (value == null) {
                value = new ArrayList<MeasuredValue.MeasurementEquipmentTypeUsed.Value>();
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
