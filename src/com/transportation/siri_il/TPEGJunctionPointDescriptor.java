
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A descriptor for describing a point at a junction on a road network.
 * 
 * <p>Java class for TPEGJunctionPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGJunctionPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegDescriptorType" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03JunctionPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegjunctionPointDescriptorExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGJunctionPointDescriptor", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegDescriptorType",
    "tpegjunctionPointDescriptorExtension"
})
public class TPEGJunctionPointDescriptor
    extends TPEGPointDescriptor
{

    @XmlElement(required = true)
    protected TPEGLoc03JunctionPointDescriptorSubtypeEnum tpegDescriptorType;
    protected ExtensionType tpegjunctionPointDescriptorExtension;

    /**
     * Gets the value of the tpegDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03JunctionPointDescriptorSubtypeEnum getTpegDescriptorType() {
        return tpegDescriptorType;
    }

    /**
     * Sets the value of the tpegDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegDescriptorType(TPEGLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegDescriptorType = value;
    }

    /**
     * Gets the value of the tpegjunctionPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegjunctionPointDescriptorExtension() {
        return tpegjunctionPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegjunctionPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegjunctionPointDescriptorExtension(ExtensionType value) {
        this.tpegjunctionPointDescriptorExtension = value;
    }

}
