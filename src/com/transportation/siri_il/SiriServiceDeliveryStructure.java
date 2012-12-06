
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a SIRI SIRI Functional Service Delivery types.Used for WSDL.         
 * 
 * <p>Java class for SiriServiceDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiriServiceDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SiriServiceDeliveryGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiriServiceDeliveryStructure", propOrder = {
    "productionTimetableDelivery",
    "estimatedTimetableDelivery",
    "stopTimetableDelivery",
    "stopMonitoringDelivery",
    "vehicleMonitoringDelivery",
    "connectionTimetableDelivery",
    "connectionMonitoringFeederDelivery",
    "connectionMonitoringDistributorDelivery",
    "generalMessageDelivery",
    "facilityMonitoringDelivery",
    "situationExchangeDelivery"
})
public class SiriServiceDeliveryStructure {

    @XmlElement(name = "ProductionTimetableDelivery")
    protected List<ProductionTimetableDeliveryStructure> productionTimetableDelivery;
    @XmlElement(name = "EstimatedTimetableDelivery")
    protected List<EstimatedTimetableDeliveryStructure> estimatedTimetableDelivery;
    @XmlElement(name = "StopTimetableDelivery")
    protected List<StopTimetableDeliveryStructure> stopTimetableDelivery;
    @XmlElement(name = "StopMonitoringDelivery")
    protected List<StopMonitoringDeliveryStructure> stopMonitoringDelivery;
    @XmlElement(name = "VehicleMonitoringDelivery")
    protected List<VehicleMonitoringDeliveryStructure> vehicleMonitoringDelivery;
    @XmlElement(name = "ConnectionTimetableDelivery")
    protected List<ConnectionTimetableDeliveryStructure> connectionTimetableDelivery;
    @XmlElement(name = "ConnectionMonitoringFeederDelivery")
    protected List<ConnectionMonitoringFeederDeliveryStructure> connectionMonitoringFeederDelivery;
    @XmlElement(name = "ConnectionMonitoringDistributorDelivery")
    protected List<ConnectionMonitoringDistributorDeliveryStructure> connectionMonitoringDistributorDelivery;
    @XmlElement(name = "GeneralMessageDelivery")
    protected List<GeneralMessageDeliveryStructure> generalMessageDelivery;
    @XmlElement(name = "FacilityMonitoringDelivery")
    protected List<FacilityMonitoringDeliveryStructure> facilityMonitoringDelivery;
    @XmlElement(name = "SituationExchangeDelivery")
    protected List<SituationExchangeDeliveryStructure> situationExchangeDelivery;

    /**
     * Gets the value of the productionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableDeliveryStructure }
     * 
     * 
     */
    public List<ProductionTimetableDeliveryStructure> getProductionTimetableDelivery() {
        if (productionTimetableDelivery == null) {
            productionTimetableDelivery = new ArrayList<ProductionTimetableDeliveryStructure>();
        }
        return this.productionTimetableDelivery;
    }

    /**
     * Gets the value of the estimatedTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableDeliveryStructure }
     * 
     * 
     */
    public List<EstimatedTimetableDeliveryStructure> getEstimatedTimetableDelivery() {
        if (estimatedTimetableDelivery == null) {
            estimatedTimetableDelivery = new ArrayList<EstimatedTimetableDeliveryStructure>();
        }
        return this.estimatedTimetableDelivery;
    }

    /**
     * Gets the value of the stopTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableDeliveryStructure }
     * 
     * 
     */
    public List<StopTimetableDeliveryStructure> getStopTimetableDelivery() {
        if (stopTimetableDelivery == null) {
            stopTimetableDelivery = new ArrayList<StopTimetableDeliveryStructure>();
        }
        return this.stopTimetableDelivery;
    }

    /**
     * Delviery for Stop Event service.Gets the value of the stopMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<StopMonitoringDeliveryStructure> getStopMonitoringDelivery() {
        if (stopMonitoringDelivery == null) {
            stopMonitoringDelivery = new ArrayList<StopMonitoringDeliveryStructure>();
        }
        return this.stopMonitoringDelivery;
    }

    /**
     * Delviery for Vehicle Activity Service Gets the value of the vehicleMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<VehicleMonitoringDeliveryStructure> getVehicleMonitoringDelivery() {
        if (vehicleMonitoringDelivery == null) {
            vehicleMonitoringDelivery = new ArrayList<VehicleMonitoringDeliveryStructure>();
        }
        return this.vehicleMonitoringDelivery;
    }

    /**
     * Gets the value of the connectionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTimetableDeliveryStructure }
     * 
     * 
     */
    public List<ConnectionTimetableDeliveryStructure> getConnectionTimetableDelivery() {
        if (connectionTimetableDelivery == null) {
            connectionTimetableDelivery = new ArrayList<ConnectionTimetableDeliveryStructure>();
        }
        return this.connectionTimetableDelivery;
    }

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

    /**
     * Delivery for general Message service.Gets the value of the generalMessageDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageDeliveryStructure }
     * 
     * 
     */
    public List<GeneralMessageDeliveryStructure> getGeneralMessageDelivery() {
        if (generalMessageDelivery == null) {
            generalMessageDelivery = new ArrayList<GeneralMessageDeliveryStructure>();
        }
        return this.generalMessageDelivery;
    }

    /**
     * Gets the value of the facilityMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<FacilityMonitoringDeliveryStructure> getFacilityMonitoringDelivery() {
        if (facilityMonitoringDelivery == null) {
            facilityMonitoringDelivery = new ArrayList<FacilityMonitoringDeliveryStructure>();
        }
        return this.facilityMonitoringDelivery;
    }

    /**
     * Gets the value of the situationExchangeDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeDeliveryStructure }
     * 
     * 
     */
    public List<SituationExchangeDeliveryStructure> getSituationExchangeDelivery() {
        if (situationExchangeDelivery == null) {
            situationExchangeDelivery = new ArrayList<SituationExchangeDeliveryStructure>();
        }
        return this.situationExchangeDelivery;
    }

}
