
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delivery for Stop Monitoring Service.
 * 
 * <p>Java class for StopMonitoringCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringPermissions" minOccurs="0"/>
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
@XmlType(name = "StopMonitoringCapabilitiesResponseStructure", propOrder = {
    "stopMonitoringServiceCapabilities",
    "stopMonitoringPermissions",
    "extensions"
})
public class StopMonitoringCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "StopMonitoringServiceCapabilities")
    protected StopMonitoringServiceCapabilitiesStructure stopMonitoringServiceCapabilities;
    @XmlElement(name = "StopMonitoringPermissions")
    protected StopMonitoringPermissions stopMonitoringPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the stopMonitoringServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringServiceCapabilitiesStructure }
     *     
     */
    public StopMonitoringServiceCapabilitiesStructure getStopMonitoringServiceCapabilities() {
        return stopMonitoringServiceCapabilities;
    }

    /**
     * Sets the value of the stopMonitoringServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringServiceCapabilitiesStructure }
     *     
     */
    public void setStopMonitoringServiceCapabilities(StopMonitoringServiceCapabilitiesStructure value) {
        this.stopMonitoringServiceCapabilities = value;
    }

    /**
     * Gets the value of the stopMonitoringPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringPermissions }
     *     
     */
    public StopMonitoringPermissions getStopMonitoringPermissions() {
        return stopMonitoringPermissions;
    }

    /**
     * Sets the value of the stopMonitoringPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringPermissions }
     *     
     */
    public void setStopMonitoringPermissions(StopMonitoringPermissions value) {
        this.stopMonitoringPermissions = value;
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
