
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Subscription Request for Estimated Timetable Service.
 * 
 * <p>Java class for EstimatedTimetableSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetableRequest"/>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.siri.org.uk/siri}EstimatedTimetableSubscriptionPolicyGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedTimetableSubscriptionStructure", propOrder = {
    "estimatedTimetableRequest",
    "incrementalUpdates",
    "changeBeforeUpdates"
})
public class EstimatedTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "EstimatedTimetableRequest", required = true)
    protected EstimatedTimetableRequestStructure estimatedTimetableRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "true")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "ChangeBeforeUpdates", required = true)
    protected Duration changeBeforeUpdates;

    /**
     * Gets the value of the estimatedTimetableRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableRequestStructure }
     *     
     */
    public EstimatedTimetableRequestStructure getEstimatedTimetableRequest() {
        return estimatedTimetableRequest;
    }

    /**
     * Sets the value of the estimatedTimetableRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableRequestStructure }
     *     
     */
    public void setEstimatedTimetableRequest(EstimatedTimetableRequestStructure value) {
        this.estimatedTimetableRequest = value;
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

    /**
     * Gets the value of the changeBeforeUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeBeforeUpdates() {
        return changeBeforeUpdates;
    }

    /**
     * Sets the value of the changeBeforeUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChangeBeforeUpdates(Duration value) {
        this.changeBeforeUpdates = value;
    }

}
