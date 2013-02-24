
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Height information which provides additional descrimination for the applicable area.
 * 
 * <p>Java class for TPEGHeight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGHeight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="height" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="heightType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc04HeightTypeEnum"/>
 *         &lt;element name="tpegheightExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGHeight", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "height",
    "heightType",
    "tpegheightExtension"
})
public class TPEGHeight {

    protected Float height;
    @XmlElement(required = true)
    protected TPEGLoc04HeightTypeEnum heightType;
    protected ExtensionType tpegheightExtension;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the heightType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc04HeightTypeEnum }
     *     
     */
    public TPEGLoc04HeightTypeEnum getHeightType() {
        return heightType;
    }

    /**
     * Sets the value of the heightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc04HeightTypeEnum }
     *     
     */
    public void setHeightType(TPEGLoc04HeightTypeEnum value) {
        this.heightType = value;
    }

    /**
     * Gets the value of the tpegheightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegheightExtension() {
        return tpegheightExtension;
    }

    /**
     * Sets the value of the tpegheightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegheightExtension(ExtensionType value) {
        this.tpegheightExtension = value;
    }

}
