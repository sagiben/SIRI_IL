
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Location model for scope of situation or effect.
 * 
 * <p>Java class for AffectedRoadsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedRoadsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datex2Locations" type="{http://datex2.eu/schema/1_0/1_0}GroupOfLocations" minOccurs="0"/>
 *         &lt;element name="AffectedRoad" type="{http://www.siri.org.uk/siri}AffectedRoadStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadsStructure", propOrder = {
    "datex2Locations",
    "affectedRoad"
})
public class AffectedRoadsStructure {

    @XmlElement(name = "Datex2Locations")
    protected GroupOfLocations datex2Locations;
    @XmlElement(name = "AffectedRoad")
    protected List<AffectedRoadStructure> affectedRoad;

    /**
     * Gets the value of the datex2Locations property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getDatex2Locations() {
        return datex2Locations;
    }

    /**
     * Sets the value of the datex2Locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setDatex2Locations(GroupOfLocations value) {
        this.datex2Locations = value;
    }

    /**
     * Gets the value of the affectedRoad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedRoad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedRoad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRoadStructure }
     * 
     * 
     */
    public List<AffectedRoadStructure> getAffectedRoad() {
        if (affectedRoad == null) {
            affectedRoad = new ArrayList<AffectedRoadStructure>();
        }
        return this.affectedRoad;
    }

}
