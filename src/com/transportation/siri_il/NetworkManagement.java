
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Changes to the configuration or usability of the road network whether by legal order or by operational decisions. It includes road and lane closures, weight and dimensional limits, vehicle restrictions, contraflows and rerouting operations.
 * 
 * <p>Java class for NetworkManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="networkManagementType" type="{http://datex2.eu/schema/1_0/1_0}NetworkManagementTypeEnum"/>
 *         &lt;element name="forVehicleWithCharacteristicsOf" type="{http://datex2.eu/schema/1_0/1_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="restriction" type="{http://datex2.eu/schema/1_0/1_0}Restriction" minOccurs="0"/>
 *         &lt;element name="trafficControl" type="{http://datex2.eu/schema/1_0/1_0}TrafficControl" minOccurs="0"/>
 *         &lt;element name="networkManagementExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagement", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "networkManagementType",
    "forVehicleWithCharacteristicsOf",
    "restriction",
    "trafficControl",
    "networkManagementExtension"
})
public class NetworkManagement
    extends OperatorAction
{

    @XmlElement(required = true)
    protected NetworkManagementTypeEnum networkManagementType;
    protected List<VehicleCharacteristics> forVehicleWithCharacteristicsOf;
    protected Restriction restriction;
    protected TrafficControl trafficControl;
    protected ExtensionType networkManagementExtension;

    /**
     * Gets the value of the networkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementTypeEnum }
     *     
     */
    public NetworkManagementTypeEnum getNetworkManagementType() {
        return networkManagementType;
    }

    /**
     * Sets the value of the networkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementTypeEnum }
     *     
     */
    public void setNetworkManagementType(NetworkManagementTypeEnum value) {
        this.networkManagementType = value;
    }

    /**
     * Gets the value of the forVehicleWithCharacteristicsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forVehicleWithCharacteristicsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehicleWithCharacteristicsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getForVehicleWithCharacteristicsOf() {
        if (forVehicleWithCharacteristicsOf == null) {
            forVehicleWithCharacteristicsOf = new ArrayList<VehicleCharacteristics>();
        }
        return this.forVehicleWithCharacteristicsOf;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link Restriction }
     *     
     */
    public Restriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restriction }
     *     
     */
    public void setRestriction(Restriction value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the trafficControl property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficControl }
     *     
     */
    public TrafficControl getTrafficControl() {
        return trafficControl;
    }

    /**
     * Sets the value of the trafficControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficControl }
     *     
     */
    public void setTrafficControl(TrafficControl value) {
        this.trafficControl = value;
    }

    /**
     * Gets the value of the networkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkManagementExtension() {
        return networkManagementExtension;
    }

    /**
     * Sets the value of the networkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkManagementExtension(ExtensionType value) {
        this.networkManagementExtension = value;
    }

}
