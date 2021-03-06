
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for Connection Monitoring Service. Used in WSDL.
 * 
 * <p>Java class for ConnectionMonitoringDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringFeederDelivery" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}ConnectionMonitoringDistributorDelivery" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionMonitoringDeliveriesStructure", propOrder = {
    "connectionMonitoringFeederDelivery",
    "connectionMonitoringDistributorDelivery"
})
public class ConnectionMonitoringDeliveriesStructure {

    @XmlElement(name = "ConnectionMonitoringFeederDelivery")
    protected List<ConnectionMonitoringFeederDeliveryStructure> connectionMonitoringFeederDelivery;
    @XmlElement(name = "ConnectionMonitoringDistributorDelivery")
    protected List<ConnectionMonitoringDistributorDeliveryStructure> connectionMonitoringDistributorDelivery;

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringFeederDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringFeederDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringFeederDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringFeederDeliveryStructure> getConnectionMonitoringFeederDelivery() {
        if (connectionMonitoringFeederDelivery == null) {
            connectionMonitoringFeederDelivery = new ArrayList<ConnectionMonitoringFeederDeliveryStructure>();
        }
        return this.connectionMonitoringFeederDelivery;
    }

    /**
     * Delivery for Connection Protection Fetcher Service.Gets the value of the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringDistributorDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringDistributorDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringDistributorDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringDistributorDeliveryStructure> getConnectionMonitoringDistributorDelivery() {
        if (connectionMonitoringDistributorDelivery == null) {
            connectionMonitoringDistributorDelivery = new ArrayList<ConnectionMonitoringDistributorDeliveryStructure>();
        }
        return this.connectionMonitoringDistributorDelivery;
    }

}
