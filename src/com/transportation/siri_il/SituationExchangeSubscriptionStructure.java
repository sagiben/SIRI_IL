
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for Subscription Request forSituation Exchange Service.
 * 
 * <p>Java class for SituationExchangeSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangeRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangeSubscriptionPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeSubscriptionStructure", propOrder = {
    "situationExchangeRequest",
    "incrementalUpdates"
})
public class SituationExchangeSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "SituationExchangeRequest", required = true)
    protected SituationExchangeRequestStructure situationExchangeRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;

    /**
     * Gets the value of the situationExchangeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeRequestStructure }
     *     
     */
    public SituationExchangeRequestStructure getSituationExchangeRequest() {
        return situationExchangeRequest;
    }

    /**
     * Sets the value of the situationExchangeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeRequestStructure }
     *     
     */
    public void setSituationExchangeRequest(SituationExchangeRequestStructure value) {
        this.situationExchangeRequest = value;
    }

    /**
     * Gets the value of the incrementalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalUpdates() {
        return incrementalUpdates;
    }

    /**
     * Sets the value of the incrementalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalUpdates(Boolean value) {
        this.incrementalUpdates = value;
    }

}
