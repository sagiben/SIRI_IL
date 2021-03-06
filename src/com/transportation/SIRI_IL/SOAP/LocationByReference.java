
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A location defined by reference to a predefined location.
 * 
 * <p>Java class for LocationByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Location">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location
{

    @XmlElement(required = true)
    protected String predefinedLocationReference;
    protected ExtensionType locationByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Sets the value of the predefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationReference(String value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Gets the value of the locationByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Sets the value of the locationByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

}
