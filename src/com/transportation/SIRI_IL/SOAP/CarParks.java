
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the status of one or more car parks.
 * 
 * <p>Java class for CarParks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarParks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="carParkConfiguration" type="{http://datex2.eu/schema/1_0/1_0}CarParkConfigurationEnum" minOccurs="0"/>
 *         &lt;element name="carParkIdentity" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="carParkOccupancy" type="{http://datex2.eu/schema/1_0/1_0}Percentage" minOccurs="0"/>
 *         &lt;element name="carParkStatus" type="{http://datex2.eu/schema/1_0/1_0}CarParkStatusEnum" minOccurs="0"/>
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/1_0/1_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/1_0/1_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="numberOfVacantParkingSpaces" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="occupiedSpaces" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="queueingTime" type="{http://datex2.eu/schema/1_0/1_0}Time" minOccurs="0"/>
 *         &lt;element name="totalCapacity" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="carParksExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarParks", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "carParkConfiguration",
    "carParkIdentity",
    "carParkOccupancy",
    "carParkStatus",
    "exitRate",
    "fillRate",
    "numberOfVacantParkingSpaces",
    "occupiedSpaces",
    "queueingTime",
    "totalCapacity",
    "carParksExtension"
})
public class CarParks
    extends NonRoadEventInformation
{

    protected CarParkConfigurationEnum carParkConfiguration;
    @XmlElement(required = true)
    protected String carParkIdentity;
    protected Float carParkOccupancy;
    protected CarParkStatusEnum carParkStatus;
    protected BigInteger exitRate;
    protected BigInteger fillRate;
    protected BigInteger numberOfVacantParkingSpaces;
    protected BigInteger occupiedSpaces;
    protected Time queueingTime;
    protected BigInteger totalCapacity;
    protected ExtensionType carParksExtension;

    /**
     * Gets the value of the carParkConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public CarParkConfigurationEnum getCarParkConfiguration() {
        return carParkConfiguration;
    }

    /**
     * Sets the value of the carParkConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public void setCarParkConfiguration(CarParkConfigurationEnum value) {
        this.carParkConfiguration = value;
    }

    /**
     * Gets the value of the carParkIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarParkIdentity() {
        return carParkIdentity;
    }

    /**
     * Sets the value of the carParkIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarParkIdentity(String value) {
        this.carParkIdentity = value;
    }

    /**
     * Gets the value of the carParkOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCarParkOccupancy() {
        return carParkOccupancy;
    }

    /**
     * Sets the value of the carParkOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCarParkOccupancy(Float value) {
        this.carParkOccupancy = value;
    }

    /**
     * Gets the value of the carParkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public CarParkStatusEnum getCarParkStatus() {
        return carParkStatus;
    }

    /**
     * Sets the value of the carParkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public void setCarParkStatus(CarParkStatusEnum value) {
        this.carParkStatus = value;
    }

    /**
     * Gets the value of the exitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExitRate() {
        return exitRate;
    }

    /**
     * Sets the value of the exitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExitRate(BigInteger value) {
        this.exitRate = value;
    }

    /**
     * Gets the value of the fillRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFillRate() {
        return fillRate;
    }

    /**
     * Sets the value of the fillRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFillRate(BigInteger value) {
        this.fillRate = value;
    }

    /**
     * Gets the value of the numberOfVacantParkingSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVacantParkingSpaces() {
        return numberOfVacantParkingSpaces;
    }

    /**
     * Sets the value of the numberOfVacantParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVacantParkingSpaces(BigInteger value) {
        this.numberOfVacantParkingSpaces = value;
    }

    /**
     * Gets the value of the occupiedSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupiedSpaces() {
        return occupiedSpaces;
    }

    /**
     * Sets the value of the occupiedSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupiedSpaces(BigInteger value) {
        this.occupiedSpaces = value;
    }

    /**
     * Gets the value of the queueingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getQueueingTime() {
        return queueingTime;
    }

    /**
     * Sets the value of the queueingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setQueueingTime(Time value) {
        this.queueingTime = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Gets the value of the carParksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCarParksExtension() {
        return carParksExtension;
    }

    /**
     * Sets the value of the carParksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCarParksExtension(ExtensionType value) {
        this.carParksExtension = value;
    }

}
