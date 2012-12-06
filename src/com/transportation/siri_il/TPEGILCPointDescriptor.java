
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a junction by defining the intersecting roads.
 * 
 * <p>Java class for TPEGILCPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGILCPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegDescriptorType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03ILCPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegilcpointDescriptorExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGILCPointDescriptor", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDescriptorType",
    "tpegilcpointDescriptorExtension"
})
public class TPEGILCPointDescriptor
    extends TPEGPointDescriptor
{

    @XmlElement(required = true)
    protected TPEGLoc03ILCPointDescriptorSubtypeEnum tpegDescriptorType;
    protected ExtensionType tpegilcpointDescriptorExtension;

    /**
     * Gets the value of the tpegDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03ILCPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03ILCPointDescriptorSubtypeEnum getTpegDescriptorType() {
        return tpegDescriptorType;
    }

    /**
     * Sets the value of the tpegDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03ILCPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegDescriptorType(TPEGLoc03ILCPointDescriptorSubtypeEnum value) {
        this.tpegDescriptorType = value;
    }

    /**
     * Gets the value of the tpegilcpointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegilcpointDescriptorExtension() {
        return tpegilcpointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegilcpointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegilcpointDescriptorExtension(ExtensionType value) {
        this.tpegilcpointDescriptorExtension = value;
    }

}
