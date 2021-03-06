
package com.transportation.siri_il;

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
 * One of a sequence of reference points along a road, normally spaced at regular intervals along each carriageway with a sequence of identification from a known starting point.
 * 
 * <p>Java class for ReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencePointIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="administrativeArea" minOccurs="0">
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
 *         &lt;element name="roadName" minOccurs="0">
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
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/1_0/1_0}DirectionEnum" minOccurs="0"/>
 *         &lt;element name="directionRelative" type="{http://datex2.eu/schema/1_0/1_0}ReferencePointDirectionEnum" minOccurs="0"/>
 *         &lt;element name="distanceFromPrevious" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="distanceToNext" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="elevatedRoadSection" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="referencePointDescription" minOccurs="0">
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
 *         &lt;element name="referencePointDistance" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="referencePointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePoint", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "referencePointIdentifier",
    "administrativeArea",
    "roadName",
    "roadNumber",
    "directionBound",
    "directionRelative",
    "distanceFromPrevious",
    "distanceToNext",
    "elevatedRoadSection",
    "referencePointDescription",
    "referencePointDistance",
    "referencePointExtension"
})
public class ReferencePoint {

    @XmlElement(required = true)
    protected String referencePointIdentifier;
    protected ReferencePoint.AdministrativeArea administrativeArea;
    protected ReferencePoint.RoadName roadName;
    protected String roadNumber;
    protected DirectionEnum directionBound;
    protected ReferencePointDirectionEnum directionRelative;
    protected Float distanceFromPrevious;
    protected Float distanceToNext;
    protected Boolean elevatedRoadSection;
    protected ReferencePoint.ReferencePointDescription referencePointDescription;
    protected Float referencePointDistance;
    protected ExtensionType referencePointExtension;

    /**
     * Gets the value of the referencePointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePointIdentifier() {
        return referencePointIdentifier;
    }

    /**
     * Sets the value of the referencePointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePointIdentifier(String value) {
        this.referencePointIdentifier = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePoint.AdministrativeArea }
     *     
     */
    public ReferencePoint.AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePoint.AdministrativeArea }
     *     
     */
    public void setAdministrativeArea(ReferencePoint.AdministrativeArea value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePoint.RoadName }
     *     
     */
    public ReferencePoint.RoadName getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePoint.RoadName }
     *     
     */
    public void setRoadName(ReferencePoint.RoadName value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the directionBound property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Sets the value of the directionBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    /**
     * Gets the value of the directionRelative property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public ReferencePointDirectionEnum getDirectionRelative() {
        return directionRelative;
    }

    /**
     * Sets the value of the directionRelative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointDirectionEnum }
     *     
     */
    public void setDirectionRelative(ReferencePointDirectionEnum value) {
        this.directionRelative = value;
    }

    /**
     * Gets the value of the distanceFromPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    /**
     * Sets the value of the distanceFromPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceFromPrevious(Float value) {
        this.distanceFromPrevious = value;
    }

    /**
     * Gets the value of the distanceToNext property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Sets the value of the distanceToNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceToNext(Float value) {
        this.distanceToNext = value;
    }

    /**
     * Gets the value of the elevatedRoadSection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElevatedRoadSection() {
        return elevatedRoadSection;
    }

    /**
     * Sets the value of the elevatedRoadSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElevatedRoadSection(Boolean value) {
        this.elevatedRoadSection = value;
    }

    /**
     * Gets the value of the referencePointDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePoint.ReferencePointDescription }
     *     
     */
    public ReferencePoint.ReferencePointDescription getReferencePointDescription() {
        return referencePointDescription;
    }

    /**
     * Sets the value of the referencePointDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePoint.ReferencePointDescription }
     *     
     */
    public void setReferencePointDescription(ReferencePoint.ReferencePointDescription value) {
        this.referencePointDescription = value;
    }

    /**
     * Gets the value of the referencePointDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getReferencePointDistance() {
        return referencePointDistance;
    }

    /**
     * Sets the value of the referencePointDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setReferencePointDistance(Float value) {
        this.referencePointDistance = value;
    }

    /**
     * Gets the value of the referencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferencePointExtension() {
        return referencePointExtension;
    }

    /**
     * Sets the value of the referencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferencePointExtension(ExtensionType value) {
        this.referencePointExtension = value;
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
    public static class AdministrativeArea {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<ReferencePoint.AdministrativeArea.Value> value;

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
         * {@link ReferencePoint.AdministrativeArea.Value }
         * 
         * 
         */
        public List<ReferencePoint.AdministrativeArea.Value> getValue() {
            if (value == null) {
                value = new ArrayList<ReferencePoint.AdministrativeArea.Value>();
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
    public static class ReferencePointDescription {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<ReferencePoint.ReferencePointDescription.Value> value;

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
         * {@link ReferencePoint.ReferencePointDescription.Value }
         * 
         * 
         */
        public List<ReferencePoint.ReferencePointDescription.Value> getValue() {
            if (value == null) {
                value = new ArrayList<ReferencePoint.ReferencePointDescription.Value>();
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
    public static class RoadName {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<ReferencePoint.RoadName.Value> value;

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
         * {@link ReferencePoint.RoadName.Value }
         * 
         * 
         */
        public List<ReferencePoint.RoadName.Value> getValue() {
            if (value == null) {
                value = new ArrayList<ReferencePoint.RoadName.Value>();
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
