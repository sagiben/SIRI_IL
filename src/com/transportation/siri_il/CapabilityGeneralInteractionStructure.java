
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Request Policy capabilities.
 * 
 * <p>Java class for CapabilityGeneralInteractionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityGeneralInteractionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Delivery">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MultipartDespatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MultipleSubscriberFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasConfirmDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasHeartbeat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VisitNumberisOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityGeneralInteractionStructure", propOrder = {
    "interaction",
    "delivery",
    "multipartDespatch",
    "multipleSubscriberFilter",
    "hasConfirmDelivery",
    "hasHeartbeat",
    "visitNumberisOrder"
})
public class CapabilityGeneralInteractionStructure {

    @XmlElement(name = "Interaction", required = true)
    protected CapabilityGeneralInteractionStructure.Interaction interaction;
    @XmlElement(name = "Delivery", required = true)
    protected CapabilityGeneralInteractionStructure.Delivery delivery;
    @XmlElement(name = "MultipartDespatch", defaultValue = "true")
    protected boolean multipartDespatch;
    @XmlElement(name = "MultipleSubscriberFilter", defaultValue = "false")
    protected boolean multipleSubscriberFilter;
    @XmlElement(name = "HasConfirmDelivery", defaultValue = "false")
    protected boolean hasConfirmDelivery;
    @XmlElement(name = "HasHeartbeat", defaultValue = "false")
    protected boolean hasHeartbeat;
    @XmlElement(name = "VisitNumberisOrder", defaultValue = "false")
    protected Boolean visitNumberisOrder;

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public CapabilityGeneralInteractionStructure.Interaction getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Interaction }
     *     
     */
    public void setInteraction(CapabilityGeneralInteractionStructure.Interaction value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public CapabilityGeneralInteractionStructure.Delivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure.Delivery }
     *     
     */
    public void setDelivery(CapabilityGeneralInteractionStructure.Delivery value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the multipartDespatch property.
     * 
     */
    public boolean isMultipartDespatch() {
        return multipartDespatch;
    }

    /**
     * Sets the value of the multipartDespatch property.
     * 
     */
    public void setMultipartDespatch(boolean value) {
        this.multipartDespatch = value;
    }

    /**
     * Gets the value of the multipleSubscriberFilter property.
     * 
     */
    public boolean isMultipleSubscriberFilter() {
        return multipleSubscriberFilter;
    }

    /**
     * Sets the value of the multipleSubscriberFilter property.
     * 
     */
    public void setMultipleSubscriberFilter(boolean value) {
        this.multipleSubscriberFilter = value;
    }

    /**
     * Gets the value of the hasConfirmDelivery property.
     * 
     */
    public boolean isHasConfirmDelivery() {
        return hasConfirmDelivery;
    }

    /**
     * Sets the value of the hasConfirmDelivery property.
     * 
     */
    public void setHasConfirmDelivery(boolean value) {
        this.hasConfirmDelivery = value;
    }

    /**
     * Gets the value of the hasHeartbeat property.
     * 
     */
    public boolean isHasHeartbeat() {
        return hasHeartbeat;
    }

    /**
     * Sets the value of the hasHeartbeat property.
     * 
     */
    public void setHasHeartbeat(boolean value) {
        this.hasHeartbeat = value;
    }

    /**
     * Gets the value of the visitNumberisOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisitNumberisOrder() {
        return visitNumberisOrder;
    }

    /**
     * Sets the value of the visitNumberisOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisitNumberisOrder(Boolean value) {
        this.visitNumberisOrder = value;
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
     *         &lt;element name="DirectDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="FetchedDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "directDelivery",
        "fetchedDelivery"
    })
    public static class Delivery {

        @XmlElement(name = "DirectDelivery")
        protected boolean directDelivery;
        @XmlElement(name = "FetchedDelivery")
        protected boolean fetchedDelivery;

        /**
         * Gets the value of the directDelivery property.
         * 
         */
        public boolean isDirectDelivery() {
            return directDelivery;
        }

        /**
         * Sets the value of the directDelivery property.
         * 
         */
        public void setDirectDelivery(boolean value) {
            this.directDelivery = value;
        }

        /**
         * Gets the value of the fetchedDelivery property.
         * 
         */
        public boolean isFetchedDelivery() {
            return fetchedDelivery;
        }

        /**
         * Sets the value of the fetchedDelivery property.
         * 
         */
        public void setFetchedDelivery(boolean value) {
            this.fetchedDelivery = value;
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
     *         &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "requestResponse",
        "publishSubscribe"
    })
    public static class Interaction {

        @XmlElement(name = "RequestResponse", defaultValue = "true")
        protected boolean requestResponse;
        @XmlElement(name = "PublishSubscribe", defaultValue = "true")
        protected boolean publishSubscribe;

        /**
         * Gets the value of the requestResponse property.
         * 
         */
        public boolean isRequestResponse() {
            return requestResponse;
        }

        /**
         * Sets the value of the requestResponse property.
         * 
         */
        public void setRequestResponse(boolean value) {
            this.requestResponse = value;
        }

        /**
         * Gets the value of the publishSubscribe property.
         * 
         */
        public boolean isPublishSubscribe() {
            return publishSubscribe;
        }

        /**
         * Sets the value of the publishSubscribe property.
         * 
         */
        public void setPublishSubscribe(boolean value) {
            this.publishSubscribe = value;
        }

    }

}
