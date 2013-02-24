
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Vehicle Monitoring Capabilities.
 * 
 * <p>Java class for VehicleMonitoringServiceCapabilitiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="FilterByVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringVolumeGroup"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" type="{http://www.siri.org.uk/siri}CapabilitySubscriptionPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *                   &lt;element name="CheckVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResponseFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitoringServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "responseFeatures",
    "extensions"
})
public class VehicleMonitoringServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
{

    @XmlElement(name = "TopicFiltering")
    protected VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected CapabilitySubscriptionPolicyStructure subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected VehicleMonitoringServiceCapabilitiesStructure.AccessControl accessControl;
    @XmlElement(name = "ResponseFeatures")
    protected VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures responseFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the topicFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Sets the value of the topicFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(VehicleMonitoringServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy value) {
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
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.AccessControl getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.AccessControl }
     *     
     */
    public void setAccessControl(VehicleMonitoringServiceCapabilitiesStructure.AccessControl value) {
        this.accessControl = value;
    }

    /**
     * Gets the value of the responseFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures getResponseFeatures() {
        return responseFeatures;
    }

    /**
     * Sets the value of the responseFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures }
     *     
     */
    public void setResponseFeatures(VehicleMonitoringServiceCapabilitiesStructure.ResponseFeatures value) {
        this.responseFeatures = value;
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
     *         &lt;element name="CheckVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "checkOperatorRef",
        "checkLineRef",
        "checkVehicleMonitoringRef"
    })
    public static class AccessControl
        extends CapabilityAccessControlStructure
    {

        @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
        protected Boolean checkOperatorRef;
        @XmlElement(name = "CheckLineRef", defaultValue = "true")
        protected Boolean checkLineRef;
        @XmlElement(name = "CheckVehicleMonitoringRef", defaultValue = "true")
        protected Boolean checkVehicleMonitoringRef;

        /**
         * Gets the value of the checkOperatorRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckOperatorRef() {
            return checkOperatorRef;
        }

        /**
         * Sets the value of the checkOperatorRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckOperatorRef(Boolean value) {
            this.checkOperatorRef = value;
        }

        /**
         * Gets the value of the checkLineRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckLineRef() {
            return checkLineRef;
        }

        /**
         * Sets the value of the checkLineRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckLineRef(Boolean value) {
            this.checkLineRef = value;
        }

        /**
         * Gets the value of the checkVehicleMonitoringRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckVehicleMonitoringRef() {
            return checkVehicleMonitoringRef;
        }

        /**
         * Sets the value of the checkVehicleMonitoringRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckVehicleMonitoringRef(Boolean value) {
            this.checkVehicleMonitoringRef = value;
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringVolumeGroup"/>
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
        "hasMaximumVehicles",
        "hasNumberOfOnwardsCalls",
        "hasNumberOfPreviousCalls"
    })
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
    {

        @XmlElement(name = "HasDetailLevel", defaultValue = "false")
        protected Boolean hasDetailLevel;
        @XmlElement(name = "DefaultDetailLevel", defaultValue = "normal")
        protected VehicleMonitoringDetailEnumeration defaultDetailLevel;
        @XmlElement(name = "HasMaximumVehicles", defaultValue = "true")
        protected Boolean hasMaximumVehicles;
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
         *     {@link VehicleMonitoringDetailEnumeration }
         *     
         */
        public VehicleMonitoringDetailEnumeration getDefaultDetailLevel() {
            return defaultDetailLevel;
        }

        /**
         * Sets the value of the defaultDetailLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleMonitoringDetailEnumeration }
         *     
         */
        public void setDefaultDetailLevel(VehicleMonitoringDetailEnumeration value) {
            this.defaultDetailLevel = value;
        }

        /**
         * Gets the value of the hasMaximumVehicles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasMaximumVehicles() {
            return hasMaximumVehicles;
        }

        /**
         * Sets the value of the hasMaximumVehicles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasMaximumVehicles(Boolean value) {
            this.hasMaximumVehicles = value;
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
     *         &lt;element name="HasLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hasLocation"
    })
    public static class ResponseFeatures {

        @XmlElement(name = "HasLocation", defaultValue = "true")
        protected Boolean hasLocation;

        /**
         * Gets the value of the hasLocation property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHasLocation() {
            return hasLocation;
        }

        /**
         * Sets the value of the hasLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHasLocation(Boolean value) {
            this.hasLocation = value;
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
     *         &lt;element name="FilterByVehicleMonitoringRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByVehicleRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByDirectionRef" minOccurs="0"/>
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
        "filterByVehicleMonitoringRef",
        "filterByVehicleRef",
        "filterByLineRef",
        "filterByDirectionRef"
    })
    public static class TopicFiltering {

        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByVehicleMonitoringRef")
        protected boolean filterByVehicleMonitoringRef;
        @XmlElement(name = "FilterByVehicleRef", defaultValue = "false")
        protected Boolean filterByVehicleRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected Boolean filterByLineRef;
        @XmlElement(name = "FilterByDirectionRef", defaultValue = "true")
        protected Boolean filterByDirectionRef;

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
         * Gets the value of the filterByVehicleMonitoringRef property.
         * 
         */
        public boolean isFilterByVehicleMonitoringRef() {
            return filterByVehicleMonitoringRef;
        }

        /**
         * Sets the value of the filterByVehicleMonitoringRef property.
         * 
         */
        public void setFilterByVehicleMonitoringRef(boolean value) {
            this.filterByVehicleMonitoringRef = value;
        }

        /**
         * Gets the value of the filterByVehicleRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByVehicleRef() {
            return filterByVehicleRef;
        }

        /**
         * Sets the value of the filterByVehicleRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByVehicleRef(Boolean value) {
            this.filterByVehicleRef = value;
        }

        /**
         * Gets the value of the filterByLineRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByLineRef() {
            return filterByLineRef;
        }

        /**
         * Sets the value of the filterByLineRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByLineRef(Boolean value) {
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

    }

}
