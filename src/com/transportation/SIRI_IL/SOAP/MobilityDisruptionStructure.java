
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Effect of equipment availability change on impaired access users.
 * 
 * <p>Java class for MobilityDisruptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityDisruptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobilityImpairedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityDisruptionStructure", propOrder = {
    "mobilityImpairedAccess",
    "accessFacility"
})
public class MobilityDisruptionStructure {

    @XmlElement(name = "MobilityImpairedAccess")
    protected boolean mobilityImpairedAccess;
    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    protected List<AccessFacilityEnumeration> accessFacility;

    /**
     * Gets the value of the mobilityImpairedAccess property.
     * 
     */
    public boolean isMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Sets the value of the mobilityImpairedAccess property.
     * 
     */
    public void setMobilityImpairedAccess(boolean value) {
        this.mobilityImpairedAccess = value;
    }

    /**
     * Classification of Mobility Facility  type -  Based on Tpeg  pti23.Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

}
