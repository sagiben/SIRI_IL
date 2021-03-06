
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Data type for Subscription Request for Vehicle Monitoring Service.
 * 
 * <p>Java class for VehicleMonitoringSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleMonitoringRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringSubscriptionPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitoringSubscriptionStructure", propOrder = {
    "vehicleMonitoringRequest",
    "incrementalUpdates",
    "changeBeforeUpdates",
    "updateInterval"
})
public class VehicleMonitoringSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "VehicleMonitoringRequest", required = true)
    protected VehicleMonitoringRequestStructure vehicleMonitoringRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "ChangeBeforeUpdates")
    protected Duration changeBeforeUpdates;
    @XmlElement(name = "UpdateInterval")
    protected Duration updateInterval;

    /**
     * Gets the value of the vehicleMonitoringRequest property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRequestStructure }
     *     
     */
    public VehicleMonitoringRequestStructure getVehicleMonitoringRequest() {
        return vehicleMonitoringRequest;
    }

    /**
     * Sets the value of the vehicleMonitoringRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRequestStructure }
     *     
     */
    public void setVehicleMonitoringRequest(VehicleMonitoringRequestStructure value) {
        this.vehicleMonitoringRequest = value;
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

    /**
     * Gets the value of the updateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getUpdateInterval() {
        return updateInterval;
    }

    /**
     * Sets the value of the updateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setUpdateInterval(Duration value) {
        this.updateInterval = value;
    }

}
