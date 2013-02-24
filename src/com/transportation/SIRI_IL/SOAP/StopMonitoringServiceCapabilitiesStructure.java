
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Stop Monitoring Capabilities.
 * 
 * <p>Java class for StopMonitoringServiceCapabilitiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
 *                   &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}MonitoringCapabilityAccessControlStructure" minOccurs="0"/>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures"
})
public class StopMonitoringServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
{

    @XmlElement(name = "TopicFiltering")
    protected StopMonitoringServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected StopMonitoringServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected MonitoringCapabilityAccessControlStructure accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected StopMonitoringServiceCapabilitiesStructure.ResponseFeatures responseFeatures;

    /**
     * Gets the value of the topicFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Sets the value of the topicFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(StopMonitoringServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(StopMonitoringServiceCapabilitiesStructure.RequestPolicy value) {
        this.requestPolicy = value;
    }

    /**
     * Gets the value of the subscriptionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitySubscriptionPolicyStructure }
     *     
     */
    public CapabilitySubscriptionPolicyStructure getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Sets the value of the subscriptionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitySubscriptionPolicyStructure }
     *     
     */
    public void setSubscriptionPolicy(CapabilitySubscriptionPolicyStructure value) {
        this.subscriptionPolicy = value;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringCapabilityAccessControlStructure }
     *     
     */
    public MonitoringCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(MonitoringCapabilityAccessControlStructure value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the responseFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Sets the value of the responseFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(StopMonitoringServiceCapabilitiesStructure.ResponseFeatures value) {
        this.responseFeatures = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}StopMonitoringCapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringVolumeGroup"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasDetailLevel",
        "defaultDetailLevel",
        "hasMaximumVisits",
        "hasMinimumVisitsPerLine",
        "hasNumberOfOnwardsCalls",
        "hasNumberOfPreviousCalls"
    })
    public static class RequestPolicy
        extends StopMonitoringCapabilityRequestPolicyStructure
    {

        @XmlElement(name = "HasDetailLevel", defaultValue = "false")
        protected Boolean hasDetailLevel;
        @XmlElement(name = "DefaultDetailLevel", defaultValue = "normal")
        protected StopMonitoringDetailEnumeration defaultDetailLevel;
        @XmlElement(name = "HasMaximumVisits", defaultValue = "true")
        protected Boolean hasMaximumVisits;
        @XmlElement(name = "HasMinimumVisitsPerLine", defaultValue = "true")
        protected Boolean hasMinimumVisitsPerLine;
        @XmlElement(name = "HasNumberOfOnwardsCalls", defaultValue = "false")
        protected Boolean hasNumberOfOnwardsCalls;
        @XmlElement(name = "HasNumberOfPreviousCalls", defaultValue = "false")
        protected Boolean hasNumberOfPreviousCalls;

        /**
         * Gets the value of the hasDetailLevel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasDetailLevel() {
            return hasDetailLevel;
        }

        /**
         * Sets the value of the hasDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasDetailLevel(Boolean value) {
            this.hasDetailLevel = value;
        }

        /**
         * Gets the value of the defaultDetailLevel property.
         * 
         * @return
         *     possible object is
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public StopMonitoringDetailEnumeration getDefaultDetailLevel() {
            return defaultDetailLevel;
        }

        /**
         * Sets the value of the defaultDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link StopMonitoringDetailEnumeration }
         *     
         */
        public void setDefaultDetailLevel(StopMonitoringDetailEnumeration value) {
            this.defaultDetailLevel = value;
        }

        /**
         * Gets the value of the hasMaximumVisits property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumVisits() {
            return hasMaximumVisits;
        }

        /**
         * Sets the value of the hasMaximumVisits property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumVisits(Boolean value) {
            this.hasMaximumVisits = value;
        }

        /**
         * Gets the value of the hasMinimumVisitsPerLine property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMinimumVisitsPerLine() {
            return hasMinimumVisitsPerLine;
        }

        /**
         * Sets the value of the hasMinimumVisitsPerLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMinimumVisitsPerLine(Boolean value) {
            this.hasMinimumVisitsPerLine = value;
        }

        /**
         * Gets the value of the hasNumberOfOnwardsCalls property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfOnwardsCalls() {
            return hasNumberOfOnwardsCalls;
        }

        /**
         * Sets the value of the hasNumberOfOnwardsCalls property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfOnwardsCalls(Boolean value) {
            this.hasNumberOfOnwardsCalls = value;
        }

        /**
         * Gets the value of the hasNumberOfPreviousCalls property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasNumberOfPreviousCalls() {
            return hasNumberOfPreviousCalls;
        }

        /**
         * Sets the value of the hasNumberOfPreviousCalls property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasNumberOfPreviousCalls(Boolean value) {
            this.hasNumberOfPreviousCalls = value;
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
     *         &lt;element name="HasLineNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hasLineNotices"
    })
    public static class ResponseFeatures {

        @XmlElement(name = "HasLineNotices", defaultValue = "true")
        protected Boolean hasLineNotices;

        /**
         * Gets the value of the hasLineNotices property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasLineNotices() {
            return hasLineNotices;
        }

        /**
         * Sets the value of the hasLineNotices property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasLineNotices(Boolean value) {
            this.hasLineNotices = value;
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
     *         &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
     *         &lt;element name="ByStartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByMonitoringRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDestination" minOccurs="0"/>
     *         &lt;element name="FilterByVisitType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "defaultPreviewInterval",
        "byStartTime",
        "filterByMonitoringRef",
        "filterByLineRef",
        "filterByDirectionRef",
        "filterByDestination",
        "filterByVisitType"
    })
    public static class TopicFiltering {

        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "ByStartTime", defaultValue = "true")
        protected Boolean byStartTime;
        @XmlElement(name = "FilterByMonitoringRef")
        protected boolean filterByMonitoringRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", defaultValue = "true")
        protected Boolean filterByDirectionRef;
        @XmlElement(name = "FilterByDestination", defaultValue = "false")
        protected Boolean filterByDestination;
        @XmlElement(name = "FilterByVisitType", defaultValue = "true")
        protected Boolean filterByVisitType;

        /**
         * Gets the value of the defaultPreviewInterval property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDefaultPreviewInterval() {
            return defaultPreviewInterval;
        }

        /**
         * Sets the value of the defaultPreviewInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDefaultPreviewInterval(Duration value) {
            this.defaultPreviewInterval = value;
        }

        /**
         * Gets the value of the byStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isByStartTime() {
            return byStartTime;
        }

        /**
         * Sets the value of the byStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setByStartTime(Boolean value) {
            this.byStartTime = value;
        }

        /**
         * Gets the value of the filterByMonitoringRef property.
         * 
         */
        public boolean isFilterByMonitoringRef() {
            return filterByMonitoringRef;
        }

        /**
         * Sets the value of the filterByMonitoringRef property.
         * 
         */
        public void setFilterByMonitoringRef(boolean value) {
            this.filterByMonitoringRef = value;
        }

        /**
         * Gets the value of the filterByLineRef property.
         * 
         */
        public boolean isFilterByLineRef() {
            return filterByLineRef;
        }

        /**
         * Sets the value of the filterByLineRef property.
         * 
         */
        public void setFilterByLineRef(boolean value) {
            this.filterByLineRef = value;
        }

        /**
         * Gets the value of the filterByDirectionRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDirectionRef() {
            return filterByDirectionRef;
        }

        /**
         * Sets the value of the filterByDirectionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDirectionRef(Boolean value) {
            this.filterByDirectionRef = value;
        }

        /**
         * Gets the value of the filterByDestination property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByDestination() {
            return filterByDestination;
        }

        /**
         * Sets the value of the filterByDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByDestination(Boolean value) {
            this.filterByDestination = value;
        }

        /**
         * Gets the value of the filterByVisitType property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVisitType() {
            return filterByVisitType;
        }

        /**
         * Sets the value of the filterByVisitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVisitType(Boolean value) {
            this.filterByVisitType = value;
        }

    }

}
