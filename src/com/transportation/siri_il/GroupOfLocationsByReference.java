
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A group of locations defined by reference to a predefined set of locations.
 * 
 * <p>Java class for GroupOfLocationsByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupOfLocationsByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="groupOfLocationsByReferenceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfLocationsByReference", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "predefinedLocationSetReference",
    "groupOfLocationsByReferenceExtension"
})
public class GroupOfLocationsByReference
    extends GroupOfLocations
{

    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    protected ExtensionType groupOfLocationsByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationSetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Sets the value of the predefinedLocationSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    /**
     * Gets the value of the groupOfLocationsByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfLocationsByReferenceExtension() {
        return groupOfLocationsByReferenceExtension;
    }

    /**
     * Sets the value of the groupOfLocationsByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfLocationsByReferenceExtension(ExtensionType value) {
        this.groupOfLocationsByReferenceExtension = value;
    }

}
