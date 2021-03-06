
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a point location.
 * 
 * <p>Java class for TPEGPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegpointDescriptorExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGPointDescriptor", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegpointDescriptorExtension"
})
@XmlSeeAlso({
    TPEGILCPointDescriptor.class,
    TPEGOtherPointDescriptor.class,
    TPEGJunctionPointDescriptor.class
})
public abstract class TPEGPointDescriptor
    extends TPEGDescriptor
{

    protected ExtensionType tpegpointDescriptorExtension;

    /**
     * Gets the value of the tpegpointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegpointDescriptorExtension() {
        return tpegpointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegpointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegpointDescriptorExtension(ExtensionType value) {
        this.tpegpointDescriptorExtension = value;
    }

}
