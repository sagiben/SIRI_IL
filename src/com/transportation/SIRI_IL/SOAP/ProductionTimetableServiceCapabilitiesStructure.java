
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  ProductionTimetable Capabilities
 * 
 * <p>Java class for ProductionTimetableServiceCapabilitiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByValidityPeriod"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByOperatorRef"/>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
 *                   &lt;element name="FilterByVersionRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubscriptionPolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}ConnectionCapabilityAccessControlStructure" minOccurs="0"/>
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
@XmlType(name = "ProductionTimetableServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "subscriptionPolicy",
    "accessControl",
    "extensions"
})
public class ProductionTimetableServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
{

    @XmlElement(name = "TopicFiltering")
    protected ProductionTimetableServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected ProductionTimetableServiceCapabilitiesStructure.RequestPolicy requestPolicy;
    @XmlElement(name = "SubscriptionPolicy")
    protected ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy subscriptionPolicy;
    @XmlElement(name = "AccessControl")
    protected ConnectionCapabilityAccessControlStructure accessControl;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the topicFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Sets the value of the topicFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(ProductionTimetableServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.RequestPolicy getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.RequestPolicy }
     *     
     */
    public void setRequestPolicy(ProductionTimetableServiceCapabilitiesStructure.RequestPolicy value) {
        this.requestPolicy = value;
    }

    /**
     * Gets the value of the subscriptionPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy getSubscriptionPolicy() {
        return subscriptionPolicy;
    }

    /**
     * Sets the value of the subscriptionPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy }
     *     
     */
    public void setSubscriptionPolicy(ProductionTimetableServiceCapabilitiesStructure.SubscriptionPolicy value) {
        this.subscriptionPolicy = value;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCapabilityAccessControlStructure }
     *     
     */
    public ConnectionCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(ConnectionCapabilityAccessControlStructure value) {
        this.accessControl = value;
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RequestPolicy
        extends CapabilityRequestPolicyStructure
    {


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
     *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "hasIncrementalUpdates"
    })
    public static class SubscriptionPolicy {

        @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
        protected boolean hasIncrementalUpdates;

        /**
         * Gets the value of the hasIncrementalUpdates property.
         * 
         */
        public boolean isHasIncrementalUpdates() {
            return hasIncrementalUpdates;
        }

        /**
         * Sets the value of the hasIncrementalUpdates property.
         * 
         */
        public void setHasIncrementalUpdates(boolean value) {
            this.hasIncrementalUpdates = value;
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByValidityPeriod"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByOperatorRef"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}FilterByLineRef"/>
     *         &lt;element name="FilterByVersionRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "filterByValidityPeriod",
        "filterByOperatorRef",
        "filterByLineRef",
        "filterByVersionRef"
    })
    public static class TopicFiltering {

        @XmlElement(name = "FilterByValidityPeriod", defaultValue = "true")
        protected boolean filterByValidityPeriod;
        @XmlElement(name = "FilterByOperatorRef", defaultValue = "true")
        protected boolean filterByOperatorRef;
        @XmlElement(name = "FilterByLineRef", defaultValue = "true")
        protected boolean filterByLineRef;
        @XmlElement(name = "FilterByVersionRef", defaultValue = "true")
        protected boolean filterByVersionRef;

        /**
         * Whether results can be filtered by Time of Connection. Default true
         * 
         */
        public boolean isFilterByValidityPeriod() {
            return filterByValidityPeriod;
        }

        /**
         * Sets the value of the filterByValidityPeriod property.
         * 
         */
        public void setFilterByValidityPeriod(boolean value) {
            this.filterByValidityPeriod = value;
        }

        /**
         * Whether results can be filtered by Time of Connection. Default true
         * 
         */
        public boolean isFilterByOperatorRef() {
            return filterByOperatorRef;
        }

        /**
         * Sets the value of the filterByOperatorRef property.
         * 
         */
        public void setFilterByOperatorRef(boolean value) {
            this.filterByOperatorRef = value;
        }

        /**
         * Whether results can be filtered by Journey
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
         * Gets the value of the filterByVersionRef property.
         * 
         */
        public boolean isFilterByVersionRef() {
            return filterByVersionRef;
        }

        /**
         * Sets the value of the filterByVersionRef property.
         * 
         */
        public void setFilterByVersionRef(boolean value) {
            this.filterByVersionRef = value;
        }

    }

}
