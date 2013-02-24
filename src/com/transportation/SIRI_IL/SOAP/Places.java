
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary places advice.
 * 
 * <p>Java class for Places complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Places">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="placesAdvice" type="{http://datex2.eu/schema/1_0/1_0}PlacesAdviceEnum"/>
 *         &lt;element name="placesExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Places", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "placesAdvice",
    "placesExtension"
})
public class Places
    extends Advice
{

    @XmlElement(required = true)
    protected PlacesAdviceEnum placesAdvice;
    protected ExtensionType placesExtension;

    /**
     * Gets the value of the placesAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesAdviceEnum }
     *     
     */
    public PlacesAdviceEnum getPlacesAdvice() {
        return placesAdvice;
    }

    /**
     * Sets the value of the placesAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesAdviceEnum }
     *     
     */
    public void setPlacesAdvice(PlacesAdviceEnum value) {
        this.placesAdvice = value;
    }

    /**
     * Gets the value of the placesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPlacesExtension() {
        return placesExtension;
    }

    /**
     * Sets the value of the placesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPlacesExtension(ExtensionType value) {
        this.placesExtension = value;
    }

}
