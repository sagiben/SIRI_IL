
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
 * An action which involves diverting traffic, whether mandatory or advisory.
 * 
 * <p>Java class for Rerouting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rerouting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficControl">
 *       &lt;sequence>
 *         &lt;element name="alternativeRerouting" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="reroutingItineraryDescription" minOccurs="0">
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
 *         &lt;element name="reroutingType" type="{http://datex2.eu/schema/1_0/1_0}ReroutingTypeEnum" minOccurs="0"/>
 *         &lt;element name="reroutingExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rerouting", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "alternativeRerouting",
    "reroutingItineraryDescription",
    "reroutingType",
    "reroutingExtension"
})
public class Rerouting
    extends TrafficControl
{

    protected Boolean alternativeRerouting;
    protected Rerouting.ReroutingItineraryDescription reroutingItineraryDescription;
    protected ReroutingTypeEnum reroutingType;
    protected ExtensionType reroutingExtension;

    /**
     * Gets the value of the alternativeRerouting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternativeRerouting() {
        return alternativeRerouting;
    }

    /**
     * Sets the value of the alternativeRerouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternativeRerouting(Boolean value) {
        this.alternativeRerouting = value;
    }

    /**
     * Gets the value of the reroutingItineraryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Rerouting.ReroutingItineraryDescription }
     *     
     */
    public Rerouting.ReroutingItineraryDescription getReroutingItineraryDescription() {
        return reroutingItineraryDescription;
    }

    /**
     * Sets the value of the reroutingItineraryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rerouting.ReroutingItineraryDescription }
     *     
     */
    public void setReroutingItineraryDescription(Rerouting.ReroutingItineraryDescription value) {
        this.reroutingItineraryDescription = value;
    }

    /**
     * Gets the value of the reroutingType property.
     * 
     * @return
     *     possible object is
     *     {@link ReroutingTypeEnum }
     *     
     */
    public ReroutingTypeEnum getReroutingType() {
        return reroutingType;
    }

    /**
     * Sets the value of the reroutingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReroutingTypeEnum }
     *     
     */
    public void setReroutingType(ReroutingTypeEnum value) {
        this.reroutingType = value;
    }

    /**
     * Gets the value of the reroutingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReroutingExtension() {
        return reroutingExtension;
    }

    /**
     * Sets the value of the reroutingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReroutingExtension(ExtensionType value) {
        this.reroutingExtension = value;
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
    public static class ReroutingItineraryDescription {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<Rerouting.ReroutingItineraryDescription.Value> value;

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
         * {@link Rerouting.ReroutingItineraryDescription.Value }
         * 
         * 
         */
        public List<Rerouting.ReroutingItineraryDescription.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Rerouting.ReroutingItineraryDescription.Value>();
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
