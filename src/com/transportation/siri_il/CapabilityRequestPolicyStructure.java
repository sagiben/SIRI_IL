
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Common Request Policy capabilities.
 * 
 * <p>Java class for CapabilityRequestPolicyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NationalLanguage" type="{http://www.w3.org/2001/XMLSchema}language" maxOccurs="unbounded"/>
 *         &lt;choice>
 *           &lt;element name="GmlCoordinateFormat" type="{http://www.siri.org.uk/siri}SrsNameType"/>
 *           &lt;element name="WgsDecimalDegrees" type="{http://www.siri.org.uk/siri}EmptyType"/>
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
@XmlType(name = "CapabilityRequestPolicyStructure", propOrder = {
    "nationalLanguage",
    "gmlCoordinateFormat",
    "wgsDecimalDegrees"
})
@XmlSeeAlso({
    com.transportation.siri_il.VehicleMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    com.transportation.siri_il.ConnectionTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    com.transportation.siri_il.ProductionTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    com.transportation.siri_il.FacilityMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    com.transportation.siri_il.SituationExchangeServiceCapabilitiesStructure.RequestPolicy.class,
    com.transportation.siri_il.EstimatedTimetableServiceCapabilitiesStructure.RequestPolicy.class,
    VehicleMonitoringCapabilityRequestPolicyStructure.class,
    ConnectionMonitoringCapabilityRequestPolicyStructure.class,
    ConnectionTimetableCapabilityRequestPolicyStructure.class,
    StopMonitoringCapabilityRequestPolicyStructure.class,
    com.transportation.siri_il.ConnectionMonitoringServiceCapabilitiesStructure.RequestPolicy.class,
    EstimatedTimetableCapabilityRequestPolicyStructure.class,
    ProductionTimetableCapabilityRequestPolicyStructure.class
})
public class CapabilityRequestPolicyStructure {

    @XmlElement(name = "NationalLanguage", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> nationalLanguage;
    @XmlElement(name = "GmlCoordinateFormat")
    protected String gmlCoordinateFormat;
    @XmlElement(name = "WgsDecimalDegrees")
    protected String wgsDecimalDegrees;

    /**
     * Gets the value of the nationalLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNationalLanguage() {
        if (nationalLanguage == null) {
            nationalLanguage = new ArrayList<String>();
        }
        return this.nationalLanguage;
    }

    /**
     * Gets the value of the gmlCoordinateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmlCoordinateFormat() {
        return gmlCoordinateFormat;
    }

    /**
     * Sets the value of the gmlCoordinateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmlCoordinateFormat(String value) {
        this.gmlCoordinateFormat = value;
    }

    /**
     * Gets the value of the wgsDecimalDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWgsDecimalDegrees() {
        return wgsDecimalDegrees;
    }

    /**
     * Sets the value of the wgsDecimalDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWgsDecimalDegrees(String value) {
        this.wgsDecimalDegrees = value;
    }

}
