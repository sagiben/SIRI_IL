
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Same as CheckStatusResponseStructure, but without extension to be consistent with the other operation definition.
 * 
 * <p>Java class for CheckStatusResponseBodyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckStatusResponseBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResponseBodyStructure", propOrder = {
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime"
})
public class CheckStatusResponseBodyStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "ShortestPossibleCycle")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "ServiceStartedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceStartedTime;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorCondition property.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Sets the value of the errorCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseBodyStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the shortestPossibleCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Sets the value of the shortestPossibleCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    /**
     * Gets the value of the serviceStartedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Sets the value of the serviceStartedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartedTime(XMLGregorianCalendar value) {
        this.serviceStartedTime = value;
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}ServiceNotAvailableError"/>
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
        "serviceNotAvailableError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "ServiceNotAvailableError")
        protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Gets the value of the serviceNotAvailableError property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
            return serviceNotAvailableError;
        }

        /**
         * Sets the value of the serviceNotAvailableError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceNotAvailableErrorStructure }
         *     
         */
        public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
            this.serviceNotAvailableError = value;
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
