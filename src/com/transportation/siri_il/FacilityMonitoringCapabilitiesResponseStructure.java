
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type for Delivery for Vehicle Monitoring Service
 * 
 * <p>Java class for FacilityMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringPermissions" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringCapabilitiesResponseStructure", propOrder = {
    "facilityMonitoringServiceCapabilities",
    "facilityMonitoringPermissions",
    "extensions"
})
public class FacilityMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "FacilityMonitoringServiceCapabilities")
    protected FacilityMonitoringServiceCapabilitiesStructure facilityMonitoringServiceCapabilities;
    @XmlElement(name = "FacilityMonitoringPermissions")
    protected FacilityMonitoringPermissions facilityMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the facilityMonitoringServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure }
     *     
     */
    public FacilityMonitoringServiceCapabilitiesStructure getFacilityMonitoringServiceCapabilities() {
        return facilityMonitoringServiceCapabilities;
    }

    /**
     * Sets the value of the facilityMonitoringServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setFacilityMonitoringServiceCapabilities(FacilityMonitoringServiceCapabilitiesStructure value) {
        this.facilityMonitoringServiceCapabilities = value;
    }

    /**
     * Gets the value of the facilityMonitoringPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringPermissions }
     *     
     */
    public FacilityMonitoringPermissions getFacilityMonitoringPermissions() {
        return facilityMonitoringPermissions;
    }

    /**
     * Sets the value of the facilityMonitoringPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringPermissions }
     *     
     */
    public void setFacilityMonitoringPermissions(FacilityMonitoringPermissions value) {
        this.facilityMonitoringPermissions = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
