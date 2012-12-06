
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notify user by other means.
 * 
 * <p>Java class for NotifyUserActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifyUserActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="WorkgroupRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyUserActionStructure", propOrder = {
    "workgroupRef",
    "userName",
    "userRef"
})
public class NotifyUserActionStructure
    extends PushedActionStructure
{

    @XmlElement(name = "WorkgroupRef", defaultValue = "true")
    protected String workgroupRef;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserRef", defaultValue = "true")
    protected String userRef;

    /**
     * Gets the value of the workgroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkgroupRef() {
        return workgroupRef;
    }

    /**
     * Sets the value of the workgroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkgroupRef(String value) {
        this.workgroupRef = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRef() {
        return userRef;
    }

    /**
     * Sets the value of the userRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRef(String value) {
        this.userRef = value;
    }

}
