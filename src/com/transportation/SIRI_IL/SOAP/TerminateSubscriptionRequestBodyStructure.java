
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Body of Terminate Subscription Request content. Used in WSDL.           
 * 
 * <p>Java class for TerminateSubscriptionRequestBodyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionRequestBodyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminateSubscriptionTopicGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionRequestBodyStructure", propOrder = {
    "subscriberRef",
    "all",
    "subscriptionRef"
})
public class TerminateSubscriptionRequestBodyStructure {

    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "All")
    protected String all;
    @XmlElement(name = "SubscriptionRef")
    protected List<SubscriptionQualifierStructure> subscriptionRef;

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
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAll(String value) {
        this.all = value;
    }

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<SubscriptionQualifierStructure> getSubscriptionRef() {
        if (subscriptionRef == null) {
            subscriptionRef = new ArrayList<SubscriptionQualifierStructure>();
        }
        return this.subscriptionRef;
    }

}
