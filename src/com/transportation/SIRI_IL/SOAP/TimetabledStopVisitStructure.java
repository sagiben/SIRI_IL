
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type for Timetabled Visit of a vehicle to a stop. May provide information about the arrival, the departure or both.
 * 
 * <p>Java class for TimetabledStopVisitStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimetabledStopVisitStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="MonitoringRef" type="{http://www.siri.org.uk/siri}MonitoringRefStructure"/>
 *         &lt;element name="TargetedVehicleJourney" type="{http://www.siri.org.uk/siri}TargetedVehicleJourneyStructure"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimetabledStopVisitStructure", propOrder = {
    "monitoringRef",
    "targetedVehicleJourney",
    "extensions"
})
public class TimetabledStopVisitStructure
    extends AbstractIdentifiedItemStructure
{

    @XmlElement(name = "MonitoringRef", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "TargetedVehicleJourney", required = true)
    protected TargetedVehicleJourneyStructure targetedVehicleJourney;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the monitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Sets the value of the monitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    /**
     * Gets the value of the targetedVehicleJourney property.
     * 
     * @return
     *     possible object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public TargetedVehicleJourneyStructure getTargetedVehicleJourney() {
        return targetedVehicleJourney;
    }

    /**
     * Sets the value of the targetedVehicleJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetedVehicleJourneyStructure }
     *     
     */
    public void setTargetedVehicleJourney(TargetedVehicleJourneyStructure value) {
        this.targetedVehicleJourney = value;
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
