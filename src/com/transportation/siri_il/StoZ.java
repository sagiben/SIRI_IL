
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations alphabetically ordered between S and Z.
 * 
 * <p>Java class for StoZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="winterEquipmentAdviceEnum" type="{http://datex2.eu/schema/1_0/1_0}WinterEquipmentAdviceEnum"/>
 *         &lt;element name="vehicleEquipmentEnum" type="{http://datex2.eu/schema/1_0/1_0}VehicleEquipmentEnum"/>
 *         &lt;element name="sourceTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}SourceTypeEnum"/>
 *         &lt;element name="trafficStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficStatusEnum"/>
 *         &lt;element name="urgencyEnum" type="{http://datex2.eu/schema/1_0/1_0}UrgencyEnum"/>
 *         &lt;element name="trafficDestinationTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficDestinationTypeEnum"/>
 *         &lt;element name="speedAdviceEnum" type="{http://datex2.eu/schema/1_0/1_0}SpeedAdviceEnum"/>
 *         &lt;element name="transitServiceInformationEnum" type="{http://datex2.eu/schema/1_0/1_0}TransitServiceInformationEnum"/>
 *         &lt;element name="warningAdviceEnum" type="{http://datex2.eu/schema/1_0/1_0}WarningAdviceEnum"/>
 *         &lt;element name="trafficControlTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlTypeEnum"/>
 *         &lt;element name="vehicleTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}VehicleTypeEnum"/>
 *         &lt;element name="vehicleObstructionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}VehicleObstructionTypeEnum"/>
 *         &lt;element name="vmsfaultEnum" type="{http://datex2.eu/schema/1_0/1_0}VMSFaultEnum"/>
 *         &lt;element name="weatherRelatedRoadConditionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}WeatherRelatedRoadConditionTypeEnum"/>
 *         &lt;element name="subjectTypeOfWorksEnum" type="{http://datex2.eu/schema/1_0/1_0}SubjectTypeOfWorksEnum"/>
 *         &lt;element name="winterEquipmentRequirementEnum" type="{http://datex2.eu/schema/1_0/1_0}WinterEquipmentRequirementEnum"/>
 *         &lt;element name="vehicleStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}VehicleStatusEnum"/>
 *         &lt;element name="vehicleUsageEnum" type="{http://datex2.eu/schema/1_0/1_0}VehicleUsageEnum"/>
 *         &lt;element name="travelTimeTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTypeEnum"/>
 *         &lt;element name="serviceDisruptionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}ServiceDisruptionTypeEnum"/>
 *         &lt;element name="transitServiceTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TransitServiceTypeEnum"/>
 *         &lt;element name="trafficRestrictionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficRestrictionTypeEnum"/>
 *         &lt;element name="validityStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}ValidityStatusEnum"/>
 *         &lt;element name="trafficControlEquipmentTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlEquipmentTypeEnum"/>
 *         &lt;element name="trafficControlOptionsEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlOptionsEnum"/>
 *         &lt;element name="valueCompareOperatorEnum" type="{http://datex2.eu/schema/1_0/1_0}ValueCompareOperatorEnum"/>
 *         &lt;element name="stoZExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="travelTimeTrendTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTrendTypeEnum"/>
 *         &lt;element name="vmstypeEnum" type="{http://datex2.eu/schema/1_0/1_0}VMSTypeEnum"/>
 *         &lt;element name="trafficTrendTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TrafficTrendTypeEnum"/>
 *         &lt;element name="weekOfMonthEnum" type="{http://datex2.eu/schema/1_0/1_0}WeekOfMonthEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoZ", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "winterEquipmentAdviceEnum",
    "vehicleEquipmentEnum",
    "sourceTypeEnum",
    "trafficStatusEnum",
    "urgencyEnum",
    "trafficDestinationTypeEnum",
    "speedAdviceEnum",
    "transitServiceInformationEnum",
    "warningAdviceEnum",
    "trafficControlTypeEnum",
    "vehicleTypeEnum",
    "vehicleObstructionTypeEnum",
    "vmsfaultEnum",
    "weatherRelatedRoadConditionTypeEnum",
    "subjectTypeOfWorksEnum",
    "winterEquipmentRequirementEnum",
    "vehicleStatusEnum",
    "vehicleUsageEnum",
    "travelTimeTypeEnum",
    "serviceDisruptionTypeEnum",
    "transitServiceTypeEnum",
    "trafficRestrictionTypeEnum",
    "validityStatusEnum",
    "trafficControlEquipmentTypeEnum",
    "trafficControlOptionsEnum",
    "valueCompareOperatorEnum",
    "stoZExtension",
    "travelTimeTrendTypeEnum",
    "vmstypeEnum",
    "trafficTrendTypeEnum",
    "weekOfMonthEnum"
})
public abstract class StoZ {

