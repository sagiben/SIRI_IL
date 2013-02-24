
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information/advice that supplements the traffic/travel information contained in a situation publication.
 * 
 * <p>Java class for Advice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Advice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adviceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Advice", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "adviceExtension"
})
@XmlSeeAlso({
    Speeds.class,
    VehicleAndTrafficTypeAdvice.class,
    Instructions.class,
    Places.class,
    Diversion.class,
    Warnings.class,
    LaneUsage.class,
    WinterDriving.class
})
public abstract class Advice {

    protected ExtensionType adviceExtension;

    /**
     * Gets the value of the adviceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAdviceExtension() {
        return adviceExtension;
    }

    /**
     * Sets the value of the adviceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAdviceExtension(ExtensionType value) {
        this.adviceExtension = value;
    }

}
