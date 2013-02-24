
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for General Message Capabilities
 * 
 * <p>Java class for GeneralMessageServiceCapabilitiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageServiceCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractCapabilitiesStructure">
 *       &lt;sequence>
 *         &lt;element name="TopicFiltering" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DefaultPreviewInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType"/>
 *                   &lt;element name="FilterByInfoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequestPolicy" type="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure" minOccurs="0"/>
 *         &lt;element name="AccessControl" type="{http://www.siri.org.uk/siri}GeneralMessageCapabilityAccessControlStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageServiceCapabilitiesStructure", propOrder = {
    "topicFiltering",
    "requestPolicy",
    "accessControl"
})
public class GeneralMessageServiceCapabilitiesStructure
    extends AbstractCapabilitiesStructure
{

    @XmlElement(name = "TopicFiltering")
    protected GeneralMessageServiceCapabilitiesStructure.TopicFiltering topicFiltering;
    @XmlElement(name = "RequestPolicy")
    protected CapabilityRequestPolicyStructure requestPolicy;
    @XmlElement(name = "AccessControl")
    protected GeneralMessageCapabilityAccessControlStructure accessControl;

    /**
     * Gets the value of the topicFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public GeneralMessageServiceCapabilitiesStructure.TopicFiltering getTopicFiltering() {
        return topicFiltering;
    }

    /**
     * Sets the value of the topicFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageServiceCapabilitiesStructure.TopicFiltering }
     *     
     */
    public void setTopicFiltering(GeneralMessageServiceCapabilitiesStructure.TopicFiltering value) {
        this.topicFiltering = value;
    }

    /**
     * Gets the value of the requestPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityRequestPolicyStructure }
     *     
     */
    public CapabilityRequestPolicyStructure getRequestPolicy() {
        return requestPolicy;
    }

    /**
     * Sets the value of the requestPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityRequestPolicyStructure }
     *     
     */
    public void setRequestPolicy(CapabilityRequestPolicyStructure value) {
        this.requestPolicy = value;
    }

    /**
     * Gets the value of the accessControl property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageCapabilityAccessControlStructure }
     *     
     */
    public GeneralMessageCapabilityAccessControlStructure getAccessControl() {
        return accessControl;
    }

    /**
     * Sets the value of the accessControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageCapabilityAccessControlStructure }
     *     
     */
    public void setAccessControl(GeneralMessageCapabilityAccessControlStructure value) {
        this.accessControl = value;
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
     *         &lt;element name="FilterByInfoChannel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "filterByInfoChannel"
    })
    public static class TopicFiltering {

        @XmlElement(name = "DefaultPreviewInterval", required = true, defaultValue = "PT60M")
        protected Duration defaultPreviewInterval;
        @XmlElement(name = "FilterByInfoChannel", defaultValue = "true")
        protected Boolean filterByInfoChannel;

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
         * Gets the value of the filterByInfoChannel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFilterByInfoChannel() {
            return filterByInfoChannel;
        }

        /**
         * Sets the value of the filterByInfoChannel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFilterByInfoChannel(Boolean value) {
            this.filterByInfoChannel = value;
        }

    }

}