    @XmlElement(required = true)
    protected WinterEquipmentAdviceEnum winterEquipmentAdviceEnum;
    @XmlElement(required = true)
    protected VehicleEquipmentEnum vehicleEquipmentEnum;
    @XmlElement(required = true)
    protected SourceTypeEnum sourceTypeEnum;
    @XmlElement(required = true)
    protected TrafficStatusEnum trafficStatusEnum;
    @XmlElement(required = true)
    protected UrgencyEnum urgencyEnum;
    @XmlElement(required = true)
    protected TrafficDestinationTypeEnum trafficDestinationTypeEnum;
    @XmlElement(required = true)
    protected SpeedAdviceEnum speedAdviceEnum;
    @XmlElement(required = true)
    protected TransitServiceInformationEnum transitServiceInformationEnum;
    @XmlElement(required = true)
    protected WarningAdviceEnum warningAdviceEnum;
    @XmlElement(required = true)
    protected TrafficControlTypeEnum trafficControlTypeEnum;
    @XmlElement(required = true)
    protected VehicleTypeEnum vehicleTypeEnum;
    @XmlElement(required = true)
    protected VehicleObstructionTypeEnum vehicleObstructionTypeEnum;
    @XmlElement(required = true)
    protected VMSFaultEnum vmsfaultEnum;
    @XmlElement(required = true)
    protected WeatherRelatedRoadConditionTypeEnum weatherRelatedRoadConditionTypeEnum;
    @XmlElement(required = true)
    protected SubjectTypeOfWorksEnum subjectTypeOfWorksEnum;
    @XmlElement(required = true)
    protected WinterEquipmentRequirementEnum winterEquipmentRequirementEnum;
    @XmlElement(required = true)
    protected VehicleStatusEnum vehicleStatusEnum;
    @XmlElement(required = true)
    protected VehicleUsageEnum vehicleUsageEnum;
    @XmlElement(required = true)
    protected TravelTimeTypeEnum travelTimeTypeEnum;
    @XmlElement(required = true)
    protected ServiceDisruptionTypeEnum serviceDisruptionTypeEnum;
    @XmlElement(required = true)
    protected TransitServiceTypeEnum transitServiceTypeEnum;
    @XmlElement(required = true)
    protected TrafficRestrictionTypeEnum trafficRestrictionTypeEnum;
    @XmlElement(required = true)
    protected ValidityStatusEnum validityStatusEnum;
    @XmlElement(required = true)
    protected TrafficControlEquipmentTypeEnum trafficControlEquipmentTypeEnum;
    @XmlElement(required = true)
    protected TrafficControlOptionsEnum trafficControlOptionsEnum;
    @XmlElement(required = true)
    protected ValueCompareOperatorEnum valueCompareOperatorEnum;
    protected ExtensionType stoZExtension;
    @XmlElement(required = true)
    protected TravelTimeTrendTypeEnum travelTimeTrendTypeEnum;
    @XmlElement(required = true)
    protected VMSTypeEnum vmstypeEnum;
    @XmlElement(required = true)
    protected TrafficTrendTypeEnum trafficTrendTypeEnum;
    @XmlElement(required = true)
    protected WeekOfMonthEnum weekOfMonthEnum;

