
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * General management information.
 * 
 * <p>Java class for ManagementDescriptiveData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementDescriptiveData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageChain" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="managementDescriptiveDataExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementDescriptiveData", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "messageChain",
    "managementDescriptiveDataExtension"
})
public class ManagementDescriptiveData {

    protected String messageChain;
    protected ExtensionType managementDescriptiveDataExtension;

    /**
     * Gets the value of the messageChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageChain() {
        return messageChain;
    }

    /**
     * Sets the value of the messageChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageChain(String value) {
        this.messageChain = value;
    }

    /**
     * Gets the value of the managementDescriptiveDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagementDescriptiveDataExtension() {
        return managementDescriptiveDataExtension;
    }

    /**
     * Sets the value of the managementDescriptiveDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagementDescriptiveDataExtension(ExtensionType value) {
        this.managementDescriptiveDataExtension = value;
    }

}
