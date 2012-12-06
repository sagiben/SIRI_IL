
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations alphabetically ordered between A and D.
 * 
 * <p>Java class for AtoD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtoD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayGroupEnum" type="{http://datex2.eu/schema/1_0/1_0}DayGroupEnum"/>
 *         &lt;element name="computationMethodEnum" type="{http://datex2.eu/schema/1_0/1_0}ComputationMethodEnum"/>
 *         &lt;element name="atoDExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="carParkConfigurationEnum" type="{http://datex2.eu/schema/1_0/1_0}CarParkConfigurationEnum"/>
 *         &lt;element name="authorityOperationTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}AuthorityOperationTypeEnum"/>
 *         &lt;element name="comparisonOperatorEnum" type="{http://datex2.eu/schema/1_0/1_0}ComparisonOperatorEnum"/>
 *         &lt;element name="dataClassEnum" type="{http://datex2.eu/schema/1_0/1_0}DataClassEnum"/>
 *         &lt;element name="abnormalTrafficTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}AbnormalTrafficTypeEnum"/>
 *         &lt;element name="delaysTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}DelaysTypeEnum"/>
 *         &lt;element name="diversionAdviceEnum" type="{http://datex2.eu/schema/1_0/1_0}DiversionAdviceEnum"/>
 *         &lt;element name="confidentialityValueEnum" type="{http://datex2.eu/schema/1_0/1_0}ConfidentialityValueEnum"/>
 *         &lt;element name="countryEnum" type="{http://datex2.eu/schema/1_0/1_0}CountryEnum"/>
 *         &lt;element name="datexPictogramEnum" type="{http://datex2.eu/schema/1_0/1_0}DatexPictogramEnum"/>
 *         &lt;element name="carParkStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}CarParkStatusEnum"/>
 *         &lt;element name="animalPresenceTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}AnimalPresenceTypeEnum"/>
 *         &lt;element name="disturbanceActivityTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}DisturbanceActivityTypeEnum"/>
 *         &lt;element name="constructionWorkTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}ConstructionWorkTypeEnum"/>
 *         &lt;element name="delayCodeEnum" type="{http://datex2.eu/schema/1_0/1_0}DelayCodeEnum"/>
 *         &lt;element name="dayEnum" type="{http://datex2.eu/schema/1_0/1_0}DayEnum"/>
 *         &lt;element name="causeTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}CauseTypeEnum"/>
 *         &lt;element name="accidentTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}AccidentTypeEnum"/>
 *         &lt;element name="dangerousGoodRegulationsEnum" type="{http://datex2.eu/schema/1_0/1_0}DangerousGoodRegulationsEnum"/>
 *         &lt;element name="areaOfInterestEnum" type="{http://datex2.eu/schema/1_0/1_0}AreaOfInterestEnum"/>
 *         &lt;element name="accidentCauseEnum" type="{http://datex2.eu/schema/1_0/1_0}AccidentCauseEnum"/>
 *         &lt;element name="drivingConditionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}DrivingConditionTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtoD", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "dayGroupEnum",
    "computationMethodEnum",
    "atoDExtension",
    "carParkConfigurationEnum",
    "authorityOperationTypeEnum",
    "comparisonOperatorEnum",
    "dataClassEnum",
    "abnormalTrafficTypeEnum",
    "delaysTypeEnum",
    "diversionAdviceEnum",
    "confidentialityValueEnum",
    "countryEnum",
    "datexPictogramEnum",
    "carParkStatusEnum",
    "animalPresenceTypeEnum",
    "disturbanceActivityTypeEnum",
    "constructionWorkTypeEnum",
    "delayCodeEnum",
    "dayEnum",
    "causeTypeEnum",
    "accidentTypeEnum",
    "dangerousGoodRegulationsEnum",
    "areaOfInterestEnum",
    "accidentCauseEnum",
    "drivingConditionTypeEnum"
})
public abstract class AtoD {

