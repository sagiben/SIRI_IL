
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type for change to equipment availability. Basic structure defined in the first 1.0 SIRI XSD
 * 
 * <p>Java class for FacilityChangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityChangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentAvailability" type="{http://www.siri.org.uk/siri}EquipmentAvailabilityStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="MobilityDisruption" type="{http://www.siri.org.uk/siri}MobilityDisruptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityChangeStructure", propOrder = {
    "equipmentAvailability",
    "situationRef",
    "mobilityDisruption"
})
public class FacilityChangeStructure {

    @XmlElement(name = "EquipmentAvailability")
    protected EquipmentAvailabilityStructure equipmentAvailability;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "MobilityDisruption")
    protected MobilityDisruptionStructure mobilityDisruption;

    /**
     * Gets the value of the equipmentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public EquipmentAvailabilityStructure getEquipmentAvailability() {
        return equipmentAvailability;
    }

    /**
     * Sets the value of the equipmentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure }
     *     
     */
    public void setEquipmentAvailability(EquipmentAvailabilityStructure value) {
        this.equipmentAvailability = value;
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
     * Gets the value of the mobilityDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public MobilityDisruptionStructure getMobilityDisruption() {
        return mobilityDisruption;
    }

    /**
     * Sets the value of the mobilityDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityDisruptionStructure }
     *     
     */
    public void setMobilityDisruption(MobilityDisruptionStructure value) {
        this.mobilityDisruption = value;
    }
    
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}