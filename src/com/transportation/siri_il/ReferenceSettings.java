
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of the default value for traffic status on a set of predefined locations on the road network. Only when traffic status differs from this value at a location in the set need a value be sent.
 * 
 * <p>Java class for ReferenceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationSetReference" type="{http://datex2.eu/schema/1_0/1_0}Reference" minOccurs="0"/>
 *         &lt;element name="trafficStatusDefault" type="{http://datex2.eu/schema/1_0/1_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="referenceSettingsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSettings", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "locationSetReference",
    "trafficStatusDefault",
    "referenceSettingsExtension"
})
public class ReferenceSettings {

    protected String locationSetReference;
    protected TrafficStatusEnum trafficStatusDefault;
    protected ExtensionType referenceSettingsExtension;

    /**
     * Gets the value of the locationSetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSetReference() {
        return locationSetReference;
    }

    /**
     * Sets the value of the locationSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSetReference(String value) {
        this.locationSetReference = value;
    }

    /**
     * Gets the value of the trafficStatusDefault property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusDefault() {
        return trafficStatusDefault;
    }

    /**
     * Sets the value of the trafficStatusDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusDefault(TrafficStatusEnum value) {
        this.trafficStatusDefault = value;
    }

    /**
     * Gets the value of the referenceSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferenceSettingsExtension() {
        return referenceSettingsExtension;
    }

    /**
     * Sets the value of the referenceSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferenceSettingsExtension(ExtensionType value) {
        this.referenceSettingsExtension = value;
    }

}
