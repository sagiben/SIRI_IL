
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Measured or derived values relating to traffic or individual vehicle movements on a specific section or at a specific point on the road network.
 * 
 * <p>Java class for TrafficValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/1_0/1_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="trafficValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "vehicleCharacteristics",
    "trafficValueExtension"
})
@XmlSeeAlso({
    IndividualVehicleMeasurements.class,
    TrafficHeadway.class,
    TrafficSpeed.class,
    TrafficFlow.class,
    TrafficConcentration.class
})
public abstract class TrafficValue
    extends BasicDataValue
{

    protected VehicleCharacteristics vehicleCharacteristics;
    protected ExtensionType trafficValueExtension;

    /**
     * Gets the value of the vehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Sets the value of the vehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    /**
     * Gets the value of the trafficValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficValueExtension() {
        return trafficValueExtension;
    }

    /**
     * Sets the value of the trafficValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficValueExtension(ExtensionType value) {
        this.trafficValueExtension = value;
    }

}
