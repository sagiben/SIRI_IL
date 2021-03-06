
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specification of validity, either explicitly or by a validity time period specification which may be discontinous.
 * 
 * <p>Java class for Validity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Validity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validityStatus" type="{http://datex2.eu/schema/1_0/1_0}ValidityStatusEnum"/>
 *         &lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/1_0/1_0}OverallPeriod"/>
 *         &lt;element name="validityExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validity", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "validityStatus",
    "validityTimeSpecification",
    "validityExtension"
})
public class Validity {

    @XmlElement(required = true)
    protected ValidityStatusEnum validityStatus;
    @XmlElement(required = true)
    protected OverallPeriod validityTimeSpecification;
    protected ExtensionType validityExtension;

    /**
     * Gets the value of the validityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public ValidityStatusEnum getValidityStatus() {
        return validityStatus;
    }

    /**
     * Sets the value of the validityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStatusEnum }
     *     
     */
    public void setValidityStatus(ValidityStatusEnum value) {
        this.validityStatus = value;
    }

    /**
     * Gets the value of the validityTimeSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityTimeSpecification() {
        return validityTimeSpecification;
    }

    /**
     * Sets the value of the validityTimeSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityTimeSpecification(OverallPeriod value) {
        this.validityTimeSpecification = value;
    }

    /**
     * Gets the value of the validityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getValidityExtension() {
        return validityExtension;
    }

    /**
     * Sets the value of the validityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setValidityExtension(ExtensionType value) {
        this.validityExtension = value;
    }

}
