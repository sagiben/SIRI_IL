
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *         &lt;element name="OperatorPermission" type="{http://www.siri.org.uk/siri}OperatorPermissionStructure" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowAll",
    "operatorPermission"
})
@XmlRootElement(name = "OperatorPermissions")
public class OperatorPermissions {

    @XmlElement(name = "AllowAll")
    protected Boolean allowAll;
    @XmlElement(name = "OperatorPermission")
    protected List<OperatorPermissionStructure> operatorPermission;

    /**
     * Gets the value of the allowAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAll() {
        return allowAll;
    }

    /**
     * Sets the value of the allowAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAll(Boolean value) {
        this.allowAll = value;
    }

    /**
     * Gets the value of the operatorPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorPermissionStructure }
     * 
     * 
     */
    public List<OperatorPermissionStructure> getOperatorPermission() {
        if (operatorPermission == null) {
            operatorPermission = new ArrayList<OperatorPermissionStructure>();
        }
        return this.operatorPermission;
    }

}
