
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A traffic condition which is not normal.
 * 
 * <p>Java class for AbnormalTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbnormalTraffic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/1_0/1_0}AbnormalTrafficTypeEnum" minOccurs="0"/>
 *         &lt;element name="numberOfVehiclesWaiting" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="queueLength" type="{http://datex2.eu/schema/1_0/1_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="relativeTrafficFlow" type="{http://datex2.eu/schema/1_0/1_0}RelativeTrafficFlowEnum" minOccurs="0"/>
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/1_0/1_0}TrafficTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="abnormalTrafficExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalTraffic", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "abnormalTrafficType",
    "numberOfVehiclesWaiting",
    "queueLength",
    "relativeTrafficFlow",
    "trafficTrendType",
    "abnormalTrafficExtension"
})
public class AbnormalTraffic
    extends TrafficElement
{

    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    protected BigInteger numberOfVehiclesWaiting;
    protected BigInteger queueLength;
    protected RelativeTrafficFlowEnum relativeTrafficFlow;
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType abnormalTrafficExtension;

    /**
     * Gets the value of the abnormalTrafficType property.
     * 
     * @return
     *     possible object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Sets the value of the abnormalTrafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbnormalTrafficTypeEnum }
     *     
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    /**
     * Gets the value of the numberOfVehiclesWaiting property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehiclesWaiting() {
        return numberOfVehiclesWaiting;
    }

    /**
     * Sets the value of the numberOfVehiclesWaiting property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehiclesWaiting(BigInteger value) {
        this.numberOfVehiclesWaiting = value;
    }

    /**
     * Gets the value of the queueLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueueLength() {
        return queueLength;
    }

    /**
     * Sets the value of the queueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueueLength(BigInteger value) {
        this.queueLength = value;
    }

    /**
     * Gets the value of the relativeTrafficFlow property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlow() {
        return relativeTrafficFlow;
    }

    /**
     * Sets the value of the relativeTrafficFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public void setRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlow = value;
    }

    /**
     * Gets the value of the trafficTrendType property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Sets the value of the trafficTrendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTrendTypeEnum }
     *     
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Gets the value of the abnormalTrafficExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAbnormalTrafficExtension() {
        return abnormalTrafficExtension;
    }

    /**
     * Sets the value of the abnormalTrafficExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAbnormalTrafficExtension(ExtensionType value) {
        this.abnormalTrafficExtension = value;
    }

}
