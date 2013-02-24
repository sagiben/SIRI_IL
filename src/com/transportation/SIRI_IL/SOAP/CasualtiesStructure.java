
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  Information on casualties.
 * 
 * <p>Java class for CasualtiesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CasualtiesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfDeaths" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="NumberOfInjured" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CasualtiesStructure", propOrder = {
    "numberOfDeaths",
    "numberOfInjured"
})
public class CasualtiesStructure {

    @XmlElement(name = "NumberOfDeaths")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfDeaths;
    @XmlElement(name = "NumberOfInjured")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInjured;

    /**
     * Gets the value of the numberOfDeaths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfDeaths() {
        return numberOfDeaths;
    }

    /**
     * Sets the value of the numberOfDeaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfDeaths(BigInteger value) {
        this.numberOfDeaths = value;
    }

    /**
     * Gets the value of the numberOfInjured property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInjured() {
        return numberOfInjured;
    }

    /**
     * Sets the value of the numberOfInjured property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInjured(BigInteger value) {
        this.numberOfInjured = value;
    }

}
