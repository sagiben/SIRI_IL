
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * SIRI Service Request.
 * 
 * <p>Java class for ServiceRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ContextualisedRequestStructure">
 *       &lt;group ref="{http://www.siri.org.uk/siri}SiriServiceRequestGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestStructure", propOrder = {
    "productionTimetableRequest",
    "estimatedTimetableRequest",
    "stopTimetableRequest",
    "stopMonitoringMultipleRequest",
    "stopMonitoringRequest",
    "vehicleMonitoringRequest",
    "connectionTimetableRequest",
    "connectionMonitoringRequest",
    "generalMessageRequest",
    "facilityMonitoringRequest",
    "situationExchangeRequest"
})
@XmlSeeAlso({
    ServiceRequest.class
})
public class ServiceRequestStructure
    extends ContextualisedRequestStructure
{

    @XmlElement(name = "ProductionTimetableRequest")
    protected List<ProductionTimetableRequestStructure> productionTimetableRequest;
    @XmlElement(name = "EstimatedTimetableRequest")
    protected List<EstimatedTimetableRequestStructure> estimatedTimetableRequest;
    @XmlElement(name = "StopTimetableRequest")
    protected List<StopTimetableRequestStructure> stopTimetableRequest;
    @XmlElement(name = "StopMonitoringMultipleRequest")
    protected List<StopMonitoringMultipleRequestStructure> stopMonitoringMultipleRequest;
    @XmlElement(name = "StopMonitoringRequest")
    protected List<StopMonitoringRequestStructure> stopMonitoringRequest;
    @XmlElement(name = "VehicleMonitoringRequest")
    protected List<VehicleMonitoringRequestStructure> vehicleMonitoringRequest;
    @XmlElement(name = "ConnectionTimetableRequest")
    protected List<ConnectionTimetableRequestStructure> connectionTimetableRequest;
    @XmlElement(name = "ConnectionMonitoringRequest")
    protected List<ConnectionMonitoringRequestStructure> connectionMonitoringRequest;
    @XmlElement(name = "GeneralMessageRequest")
    protected List<GeneralMessageRequestStructure> generalMessageRequest;
    @XmlElement(name = "FacilityMonitoringRequest")
    protected List<FacilityMonitoringRequestStructure> facilityMonitoringRequest;
    @XmlElement(name = "SituationExchangeRequest")
    protected List<SituationExchangeRequestStructure> situationExchangeRequest;

    /**
     * Gets the value of the productionTimetableRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableRequestStructure }
     * 
     * 
     */
    public List<ProductionTimetableRequestStructure> getProductionTimetableRequest() {
        if (productionTimetableRequest == null) {
            productionTimetableRequest = new ArrayList<ProductionTimetableRequestStructure>();
        }
        return this.productionTimetableRequest;
    }

    /**
     * Gets the value of the estimatedTimetableRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableRequestStructure }
     * 
     * 
     */
    public List<EstimatedTimetableRequestStructure> getEstimatedTimetableRequest() {
        if (estimatedTimetableRequest == null) {
            estimatedTimetableRequest = new ArrayList<EstimatedTimetableRequestStructure>();
        }
        return this.estimatedTimetableRequest;
    }

    /**
     * Gets the value of the stopTimetableRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetableRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetableRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopTimetableRequestStructure }
     * 
     * 
     */
    public List<StopTimetableRequestStructure> getStopTimetableRequest() {
        if (stopTimetableRequest == null) {
            stopTimetableRequest = new ArrayList<StopTimetableRequestStructure>();
        }
        return this.stopTimetableRequest;
    }

    /**
     * Gets the value of the stopMonitoringMultipleRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringMultipleRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringMultipleRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringMultipleRequestStructure }
     * 
     * 
     */
    public List<StopMonitoringMultipleRequestStructure> getStopMonitoringMultipleRequest() {
        if (stopMonitoringMultipleRequest == null) {
            stopMonitoringMultipleRequest = new ArrayList<StopMonitoringMultipleRequestStructure>();
        }
        return this.stopMonitoringMultipleRequest;
    }

    /**
     * Gets the value of the stopMonitoringRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringRequestStructure }
     * 
     * 
     */
    public List<StopMonitoringRequestStructure> getStopMonitoringRequest() {
        if (stopMonitoringRequest == null) {
            stopMonitoringRequest = new ArrayList<StopMonitoringRequestStructure>();
        }
        return this.stopMonitoringRequest;
    }

    /**
     * Gets the value of the vehicleMonitoringRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMonitoringRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMonitoringRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleMonitoringRequestStructure }
     * 
     * 
     */
    public List<VehicleMonitoringRequestStructure> getVehicleMonitoringRequest() {
        if (vehicleMonitoringRequest == null) {
            vehicleMonitoringRequest = new ArrayList<VehicleMonitoringRequestStructure>();
        }
        return this.vehicleMonitoringRequest;
    }

    /**
     * Gets the value of the connectionTimetableRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionTimetableRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionTimetableRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionTimetableRequestStructure }
     * 
     * 
     */
    public List<ConnectionTimetableRequestStructure> getConnectionTimetableRequest() {
        if (connectionTimetableRequest == null) {
            connectionTimetableRequest = new ArrayList<ConnectionTimetableRequestStructure>();
        }
        return this.connectionTimetableRequest;
    }

    /**
     * Gets the value of the connectionMonitoringRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionMonitoringRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionMonitoringRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionMonitoringRequestStructure }
     * 
     * 
     */
    public List<ConnectionMonitoringRequestStructure> getConnectionMonitoringRequest() {
        if (connectionMonitoringRequest == null) {
            connectionMonitoringRequest = new ArrayList<ConnectionMonitoringRequestStructure>();
        }
        return this.connectionMonitoringRequest;
    }

    /**
     * Gets the value of the generalMessageRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageRequestStructure }
     * 
     * 
     */
    public List<GeneralMessageRequestStructure> getGeneralMessageRequest() {
        if (generalMessageRequest == null) {
            generalMessageRequest = new ArrayList<GeneralMessageRequestStructure>();
        }
        return this.generalMessageRequest;
    }

    /**
     * Gets the value of the facilityMonitoringRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringRequestStructure }
     * 
     * 
     */
    public List<FacilityMonitoringRequestStructure> getFacilityMonitoringRequest() {
        if (facilityMonitoringRequest == null) {
            facilityMonitoringRequest = new ArrayList<FacilityMonitoringRequestStructure>();
        }
        return this.facilityMonitoringRequest;
    }

    /**
     * Gets the value of the situationExchangeRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeRequestStructure }
     * 
     * 
     */
    public List<SituationExchangeRequestStructure> getSituationExchangeRequest() {
        if (situationExchangeRequest == null) {
            situationExchangeRequest = new ArrayList<SituationExchangeRequestStructure>();
        }
        return this.situationExchangeRequest;
    }
    
    @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
