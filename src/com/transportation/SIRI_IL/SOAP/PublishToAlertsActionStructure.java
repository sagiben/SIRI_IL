
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Action Publish situation To Alert Service.
 * 
 * <p>Java class for PublishToAlertsActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishToAlertsActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="ByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ByMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToAlertsActionStructure", propOrder = {
    "byEmail",
    "byMobile"
})
public class PublishToAlertsActionStructure
    extends PushedActionStructure
{

    @XmlElement(name = "ByEmail", defaultValue = "true")
    protected Boolean byEmail;
    @XmlElement(name = "ByMobile", defaultValue = "true")
    protected Boolean byMobile;

    /**
     * Gets the value of the byEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByEmail() {
        return byEmail;
    }

    /**
     * Sets the value of the byEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByEmail(Boolean value) {
        this.byEmail = value;
    }

    /**
     * Gets the value of the byMobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isByMobile() {
        return byMobile;
    }

    /**
     * Sets the value of the byMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setByMobile(Boolean value) {
        this.byMobile = value;
    }

}
