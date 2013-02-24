
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for the capabilities of an implementation. 
 * 
 * <p>Java class for CapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SiriServiceCapabilitiesResponseGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "productionTimetableCapabilitiesResponse",
    "estimatedTimetableCapabilitiesResponse",
    "stopTimetableCapabilitiesResponse",
    "stopMonitoringCapabilitiesResponse",
    "vehicleMonitoringCapabilitiesResponse",
    "connectionTimetableCapabilitiesResponse",
    "connectionMonitoringCapabilitiesResponse",
    "generalMessageCapabilitiesResponse",
    "facilityMonitoringCapabilitiesResponse",
    "situationExchangeServiceCapabilities"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
{

    @XmlElement(name = "ProductionTimetableCapabilitiesResponse")
    protected ProductionTimetableCapabilitiesResponseStructure productionTimetableCapabilitiesResponse;
    @XmlElement(name = "EstimatedTimetableCapabilitiesResponse")
    protected EstimatedTimetableCapabilitiesResponseStructure estimatedTimetableCapabilitiesResponse;
    @XmlElement(name = "StopTimetableCapabilitiesResponse")
    protected StopTimetableCapabilitiesResponseStructure stopTimetableCapabilitiesResponse;
    @XmlElement(name = "StopMonitoringCapabilitiesResponse")
    protected StopMonitoringCapabilitiesResponseStructure stopMonitoringCapabilitiesResponse;
    @XmlElement(name = "VehicleMonitoringCapabilitiesResponse")
    protected VehicleMonitoringCapabilitiesResponseStructure vehicleMonitoringCapabilitiesResponse;
    @XmlElement(name = "ConnectionTimetableCapabilitiesResponse")
    protected ConnectionTimetableCapabilitiesResponseStructure connectionTimetableCapabilitiesResponse;
    @XmlElement(name = "ConnectionMonitoringCapabilitiesResponse")
    protected ConnectionMonitoringCapabilitiesResponseStructure connectionMonitoringCapabilitiesResponse;
    @XmlElement(name = "GeneralMessageCapabilitiesResponse")
    protected GeneralMessageCapabilitiesResponseStructure generalMessageCapabilitiesResponse;
    @XmlElement(name = "FacilityMonitoringCapabilitiesResponse")
    protected FacilityMonitoringCapabilitiesResponseStructure facilityMonitoringCapabilitiesResponse;
    @XmlElement(name = "SituationExchangeServiceCapabilities")
    protected SituationExchangeServiceCapabilitiesStructure situationExchangeServiceCapabilities;

    /**
     * Gets the value of the productionTimetableCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableCapabilitiesResponseStructure }
     *     
     */
    public ProductionTimetableCapabilitiesResponseStructure getProductionTimetableCapabilitiesResponse() {
        return productionTimetableCapabilitiesResponse;
    }

    /**
     * Sets the value of the productionTimetableCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setProductionTimetableCapabilitiesResponse(ProductionTimetableCapabilitiesResponseStructure value) {
        this.productionTimetableCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the estimatedTimetableCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableCapabilitiesResponseStructure }
     *     
     */
    public EstimatedTimetableCapabilitiesResponseStructure getEstimatedTimetableCapabilitiesResponse() {
        return estimatedTimetableCapabilitiesResponse;
    }

    /**
     * Sets the value of the estimatedTimetableCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setEstimatedTimetableCapabilitiesResponse(EstimatedTimetableCapabilitiesResponseStructure value) {
        this.estimatedTimetableCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the stopTimetableCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableCapabilitiesResponseStructure }
     *     
     */
    public StopTimetableCapabilitiesResponseStructure getStopTimetableCapabilitiesResponse() {
        return stopTimetableCapabilitiesResponse;
    }

    /**
     * Sets the value of the stopTimetableCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setStopTimetableCapabilitiesResponse(StopTimetableCapabilitiesResponseStructure value) {
        this.stopTimetableCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the stopMonitoringCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringCapabilitiesResponseStructure }
     *     
     */
    public StopMonitoringCapabilitiesResponseStructure getStopMonitoringCapabilitiesResponse() {
        return stopMonitoringCapabilitiesResponse;
    }

    /**
     * Sets the value of the stopMonitoringCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setStopMonitoringCapabilitiesResponse(StopMonitoringCapabilitiesResponseStructure value) {
        this.stopMonitoringCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the vehicleMonitoringCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringCapabilitiesResponseStructure }
     *     
     */
    public VehicleMonitoringCapabilitiesResponseStructure getVehicleMonitoringCapabilitiesResponse() {
        return vehicleMonitoringCapabilitiesResponse;
    }

    /**
     * Sets the value of the vehicleMonitoringCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setVehicleMonitoringCapabilitiesResponse(VehicleMonitoringCapabilitiesResponseStructure value) {
        this.vehicleMonitoringCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the connectionTimetableCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure }
     *     
     */
    public ConnectionTimetableCapabilitiesResponseStructure getConnectionTimetableCapabilitiesResponse() {
        return connectionTimetableCapabilitiesResponse;
    }

    /**
     * Sets the value of the connectionTimetableCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableCapabilitiesResponseStructure }
     *     
     */
    public void setConnectionTimetableCapabilitiesResponse(ConnectionTimetableCapabilitiesResponseStructure value) {
        this.connectionTimetableCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the connectionMonitoringCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionMonitoringCapabilitiesResponseStructure }
     *     
     */
    public ConnectionMonitoringCapabilitiesResponseStructure getConnectionMonitoringCapabilitiesResponse() {
        return connectionMonitoringCapabilitiesResponse;
    }

    /**
     * Sets the value of the connectionMonitoringCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setConnectionMonitoringCapabilitiesResponse(ConnectionMonitoringCapabilitiesResponseStructure value) {
        this.connectionMonitoringCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the generalMessageCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageCapabilitiesResponseStructure }
     *     
     */
    public GeneralMessageCapabilitiesResponseStructure getGeneralMessageCapabilitiesResponse() {
        return generalMessageCapabilitiesResponse;
    }

    /**
     * Sets the value of the generalMessageCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageCapabilitiesResponseStructure }
     *     
     */
    public void setGeneralMessageCapabilitiesResponse(GeneralMessageCapabilitiesResponseStructure value) {
        this.generalMessageCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the facilityMonitoringCapabilitiesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringCapabilitiesResponseStructure }
     *     
     */
    public FacilityMonitoringCapabilitiesResponseStructure getFacilityMonitoringCapabilitiesResponse() {
        return facilityMonitoringCapabilitiesResponse;
    }

    /**
     * Sets the value of the facilityMonitoringCapabilitiesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringCapabilitiesResponseStructure }
     *     
     */
    public void setFacilityMonitoringCapabilitiesResponse(FacilityMonitoringCapabilitiesResponseStructure value) {
        this.facilityMonitoringCapabilitiesResponse = value;
    }

    /**
     * Gets the value of the situationExchangeServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure getSituationExchangeServiceCapabilities() {
        return situationExchangeServiceCapabilities;
    }

    /**
     * Sets the value of the situationExchangeServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public void setSituationExchangeServiceCapabilities(SituationExchangeServiceCapabilitiesStructure value) {
        this.situationExchangeServiceCapabilities = value;
    }

}
