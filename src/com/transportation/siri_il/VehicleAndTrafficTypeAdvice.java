
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary vehicle and traffic type advice.
 * 
 * <p>Java class for VehicleAndTrafficTypeAdvice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleAndTrafficTypeAdvice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="forTrafficOfType" type="{http://datex2.eu/schema/1_0/1_0}TrafficDestinationTypeEnum" minOccurs="0"/>
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/1_0/1_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="vehicleAndTrafficTypeAdviceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleAndTrafficTypeAdvice", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "forTrafficOfType",
    "forVehiclesWithCharacteristicsOf",
    "vehicleAndTrafficTypeAdviceExtension"
})
public class VehicleAndTrafficTypeAdvice
    extends Advice
{

    protected TrafficDestinationTypeEnum forTrafficOfType;
    protected VehicleCharacteristics forVehiclesWithCharacteristicsOf;
    protected ExtensionType vehicleAndTrafficTypeAdviceExtension;

    /**
     * Gets the value of the forTrafficOfType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficDestinationTypeEnum }
     *     
     */
    public TrafficDestinationTypeEnum getForTrafficOfType() {
        return forTrafficOfType;
    }

    /**
     * Sets the value of the forTrafficOfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficDestinationTypeEnum }
     *     
     */
    public void setForTrafficOfType(TrafficDestinationTypeEnum value) {
        this.forTrafficOfType = value;
    }

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getForVehiclesWithCharacteristicsOf() {
        return forVehiclesWithCharacteristicsOf;
    }

    /**
     * Sets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        this.forVehiclesWithCharacteristicsOf = value;
    }

    /**
     * Gets the value of the vehicleAndTrafficTypeAdviceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleAndTrafficTypeAdviceExtension() {
        return vehicleAndTrafficTypeAdviceExtension;
    }

    /**
     * Sets the value of the vehicleAndTrafficTypeAdviceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleAndTrafficTypeAdviceExtension(ExtensionType value) {
        this.vehicleAndTrafficTypeAdviceExtension = value;
    }

}