
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of traffic management controls which affect the road network that have been instigated by the network/road operator. These controls may require either optional or mandatory compliance.
 * 
 * <p>Java class for TrafficControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficControlOptions" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlOptionsEnum" minOccurs="0"/>
 *         &lt;element name="trafficControlType" type="{http://datex2.eu/schema/1_0/1_0}TrafficControlTypeEnum" minOccurs="0"/>
 *         &lt;element name="trafficControlExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficControl", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "trafficControlOptions",
    "trafficControlType",
    "trafficControlExtension"
})
@XmlSeeAlso({
    Rerouting.class,
    TemporaryLimits.class
})
public class TrafficControl {

    protected TrafficControlOptionsEnum trafficControlOptions;
    protected TrafficControlTypeEnum trafficControlType;
    protected ExtensionType trafficControlExtension;

    /**
     * Gets the value of the trafficControlOptions property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlOptionsEnum }
     *     
     */
    public TrafficControlOptionsEnum getTrafficControlOptions() {
        return trafficControlOptions;
    }

    /**
     * Sets the value of the trafficControlOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlOptionsEnum }
     *     
     */
    public void setTrafficControlOptions(TrafficControlOptionsEnum value) {
        this.trafficControlOptions = value;
    }

    /**
     * Gets the value of the trafficControlType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControlTypeEnum }
     *     
     */
    public TrafficControlTypeEnum getTrafficControlType() {
        return trafficControlType;
    }

    /**
     * Sets the value of the trafficControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControlTypeEnum }
     *     
     */
    public void setTrafficControlType(TrafficControlTypeEnum value) {
        this.trafficControlType = value;
    }

    /**
     * Gets the value of the trafficControlExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficControlExtension() {
        return trafficControlExtension;
    }

    /**
     * Sets the value of the trafficControlExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficControlExtension(ExtensionType value) {
        this.trafficControlExtension = value;
    }

}
