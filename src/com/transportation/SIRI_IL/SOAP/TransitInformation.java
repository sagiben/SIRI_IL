
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
 * The availability of transit services and information relating to their departures. This is limited to those transit services which are of direct relevance to road users, e.g. connecting rail or ferry services.
 * 
 * <p>Java class for TransitInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="journeyDestination" minOccurs="0">
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
 *         &lt;element name="journeyOrigin" minOccurs="0">
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
 *         &lt;element name="journeyReference" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="transitServiceInformation" type="{http://datex2.eu/schema/1_0/1_0}TransitServiceInformationEnum"/>
 *         &lt;element name="transitServiceType" type="{http://datex2.eu/schema/1_0/1_0}TransitServiceTypeEnum"/>
 *         &lt;element name="scheduledDepartureTime" type="{http://datex2.eu/schema/1_0/1_0}DateTime" minOccurs="0"/>
 *         &lt;element name="transitInformationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitInformation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "journeyDestination",
    "journeyOrigin",
    "journeyReference",
    "transitServiceInformation",
    "transitServiceType",
    "scheduledDepartureTime",
    "transitInformationExtension"
})
public class TransitInformation
    extends NonRoadEventInformation
{

    protected TransitInformation.JourneyDestination journeyDestination;
    protected TransitInformation.JourneyOrigin journeyOrigin;
    protected String journeyReference;
    @XmlElement(required = true)
    protected TransitServiceInformationEnum transitServiceInformation;
    @XmlElement(required = true)
    protected TransitServiceTypeEnum transitServiceType;
    protected DateTime scheduledDepartureTime;
    protected ExtensionType transitInformationExtension;

    /**
     * Gets the value of the journeyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link TransitInformation.JourneyDestination }
     *     
     */
    public TransitInformation.JourneyDestination getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Sets the value of the journeyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitInformation.JourneyDestination }
     *     
     */
    public void setJourneyDestination(TransitInformation.JourneyDestination value) {
        this.journeyDestination = value;
    }

    /**
     * Gets the value of the journeyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link TransitInformation.JourneyOrigin }
     *     
     */
    public TransitInformation.JourneyOrigin getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Sets the value of the journeyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitInformation.JourneyOrigin }
     *     
     */
    public void setJourneyOrigin(TransitInformation.JourneyOrigin value) {
        this.journeyOrigin = value;
    }

    /**
     * Gets the value of the journeyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyReference() {
        return journeyReference;
    }

    /**
     * Sets the value of the journeyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyReference(String value) {
        this.journeyReference = value;
    }

    /**
     * Gets the value of the transitServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Sets the value of the transitServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    /**
     * Gets the value of the transitServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public TransitServiceTypeEnum getTransitServiceType() {
        return transitServiceType;
    }

    /**
     * Sets the value of the transitServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public void setTransitServiceType(TransitServiceTypeEnum value) {
        this.transitServiceType = value;
    }

    /**
     * Gets the value of the scheduledDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Sets the value of the scheduledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setScheduledDepartureTime(DateTime value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * Gets the value of the transitInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTransitInformationExtension() {
        return transitInformationExtension;
    }

    /**
     * Sets the value of the transitInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTransitInformationExtension(ExtensionType value) {
        this.transitInformationExtension = value;
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
    public static class JourneyDestination {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<TransitInformation.JourneyDestination.Value> value;

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
         * {@link TransitInformation.JourneyDestination.Value }
         * 
         * 
         */
        public List<TransitInformation.JourneyDestination.Value> getValue() {
            if (value == null) {
                value = new ArrayList<TransitInformation.JourneyDestination.Value>();
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
    public static class JourneyOrigin {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<TransitInformation.JourneyOrigin.Value> value;

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
         * {@link TransitInformation.JourneyOrigin.Value }
         * 
         * 
         */
        public List<TransitInformation.JourneyOrigin.Value> getValue() {
            if (value == null) {
                value = new ArrayList<TransitInformation.JourneyOrigin.Value>();
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
