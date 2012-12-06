
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for COmmon Subscription Request
 * 
 * <p>Java class for AbstractSubscriptionRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriberEndpointGroup"/>
 *         &lt;element name="SubscriptionContext" type="{http://www.siri.org.uk/siri}SubscriptionContextStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionRequestStructure", propOrder = {
    "consumerAddress",
    "subscriptionFilterIdentifier",
    "subscriptionContext"
})
@XmlSeeAlso({
    SubscriptionRequestStructure.class
})
public abstract class AbstractSubscriptionRequestStructure
    extends RequestStructure
{

    @XmlElement(name = "ConsumerAddress")
    protected String consumerAddress;
    @XmlElement(name = "SubscriptionFilterIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String subscriptionFilterIdentifier;
    @XmlElement(name = "SubscriptionContext")
    protected SubscriptionContextStructure subscriptionContext;

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
     * Gets the value of the subscriptionFilterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionFilterIdentifier() {
        return subscriptionFilterIdentifier;
    }

    /**
     * Sets the value of the subscriptionFilterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionFilterIdentifier(String value) {
        this.subscriptionFilterIdentifier = value;
    }

    /**
     * Gets the value of the subscriptionContext property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public SubscriptionContextStructure getSubscriptionContext() {
        return subscriptionContext;
    }

    /**
     * Sets the value of the subscriptionContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContextStructure }
     *     
     */
    public void setSubscriptionContext(SubscriptionContextStructure value) {
        this.subscriptionContext = value;
    }

}
