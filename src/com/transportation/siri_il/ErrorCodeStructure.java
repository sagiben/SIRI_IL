
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Error Code
 * 
 * <p>Java class for ErrorCodeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorCodeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorCodeStructure", propOrder = {
    "errorText"
})
@XmlSeeAlso({
    UnknownSubscriptionErrorStructure.class,
    BeyondDataHorizonErrorStructure.class,
    UnknownSubscriberErrorStructure.class,
    CapabilityNotSupportedErrorStructure.class,
    AccessNotAllowedErrorStructure.class,
    NoInfoForTopicErrorStructure.class,
    AllowedResourceUsageExceededErrorStructure.class,
    OtherErrorStructure.class,
    ServiceNotAvailableErrorStructure.class
})
public class ErrorCodeStructure {

    @XmlElement(name = "ErrorText")
    protected String errorText;

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

}
