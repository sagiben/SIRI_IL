
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}AccessNotAllowedError"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}NoInfoForTopicError"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}AllowedResourceUsageExceededError"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
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
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "noInfoForTopicError",
    "allowedResourceUsageExceededError",
    "unknownSubscriptionError",
    "otherError",
    "description"
})
@XmlRootElement(name = "ErrorCondition")
public class ErrorCondition {

    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "UnknownSubscriptionError")
    protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;

    /**
     * Gets the value of the capabilityNotSupportedError property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Sets the value of the capabilityNotSupportedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Gets the value of the accessNotAllowedError property.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Sets the value of the accessNotAllowedError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Gets the value of the noInfoForTopicError property.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Sets the value of the noInfoForTopicError property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Gets the value of the allowedResourceUsageExceededError property.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Sets the value of the allowedResourceUsageExceededError property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Gets the value of the unknownSubscriptionError property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownSubscriptionErrorStructure }
     *     
     */
    public UnknownSubscriptionErrorStructure getUnknownSubscriptionError() {
        return unknownSubscriptionError;
    }

    /**
     * Sets the value of the unknownSubscriptionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownSubscriptionErrorStructure }
     *     
     */
    public void setUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
        this.unknownSubscriptionError = value;
    }

    /**
     * Gets the value of the otherError property.
     * 
     * @return
     *     possible object is
     *     {@link OtherErrorStructure }
     *     
     */
    public OtherErrorStructure getOtherError() {
        return otherError;
    }

    /**
     * Sets the value of the otherError property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherErrorStructure }
     *     
     */
    public void setOtherError(OtherErrorStructure value) {
        this.otherError = value;
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

}
