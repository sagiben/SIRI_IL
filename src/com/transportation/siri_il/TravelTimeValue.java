
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Derived/computed travel time information relating to a specific group of locations.
 * 
 * <p>Java class for TravelTimeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/1_0/1_0}TravelTimeTypeEnum" minOccurs="0"/>
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/1_0/1_0}Seconds" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/1_0/1_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="travelTimeValueExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeValue", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "travelTime",
    "travelTimeTrendType",
    "travelTimeType",
    "freeFlowSpeed",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "vehicleType",
    "travelTimeValueExtension"
})
public class TravelTimeValue
    extends BasicDataValue
{

    protected Float travelTime;
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    protected TravelTimeTypeEnum travelTimeType;
    protected Float freeFlowSpeed;
    protected Float freeFlowTravelTime;
    protected Float normallyExpectedTravelTime;
    protected List<VehicleTypeEnum> vehicleType;
    protected ExtensionType travelTimeValueExtension;

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTravelTime(Float value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the travelTimeTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Sets the value of the travelTimeTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    /**
     * Gets the value of the travelTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Sets the value of the travelTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
    }

    /**
     * Gets the value of the freeFlowSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Sets the value of the freeFlowSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowSpeed(Float value) {
        this.freeFlowSpeed = value;
    }

    /**
     * Gets the value of the freeFlowTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Sets the value of the freeFlowTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowTravelTime(Float value) {
        this.freeFlowTravelTime = value;
    }

    /**
     * Gets the value of the normallyExpectedTravelTime property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Sets the value of the normallyExpectedTravelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNormallyExpectedTravelTime(Float value) {
        this.normallyExpectedTravelTime = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    /**
     * Gets the value of the travelTimeValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTravelTimeValueExtension() {
        return travelTimeValueExtension;
    }

    /**
     * Sets the value of the travelTimeValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTravelTimeValueExtension(ExtensionType value) {
        this.travelTimeValueExtension = value;
    }

}
