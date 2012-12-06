
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Averaged measurement of traffic headway, i.e. the distance between vehicles.
 * 
 * <p>Java class for TrafficHeadway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficHeadway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="averageDistanceHeadway" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="averageTimeHeadway" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="trafficHeadwayExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficHeadway", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "averageDistanceHeadway",
    "averageTimeHeadway",
    "trafficHeadwayExtension"
})
public class TrafficHeadway
    extends TrafficValue
{

    protected Float averageDistanceHeadway;
    protected Float averageTimeHeadway;
    protected ExtensionType trafficHeadwayExtension;

    /**
     * Gets the value of the averageDistanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageDistanceHeadway() {
        return averageDistanceHeadway;
    }

    /**
     * Sets the value of the averageDistanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageDistanceHeadway(Float value) {
        this.averageDistanceHeadway = value;
    }

    /**
     * Gets the value of the averageTimeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageTimeHeadway() {
        return averageTimeHeadway;
    }

    /**
     * Sets the value of the averageTimeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageTimeHeadway(Float value) {
        this.averageTimeHeadway = value;
    }

    /**
     * Gets the value of the trafficHeadwayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficHeadwayExtension() {
        return trafficHeadwayExtension;
    }

    /**
     * Sets the value of the trafficHeadwayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficHeadwayExtension(ExtensionType value) {
        this.trafficHeadwayExtension = value;
    }

}