    @XmlElement(required = true)
    protected DayGroupEnum dayGroupEnum;
    @XmlElement(required = true)
    protected ComputationMethodEnum computationMethodEnum;
    protected ExtensionType atoDExtension;
    @XmlElement(required = true)
    protected CarParkConfigurationEnum carParkConfigurationEnum;
    @XmlElement(required = true)
    protected AuthorityOperationTypeEnum authorityOperationTypeEnum;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperatorEnum;
    @XmlElement(required = true)
    protected DataClassEnum dataClassEnum;
    @XmlElement(required = true)
    protected AbnormalTrafficTypeEnum abnormalTrafficTypeEnum;
    @XmlElement(required = true)
    protected DelaysTypeEnum delaysTypeEnum;
    @XmlElement(required = true)
    protected DiversionAdviceEnum diversionAdviceEnum;
    @XmlElement(required = true)
    protected ConfidentialityValueEnum confidentialityValueEnum;
    @XmlElement(required = true)
    protected CountryEnum countryEnum;
    @XmlElement(required = true)
    protected DatexPictogramEnum datexPictogramEnum;
    @XmlElement(required = true)
    protected CarParkStatusEnum carParkStatusEnum;
    @XmlElement(required = true)
    protected AnimalPresenceTypeEnum animalPresenceTypeEnum;
    @XmlElement(required = true)
    protected DisturbanceActivityTypeEnum disturbanceActivityTypeEnum;
    @XmlElement(required = true)
    protected ConstructionWorkTypeEnum constructionWorkTypeEnum;
    @XmlElement(required = true)
    protected DelayCodeEnum delayCodeEnum;
    @XmlElement(required = true)
    protected DayEnum dayEnum;
    @XmlElement(required = true)
    protected CauseTypeEnum causeTypeEnum;
    @XmlElement(required = true)
    protected AccidentTypeEnum accidentTypeEnum;
    @XmlElement(required = true)
    protected DangerousGoodRegulationsEnum dangerousGoodRegulationsEnum;
    @XmlElement(required = true)
    protected AreaOfInterestEnum areaOfInterestEnum;
    @XmlElement(required = true)
    protected AccidentCauseEnum accidentCauseEnum;
    @XmlElement(required = true)
    protected DrivingConditionTypeEnum drivingConditionTypeEnum;

    /**
     * Gets the value of the dayGroupEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DayGroupEnum }
     *     
     */
    public DayGroupEnum getDayGroupEnum() {
        return dayGroupEnum;
    }

    /**
     * Sets the value of the dayGroupEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayGroupEnum }
     *     
     */
    public void setDayGroupEnum(DayGroupEnum value) {
        this.dayGroupEnum = value;
    }

    /**
     * Gets the value of the computationMethodEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethodEnum() {
        return computationMethodEnum;
    }

    /**
     * Sets the value of the computationMethodEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethodEnum(ComputationMethodEnum value) {
        this.computationMethodEnum = value;
    }

    /**
     * Gets the value of the atoDExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAtoDExtension() {
        return atoDExtension;
    }

    /**
     * Sets the value of the atoDExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAtoDExtension(ExtensionType value) {
        this.atoDExtension = value;
    }

    /**
     * Gets the value of the carParkConfigurationEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public CarParkConfigurationEnum getCarParkConfigurationEnum() {
        return carParkConfigurationEnum;
    }

    /**
     * Sets the value of the carParkConfigurationEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public void setCarParkConfigurationEnum(CarParkConfigurationEnum value) {
        this.carParkConfigurationEnum = value;
    }

    /**
     * Gets the value of the authorityOperationTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public AuthorityOperationTypeEnum getAuthorityOperationTypeEnum() {
        return authorityOperationTypeEnum;
    }

    /**
     * Sets the value of the authorityOperationTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityOperationTypeEnum }
     *     
     */
    public void setAuthorityOperationTypeEnum(AuthorityOperationTypeEnum value) {
        this.authorityOperationTypeEnum = value;
    }

    /**
     * Gets the value of the comparisonOperatorEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperatorEnum() {
        return comparisonOperatorEnum;
    }

    /**
     * Sets the value of the comparisonOperatorEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperatorEnum(ComparisonOperatorEnum value) {
        this.comparisonOperatorEnum = value;
    }

    /**
     * Gets the value of the dataClassEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DataClassEnum }
     *     
     */
    public DataClassEnum getDataClassEnum() {
        return dataClassEnum;
    }

    /**
     * Sets the value of the dataClassEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataClassEnum }
     *     
     */
    public void setDataClassEnum(DataClassEnum value) {
        this.dataClassEnum = value;
    }

    /**
     * Gets the value of the abnormalTrafficTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficTypeEnum() {
        return abnormalTrafficTypeEnum;
    }

    /**
     * Sets the value of the abnormalTrafficTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficTypeEnum(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficTypeEnum = value;
    }

    /**
     * Gets the value of the delaysTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelaysTypeEnum() {
        return delaysTypeEnum;
    }

    /**
     * Sets the value of the delaysTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelaysTypeEnum(DelaysTypeEnum value) {
        this.delaysTypeEnum = value;
    }

    /**
     * Gets the value of the diversionAdviceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public DiversionAdviceEnum getDiversionAdviceEnum() {
        return diversionAdviceEnum;
    }

    /**
     * Sets the value of the diversionAdviceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public void setDiversionAdviceEnum(DiversionAdviceEnum value) {
        this.diversionAdviceEnum = value;
    }

    /**
     * Gets the value of the confidentialityValueEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentialityValueEnum() {
        return confidentialityValueEnum;
    }

    /**
     * Sets the value of the confidentialityValueEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentialityValueEnum(ConfidentialityValueEnum value) {
        this.confidentialityValueEnum = value;
    }

    /**
     * Gets the value of the countryEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CountryEnum }
     *     
     */
    public CountryEnum getCountryEnum() {
        return countryEnum;
    }

