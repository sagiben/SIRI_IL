
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for list of situations.
 * 
 * <p>Java class for SimpleActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleActionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionStatus" type="{http://www.siri.org.uk/siri}ActionStatusEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleActionStructure", propOrder = {
    "actionStatus"
})
@XmlSeeAlso({
    ParameterisedActionStructure.class
})
public class SimpleActionStructure {

    @XmlElement(name = "ActionStatus", defaultValue = "open")
    protected ActionStatusEnumeration actionStatus;

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public ActionStatusEnumeration getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatusEnumeration }
     *     
     */
    public void setActionStatus(ActionStatusEnumeration value) {
        this.actionStatus = value;
    }

}
