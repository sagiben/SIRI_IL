
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A single point on the road network defined by reference to a pre-defined Alert C location table and which has an associated direction of traffic flow.
 * 
 * <p>Java class for AlertCPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocationCountryCode" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="alertCLocationTableNumber" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="alertCLocationTableVersion" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="alertCPointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCPoint", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "alertCLocationCountryCode",
    "alertCLocationTableNumber",
    "alertCLocationTableVersion",
    "alertCPointExtension"
})
@XmlSeeAlso({
    AlertCMethod2Point.class,
    AlertCMethod4Point.class
})
public abstract class AlertCPoint {

    @XmlElement(required = true)
    protected String alertCLocationCountryCode;
    @XmlElement(required = true)
    protected String alertCLocationTableNumber;
    @XmlElement(required = true)
    protected String alertCLocationTableVersion;
    protected ExtensionType alertCPointExtension;

    /**
     * Gets the value of the alertCLocationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCountryCode() {
        return alertCLocationCountryCode;
    }

    /**
     * Sets the value of the alertCLocationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCountryCode(String value) {
        this.alertCLocationCountryCode = value;
    }

    /**
     * Gets the value of the alertCLocationTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableNumber() {
        return alertCLocationTableNumber;
    }

    /**
     * Sets the value of the alertCLocationTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableNumber(String value) {
        this.alertCLocationTableNumber = value;
    }

    /**
     * Gets the value of the alertCLocationTableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationTableVersion() {
        return alertCLocationTableVersion;
    }

    /**
     * Sets the value of the alertCLocationTableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationTableVersion(String value) {
        this.alertCLocationTableVersion = value;
    }

    /**
     * Gets the value of the alertCPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCPointExtension() {
        return alertCPointExtension;
    }

    /**
     * Sets the value of the alertCPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCPointExtension(ExtensionType value) {
        this.alertCPointExtension = value;
    }

}
