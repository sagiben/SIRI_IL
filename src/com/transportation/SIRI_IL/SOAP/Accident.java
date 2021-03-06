
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Accidents are events in which one or more vehicles lose control and do not recover.  They include collisions between vehicle(s) or other road user(s), between vehicle(s) and any obstacle(s), or they result from a vehicle running off the road.
 * 
 * <p>Java class for Accident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accident">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="accidentCause" type="{http://datex2.eu/schema/1_0/1_0}AccidentCauseEnum" minOccurs="0"/>
 *         &lt;element name="accidentType" type="{http://datex2.eu/schema/1_0/1_0}AccidentTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="vehicleInvolved" type="{http://datex2.eu/schema/1_0/1_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overviewOfVehiclesInvolved" type="{http://datex2.eu/schema/1_0/1_0}VehiclesInvolved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overviewOfPeopleInvolved" type="{http://datex2.eu/schema/1_0/1_0}PeopleInvolved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accidentExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accident", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "accidentCause",
    "accidentType",
    "vehicleInvolved",
    "overviewOfVehiclesInvolved",
    "overviewOfPeopleInvolved",
    "accidentExtension"
})
public class Accident
    extends TrafficElement
{

    protected AccidentCauseEnum accidentCause;
    @XmlElement(required = true)
    protected List<AccidentTypeEnum> accidentType;
    protected List<Vehicle> vehicleInvolved;
    protected List<VehiclesInvolved> overviewOfVehiclesInvolved;
    protected List<PeopleInvolved> overviewOfPeopleInvolved;
    protected ExtensionType accidentExtension;

    /**
     * Gets the value of the accidentCause property.
     * 
     * @return
     *     possible object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public AccidentCauseEnum getAccidentCause() {
        return accidentCause;
    }

    /**
     * Sets the value of the accidentCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public void setAccidentCause(AccidentCauseEnum value) {
        this.accidentCause = value;
    }

    /**
     * Gets the value of the accidentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accidentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentTypeEnum }
     * 
     * 
     */
    public List<AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    /**
     * Gets the value of the vehicleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicleInvolved() {
        if (vehicleInvolved == null) {
            vehicleInvolved = new ArrayList<Vehicle>();
        }
        return this.vehicleInvolved;
    }

    /**
     * Gets the value of the overviewOfVehiclesInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overviewOfVehiclesInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverviewOfVehiclesInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclesInvolved }
     * 
     * 
     */
    public List<VehiclesInvolved> getOverviewOfVehiclesInvolved() {
        if (overviewOfVehiclesInvolved == null) {
            overviewOfVehiclesInvolved = new ArrayList<VehiclesInvolved>();
        }
        return this.overviewOfVehiclesInvolved;
    }

    /**
     * Gets the value of the overviewOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overviewOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverviewOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeopleInvolved }
     * 
     * 
     */
    public List<PeopleInvolved> getOverviewOfPeopleInvolved() {
        if (overviewOfPeopleInvolved == null) {
            overviewOfPeopleInvolved = new ArrayList<PeopleInvolved>();
        }
        return this.overviewOfPeopleInvolved;
    }

    /**
     * Gets the value of the accidentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAccidentExtension() {
        return accidentExtension;
    }

    /**
     * Sets the value of the accidentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAccidentExtension(ExtensionType value) {
        this.accidentExtension = value;
    }

}
