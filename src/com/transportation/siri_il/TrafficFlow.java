
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Averaged measurements of traffic flow rates.
 * 
 * <p>Java class for TrafficFlow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficFlow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="axleFlow" type="{http://datex2.eu/schema/1_0/1_0}AxlesPerHour" minOccurs="0"/>
 *         &lt;element name="pCUFlow" type="{http://datex2.eu/schema/1_0/1_0}PassengerCarUnitsPerHour" minOccurs="0"/>
 *         &lt;element name="percentageLongVehicles" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="vehicleFlow" type="{http://datex2.eu/schema/1_0/1_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="trafficFlowExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficFlow", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "axleFlow",
    "pcuFlow",
    "percentageLongVehicles",
    "vehicleFlow",
    "trafficFlowExtension"
})
public class TrafficFlow
    extends TrafficValue
{

    protected BigInteger axleFlow;
    @XmlElement(name = "pCUFlow")
    protected BigInteger pcuFlow;
    protected Float percentageLongVehicles;
    protected BigInteger vehicleFlow;
    protected ExtensionType trafficFlowExtension;

    /**
     * Gets the value of the axleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleFlow() {
        return axleFlow;
    }

    /**
     * Sets the value of the axleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleFlow(BigInteger value) {
        this.axleFlow = value;
    }

    /**
     * Gets the value of the pcuFlow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPCUFlow() {
        return pcuFlow;
    }

    /**
     * Sets the value of the pcuFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPCUFlow(BigInteger value) {
        this.pcuFlow = value;
    }

    /**
     * Gets the value of the percentageLongVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentageLongVehicles() {
        return percentageLongVehicles;
    }

    /**
     * Sets the value of the percentageLongVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentageLongVehicles(Float value) {
        this.percentageLongVehicles = value;
    }

    /**
     * Gets the value of the vehicleFlow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleFlow() {
        return vehicleFlow;
    }

    /**
     * Sets the value of the vehicleFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleFlow(BigInteger value) {
        this.vehicleFlow = value;
    }

    /**
     * Gets the value of the trafficFlowExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficFlowExtension() {
        return trafficFlowExtension;
    }

    /**
     * Sets the value of the trafficFlowExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficFlowExtension(ExtensionType value) {
        this.trafficFlowExtension = value;
    }

}
