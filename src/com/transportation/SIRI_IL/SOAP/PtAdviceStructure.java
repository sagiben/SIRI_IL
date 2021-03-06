
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for advice
 * 
 * <p>Java class for PtAdviceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtAdviceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdviceRef" type="{http://www.siri.org.uk/siri}AdviceRefStructure" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtAdviceStructure", propOrder = {
    "adviceRef",
    "details"
})
public class PtAdviceStructure {

    @XmlElement(name = "AdviceRef")
    protected AdviceRefStructure adviceRef;
    @XmlElement(name = "Details")
    protected NaturalLanguageStringStructure details;

    /**
     * Gets the value of the adviceRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceRefStructure }
     *     
     */
    public AdviceRefStructure getAdviceRef() {
        return adviceRef;
    }

    /**
     * Sets the value of the adviceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceRefStructure }
     *     
     */
    public void setAdviceRef(AdviceRefStructure value) {
        this.adviceRef = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDetails(NaturalLanguageStringStructure value) {
        this.details = value;
    }

}
