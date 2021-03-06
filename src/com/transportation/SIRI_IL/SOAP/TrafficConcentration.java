
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Averaged measurements of traffic concentration.
 * 
 * <p>Java class for TrafficConcentration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficConcentration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="concentration" type="{http://datex2.eu/schema/1_0/1_0}ConcentrationVehiclesPerKilometre" minOccurs="0"/>
 *         &lt;element name="occupancy" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="trafficConcentrationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficConcentration", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "concentration",
    "occupancy",
    "trafficConcentrationExtension"
})
public class TrafficConcentration
    extends TrafficValue
{

    protected BigInteger concentration;
    protected Float occupancy;
    protected ExtensionType trafficConcentrationExtension;

    /**
     * Gets the value of the concentration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcentration() {
        return concentration;
    }

    /**
     * Sets the value of the concentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcentration(BigInteger value) {
        this.concentration = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOccupancy(Float value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the trafficConcentrationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficConcentrationExtension() {
        return trafficConcentrationExtension;
    }

    /**
     * Sets the value of the trafficConcentrationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficConcentrationExtension(ExtensionType value) {
        this.trafficConcentrationExtension = value;
    }

}
