
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sumamry information about a stop.
 * 
 * <p>Java class for AnnotatedStopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedStopPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TimingPoint" minOccurs="0"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Lines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
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
@XmlType(name = "AnnotatedStopPointStructure", propOrder = {
    "stopPointRef",
    "timingPoint",
    "monitored",
    "stopName",
    "features",
    "lines"
})
public class AnnotatedStopPointStructure {

    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "StopName")
    protected NaturalLanguageStringStructure stopName;
    @XmlElement(name = "Features")
    protected AnnotatedStopPointStructure.Features features;
    @XmlElement(name = "Lines")
    protected AnnotatedStopPointStructure.Lines lines;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the timingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Sets the value of the timingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Gets the value of the monitored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the stopName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getStopName() {
        return stopName;
    }

    /**
     * Sets the value of the stopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setStopName(NaturalLanguageStringStructure value) {
        this.stopName = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public AnnotatedStopPointStructure.Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Features }
     *     
     */
    public void setFeatures(AnnotatedStopPointStructure.Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public AnnotatedStopPointStructure.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedStopPointStructure.Lines }
     *     
     */
    public void setLines(AnnotatedStopPointStructure.Lines value) {
        this.lines = value;
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
     *         &lt;element name="ServiceFeature" type="{http://www.siri.org.uk/siri}ServiceFeatureStructure" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}ServiceFeatureRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "serviceFeature",
        "serviceFeatureRef"
    })
    public static class Features {

        @XmlElement(name = "ServiceFeature")
        protected List<ServiceFeatureStructure> serviceFeature;
        @XmlElement(name = "ServiceFeatureRef")
        protected List<ServiceFeatureRefStructure> serviceFeatureRef;

        /**
         * Gets the value of the serviceFeature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureStructure }
         * 
         * 
         */
        public List<ServiceFeatureStructure> getServiceFeature() {
            if (serviceFeature == null) {
                serviceFeature = new ArrayList<ServiceFeatureStructure>();
            }
            return this.serviceFeature;
        }

        /**
         * Gets the value of the serviceFeatureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
            if (serviceFeatureRef == null) {
                serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
            }
            return this.serviceFeatureRef;
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
     *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" maxOccurs="unbounded"/>
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
        "lineRef"
    })
    public static class Lines {

        @XmlElement(name = "LineRef", required = true)
        protected List<LineRefStructure> lineRef;

        /**
         * Gets the value of the lineRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineRefStructure }
         * 
         * 
         */
        public List<LineRefStructure> getLineRef() {
            if (lineRef == null) {
                lineRef = new ArrayList<LineRefStructure>();
            }
            return this.lineRef;
        }

    }

}
