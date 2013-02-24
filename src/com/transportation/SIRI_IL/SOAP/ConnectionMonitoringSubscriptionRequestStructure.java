
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Subscription Request for Connection Monitoring.
 * 
 * <p>Java class for ConnectionMonitoringSubscriptionRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringSubscriptionPolicyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionMonitoringSubscriptionRequestStructure", propOrder = {
    "connectionMonitoringRequest",
    "changeBeforeUpdates"
})
public class ConnectionMonitoringSubscriptionRequestStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "ConnectionMonitoringRequest", required = true)
    protected ConnectionMonitoringRequestStructure connectionMonitoringRequest;
    @XmlElement(name = "ChangeBeforeUpdates")
    protected Duration changeBeforeUpdates;

    /**
     * Gets the value of the connectionMonitoringRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringRequestStructure }
     *     
     */
    public ConnectionMonitoringRequestStructure getConnectionMonitoringRequest() {
        return connectionMonitoringRequest;
    }

    /**
     * Sets the value of the connectionMonitoringRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringRequestStructure }
     *     
     */
    public void setConnectionMonitoringRequest(ConnectionMonitoringRequestStructure value) {
        this.connectionMonitoringRequest = value;
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
