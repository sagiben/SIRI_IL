
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * High level assessment of the impact that an unplanned event or operator action defined by the situation record has on the driving conditions.
 * 
 * <p>Java class for Impact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Impact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impactOnTraffic" type="{http://datex2.eu/schema/1_0/1_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="impactDetails" type="{http://datex2.eu/schema/1_0/1_0}ImpactDetails" minOccurs="0"/>
 *         &lt;element name="delays" type="{http://datex2.eu/schema/1_0/1_0}Delays" minOccurs="0"/>
 *         &lt;element name="impactExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impact", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "impactOnTraffic",
    "impactDetails",
    "delays",
    "impactExtension"
})
public class Impact {

    protected TrafficStatusEnum impactOnTraffic;
    protected ImpactDetails impactDetails;
    protected Delays delays;
    protected ExtensionType impactExtension;

    /**
     * Gets the value of the impactOnTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getImpactOnTraffic() {
        return impactOnTraffic;
    }

    /**
     * Sets the value of the impactOnTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setImpactOnTraffic(TrafficStatusEnum value) {
        this.impactOnTraffic = value;
    }

    /**
     * Gets the value of the impactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ImpactDetails }
     *     
     */
    public ImpactDetails getImpactDetails() {
        return impactDetails;
    }

    /**
     * Sets the value of the impactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpactDetails }
     *     
     */
    public void setImpactDetails(ImpactDetails value) {
        this.impactDetails = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link Delays }
     *     
     */
    public Delays getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delays }
     *     
     */
    public void setDelays(Delays value) {
        this.delays = value;
    }

    /**
     * Gets the value of the impactExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getImpactExtension() {
        return impactExtension;
    }

    /**
     * Sets the value of the impactExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setImpactExtension(ExtensionType value) {
        this.impactExtension = value;
    }

}
