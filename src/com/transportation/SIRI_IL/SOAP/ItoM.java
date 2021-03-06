
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations alphabetically ordered between I and M.
 * 
 * <p>Java class for ItoM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItoM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itoMExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="instructionsEnum" type="{http://datex2.eu/schema/1_0/1_0}InstructionsEnum"/>
 *         &lt;element name="injuryStatusTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}InjuryStatusTypeEnum"/>
 *         &lt;element name="loadTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}LoadTypeEnum"/>
 *         &lt;element name="mobilityEnum" type="{http://datex2.eu/schema/1_0/1_0}MobilityEnum"/>
 *         &lt;element name="maintenanceVehicleActionsEnum" type="{http://datex2.eu/schema/1_0/1_0}MaintenanceVehicleActionsEnum"/>
 *         &lt;element name="matrixFaultEnum" type="{http://datex2.eu/schema/1_0/1_0}MatrixFaultEnum"/>
 *         &lt;element name="informationStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}InformationStatusEnum"/>
 *         &lt;element name="involvementRolesEnum" type="{http://datex2.eu/schema/1_0/1_0}InvolvementRolesEnum"/>
 *         &lt;element name="laneUsageEnum" type="{http://datex2.eu/schema/1_0/1_0}LaneUsageEnum"/>
 *         &lt;element name="informationUsageEnum" type="{http://datex2.eu/schema/1_0/1_0}InformationUsageEnum"/>
 *         &lt;element name="measuredOrDerivedDataTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}MeasuredOrDerivedDataTypeEnum"/>
 *         &lt;element name="logicalOperatorEnum" type="{http://datex2.eu/schema/1_0/1_0}LogicalOperatorEnum"/>
 *         &lt;element name="monthOfYearEnum" type="{http://datex2.eu/schema/1_0/1_0}MonthOfYearEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItoM", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "itoMExtension",
    "instructionsEnum",
    "injuryStatusTypeEnum",
    "loadTypeEnum",
    "mobilityEnum",
    "maintenanceVehicleActionsEnum",
    "matrixFaultEnum",
    "informationStatusEnum",
    "involvementRolesEnum",
    "laneUsageEnum",
    "informationUsageEnum",
    "measuredOrDerivedDataTypeEnum",
    "logicalOperatorEnum",
    "monthOfYearEnum"
})
public abstract class ItoM {

    protected ExtensionType itoMExtension;
    @XmlElement(required = true)
    protected InstructionsEnum instructionsEnum;
    @XmlElement(required = true)
    protected InjuryStatusTypeEnum injuryStatusTypeEnum;
    @XmlElement(required = true)
    protected LoadTypeEnum loadTypeEnum;
    @XmlElement(required = true)
    protected MobilityEnum mobilityEnum;
    @XmlElement(required = true)
    protected MaintenanceVehicleActionsEnum maintenanceVehicleActionsEnum;
    @XmlElement(required = true)
    protected MatrixFaultEnum matrixFaultEnum;
    @XmlElement(required = true)
    protected InformationStatusEnum informationStatusEnum;
    @XmlElement(required = true)
    protected InvolvementRolesEnum involvementRolesEnum;
    @XmlElement(required = true)
    protected LaneUsageEnum laneUsageEnum;
    @XmlElement(required = true)
    protected InformationUsageEnum informationUsageEnum;
    @XmlElement(required = true)
    protected MeasuredOrDerivedDataTypeEnum measuredOrDerivedDataTypeEnum;
    @XmlElement(required = true)
    protected LogicalOperatorEnum logicalOperatorEnum;
    @XmlElement(required = true)
    protected MonthOfYearEnum monthOfYearEnum;

    /**
     * Gets the value of the itoMExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItoMExtension() {
        return itoMExtension;
    }

    /**
     * Sets the value of the itoMExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItoMExtension(ExtensionType value) {
        this.itoMExtension = value;
    }

    /**
     * Gets the value of the instructionsEnum property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionsEnum }
     *     
     */
    public InstructionsEnum getInstructionsEnum() {
        return instructionsEnum;
    }

    /**
     * Sets the value of the instructionsEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionsEnum }
     *     
     */
    public void setInstructionsEnum(InstructionsEnum value) {
        this.instructionsEnum = value;
    }

    /**
     * Gets the value of the injuryStatusTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public InjuryStatusTypeEnum getInjuryStatusTypeEnum() {
        return injuryStatusTypeEnum;
    }

    /**
     * Sets the value of the injuryStatusTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InjuryStatusTypeEnum }
     *     
     */
    public void setInjuryStatusTypeEnum(InjuryStatusTypeEnum value) {
        this.injuryStatusTypeEnum = value;
    }

