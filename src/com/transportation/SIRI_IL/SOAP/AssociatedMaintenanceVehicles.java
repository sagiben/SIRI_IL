
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of the maintenance vehicles involved in the roadworks activity.#NOTES#
 * 
 * 
 * <p>Java class for AssociatedMaintenanceVehicles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedMaintenanceVehicles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfMaintenanceVehicles" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="maintenanceVehicleActions" type="{http://datex2.eu/schema/1_0/1_0}MaintenanceVehicleActionsEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="associatedMaintenanceVehiclesExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedMaintenanceVehicles", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "numberOfMaintenanceVehicles",
    "maintenanceVehicleActions",
    "associatedMaintenanceVehiclesExtension"
})
public class AssociatedMaintenanceVehicles {

    protected BigInteger numberOfMaintenanceVehicles;
    protected List<MaintenanceVehicleActionsEnum> maintenanceVehicleActions;
    protected ExtensionType associatedMaintenanceVehiclesExtension;

    /**
     * Gets the value of the numberOfMaintenanceVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMaintenanceVehicles() {
        return numberOfMaintenanceVehicles;
    }

    /**
     * Sets the value of the numberOfMaintenanceVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMaintenanceVehicles(BigInteger value) {
        this.numberOfMaintenanceVehicles = value;
    }

    /**
     * Gets the value of the maintenanceVehicleActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceVehicleActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceVehicleActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceVehicleActionsEnum }
     * 
     * 
     */
    public List<MaintenanceVehicleActionsEnum> getMaintenanceVehicleActions() {
        if (maintenanceVehicleActions == null) {
            maintenanceVehicleActions = new ArrayList<MaintenanceVehicleActionsEnum>();
        }
        return this.maintenanceVehicleActions;
    }

    /**
     * Gets the value of the associatedMaintenanceVehiclesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAssociatedMaintenanceVehiclesExtension() {
        return associatedMaintenanceVehiclesExtension;
    }

    /**
     * Sets the value of the associatedMaintenanceVehiclesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAssociatedMaintenanceVehiclesExtension(ExtensionType value) {
        this.associatedMaintenanceVehiclesExtension = value;
    }

}
