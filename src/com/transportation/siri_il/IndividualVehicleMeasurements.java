
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurements relating to individual vehicles.
 * 
 * <p>Java class for IndividualVehicleMeasurements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleMeasurements">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="vehicleSpeed" type="{http://datex2.eu/schema/1_0/1_0}VehicleSpeed" minOccurs="0"/>
 *         &lt;element name="vehicleDetectionTime" type="{http://datex2.eu/schema/1_0/1_0}VehicleDetectionTime" minOccurs="0"/>
 *         &lt;element name="vehicleHeadway" type="{http://datex2.eu/schema/1_0/1_0}VehicleHeadway" minOccurs="0"/>
 *         &lt;element name="individualVehicleMeasurementsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleMeasurements", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "vehicleSpeed",
    "vehicleDetectionTime",
    "vehicleHeadway",
    "individualVehicleMeasurementsExtension"
})
public class IndividualVehicleMeasurements
    extends TrafficValue
{

    protected VehicleSpeed vehicleSpeed;
    protected VehicleDetectionTime vehicleDetectionTime;
    protected VehicleHeadway vehicleHeadway;
    protected ExtensionType individualVehicleMeasurementsExtension;

    /**
     * Gets the value of the vehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpeed }
     *     
     */
    public VehicleSpeed getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Sets the value of the vehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpeed }
     *     
     */
    public void setVehicleSpeed(VehicleSpeed value) {
        this.vehicleSpeed = value;
    }

    /**
     * Gets the value of the vehicleDetectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public VehicleDetectionTime getVehicleDetectionTime() {
        return vehicleDetectionTime;
    }

    /**
     * Sets the value of the vehicleDetectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public void setVehicleDetectionTime(VehicleDetectionTime value) {
        this.vehicleDetectionTime = value;
    }

    /**
     * Gets the value of the vehicleHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleHeadway }
     *     
     */
    public VehicleHeadway getVehicleHeadway() {
        return vehicleHeadway;
    }

    /**
     * Sets the value of the vehicleHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleHeadway }
     *     
     */
    public void setVehicleHeadway(VehicleHeadway value) {
        this.vehicleHeadway = value;
    }

    /**
     * Gets the value of the individualVehicleMeasurementsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualVehicleMeasurementsExtension() {
        return individualVehicleMeasurementsExtension;
    }

    /**
     * Sets the value of the individualVehicleMeasurementsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualVehicleMeasurementsExtension(ExtensionType value) {
        this.individualVehicleMeasurementsExtension = value;
    }

}
