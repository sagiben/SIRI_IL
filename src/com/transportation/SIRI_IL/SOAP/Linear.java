
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A linear section along a road with optional directionality defined between two points on the road. 
 * 
 * <p>Java class for Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpeglinearLocation" type="{http://datex2.eu/schema/1_0/1_0}TPEGLinearLocation" minOccurs="0"/>
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/1_0/1_0}AlertCLinear" minOccurs="0"/>
 *         &lt;element name="referencePointLinear" type="{http://datex2.eu/schema/1_0/1_0}ReferencePointLinear" minOccurs="0"/>
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpeglinearLocation",
    "alertCLinear",
    "referencePointLinear",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    protected TPEGLinearLocation tpeglinearLocation;
    protected AlertCLinear alertCLinear;
    protected ReferencePointLinear referencePointLinear;
    protected ExtensionType linearExtension;

    /**
     * Gets the value of the tpeglinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLinearLocation }
     *     
     */
    public TPEGLinearLocation getTpeglinearLocation() {
        return tpeglinearLocation;
    }

    /**
     * Sets the value of the tpeglinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLinearLocation }
     *     
     */
    public void setTpeglinearLocation(TPEGLinearLocation value) {
        this.tpeglinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Sets the value of the alertCLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Gets the value of the referencePointLinear property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointLinear }
     *     
     */
    public ReferencePointLinear getReferencePointLinear() {
        return referencePointLinear;
    }

    /**
     * Sets the value of the referencePointLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointLinear }
     *     
     */
    public void setReferencePointLinear(ReferencePointLinear value) {
        this.referencePointLinear = value;
    }

    /**
     * Gets the value of the linearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Sets the value of the linearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

}
