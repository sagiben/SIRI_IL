
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary speed advice.
 * 
 * <p>Java class for Speeds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Speeds">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="speedAdvice" type="{http://datex2.eu/schema/1_0/1_0}SpeedAdviceEnum"/>
 *         &lt;element name="speedsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Speeds", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "speedAdvice",
    "speedsExtension"
})
public class Speeds
    extends Advice
{

    @XmlElement(required = true)
    protected SpeedAdviceEnum speedAdvice;
    protected ExtensionType speedsExtension;

    /**
     * Gets the value of the speedAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedAdviceEnum }
     *     
     */
    public SpeedAdviceEnum getSpeedAdvice() {
        return speedAdvice;
    }

    /**
     * Sets the value of the speedAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedAdviceEnum }
     *     
     */
    public void setSpeedAdvice(SpeedAdviceEnum value) {
        this.speedAdvice = value;
    }

    /**
     * Gets the value of the speedsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedsExtension() {
        return speedsExtension;
    }

    /**
     * Sets the value of the speedsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedsExtension(ExtensionType value) {
        this.speedsExtension = value;
    }

}
