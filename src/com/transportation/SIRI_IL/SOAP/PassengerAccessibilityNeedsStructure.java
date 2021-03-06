
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for accessibility needs. Records the requirementrs of a passenger that may affect chocie of facilities
 * 
 * <p>Java class for PassengerAccessibilityNeedsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerAccessibilityNeedsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccompaniedByCarer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAccessibilityNeedsStructure", namespace = "http://www.ifopt.org.uk/acsb", propOrder = {
    "userNeed",
    "accompaniedByCarer"
})
public class PassengerAccessibilityNeedsStructure {

    @XmlElement(name = "UserNeed")
    protected List<UserNeedStructure> userNeed;
    @XmlElement(name = "AccompaniedByCarer")
    protected Boolean accompaniedByCarer;

    /**
     * Gets the value of the userNeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userNeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserNeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserNeedStructure }
     * 
     * 
     */
    public List<UserNeedStructure> getUserNeed() {
        if (userNeed == null) {
            userNeed = new ArrayList<UserNeedStructure>();
        }
        return this.userNeed;
    }

    /**
     * Gets the value of the accompaniedByCarer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByCarer() {
        return accompaniedByCarer;
    }

    /**
     * Sets the value of the accompaniedByCarer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByCarer(Boolean value) {
        this.accompaniedByCarer = value;
    }

}
