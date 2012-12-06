
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Notify situation to Tv.
 * 
 * <p>Java class for PublishToTvActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishToTvActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="Ceefax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Teletext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToTvActionStructure", propOrder = {
    "ceefax",
    "teletext"
})
public class PublishToTvActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "Ceefax", defaultValue = "true")
    protected Boolean ceefax;
    @XmlElement(name = "Teletext", defaultValue = "true")
    protected Boolean teletext;

    /**
     * Gets the value of the ceefax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCeefax() {
        return ceefax;
    }

    /**
     * Sets the value of the ceefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCeefax(Boolean value) {
        this.ceefax = value;
    }

    /**
     * Gets the value of the teletext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeletext() {
        return teletext;
    }

    /**
     * Sets the value of the teletext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeletext(Boolean value) {
        this.teletext = value;
    }

}
