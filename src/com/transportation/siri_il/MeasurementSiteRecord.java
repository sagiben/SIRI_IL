
package com.transportation.siri_il;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An identifiable single measurement site entry/record in the Measurement Site table.
 * 
 * <p>Java class for MeasurementSiteRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/1_0/1_0}ComputationMethodEnum" minOccurs="0"/>
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
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
 *         &lt;element name="measurementSiteName" minOccurs="0">
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
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="measurementSiteReference" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/1_0/1_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="measurementSpecificCharacteristics" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://datex2.eu/schema/1_0/1_0}MeasurementSpecificCharacteristics">
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/1_0/1_0}Location"/>
 *         &lt;element name="measurementSiteRecordExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSiteRecord", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "computationMethod",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteReference",
    "measurementSide",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "measurementSiteRecordExtension"
})
public class MeasurementSiteRecord {

    protected ComputationMethodEnum computationMethod;
    protected String measurementEquipmentReference;
    protected MeasurementSiteRecord.MeasurementEquipmentTypeUsed measurementEquipmentTypeUsed;
    protected MeasurementSiteRecord.MeasurementSiteName measurementSiteName;
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteReference;
    protected DirectionEnum measurementSide;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected Location measurementSiteLocation;
    protected ExtensionType measurementSiteRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the computationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Sets the value of the computationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Gets the value of the measurementEquipmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementEquipmentReference() {
        return measurementEquipmentReference;
    }

    /**
     * Sets the value of the measurementEquipmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementEquipmentReference(String value) {
        this.measurementEquipmentReference = value;
    }

    /**
     * Gets the value of the measurementEquipmentTypeUsed property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSiteRecord.MeasurementEquipmentTypeUsed }
     *     
     */
    public MeasurementSiteRecord.MeasurementEquipmentTypeUsed getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Sets the value of the measurementEquipmentTypeUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSiteRecord.MeasurementEquipmentTypeUsed }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MeasurementSiteRecord.MeasurementEquipmentTypeUsed value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Gets the value of the measurementSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSiteRecord.MeasurementSiteName }
     *     
     */
    public MeasurementSiteRecord.MeasurementSiteName getMeasurementSiteName() {
        return measurementSiteName;
    }

    /**
     * Sets the value of the measurementSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSiteRecord.MeasurementSiteName }
     *     
     */
    public void setMeasurementSiteName(MeasurementSiteRecord.MeasurementSiteName value) {
        this.measurementSiteName = value;
    }

    /**
     * Gets the value of the measurementSiteNumberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteNumberOfLanes() {
        return measurementSiteNumberOfLanes;
    }

    /**
     * Sets the value of the measurementSiteNumberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteNumberOfLanes(BigInteger value) {
        this.measurementSiteNumberOfLanes = value;
    }

    /**
     * Gets the value of the measurementSiteReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteReference() {
        return measurementSiteReference;
    }

    /**
     * Sets the value of the measurementSiteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteReference(String value) {
        this.measurementSiteReference = value;
    }

    /**
     * Gets the value of the measurementSide property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Sets the value of the measurementSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSpecificCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSpecificCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord.MeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<MeasurementSiteRecord.MeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    /**
     * Gets the value of the measurementSiteLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Sets the value of the measurementSiteLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setMeasurementSiteLocation(Location value) {
        this.measurementSiteLocation = value;
    }

    /**
     * Gets the value of the measurementSiteRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteRecordExtension() {
        return measurementSiteRecordExtension;
    }

    /**
     * Sets the value of the measurementSiteRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteRecordExtension(ExtensionType value) {
        this.measurementSiteRecordExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
        protected List<MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value> value;

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
         * {@link MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value }
         * 
         * 
         */
        public List<MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value> getValue() {
            if (value == null) {
                value = new ArrayList<MeasurementSiteRecord.MeasurementEquipmentTypeUsed.Value>();
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
    public static class MeasurementSiteName {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<MeasurementSiteRecord.MeasurementSiteName.Value> value;

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
         * {@link MeasurementSiteRecord.MeasurementSiteName.Value }
         * 
         * 
         */
        public List<MeasurementSiteRecord.MeasurementSiteName.Value> getValue() {
            if (value == null) {
                value = new ArrayList<MeasurementSiteRecord.MeasurementSiteName.Value>();
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}MeasurementSpecificCharacteristics">
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementSpecificCharacteristics
        extends com.transportation.siri_il.MeasurementSpecificCharacteristics
    {

        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Gets the value of the index property.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

    }

}
