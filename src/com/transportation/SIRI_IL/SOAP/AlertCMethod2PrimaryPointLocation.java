
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The point (called Primary point) which is either a single point or at the downstream end of a linear road section. The point is specified by a reference to a point in a pre-defined Alert C location table.
 * 
 * <p>Java class for AlertCMethod2PrimaryPointLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCMethod2PrimaryPointLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertCLocation" type="{http://datex2.eu/schema/1_0/1_0}AlertCLocation"/>
 *         &lt;element name="alertCMethod2PrimaryPointLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCMethod2PrimaryPointLocation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "alertCLocation",
    "alertCMethod2PrimaryPointLocationExtension"
})
public class AlertCMethod2PrimaryPointLocation {

    @XmlElement(required = true)
    protected AlertCLocation alertCLocation;
    protected ExtensionType alertCMethod2PrimaryPointLocationExtension;

    /**
     * Gets the value of the alertCLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocation }
     *     
     */
    public AlertCLocation getAlertCLocation() {
        return alertCLocation;
    }

    /**
     * Sets the value of the alertCLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocation }
     *     
     */
    public void setAlertCLocation(AlertCLocation value) {
        this.alertCLocation = value;
    }

    /**
     * Gets the value of the alertCMethod2PrimaryPointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCMethod2PrimaryPointLocationExtension() {
        return alertCMethod2PrimaryPointLocationExtension;
    }

    /**
     * Sets the value of the alertCMethod2PrimaryPointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCMethod2PrimaryPointLocationExtension(ExtensionType value) {
        this.alertCMethod2PrimaryPointLocationExtension = value;
    }

}
