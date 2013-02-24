
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Service Request Type for Vehicle Monitoring Service
 * 
 * <p>Java class for VehicleMonitoringRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleMonitoringRequestPolicyGroup"/>
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
@XmlType(name = "VehicleMonitoringRequestStructure", propOrder = {
    "vehicleMonitoringRef",
    "vehicleRef",
    "lineRef",
    "directionRef",
    "language",
    "maximumVehicles",
    "vehicleMonitoringDetailLevel",
    "extensions"
})
public class VehicleMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(name = "VehicleMonitoringRef")
    protected VehicleMonitoringRefStructure vehicleMonitoringRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "MaximumVehicles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumVehicles;
    @XmlElement(name = "VehicleMonitoringDetailLevel")
    protected VehicleMonitoringDetailEnumeration vehicleMonitoringDetailLevel;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the vehicleMonitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public VehicleMonitoringRefStructure getVehicleMonitoringRef() {
        return vehicleMonitoringRef;
    }

    /**
     * Sets the value of the vehicleMonitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public void setVehicleMonitoringRef(VehicleMonitoringRefStructure value) {
        this.vehicleMonitoringRef = value;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the maximumVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumVehicles() {
        return maximumVehicles;
    }

    /**
     * Sets the value of the maximumVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumVehicles(BigInteger value) {
        this.maximumVehicles = value;
    }

    /**
     * Gets the value of the vehicleMonitoringDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringDetailEnumeration }
     *     
     */
    public VehicleMonitoringDetailEnumeration getVehicleMonitoringDetailLevel() {
        return vehicleMonitoringDetailLevel;
    }

    /**
     * Sets the value of the vehicleMonitoringDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringDetailEnumeration }
     *     
     */
    public void setVehicleMonitoringDetailLevel(VehicleMonitoringDetailEnumeration value) {
        this.vehicleMonitoringDetailLevel = value;
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