    /**
     * Gets the value of the winterEquipmentAdviceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentAdviceEnum }
     *     
     */
    public WinterEquipmentAdviceEnum getWinterEquipmentAdviceEnum() {
        return winterEquipmentAdviceEnum;
    }

    /**
     * Sets the value of the winterEquipmentAdviceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentAdviceEnum }
     *     
     */
    public void setWinterEquipmentAdviceEnum(WinterEquipmentAdviceEnum value) {
        this.winterEquipmentAdviceEnum = value;
    }

    /**
     * Gets the value of the vehicleEquipmentEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public VehicleEquipmentEnum getVehicleEquipmentEnum() {
        return vehicleEquipmentEnum;
    }

    /**
     * Sets the value of the vehicleEquipmentEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipmentEnum(VehicleEquipmentEnum value) {
        this.vehicleEquipmentEnum = value;
    }

    /**
     * Gets the value of the sourceTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeEnum }
     *     
     */
    public SourceTypeEnum getSourceTypeEnum() {
        return sourceTypeEnum;
    }

    /**
     * Sets the value of the sourceTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeEnum }
     *     
     */
    public void setSourceTypeEnum(SourceTypeEnum value) {
        this.sourceTypeEnum = value;
    }

    /**
     * Gets the value of the trafficStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusEnum() {
        return trafficStatusEnum;
    }

    /**
     * Sets the value of the trafficStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusEnum(TrafficStatusEnum value) {
        this.trafficStatusEnum = value;
    }

    /**
     * Gets the value of the urgencyEnum property.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgencyEnum() {
        return urgencyEnum;
    }

    /**
     * Sets the value of the urgencyEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgencyEnum(UrgencyEnum value) {
        this.urgencyEnum = value;
    }

    /**
     * Gets the value of the trafficDestinationTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDestinationTypeEnum }
     *     
     */
    public TrafficDestinationTypeEnum getTrafficDestinationTypeEnum() {
        return trafficDestinationTypeEnum;
    }

    /**
     * Sets the value of the trafficDestinationTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDestinationTypeEnum }
     *     
     */
    public void setTrafficDestinationTypeEnum(TrafficDestinationTypeEnum value) {
        this.trafficDestinationTypeEnum = value;
    }

    /**
     * Gets the value of the speedAdviceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedAdviceEnum }
     *     
     */
    public SpeedAdviceEnum getSpeedAdviceEnum() {
        return speedAdviceEnum;
    }

    /**
     * Sets the value of the speedAdviceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedAdviceEnum }
     *     
     */
    public void setSpeedAdviceEnum(SpeedAdviceEnum value) {
        this.speedAdviceEnum = value;
    }

    /**
     * Gets the value of the transitServiceInformationEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public TransitServiceInformationEnum getTransitServiceInformationEnum() {
        return transitServiceInformationEnum;
    }

    /**
     * Sets the value of the transitServiceInformationEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformationEnum(TransitServiceInformationEnum value) {
        this.transitServiceInformationEnum = value;
    }

    /**
     * Gets the value of the warningAdviceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link WarningAdviceEnum }
     *     
     */
    public WarningAdviceEnum getWarningAdviceEnum() {
        return warningAdviceEnum;
    }

    /**
     * Sets the value of the warningAdviceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningAdviceEnum }
     *     
     */
    public void setWarningAdviceEnum(WarningAdviceEnum value) {
        this.warningAdviceEnum = value;
    }

    /**
     * Gets the value of the trafficControlTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlTypeEnum }
     *     
     */
    public TrafficControlTypeEnum getTrafficControlTypeEnum() {
        return trafficControlTypeEnum;
    }

    /**
     * Sets the value of the trafficControlTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlTypeEnum }
     *     
     */
    public void setTrafficControlTypeEnum(TrafficControlTypeEnum value) {
        this.trafficControlTypeEnum = value;
    }

    /**
     * Gets the value of the vehicleTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public VehicleTypeEnum getVehicleTypeEnum() {
        return vehicleTypeEnum;
    }

    /**
     * Sets the value of the vehicleTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeEnum }
     *     
     */
    public void setVehicleTypeEnum(VehicleTypeEnum value) {
        this.vehicleTypeEnum = value;
    }

