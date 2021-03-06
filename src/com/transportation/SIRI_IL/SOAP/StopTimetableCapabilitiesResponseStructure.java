
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type for Delivery for Stop Timetable Service
 * 
 * <p>Java class for StopTimetableCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetablePermissions" minOccurs="0"/>
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
@XmlType(name = "StopTimetableCapabilitiesResponseStructure", propOrder = {
    "stopTimetableServiceCapabilities",
    "stopTimetablePermissions",
    "extensions"
})
public class StopTimetableCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "StopTimetableServiceCapabilities")
    protected StopTimetableServiceCapabilitiesStructure stopTimetableServiceCapabilities;
    @XmlElement(name = "StopTimetablePermissions")
    protected StopTimetablePermissions stopTimetablePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the stopTimetableServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableServiceCapabilitiesStructure }
     *     
     */
    public StopTimetableServiceCapabilitiesStructure getStopTimetableServiceCapabilities() {
        return stopTimetableServiceCapabilities;
    }

    /**
     * Sets the value of the stopTimetableServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableServiceCapabilitiesStructure }
     *     
     */
    public void setStopTimetableServiceCapabilities(StopTimetableServiceCapabilitiesStructure value) {
        this.stopTimetableServiceCapabilities = value;
    }

    /**
     * Gets the value of the stopTimetablePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetablePermissions }
     *     
     */
    public StopTimetablePermissions getStopTimetablePermissions() {
        return stopTimetablePermissions;
    }

    /**
     * Sets the value of the stopTimetablePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetablePermissions }
     *     
     */
    public void setStopTimetablePermissions(StopTimetablePermissions value) {
        this.stopTimetablePermissions = value;
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
