
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A geographic or geometric defined area which may be qualified by height information to provide additional geospatial descrimination (e.g. for snow in an area but only above a certain altitude).
 * 
 * <p>Java class for Area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Location">
 *       &lt;sequence>
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/1_0/1_0}AlertCArea" minOccurs="0"/>
 *         &lt;element name="tpegareaLocation" type="{http://datex2.eu/schema/1_0/1_0}TPEGAreaLocation" minOccurs="0"/>
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "alertCArea",
    "tpegareaLocation",
    "areaExtension"
})
public class Area
    extends Location
{

    protected AlertCArea alertCArea;
    protected TPEGAreaLocation tpegareaLocation;
    protected ExtensionType areaExtension;

    /**
     * Gets the value of the alertCArea property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCArea }
     *     
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Sets the value of the alertCArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCArea }
     *     
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    /**
     * Gets the value of the tpegareaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGAreaLocation }
     *     
     */
    public TPEGAreaLocation getTpegareaLocation() {
        return tpegareaLocation;
    }

    /**
     * Sets the value of the tpegareaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGAreaLocation }
     *     
     */
    public void setTpegareaLocation(TPEGAreaLocation value) {
        this.tpegareaLocation = value;
    }

    /**
     * Gets the value of the areaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Sets the value of the areaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaExtension(ExtensionType value) {
        this.areaExtension = value;
    }

}