    /**
     * Gets the value of the vehicleObstructionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public VehicleObstructionTypeEnum getVehicleObstructionTypeEnum() {
        return vehicleObstructionTypeEnum;
    }

    /**
     * Sets the value of the vehicleObstructionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionTypeEnum(VehicleObstructionTypeEnum value) {
        this.vehicleObstructionTypeEnum = value;
    }

    /**
     * Gets the value of the vmsfaultEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VMSFaultEnum }
     *     
     */
    public VMSFaultEnum getVmsfaultEnum() {
        return vmsfaultEnum;
    }

    /**
     * Sets the value of the vmsfaultEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMSFaultEnum }
     *     
     */
    public void setVmsfaultEnum(VMSFaultEnum value) {
        this.vmsfaultEnum = value;
    }

    /**
     * Gets the value of the weatherRelatedRoadConditionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherRelatedRoadConditionTypeEnum }
     *     
     */
    public WeatherRelatedRoadConditionTypeEnum getWeatherRelatedRoadConditionTypeEnum() {
        return weatherRelatedRoadConditionTypeEnum;
    }

    /**
     * Sets the value of the weatherRelatedRoadConditionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherRelatedRoadConditionTypeEnum }
     *     
     */
    public void setWeatherRelatedRoadConditionTypeEnum(WeatherRelatedRoadConditionTypeEnum value) {
        this.weatherRelatedRoadConditionTypeEnum = value;
    }

    /**
     * Gets the value of the subjectTypeOfWorksEnum property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public SubjectTypeOfWorksEnum getSubjectTypeOfWorksEnum() {
        return subjectTypeOfWorksEnum;
    }

    /**
     * Sets the value of the subjectTypeOfWorksEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public void setSubjectTypeOfWorksEnum(SubjectTypeOfWorksEnum value) {
        this.subjectTypeOfWorksEnum = value;
    }

    /**
     * Gets the value of the winterEquipmentRequirementEnum property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentRequirementEnum }
     *     
     */
    public WinterEquipmentRequirementEnum getWinterEquipmentRequirementEnum() {
        return winterEquipmentRequirementEnum;
    }

    /**
     * Sets the value of the winterEquipmentRequirementEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentRequirementEnum }
     *     
     */
    public void setWinterEquipmentRequirementEnum(WinterEquipmentRequirementEnum value) {
        this.winterEquipmentRequirementEnum = value;
    }

    /**
     * Gets the value of the vehicleStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatusEnum() {
        return vehicleStatusEnum;
    }

    /**
     * Sets the value of the vehicleStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatusEnum(VehicleStatusEnum value) {
        this.vehicleStatusEnum = value;
    }

    /**
     * Gets the value of the vehicleUsageEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public VehicleUsageEnum getVehicleUsageEnum() {
        return vehicleUsageEnum;
    }

    /**
     * Sets the value of the vehicleUsageEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public void setVehicleUsageEnum(VehicleUsageEnum value) {
        this.vehicleUsageEnum = value;
    }

    /**
     * Gets the value of the travelTimeTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeTypeEnum() {
        return travelTimeTypeEnum;
    }

    /**
     * Sets the value of the travelTimeTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeTypeEnum(TravelTimeTypeEnum value) {
        this.travelTimeTypeEnum = value;
    }

    /**
     * Gets the value of the serviceDisruptionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDisruptionTypeEnum }
     *     
     */
    public ServiceDisruptionTypeEnum getServiceDisruptionTypeEnum() {
        return serviceDisruptionTypeEnum;
    }

    /**
     * Sets the value of the serviceDisruptionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDisruptionTypeEnum }
     *     
     */
    public void setServiceDisruptionTypeEnum(ServiceDisruptionTypeEnum value) {
        this.serviceDisruptionTypeEnum = value;
    }

