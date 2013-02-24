
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary diversion advice.
 * 
 * <p>Java class for Diversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Diversion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="diversionAdvice" type="{http://datex2.eu/schema/1_0/1_0}DiversionAdviceEnum"/>
 *         &lt;element name="diversionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Diversion", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "diversionAdvice",
    "diversionExtension"
})
public class Diversion
    extends Advice
{

    @XmlElement(required = true)
    protected DiversionAdviceEnum diversionAdvice;
    protected ExtensionType diversionExtension;

    /**
     * Gets the value of the diversionAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public DiversionAdviceEnum getDiversionAdvice() {
        return diversionAdvice;
    }

    /**
     * Sets the value of the diversionAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiversionAdviceEnum }
     *     
     */
    public void setDiversionAdvice(DiversionAdviceEnum value) {
        this.diversionAdvice = value;
    }

    /**
     * Gets the value of the diversionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDiversionExtension() {
        return diversionExtension;
    }

    /**
     * Sets the value of the diversionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDiversionExtension(ExtensionType value) {
        this.diversionExtension = value;
    }

}
