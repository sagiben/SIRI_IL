
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The measured individual vehicle headway, i.e.the distance between this vehicle and the preceding vehicle).
 * 
 * <p>Java class for VehicleHeadway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleHeadway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distanceGap" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="distanceHeadway" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="vehicleHeadwayExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleHeadway", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "distanceGap",
    "distanceHeadway",
    "vehicleHeadwayExtension"
})
public class VehicleHeadway {

    protected Float distanceGap;
    protected Float distanceHeadway;
    protected ExtensionType vehicleHeadwayExtension;

    /**
     * Gets the value of the distanceGap property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceGap() {
        return distanceGap;
    }

    /**
     * Sets the value of the distanceGap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceGap(Float value) {
        this.distanceGap = value;
    }

    /**
     * Gets the value of the distanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDistanceHeadway() {
        return distanceHeadway;
    }

    /**
     * Sets the value of the distanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDistanceHeadway(Float value) {
        this.distanceHeadway = value;
    }

    /**
     * Gets the value of the vehicleHeadwayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleHeadwayExtension() {
        return vehicleHeadwayExtension;
    }

    /**
     * Sets the value of the vehicleHeadwayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleHeadwayExtension(ExtensionType value) {
        this.vehicleHeadwayExtension = value;
    }

}
