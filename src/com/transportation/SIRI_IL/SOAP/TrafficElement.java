
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An event which is not planned by the traffic operator, which is affecting, or has the potential to affect traffic flow.
 * 
 * <p>Java class for TrafficElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="trafficElementExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficElement", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "trafficElementExtension"
})
@XmlSeeAlso({
    Activities.class,
    PoorRoadInfrastructure.class,
    AbnormalTraffic.class,
    Conditions.class,
    Accident.class,
    Obstruction.class
})
public abstract class TrafficElement
    extends SituationRecord
{

    protected ExtensionType trafficElementExtension;

    /**
     * Gets the value of the trafficElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficElementExtension() {
        return trafficElementExtension;
    }

    /**
     * Sets the value of the trafficElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficElementExtension(ExtensionType value) {
        this.trafficElementExtension = value;
    }

}