    /**
     * Sets the value of the countryEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryEnum }
     *     
     */
    public void setCountryEnum(CountryEnum value) {
        this.countryEnum = value;
    }

    /**
     * Gets the value of the datexPictogramEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DatexPictogramEnum }
     *     
     */
    public DatexPictogramEnum getDatexPictogramEnum() {
        return datexPictogramEnum;
    }

    /**
     * Sets the value of the datexPictogramEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatexPictogramEnum }
     *     
     */
    public void setDatexPictogramEnum(DatexPictogramEnum value) {
        this.datexPictogramEnum = value;
    }

    /**
     * Gets the value of the carParkStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public CarParkStatusEnum getCarParkStatusEnum() {
        return carParkStatusEnum;
    }

    /**
     * Sets the value of the carParkStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public void setCarParkStatusEnum(CarParkStatusEnum value) {
        this.carParkStatusEnum = value;
    }

    /**
     * Gets the value of the animalPresenceTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceTypeEnum() {
        return animalPresenceTypeEnum;
    }

    /**
     * Sets the value of the animalPresenceTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceTypeEnum(AnimalPresenceTypeEnum value) {
        this.animalPresenceTypeEnum = value;
    }

    /**
     * Gets the value of the disturbanceActivityTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public DisturbanceActivityTypeEnum getDisturbanceActivityTypeEnum() {
        return disturbanceActivityTypeEnum;
    }

    /**
     * Sets the value of the disturbanceActivityTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityTypeEnum(DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityTypeEnum = value;
    }

    /**
     * Gets the value of the constructionWorkTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkTypeEnum() {
        return constructionWorkTypeEnum;
    }

    /**
     * Sets the value of the constructionWorkTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkTypeEnum(ConstructionWorkTypeEnum value) {
        this.constructionWorkTypeEnum = value;
    }

    /**
     * Gets the value of the delayCodeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DelayCodeEnum }
     *     
     */
    public DelayCodeEnum getDelayCodeEnum() {
        return delayCodeEnum;
    }

    /**
     * Sets the value of the delayCodeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayCodeEnum }
     *     
     */
    public void setDelayCodeEnum(DelayCodeEnum value) {
        this.delayCodeEnum = value;
    }

    /**
     * Gets the value of the dayEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DayEnum }
     *     
     */
    public DayEnum getDayEnum() {
        return dayEnum;
    }

    /**
     * Sets the value of the dayEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayEnum }
     *     
     */
    public void setDayEnum(DayEnum value) {
        this.dayEnum = value;
    }

    /**
     * Gets the value of the causeTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link CauseTypeEnum }
     *     
     */
    public CauseTypeEnum getCauseTypeEnum() {
        return causeTypeEnum;
    }

    /**
     * Sets the value of the causeTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseTypeEnum }
     *     
     */
    public void setCauseTypeEnum(CauseTypeEnum value) {
        this.causeTypeEnum = value;
    }

    /**
     * Gets the value of the accidentTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AccidentTypeEnum }
     *     
     */
    public AccidentTypeEnum getAccidentTypeEnum() {
        return accidentTypeEnum;
    }

    /**
     * Sets the value of the accidentTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentTypeEnum }
     *     
     */
    public void setAccidentTypeEnum(AccidentTypeEnum value) {
        this.accidentTypeEnum = value;
    }

    /**
     * Gets the value of the dangerousGoodRegulationsEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodRegulationsEnum }
     *     
     */
    public DangerousGoodRegulationsEnum getDangerousGoodRegulationsEnum() {
        return dangerousGoodRegulationsEnum;
    }

    /**
     * Sets the value of the dangerousGoodRegulationsEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodRegulationsEnum }
     *     
     */
    public void setDangerousGoodRegulationsEnum(DangerousGoodRegulationsEnum value) {
        this.dangerousGoodRegulationsEnum = value;
    }

    /**
     * Gets the value of the areaOfInterestEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterestEnum() {
        return areaOfInterestEnum;
    }

    /**
     * Sets the value of the areaOfInterestEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterestEnum(AreaOfInterestEnum value) {
        this.areaOfInterestEnum = value;
    }

    /**
     * Gets the value of the accidentCauseEnum property.
     * 
     * @return
     *     possible object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public AccidentCauseEnum getAccidentCauseEnum() {
        return accidentCauseEnum;
    }

    /**
     * Sets the value of the accidentCauseEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public void setAccidentCauseEnum(AccidentCauseEnum value) {
        this.accidentCauseEnum = value;
    }

    /**
     * Gets the value of the drivingConditionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public DrivingConditionTypeEnum getDrivingConditionTypeEnum() {
        return drivingConditionTypeEnum;
    }

    /**
     * Sets the value of the drivingConditionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingConditionTypeEnum }
     *     
     */
    public void setDrivingConditionTypeEnum(DrivingConditionTypeEnum value) {
        this.drivingConditionTypeEnum = value;
    }

}
