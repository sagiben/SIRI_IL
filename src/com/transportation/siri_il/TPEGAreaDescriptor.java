
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing an area location.
 * 
 * <p>Java class for TPEGAreaDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGAreaDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegDescriptorType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03AreaDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegareaDescriptorExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGAreaDescriptor", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDescriptorType",
    "tpegareaDescriptorExtension"
})
public class TPEGAreaDescriptor
    extends TPEGDescriptor
{

    @XmlElement(required = true)
    protected TPEGLoc03AreaDescriptorSubtypeEnum tpegDescriptorType;
    protected ExtensionType tpegareaDescriptorExtension;

    /**
     * Gets the value of the tpegDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03AreaDescriptorSubtypeEnum getTpegDescriptorType() {
        return tpegDescriptorType;
    }

    /**
     * Sets the value of the tpegDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegDescriptorType(TPEGLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegDescriptorType = value;
    }

    /**
     * Gets the value of the tpegareaDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegareaDescriptorExtension() {
        return tpegareaDescriptorExtension;
    }

    /**
     * Sets the value of the tpegareaDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegareaDescriptorExtension(ExtensionType value) {
        this.tpegareaDescriptorExtension = value;
    }

}
