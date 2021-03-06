
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
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
 * Generic data values of either measured or elaborated data.
 * 
 * <p>Java class for BasicDataValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="computationalMethod" type="{http://datex2.eu/schema/1_0/1_0}ComputationMethodEnum" minOccurs="0"/>
 *         &lt;element name="fault" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="faultReason" minOccurs="0">
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
 *         &lt;element name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="period" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/1_0/1_0}Float" minOccurs="0"/>
 *         &lt;element name="standardDeviation" type="{http://datex2.eu/schema/1_0/1_0}Float" minOccurs="0"/>
 *         &lt;element name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="time" type="{http://datex2.eu/schema/1_0/1_0}DateTime" minOccurs="0"/>
 *         &lt;element name="affectedLocation" type="{http://datex2.eu/schema/1_0/1_0}GroupOfLocations" minOccurs="0"/>
 *         &lt;element name="basicDataValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDataValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "accuracy",
    "computationalMethod",
    "fault",
    "faultReason",
    "numberOfIncompleteInputs",
    "numberOfInputValuesUsed",
    "period",
    "smoothingFactor",
    "standardDeviation",
    "supplierCalculatedDataQuality",
    "time",
    "affectedLocation",
    "basicDataValueExtension"
})
@XmlSeeAlso({
    TravelTimeValue.class,
    WeatherValue.class,
    TrafficStatusValue.class,
    TrafficValue.class
})
public abstract class BasicDataValue {

    protected Float accuracy;
    protected ComputationMethodEnum computationalMethod;
    protected Boolean fault;
    protected BasicDataValue.FaultReason faultReason;
    protected BigInteger numberOfIncompleteInputs;
    protected BigInteger numberOfInputValuesUsed;
    protected Float period;
    protected Float smoothingFactor;
    protected Float standardDeviation;
    protected Float supplierCalculatedDataQuality;
    protected DateTime time;
    protected GroupOfLocations affectedLocation;
    protected ExtensionType basicDataValueExtension;

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
     * Gets the value of the computationalMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Sets the value of the computationalMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFault(Boolean value) {
        this.fault = value;
    }

    /**
     * Gets the value of the faultReason property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue.FaultReason }
     *     
     */
    public BasicDataValue.FaultReason getFaultReason() {
        return faultReason;
    }

    /**
     * Sets the value of the faultReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue.FaultReason }
     *     
     */
    public void setFaultReason(BasicDataValue.FaultReason value) {
        this.faultReason = value;
    }

    /**
     * Gets the value of the numberOfIncompleteInputs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Sets the value of the numberOfIncompleteInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIncompleteInputs(BigInteger value) {
        this.numberOfIncompleteInputs = value;
    }

    /**
     * Gets the value of the numberOfInputValuesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Sets the value of the numberOfInputValuesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInputValuesUsed(BigInteger value) {
        this.numberOfInputValuesUsed = value;
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
     * Gets the value of the standardDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    /**
     * Gets the value of the supplierCalculatedDataQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Sets the value of the supplierCalculatedDataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTime(DateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the affectedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getAffectedLocation() {
        return affectedLocation;
    }

    /**
     * Sets the value of the affectedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setAffectedLocation(GroupOfLocations value) {
        this.affectedLocation = value;
    }

    /**
     * Gets the value of the basicDataValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataValueExtension() {
        return basicDataValueExtension;
    }

    /**
     * Sets the value of the basicDataValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataValueExtension(ExtensionType value) {
        this.basicDataValueExtension = value;
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
    public static class FaultReason {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<BasicDataValue.FaultReason.Value> value;

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
         * {@link BasicDataValue.FaultReason.Value }
         * 
         * 
         */
        public List<BasicDataValue.FaultReason.Value> getValue() {
            if (value == null) {
                value = new ArrayList<BasicDataValue.FaultReason.Value>();
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
