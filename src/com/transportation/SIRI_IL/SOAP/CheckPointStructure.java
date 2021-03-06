
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for  a Checkpoint Hazard that can be assocaited with 
 * 
 * <p>Java class for CheckPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckPointId" type="{http://www.ifopt.org.uk/ifopt}CheckPointIdType" minOccurs="0"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}CheckPointGroup"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DelayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "checkPointId",
    "validityCondition",
    "checkPointProcess",
    "checkPointService",
    "accessFeatureType",
    "congestion",
    "facilityRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
public class CheckPointStructure {

    @XmlElement(name = "CheckPointId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String checkPointId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "CheckPointProcess")
    protected CheckPointProcessEnumeration checkPointProcess;
    @XmlElement(name = "CheckPointService")
    protected CheckPointServiceEnumeration checkPointService;
    @XmlElement(name = "AccessFeatureType")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Congestion")
    protected CongestionEnumeration congestion;
    @XmlElement(name = "FacilityRef")
    protected String facilityRef;
    @XmlElement(name = "MinimumLikelyDelay")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay")
    protected Duration maximumLikelyDelay;

    /**
     * Gets the value of the checkPointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointId() {
        return checkPointId;
    }

    /**
     * Sets the value of the checkPointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointId(String value) {
        this.checkPointId = value;
    }

    /**
     * Gets the value of the validityCondition property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Sets the value of the validityCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Gets the value of the checkPointProcess property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public CheckPointProcessEnumeration getCheckPointProcess() {
        return checkPointProcess;
    }

    /**
     * Sets the value of the checkPointProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public void setCheckPointProcess(CheckPointProcessEnumeration value) {
        this.checkPointProcess = value;
    }

    /**
     * Gets the value of the checkPointService property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public CheckPointServiceEnumeration getCheckPointService() {
        return checkPointService;
    }

    /**
     * Sets the value of the checkPointService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public void setCheckPointService(CheckPointServiceEnumeration value) {
        this.checkPointService = value;
    }

    /**
     * Gets the value of the accessFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Sets the value of the accessFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Gets the value of the congestion property.
     * 
     * @return
     *     possible object is
     *     {@link CongestionEnumeration }
     *     
     */
    public CongestionEnumeration getCongestion() {
        return congestion;
    }

    /**
     * Sets the value of the congestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CongestionEnumeration }
     *     
     */
    public void setCongestion(CongestionEnumeration value) {
        this.congestion = value;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityRef() {
        return facilityRef;
    }

    /**
     * Sets the value of the facilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityRef(String value) {
        this.facilityRef = value;
    }

    /**
     * Gets the value of the minimumLikelyDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Sets the value of the minimumLikelyDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    /**
     * Gets the value of the averageDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Sets the value of the averageDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    /**
     * Gets the value of the maximumLikelyDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Sets the value of the maximumLikelyDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

}
