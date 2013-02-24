
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about the lines affected by an Situation
 * 
 * <p>Java class for OffsetStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffsetStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistanceFromStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DistanceFromEnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetStructure", propOrder = {
    "distanceFromStart",
    "distanceFromEnd"
})
public class OffsetStructure {

    @XmlElement(name = "DistanceFromStart")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromStart;
    @XmlElement(name = "DistanceFromEnd")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromEnd;

    /**
     * Gets the value of the distanceFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Sets the value of the distanceFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromStart(Long value) {
        this.distanceFromStart = value;
    }

    /**
     * Gets the value of the distanceFromEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromEnd() {
        return distanceFromEnd;
    }

    /**
     * Sets the value of the distanceFromEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromEnd(Long value) {
        this.distanceFromEnd = value;
    }

}
