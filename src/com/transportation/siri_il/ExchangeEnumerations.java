
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of enumerations which are used within the Exchange sub-model.
 * 
 * <p>Java class for ExchangeEnumerations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeEnumerations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchangeEnumerationsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="denyReasonEnum" type="{http://datex2.eu/schema/1_0/1_0}DenyReasonEnum"/>
 *         &lt;element name="subscriptionStateEnum" type="{http://datex2.eu/schema/1_0/1_0}SubscriptionStateEnum"/>
 *         &lt;element name="requestTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}RequestTypeEnum"/>
 *         &lt;element name="changedFlagEnum" type="{http://datex2.eu/schema/1_0/1_0}ChangedFlagEnum"/>
 *         &lt;element name="compressionMethodEnum" type="{http://datex2.eu/schema/1_0/1_0}CompressionMethodEnum"/>
 *         &lt;element name="updateMethodEnum" type="{http://datex2.eu/schema/1_0/1_0}UpdateMethodEnum"/>
 *         &lt;element name="responseEnum" type="{http://datex2.eu/schema/1_0/1_0}ResponseEnum"/>
 *         &lt;element name="operatingModeEnum" type="{http://datex2.eu/schema/1_0/1_0}OperatingModeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeEnumerations", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "exchangeEnumerationsExtension",
    "denyReasonEnum",
    "subscriptionStateEnum",
    "requestTypeEnum",
    "changedFlagEnum",
    "compressionMethodEnum",
    "updateMethodEnum",
    "responseEnum",
    "operatingModeEnum"
})
public abstract class ExchangeEnumerations {

    protected ExtensionType exchangeEnumerationsExtension;
    @XmlElement(required = true)
    protected DenyReasonEnum denyReasonEnum;
    @XmlElement(required = true)
    protected SubscriptionStateEnum subscriptionStateEnum;
    @XmlElement(required = true)
    protected RequestTypeEnum requestTypeEnum;
    @XmlElement(required = true)
    protected ChangedFlagEnum changedFlagEnum;
    @XmlElement(required = true)
    protected CompressionMethodEnum compressionMethodEnum;
    @XmlElement(required = true)
    protected UpdateMethodEnum updateMethodEnum;
    @XmlElement(required = true)
    protected ResponseEnum responseEnum;
    @XmlElement(required = true)
    protected OperatingModeEnum operatingModeEnum;

    /**
     * Gets the value of the exchangeEnumerationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExchangeEnumerationsExtension() {
        return exchangeEnumerationsExtension;
    }

    /**
     * Sets the value of the exchangeEnumerationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExchangeEnumerationsExtension(ExtensionType value) {
        this.exchangeEnumerationsExtension = value;
    }

    /**
     * Gets the value of the denyReasonEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DenyReasonEnum }
     *     
     */
    public DenyReasonEnum getDenyReasonEnum() {
        return denyReasonEnum;
    }

    /**
     * Sets the value of the denyReasonEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenyReasonEnum }
     *     
     */
    public void setDenyReasonEnum(DenyReasonEnum value) {
        this.denyReasonEnum = value;
    }

    /**
     * Gets the value of the subscriptionStateEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public SubscriptionStateEnum getSubscriptionStateEnum() {
        return subscriptionStateEnum;
    }

    /**
     * Sets the value of the subscriptionStateEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStateEnum }
     *     
     */
    public void setSubscriptionStateEnum(SubscriptionStateEnum value) {
        this.subscriptionStateEnum = value;
    }

    /**
     * Gets the value of the requestTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RequestTypeEnum }
     *     
     */
    public RequestTypeEnum getRequestTypeEnum() {
        return requestTypeEnum;
    }

    /**
     * Sets the value of the requestTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestTypeEnum }
     *     
     */
    public void setRequestTypeEnum(RequestTypeEnum value) {
        this.requestTypeEnum = value;
    }

    /**
     * Gets the value of the changedFlagEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public ChangedFlagEnum getChangedFlagEnum() {
        return changedFlagEnum;
    }

    /**
     * Sets the value of the changedFlagEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedFlagEnum }
     *     
     */
    public void setChangedFlagEnum(ChangedFlagEnum value) {
        this.changedFlagEnum = value;
    }

    /**
     * Gets the value of the compressionMethodEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnum }
     *     
     */
    public CompressionMethodEnum getCompressionMethodEnum() {
        return compressionMethodEnum;
    }

    /**
     * Sets the value of the compressionMethodEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnum }
     *     
     */
    public void setCompressionMethodEnum(CompressionMethodEnum value) {
        this.compressionMethodEnum = value;
    }

    /**
     * Gets the value of the updateMethodEnum property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public UpdateMethodEnum getUpdateMethodEnum() {
        return updateMethodEnum;
    }

    /**
     * Sets the value of the updateMethodEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMethodEnum }
     *     
     */
    public void setUpdateMethodEnum(UpdateMethodEnum value) {
        this.updateMethodEnum = value;
    }

    /**
     * Gets the value of the responseEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEnum }
     *     
     */
    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }

    /**
     * Sets the value of the responseEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEnum }
     *     
     */
    public void setResponseEnum(ResponseEnum value) {
        this.responseEnum = value;
    }

    /**
     * Gets the value of the operatingModeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingModeEnum }
     *     
     */
    public OperatingModeEnum getOperatingModeEnum() {
        return operatingModeEnum;
    }

    /**
     * Sets the value of the operatingModeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingModeEnum }
     *     
     */
    public void setOperatingModeEnum(OperatingModeEnum value) {
        this.operatingModeEnum = value;
    }

}
