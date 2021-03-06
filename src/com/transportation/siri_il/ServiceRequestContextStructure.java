
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Configurable context for requests. Intended Primarily as a documentation mechanism.
 * 
 * <p>Java class for ServiceRequestContextStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ClientEndpointAddressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ReferenceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TemporalContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResourceContextGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}PredictionMethodGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestContextStructure", propOrder = {
    "checkStatusAddress",
    "subscribeAddress",
    "manageSubscriptionAddress",
    "getDataAddress",
    "statusResponseAddress",
    "subscriberAddress",
    "notifyAddress",
    "consumerAddress",
    "dataNameSpaces",
    "language",
    "wgsDecimalDegrees",
    "gmlCoordinateFormat",
    "dataHorizon",
    "requestTimeout",
    "deliveryMethod",
    "multipartDespatch",
    "confirmDelivery",
    "maximimumNumberOfSubscriptions",
    "allowedPredictors",
    "predictionFunction"
})
public class ServiceRequestContextStructure {

    @XmlElement(name = "CheckStatusAddress")
    protected String checkStatusAddress;
    @XmlElement(name = "SubscribeAddress")
    protected String subscribeAddress;
    @XmlElement(name = "ManageSubscriptionAddress")
    protected String manageSubscriptionAddress;
    @XmlElement(name = "GetDataAddress")
    protected String getDataAddress;
    @XmlElement(name = "StatusResponseAddress")
    protected String statusResponseAddress;
    @XmlElement(name = "SubscriberAddress")
    protected String subscriberAddress;
    @XmlElement(name = "NotifyAddress")
    protected String notifyAddress;
    @XmlElement(name = "ConsumerAddress")
    protected String consumerAddress;
    @XmlElement(name = "DataNameSpaces")
    protected DataNameSpacesStructure dataNameSpaces;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "DataHorizon")
    protected Duration dataHorizon;
    @XmlElement(name = "RequestTimeout")
    protected Duration requestTimeout;
    @XmlElement(name = "DeliveryMethod", defaultValue = "direct")
    protected DeliveryMethodEnumeration deliveryMethod;
    @XmlElement(name = "MultipartDespatch")
    protected Boolean multipartDespatch;
    @XmlElement(name = "ConfirmDelivery", defaultValue = "false")
    protected Boolean confirmDelivery;
    @XmlElement(name = "MaximimumNumberOfSubscriptions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximimumNumberOfSubscriptions;
    @XmlElement(name = "AllowedPredictors", defaultValue = "anyone")
    protected PredictorsEnumeration allowedPredictors;
    @XmlElement(name = "PredictionFunction")
    protected String predictionFunction;

    /**
     * Gets the value of the checkStatusAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatusAddress() {
        return checkStatusAddress;
    }

    /**
     * Sets the value of the checkStatusAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatusAddress(String value) {
        this.checkStatusAddress = value;
    }

    /**
     * Gets the value of the subscribeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribeAddress() {
        return subscribeAddress;
    }

    /**
     * Sets the value of the subscribeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribeAddress(String value) {
        this.subscribeAddress = value;
    }

    /**
     * Gets the value of the manageSubscriptionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageSubscriptionAddress() {
        return manageSubscriptionAddress;
    }

    /**
     * Sets the value of the manageSubscriptionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageSubscriptionAddress(String value) {
        this.manageSubscriptionAddress = value;
    }

    /**
     * Gets the value of the getDataAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDataAddress() {
        return getDataAddress;
    }

    /**
     * Sets the value of the getDataAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDataAddress(String value) {
        this.getDataAddress = value;
    }

    /**
     * Gets the value of the statusResponseAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusResponseAddress() {
        return statusResponseAddress;
    }

    /**
     * Sets the value of the statusResponseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusResponseAddress(String value) {
        this.statusResponseAddress = value;
    }

    /**
     * Gets the value of the subscriberAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    /**
     * Sets the value of the subscriberAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberAddress(String value) {
        this.subscriberAddress = value;
    }

    /**
     * Gets the value of the notifyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyAddress() {
        return notifyAddress;
    }

    /**
     * Sets the value of the notifyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyAddress(String value) {
        this.notifyAddress = value;
    }

    /**
     * Gets the value of the consumerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerAddress() {
        return consumerAddress;
    }

    /**
     * Sets the value of the consumerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerAddress(String value) {
        this.consumerAddress = value;
    }

    /**
     * Gets the value of the dataNameSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public DataNameSpacesStructure getDataNameSpaces() {
        return dataNameSpaces;
    }

    /**
     * Sets the value of the dataNameSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataNameSpacesStructure }
     *     
     */
    public void setDataNameSpaces(DataNameSpacesStructure value) {
        this.dataNameSpaces = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the wgsDecimalDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Sets the value of the wgsDecimalDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

    /**
     * Gets the value of the gmlCoordinateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Sets the value of the gmlCoordinateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Gets the value of the dataHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDataHorizon() {
        return dataHorizon;
    }

    /**
     * Sets the value of the dataHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDataHorizon(Duration value) {
        this.dataHorizon = value;
    }

    /**
     * Gets the value of the requestTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRequestTimeout() {
        return requestTimeout;
    }

    /**
     * Sets the value of the requestTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRequestTimeout(Duration value) {
        this.requestTimeout = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public DeliveryMethodEnumeration getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodEnumeration }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodEnumeration value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the multipartDespatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Sets the value of the multipartDespatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipartDespatch(Boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Gets the value of the confirmDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmDelivery() {
        return confirmDelivery;
    }

    /**
     * Sets the value of the confirmDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfirmDelivery(Boolean value) {
        this.confirmDelivery = value;
    }

    /**
     * Gets the value of the maximimumNumberOfSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximimumNumberOfSubscriptions() {
        return maximimumNumberOfSubscriptions;
    }

    /**
     * Sets the value of the maximimumNumberOfSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximimumNumberOfSubscriptions(BigInteger value) {
        this.maximimumNumberOfSubscriptions = value;
    }

    /**
     * Gets the value of the allowedPredictors property.
     * 
     * @return
     *     possible object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public PredictorsEnumeration getAllowedPredictors() {
        return allowedPredictors;
    }

    /**
     * Sets the value of the allowedPredictors property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictorsEnumeration }
     *     
     */
    public void setAllowedPredictors(PredictorsEnumeration value) {
        this.allowedPredictors = value;
    }

    /**
     * Gets the value of the predictionFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredictionFunction() {
        return predictionFunction;
    }

    /**
     * Sets the value of the predictionFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredictionFunction(String value) {
        this.predictionFunction = value;
    }

}
