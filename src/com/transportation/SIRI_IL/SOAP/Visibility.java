
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of atmospheric visibility.
 * 
 * <p>Java class for Visibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="visibilityValue" type="{http://datex2.eu/schema/1_0/1_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="visibilityExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visibility", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "visibilityValue",
    "visibilityExtension"
})
public class Visibility {

    @XmlElement(required = true)
    protected BigInteger visibilityValue;
    protected ExtensionType visibilityExtension;

    /**
     * Gets the value of the visibilityValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisibilityValue() {
        return visibilityValue;
    }

    /**
     * Sets the value of the visibilityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisibilityValue(BigInteger value) {
        this.visibilityValue = value;
    }

    /**
     * Gets the value of the visibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityExtension() {
        return visibilityExtension;
    }

    /**
     * Sets the value of the visibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityExtension(ExtensionType value) {
        this.visibilityExtension = value;
    }

}