    /**
     * Gets the value of the loadTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadTypeEnum() {
        return loadTypeEnum;
    }

    /**
     * Sets the value of the loadTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadTypeEnum(LoadTypeEnum value) {
        this.loadTypeEnum = value;
    }

    /**
     * Gets the value of the mobilityEnum property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityEnum() {
        return mobilityEnum;
    }

    /**
     * Sets the value of the mobilityEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityEnum(MobilityEnum value) {
        this.mobilityEnum = value;
    }

    /**
     * Gets the value of the maintenanceVehicleActionsEnum property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceVehicleActionsEnum }
     *     
     */
    public MaintenanceVehicleActionsEnum getMaintenanceVehicleActionsEnum() {
        return maintenanceVehicleActionsEnum;
    }

    /**
     * Sets the value of the maintenanceVehicleActionsEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceVehicleActionsEnum }
     *     
     */
    public void setMaintenanceVehicleActionsEnum(MaintenanceVehicleActionsEnum value) {
        this.maintenanceVehicleActionsEnum = value;
    }

    /**
     * Gets the value of the matrixFaultEnum property.
     * 
     * @return
     *     possible object is
     *     {@link MatrixFaultEnum }
     *     
     */
    public MatrixFaultEnum getMatrixFaultEnum() {
        return matrixFaultEnum;
    }

    /**
     * Sets the value of the matrixFaultEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixFaultEnum }
     *     
     */
    public void setMatrixFaultEnum(MatrixFaultEnum value) {
        this.matrixFaultEnum = value;
    }

    /**
     * Gets the value of the informationStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatusEnum() {
        return informationStatusEnum;
    }

    /**
     * Sets the value of the informationStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatusEnum(InformationStatusEnum value) {
        this.informationStatusEnum = value;
    }

    /**
     * Gets the value of the involvementRolesEnum property.
     * 
     * @return
     *     possible object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public InvolvementRolesEnum getInvolvementRolesEnum() {
        return involvementRolesEnum;
    }

    /**
     * Sets the value of the involvementRolesEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvolvementRolesEnum }
     *     
     */
    public void setInvolvementRolesEnum(InvolvementRolesEnum value) {
        this.involvementRolesEnum = value;
    }

    /**
     * Gets the value of the laneUsageEnum property.
     * 
     * @return
     *     possible object is
     *     {@link LaneUsageEnum }
     *     
     */
    public LaneUsageEnum getLaneUsageEnum() {
        return laneUsageEnum;
    }

    /**
     * Sets the value of the laneUsageEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneUsageEnum }
     *     
     */
    public void setLaneUsageEnum(LaneUsageEnum value) {
        this.laneUsageEnum = value;
    }

    /**
     * Gets the value of the informationUsageEnum property.
     * 
     * @return
     *     possible object is
     *     {@link InformationUsageEnum }
     *     
     */
    public InformationUsageEnum getInformationUsageEnum() {
        return informationUsageEnum;
    }

    /**
     * Sets the value of the informationUsageEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationUsageEnum }
     *     
     */
    public void setInformationUsageEnum(InformationUsageEnum value) {
        this.informationUsageEnum = value;
    }

    /**
     * Gets the value of the measuredOrDerivedDataTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getMeasuredOrDerivedDataTypeEnum() {
        return measuredOrDerivedDataTypeEnum;
    }

    /**
     * Sets the value of the measuredOrDerivedDataTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setMeasuredOrDerivedDataTypeEnum(MeasuredOrDerivedDataTypeEnum value) {
        this.measuredOrDerivedDataTypeEnum = value;
    }

    /**
     * Gets the value of the logicalOperatorEnum property.
     * 
     * @return
     *     possible object is
     *     {@link LogicalOperatorEnum }
     *     
     */
    public LogicalOperatorEnum getLogicalOperatorEnum() {
        return logicalOperatorEnum;
    }

    /**
     * Sets the value of the logicalOperatorEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalOperatorEnum }
     *     
     */
    public void setLogicalOperatorEnum(LogicalOperatorEnum value) {
        this.logicalOperatorEnum = value;
    }

    /**
     * Gets the value of the monthOfYearEnum property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public MonthOfYearEnum getMonthOfYearEnum() {
        return monthOfYearEnum;
    }

    /**
     * Sets the value of the monthOfYearEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfYearEnum }
     *     
     */
    public void setMonthOfYearEnum(MonthOfYearEnum value) {
        this.monthOfYearEnum = value;
    }

}
