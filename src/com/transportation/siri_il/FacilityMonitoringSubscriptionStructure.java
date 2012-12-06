
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for Subscription Request for Vehicle Monitoring Service.
 * 
 * <p>Java class for FacilityMonitoringSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringSubscriptionPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringSubscriptionStructure", propOrder = {
    "facilityMonitoringRequest",
    "incrementalUpdates"
})
public class FacilityMonitoringSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "FacilityMonitoringRequest", required = true)
    protected FacilityMonitoringRequestStructure facilityMonitoringRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;

    /**
     * Gets the value of the facilityMonitoringRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringRequestStructure }
     *     
     */
    public FacilityMonitoringRequestStructure getFacilityMonitoringRequest() {
        return facilityMonitoringRequest;
    }

    /**
     * Sets the value of the facilityMonitoringRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringRequestStructure }
     *     
     */
    public void setFacilityMonitoringRequest(FacilityMonitoringRequestStructure value) {
        this.facilityMonitoringRequest = value;
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
