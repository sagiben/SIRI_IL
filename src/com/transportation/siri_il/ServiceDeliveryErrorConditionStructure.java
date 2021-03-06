
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type for Standard ErrorConditiosn for Service request
 * 
 * <p>Java class for ServiceDeliveryErrorConditionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryErrorConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/>
 *         &lt;/choice>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryErrorConditionStructure", propOrder = {
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "noInfoForTopicError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ServiceDeliveryErrorConditionStructure {

    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElement(name = "OtherError")
    protected OtherErrorStructure otherError;
    @XmlElement(name = "Description")
    protected ErrorDescriptionStructure description;

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
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
    }

    @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
