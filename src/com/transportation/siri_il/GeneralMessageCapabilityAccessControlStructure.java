
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for access control.
 * 
 * <p>Java class for GeneralMessageCapabilityAccessControlStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element name="CheckInfoChannelRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageCapabilityAccessControlStructure", propOrder = {
    "checkInfoChannelRef"
})
public class GeneralMessageCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
{

    @XmlElement(name = "CheckInfoChannelRef", defaultValue = "true")
    protected boolean checkInfoChannelRef;

    /**
     * Gets the value of the checkInfoChannelRef property.
     * 
     */
    public boolean isCheckInfoChannelRef() {
        return checkInfoChannelRef;
    }

    /**
     * Sets the value of the checkInfoChannelRef property.
     * 
     */
    public void setCheckInfoChannelRef(boolean value) {
        this.checkInfoChannelRef = value;
    }

}
