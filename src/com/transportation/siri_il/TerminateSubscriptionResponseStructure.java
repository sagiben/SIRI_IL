
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Response to a request to terminate a subscription or subscriptions
 * 
 * <p>Java class for TerminateSubscriptionResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminationStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionResponseStructure", propOrder = {
    "terminationResponseStatus"
})
public class TerminateSubscriptionResponseStructure
    extends ResponseEndpointStructure
{

    @XmlElement(name = "TerminationResponseStatus")
    protected List<TerminateSubscriptionResponseStructure.TerminationResponseStatus> terminationResponseStatus;

    /**
     * Gets the value of the terminationResponseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationResponseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminateSubscriptionResponseStructure.TerminationResponseStatus }
     * 
     * 
     */
    public List<TerminateSubscriptionResponseStructure.TerminationResponseStatus> getTerminationResponseStatus() {
        if (terminationResponseStatus == null) {
            terminationResponseStatus = new ArrayList<TerminateSubscriptionResponseStructure.TerminationResponseStatus>();
        }
        return this.terminationResponseStatus;
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseTimestamp" minOccurs="0"/>
     *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/>
     *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}Status"/>
     *         &lt;element name="ErrorCondition" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
     *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/>
     *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
     *                     &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
     *                   &lt;/choice>
     *                   &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "responseTimestamp",
        "requestMessageRef",
        "subscriberRef",
        "subscriptionFilterRef",
        "subscriptionRef",
        "status",
        "errorCondition"
    })
    public static class TerminationResponseStatus {

        @XmlElement(name = "ResponseTimestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar responseTimestamp;
        @XmlElement(name = "RequestMessageRef")
        protected MessageQualifierStructure requestMessageRef;
        @XmlElement(name = "SubscriberRef")
        protected ParticipantRefStructure subscriberRef;
        @XmlElement(name = "SubscriptionFilterRef")
        protected SubscriptionFilterRefStructure subscriptionFilterRef;
        @XmlElement(name = "SubscriptionRef")
        protected SubscriptionQualifierStructure subscriptionRef;
        @XmlElement(name = "Status", defaultValue = "true")
        protected boolean status;
        @XmlElement(name = "ErrorCondition")
        protected TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition errorCondition;

        /**
         * Gets the value of the responseTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getResponseTimestamp() {
            return responseTimestamp;
        }

        /**
         * Sets the value of the responseTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setResponseTimestamp(XMLGregorianCalendar value) {
            this.responseTimestamp = value;
        }

        /**
         * Gets the value of the requestMessageRef property.
         * 
         * @return
         *     possible object is
         *     {@link MessageQualifierStructure }
         *     
         */
        public MessageQualifierStructure getRequestMessageRef() {
            return requestMessageRef;
        }

        /**
         * Sets the value of the requestMessageRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageQualifierStructure }
         *     
         */
        public void setRequestMessageRef(MessageQualifierStructure value) {
            this.requestMessageRef = value;
        }

        /**
         * Gets the value of the subscriberRef property.
         * 
         * @return
         *     possible object is
         *     {@link ParticipantRefStructure }
         *     
         */
        public ParticipantRefStructure getSubscriberRef() {
            return subscriberRef;
        }

        /**
         * Sets the value of the subscriberRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ParticipantRefStructure }
         *     
         */
        public void setSubscriberRef(ParticipantRefStructure value) {
            this.subscriberRef = value;
        }

        /**
         * Gets the value of the subscriptionFilterRef property.
         * 
         * @return
         *     possible object is
         *     {@link SubscriptionFilterRefStructure }
         *     
         */
        public SubscriptionFilterRefStructure getSubscriptionFilterRef() {
            return subscriptionFilterRef;
        }

        /**
         * Sets the value of the subscriptionFilterRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriptionFilterRefStructure }
         *     
         */
        public void setSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
            this.subscriptionFilterRef = value;
        }

        /**
         * Gets the value of the subscriptionRef property.
         * 
         * @return
         *     possible object is
         *     {@link SubscriptionQualifierStructure }
         *     
         */
        public SubscriptionQualifierStructure getSubscriptionRef() {
            return subscriptionRef;
        }

        /**
         * Sets the value of the subscriptionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriptionQualifierStructure }
         *     
         */
        public void setSubscriptionRef(SubscriptionQualifierStructure value) {
            this.subscriptionRef = value;
        }

        /**
         * Gets the value of the status property.
         * 
         */
        public boolean isStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         */
        public void setStatus(boolean value) {
            this.status = value;
        }

        /**
         * Gets the value of the errorCondition property.
         * 
         * @return
         *     possible object is
         *     {@link TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition }
         *     
         */
        public TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition getErrorCondition() {
            return errorCondition;
        }

        /**
         * Sets the value of the errorCondition property.
         * 
         * @param value
         *     allowed object is
         *     {@link TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition }
         *     
         */
        public void setErrorCondition(TerminateSubscriptionResponseStructure.TerminationResponseStatus.ErrorCondition value) {
            this.errorCondition = value;
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
         *         &lt;choice>
         *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
         *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/>
         *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
         *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
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
        @XmlType(name = "", propOrder = {
            "capabilityNotSupportedError",
            "unknownSubscriberError",
            "unknownSubscriptionError",
            "otherError",
            "description"
        })
        public static class ErrorCondition {

            @XmlElement(name = "CapabilityNotSupportedError")
            protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
            @XmlElement(name = "UnknownSubscriberError")
            protected UnknownSubscriberErrorStructure unknownSubscriberError;
            @XmlElement(name = "UnknownSubscriptionError")
            protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
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
             * Gets the value of the unknownSubscriberError property.
             * 
             * @return
             *     possible object is
             *     {@link UnknownSubscriberErrorStructure }
             *     
             */
            public UnknownSubscriberErrorStructure getUnknownSubscriberError() {
                return unknownSubscriberError;
            }

            /**
             * Sets the value of the unknownSubscriberError property.
             * 
             * @param value
             *     allowed object is
             *     {@link UnknownSubscriberErrorStructure }
             *     
             */
            public void setUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
                this.unknownSubscriberError = value;
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

        }

    }

}
