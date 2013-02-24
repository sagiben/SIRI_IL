
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for blocking
 * 
 * <p>Java class for BlockingStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockingStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JourneyPlanner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RealTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockingStructure", propOrder = {
    "journeyPlanner",
    "realTime"
})
public class BlockingStructure {

    @XmlElement(name = "JourneyPlanner", defaultValue = "false")
    protected Boolean journeyPlanner;
    @XmlElement(name = "RealTime", defaultValue = "false")
    protected Boolean realTime;

    /**
     * Gets the value of the journeyPlanner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJourneyPlanner() {
        return journeyPlanner;
    }

    /**
     * Sets the value of the journeyPlanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJourneyPlanner(Boolean value) {
        this.journeyPlanner = value;
    }

    /**
     * Gets the value of the realTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealTime() {
        return realTime;
    }

    /**
     * Sets the value of the realTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRealTime(Boolean value) {
        this.realTime = value;
    }

}