    /**
     * Gets the value of the transitServiceTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public TransitServiceTypeEnum getTransitServiceTypeEnum() {
        return transitServiceTypeEnum;
    }

    /**
     * Sets the value of the transitServiceTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public void setTransitServiceTypeEnum(TransitServiceTypeEnum value) {
        this.transitServiceTypeEnum = value;
    }

    /**
     * Gets the value of the trafficRestrictionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficRestrictionTypeEnum }
     *     
     */
    public TrafficRestrictionTypeEnum getTrafficRestrictionTypeEnum() {
        return trafficRestrictionTypeEnum;
    }

    /**
     * Sets the value of the trafficRestrictionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficRestrictionTypeEnum }
     *     
     */
    public void setTrafficRestrictionTypeEnum(TrafficRestrictionTypeEnum value) {
        this.trafficRestrictionTypeEnum = value;
    }

    /**
     * Gets the value of the validityStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public ValidityStatusEnum getValidityStatusEnum() {
        return validityStatusEnum;
    }

    /**
     * Sets the value of the validityStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public void setValidityStatusEnum(ValidityStatusEnum value) {
        this.validityStatusEnum = value;
    }

    /**
     * Gets the value of the trafficControlEquipmentTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlEquipmentTypeEnum }
     *     
     */
    public TrafficControlEquipmentTypeEnum getTrafficControlEquipmentTypeEnum() {
        return trafficControlEquipmentTypeEnum;
    }

    /**
     * Sets the value of the trafficControlEquipmentTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlEquipmentTypeEnum }
     *     
     */
    public void setTrafficControlEquipmentTypeEnum(TrafficControlEquipmentTypeEnum value) {
        this.trafficControlEquipmentTypeEnum = value;
    }

    /**
     * Gets the value of the trafficControlOptionsEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlOptionsEnum }
     *     
     */
    public TrafficControlOptionsEnum getTrafficControlOptionsEnum() {
        return trafficControlOptionsEnum;
    }

    /**
     * Sets the value of the trafficControlOptionsEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlOptionsEnum }
     *     
     */
    public void setTrafficControlOptionsEnum(TrafficControlOptionsEnum value) {
        this.trafficControlOptionsEnum = value;
    }

    /**
     * Gets the value of the valueCompareOperatorEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ValueCompareOperatorEnum }
     *     
     */
    public ValueCompareOperatorEnum getValueCompareOperatorEnum() {
        return valueCompareOperatorEnum;
    }

    /**
     * Sets the value of the valueCompareOperatorEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCompareOperatorEnum }
     *     
     */
    public void setValueCompareOperatorEnum(ValueCompareOperatorEnum value) {
        this.valueCompareOperatorEnum = value;
    }

    /**
     * Gets the value of the stoZExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getStoZExtension() {
        return stoZExtension;
    }

    /**
     * Sets the value of the stoZExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setStoZExtension(ExtensionType value) {
        this.stoZExtension = value;
    }

    /**
     * Gets the value of the travelTimeTrendTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendTypeEnum() {
        return travelTimeTrendTypeEnum;
    }

    /**
     * Sets the value of the travelTimeTrendTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendTypeEnum(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendTypeEnum = value;
    }

    /**
     * Gets the value of the vmstypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link VMSTypeEnum }
     *     
     */
    public VMSTypeEnum getVmstypeEnum() {
        return vmstypeEnum;
    }

    /**
     * Sets the value of the vmstypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMSTypeEnum }
     *     
     */
    public void setVmstypeEnum(VMSTypeEnum value) {
        this.vmstypeEnum = value;
    }

    /**
     * Gets the value of the trafficTrendTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendTypeEnum() {
        return trafficTrendTypeEnum;
    }

    /**
     * Sets the value of the trafficTrendTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendTypeEnum(TrafficTrendTypeEnum value) {
        this.trafficTrendTypeEnum = value;
    }

    /**
     * Gets the value of the weekOfMonthEnum property.
     * 
     * @return
     *     possible object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public WeekOfMonthEnum getWeekOfMonthEnum() {
        return weekOfMonthEnum;
    }

    /**
     * Sets the value of the weekOfMonthEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekOfMonthEnum }
     *     
     */
    public void setWeekOfMonthEnum(WeekOfMonthEnum value) {
        this.weekOfMonthEnum = value;
    }

}
