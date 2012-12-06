
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The weight details of a specific axle set of an individual vehicle. 
 * 
 * <p>Java class for AxleWeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleWeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axleSequenceIdentifier" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger"/>
 *         &lt;element name="axleWeight" type="{http://datex2.eu/schema/1_0/1_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="maximumPermittedAxleWeight" type="{http://datex2.eu/schema/1_0/1_0}Tonnes" minOccurs="0"/>
 *         &lt;element name="axleWeightExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleWeight", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "axleSequenceIdentifier",
    "axleWeight",
    "maximumPermittedAxleWeight",
    "axleWeightExtension"
})
public class AxleWeight {

    @XmlElement(required = true)
    protected BigInteger axleSequenceIdentifier;
    protected Float axleWeight;
    protected Float maximumPermittedAxleWeight;
    protected ExtensionType axleWeightExtension;

    /**
     * Gets the value of the axleSequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSequenceIdentifier() {
        return axleSequenceIdentifier;
    }

    /**
     * Sets the value of the axleSequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSequenceIdentifier(BigInteger value) {
        this.axleSequenceIdentifier = value;
    }

    /**
     * Gets the value of the axleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAxleWeight() {
        return axleWeight;
    }

    /**
     * Sets the value of the axleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxleWeight(Float value) {
        this.axleWeight = value;
    }

    /**
     * Gets the value of the maximumPermittedAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPermittedAxleWeight() {
        return maximumPermittedAxleWeight;
    }

    /**
     * Sets the value of the maximumPermittedAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPermittedAxleWeight(Float value) {
        this.maximumPermittedAxleWeight = value;
    }

    /**
     * Gets the value of the axleWeightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleWeightExtension() {
        return axleWeightExtension;
    }

    /**
     * Sets the value of the axleWeightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleWeightExtension(ExtensionType value) {
        this.axleWeightExtension = value;
    }

}
