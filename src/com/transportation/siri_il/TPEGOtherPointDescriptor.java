
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * General descriptor for describing a point.
 * 
 * <p>Java class for TPEGOtherPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGOtherPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegDescriptorType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03OtherPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegotherPointDescriptorExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGOtherPointDescriptor", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDescriptorType",
    "tpegotherPointDescriptorExtension"
})
public class TPEGOtherPointDescriptor
    extends TPEGPointDescriptor
{

    @XmlElement(required = true)
    protected TPEGLoc03OtherPointDescriptorSubtypeEnum tpegDescriptorType;
    protected ExtensionType tpegotherPointDescriptorExtension;

    /**
     * Gets the value of the tpegDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03OtherPointDescriptorSubtypeEnum getTpegDescriptorType() {
        return tpegDescriptorType;
    }

    /**
     * Sets the value of the tpegDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegDescriptorType(TPEGLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegDescriptorType = value;
    }

    /**
     * Gets the value of the tpegotherPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegotherPointDescriptorExtension() {
        return tpegotherPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegotherPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegotherPointDescriptorExtension(ExtensionType value) {
        this.tpegotherPointDescriptorExtension = value;
    }

}
