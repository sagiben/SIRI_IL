
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for sescription the facility itself
 * 
 * <p>Java class for FacilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacilityCode" type="{http://www.siri.org.uk/siri}FacilityCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="FacilityClass" type="{http://www.siri.org.uk/siri}FacilityCategoryEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ValidityCondition" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/>
 *         &lt;element name="FacilityLocation" type="{http://www.siri.org.uk/siri}FacilityLocationStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityAccessibilityGroup"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityStructure", propOrder = {
    "facilityCode",
    "description",
    "facilityClass",
    "features",
    "ownerRef",
    "ownerName",
    "validityCondition",
    "facilityLocation",
    "limitations",
    "suitabilities",
    "accessibilityAssessment",
    "extensions"
})
public class FacilityStructure {

    @XmlElement(name = "FacilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String facilityCode;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "FacilityClass")
    protected List<FacilityCategoryEnumeration> facilityClass;
    @XmlElement(name = "Features")
    protected FacilityStructure.Features features;
    @XmlElement(name = "OwnerRef")
    protected OrganisationRefStructure ownerRef;
    @XmlElement(name = "OwnerName")
    protected NaturalLanguageStringStructure ownerName;
    @XmlElement(name = "ValidityCondition")
    protected MonitoringValidityConditionStructure validityCondition;
    @XmlElement(name = "FacilityLocation")
    protected FacilityLocationStructure facilityLocation;
    @XmlElement(name = "Limitations")
    protected FacilityStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected FacilityStructure.Suitabilities suitabilities;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the facilityClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityCategoryEnumeration }
     * 
     * 
     */
    public List<FacilityCategoryEnumeration> getFacilityClass() {
        if (facilityClass == null) {
            facilityClass = new ArrayList<FacilityCategoryEnumeration>();
        }
        return this.facilityClass;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public FacilityStructure.Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public void setFeatures(FacilityStructure.Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the ownerRef property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getOwnerRef() {
        return ownerRef;
    }

    /**
     * Sets the value of the ownerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setOwnerRef(OrganisationRefStructure value) {
        this.ownerRef = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setOwnerName(NaturalLanguageStringStructure value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the validityCondition property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Sets the value of the validityCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setValidityCondition(MonitoringValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Gets the value of the facilityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public FacilityLocationStructure getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Sets the value of the facilityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public void setFacilityLocation(FacilityLocationStructure value) {
        this.facilityLocation = value;
    }

    /**
     * Gets the value of the limitations property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public FacilityStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Sets the value of the limitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public void setLimitations(FacilityStructure.Limitations value) {
        this.limitations = value;
    }

    /**
     * Gets the value of the suitabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public FacilityStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Sets the value of the suitabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(FacilityStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
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
     *         &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
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
        "feature"
    })
    public static class Features {

        @XmlElement(name = "Feature", required = true)
        protected List<AllFacilitiesFeatureStructure> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllFacilitiesFeatureStructure }
         * 
         * 
         */
        public List<AllFacilitiesFeatureStructure> getFeature() {
            if (feature == null) {
                feature = new ArrayList<AllFacilitiesFeatureStructure>();
            }
            return this.feature;
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
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/>
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/>
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
        "wheelchairAccess",
        "stepFreeAccess",
        "escalatorFreeAccess",
        "liftFreeAccess",
        "audibleSignalsAvailable",
        "visualSignsAvailable"
    })
    public static class Limitations {

        @XmlElement(name = "WheelchairAccess", namespace = "http://www.ifopt.org.uk/acsb", required = true, defaultValue = "false")
        protected AccessibilityStructure wheelchairAccess;
        @XmlElement(name = "StepFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure stepFreeAccess;
        @XmlElement(name = "EscalatorFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure escalatorFreeAccess;
        @XmlElement(name = "LiftFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure liftFreeAccess;
        @XmlElement(name = "AudibleSignalsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "false")
        protected AccessibilityStructure audibleSignalsAvailable;
        @XmlElement(name = "VisualSignsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure visualSignsAvailable;

        /**
         * Gets the value of the wheelchairAccess property.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getWheelchairAccess() {
            return wheelchairAccess;
        }

        /**
         * Sets the value of the wheelchairAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setWheelchairAccess(AccessibilityStructure value) {
            this.wheelchairAccess = value;
        }

        /**
         * Gets the value of the stepFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getStepFreeAccess() {
            return stepFreeAccess;
        }

        /**
         * Sets the value of the stepFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setStepFreeAccess(AccessibilityStructure value) {
            this.stepFreeAccess = value;
        }

        /**
         * Gets the value of the escalatorFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getEscalatorFreeAccess() {
            return escalatorFreeAccess;
        }

        /**
         * Sets the value of the escalatorFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setEscalatorFreeAccess(AccessibilityStructure value) {
            this.escalatorFreeAccess = value;
        }

        /**
         * Gets the value of the liftFreeAccess property.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getLiftFreeAccess() {
            return liftFreeAccess;
        }

        /**
         * Sets the value of the liftFreeAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setLiftFreeAccess(AccessibilityStructure value) {
            this.liftFreeAccess = value;
        }

        /**
         * Whether a Place has Audible signals for the viusally impaired.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getAudibleSignalsAvailable() {
            return audibleSignalsAvailable;
        }

        /**
         * Sets the value of the audibleSignalsAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setAudibleSignalsAvailable(AccessibilityStructure value) {
            this.audibleSignalsAvailable = value;
        }

        /**
         * Whether a Place hasVisual signals for the hearing impaired.
         * 
         * @return
         *     possible object is
         *     {@link AccessibilityStructure }
         *     
         */
        public AccessibilityStructure getVisualSignsAvailable() {
            return visualSignsAvailable;
        }

        /**
         * Sets the value of the visualSignsAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessibilityStructure }
         *     
         */
        public void setVisualSignsAvailable(AccessibilityStructure value) {
            this.visualSignsAvailable = value;
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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
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
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

    }

}
