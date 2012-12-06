
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of any change concernin g a facility. New structure defined in SIRI XSD 1.1 for Faclities Management
 * 
 * <p>Java class for FacilityConditionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityConditionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/>
 *         &lt;/choice>
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="Remedy" type="{http://www.siri.org.uk/siri}RemedyStructure" minOccurs="0"/>
 *         &lt;element name="MonitoringInfo" type="{http://www.siri.org.uk/siri}MonitoringInformationStructure" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityConditionStructure", propOrder = {
    "facility",
    "facilityRef",
    "facilityStatus",
    "situationRef",
    "remedy",
    "monitoringInfo",
    "validityPeriod",
    "extensions"
})
public class FacilityConditionStructure {

    @XmlElement(name = "Facility")
    protected FacilityStructure facility;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "FacilityStatus", required = true)
    protected FacilityStatusStructure facilityStatus;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Remedy")
    protected RemedyStructure remedy;
    @XmlElement(name = "MonitoringInfo")
    protected MonitoringInformationStructure monitoringInfo;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampRangeStructure validityPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure }
     *     
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure }
     *     
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Sets the value of the facilityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Gets the value of the facilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public FacilityStatusStructure getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * Sets the value of the facilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusStructure }
     *     
     */
    public void setFacilityStatus(FacilityStatusStructure value) {
        this.facilityStatus = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Sets the value of the situationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Gets the value of the remedy property.
     * 
     * @return
     *     possible object is
     *     {@link RemedyStructure }
     *     
     */
    public RemedyStructure getRemedy() {
        return remedy;
    }

    /**
     * Sets the value of the remedy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemedyStructure }
     *     
     */
    public void setRemedy(RemedyStructure value) {
        this.remedy = value;
    }

    /**
     * Gets the value of the monitoringInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public MonitoringInformationStructure getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     * Sets the value of the monitoringInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringInformationStructure }
     *     
     */
    public void setMonitoringInfo(MonitoringInformationStructure value) {
        this.monitoringInfo = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public HalfOpenTimestampRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
