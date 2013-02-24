
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type for Delivery forSituation Exchange Service
 * 
 * <p>Java class for SituationExchangeCapabilitiesResponseStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceCapabilitiesResponseStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangeServiceCapabilities" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangePermissions" minOccurs="0"/>
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
@XmlType(name = "SituationExchangeCapabilitiesResponseStructure", propOrder = {
    "situationExchangeServiceCapabilities",
    "situationExchangePermissions",
    "extensions"
})
public class SituationExchangeCapabilitiesResponseStructure
    extends AbstractServiceCapabilitiesResponseStructure
{

    @XmlElement(name = "SituationExchangeServiceCapabilities")
    protected SituationExchangeServiceCapabilitiesStructure situationExchangeServiceCapabilities;
    @XmlElement(name = "SituationExchangePermissions")
    protected SituationExchangePermissions situationExchangePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the situationExchangeServiceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public SituationExchangeServiceCapabilitiesStructure getSituationExchangeServiceCapabilities() {
        return situationExchangeServiceCapabilities;
    }

    /**
     * Sets the value of the situationExchangeServiceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeServiceCapabilitiesStructure }
     *     
     */
    public void setSituationExchangeServiceCapabilities(SituationExchangeServiceCapabilitiesStructure value) {
        this.situationExchangeServiceCapabilities = value;
    }

    /**
     * Gets the value of the situationExchangePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangePermissions }
     *     
     */
    public SituationExchangePermissions getSituationExchangePermissions() {
        return situationExchangePermissions;
    }

    /**
     * Sets the value of the situationExchangePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangePermissions }
     *     
     */
    public void setSituationExchangePermissions(SituationExchangePermissions value) {
        this.situationExchangePermissions = value;
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
