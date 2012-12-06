
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Temporary limits imposed by the network/road operator at a location on the road network which may be advisory or mandatory.
 * 
 * <p>Java class for TemporaryLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemporaryLimits">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficControl">
 *       &lt;sequence>
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/1_0/1_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="temporaryLimitsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryLimits", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "temporarySpeedLimit",
    "temporaryLimitsExtension"
})
public class TemporaryLimits
    extends TrafficControl
{

    protected Float temporarySpeedLimit;
    protected ExtensionType temporaryLimitsExtension;

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the temporaryLimitsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemporaryLimitsExtension() {
        return temporaryLimitsExtension;
    }

    /**
     * Sets the value of the temporaryLimitsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemporaryLimitsExtension(ExtensionType value) {
        this.temporaryLimitsExtension = value;
    }

}
