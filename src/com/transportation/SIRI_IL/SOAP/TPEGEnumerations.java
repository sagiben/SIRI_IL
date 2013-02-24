
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations used exclusively in the TPEG-Loc sub-model.
 * 
 * <p>Java class for TPEGEnumerations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGEnumerations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegloc03ILCPointDescriptorSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03ILCPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegenumerationsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="tpegloc02DirectionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc02DirectionTypeEnum"/>
 *         &lt;element name="tpegloc01LinearLocationSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01LinearLocationSubtypeEnum"/>
 *         &lt;element name="tpegloc01AreaLocationSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01AreaLocationSubtypeEnum"/>
 *         &lt;element name="tpegloc01FramedPointLocationSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01FramedPointLocationSubtypeEnum"/>
 *         &lt;element name="tpegloc03OtherPointDescriptorSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03OtherPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegloc01SimplePointLocationSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc01SimplePointLocationSubtypeEnum"/>
 *         &lt;element name="tpegloc04HeightTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc04HeightTypeEnum"/>
 *         &lt;element name="tpegloc03JunctionPointDescriptorSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03JunctionPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegloc03AreaDescriptorSubtypeEnum" type="{http://datex2.eu/schema/1_0/1_0}TPEGLoc03AreaDescriptorSubtypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGEnumerations", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "tpegloc03ILCPointDescriptorSubtypeEnum",
    "tpegenumerationsExtension",
    "tpegloc02DirectionTypeEnum",
    "tpegloc01LinearLocationSubtypeEnum",
    "tpegloc01AreaLocationSubtypeEnum",
    "tpegloc01FramedPointLocationSubtypeEnum",
    "tpegloc03OtherPointDescriptorSubtypeEnum",
    "tpegloc01SimplePointLocationSubtypeEnum",
    "tpegloc04HeightTypeEnum",
    "tpegloc03JunctionPointDescriptorSubtypeEnum",
    "tpegloc03AreaDescriptorSubtypeEnum"
})
public abstract class TPEGEnumerations {

    @XmlElement(required = true)
    protected TPEGLoc03ILCPointDescriptorSubtypeEnum tpegloc03ILCPointDescriptorSubtypeEnum;
    protected ExtensionType tpegenumerationsExtension;
    @XmlElement(required = true)
    protected TPEGLoc02DirectionTypeEnum tpegloc02DirectionTypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc01LinearLocationSubtypeEnum tpegloc01LinearLocationSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc01AreaLocationSubtypeEnum tpegloc01AreaLocationSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc01FramedPointLocationSubtypeEnum tpegloc01FramedPointLocationSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc03OtherPointDescriptorSubtypeEnum tpegloc03OtherPointDescriptorSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc01SimplePointLocationSubtypeEnum tpegloc01SimplePointLocationSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc04HeightTypeEnum tpegloc04HeightTypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc03JunctionPointDescriptorSubtypeEnum tpegloc03JunctionPointDescriptorSubtypeEnum;
    @XmlElement(required = true)
    protected TPEGLoc03AreaDescriptorSubtypeEnum tpegloc03AreaDescriptorSubtypeEnum;

    /**
     * Gets the value of the tpegloc03ILCPointDescriptorSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03ILCPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03ILCPointDescriptorSubtypeEnum getTpegloc03ILCPointDescriptorSubtypeEnum() {
        return tpegloc03ILCPointDescriptorSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc03ILCPointDescriptorSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03ILCPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegloc03ILCPointDescriptorSubtypeEnum(TPEGLoc03ILCPointDescriptorSubtypeEnum value) {
        this.tpegloc03ILCPointDescriptorSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegenumerationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegenumerationsExtension() {
        return tpegenumerationsExtension;
    }

    /**
     * Sets the value of the tpegenumerationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegenumerationsExtension(ExtensionType value) {
        this.tpegenumerationsExtension = value;
    }

    /**
     * Gets the value of the tpegloc02DirectionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc02DirectionTypeEnum }
     *     
     */
    public TPEGLoc02DirectionTypeEnum getTpegloc02DirectionTypeEnum() {
        return tpegloc02DirectionTypeEnum;
    }

    /**
     * Sets the value of the tpegloc02DirectionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc02DirectionTypeEnum }
     *     
     */
    public void setTpegloc02DirectionTypeEnum(TPEGLoc02DirectionTypeEnum value) {
        this.tpegloc02DirectionTypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc01LinearLocationSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01LinearLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01LinearLocationSubtypeEnum getTpegloc01LinearLocationSubtypeEnum() {
        return tpegloc01LinearLocationSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc01LinearLocationSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01LinearLocationSubtypeEnum }
     *     
     */
    public void setTpegloc01LinearLocationSubtypeEnum(TPEGLoc01LinearLocationSubtypeEnum value) {
        this.tpegloc01LinearLocationSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc01AreaLocationSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01AreaLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01AreaLocationSubtypeEnum getTpegloc01AreaLocationSubtypeEnum() {
        return tpegloc01AreaLocationSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc01AreaLocationSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegloc01AreaLocationSubtypeEnum(TPEGLoc01AreaLocationSubtypeEnum value) {
        this.tpegloc01AreaLocationSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc01FramedPointLocationSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01FramedPointLocationSubtypeEnum getTpegloc01FramedPointLocationSubtypeEnum() {
        return tpegloc01FramedPointLocationSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc01FramedPointLocationSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01FramedPointLocationSubtypeEnum }
     *     
     */
    public void setTpegloc01FramedPointLocationSubtypeEnum(TPEGLoc01FramedPointLocationSubtypeEnum value) {
        this.tpegloc01FramedPointLocationSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc03OtherPointDescriptorSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03OtherPointDescriptorSubtypeEnum getTpegloc03OtherPointDescriptorSubtypeEnum() {
        return tpegloc03OtherPointDescriptorSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc03OtherPointDescriptorSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03OtherPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegloc03OtherPointDescriptorSubtypeEnum(TPEGLoc03OtherPointDescriptorSubtypeEnum value) {
        this.tpegloc03OtherPointDescriptorSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc01SimplePointLocationSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public TPEGLoc01SimplePointLocationSubtypeEnum getTpegloc01SimplePointLocationSubtypeEnum() {
        return tpegloc01SimplePointLocationSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc01SimplePointLocationSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc01SimplePointLocationSubtypeEnum }
     *     
     */
    public void setTpegloc01SimplePointLocationSubtypeEnum(TPEGLoc01SimplePointLocationSubtypeEnum value) {
        this.tpegloc01SimplePointLocationSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc04HeightTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc04HeightTypeEnum }
     *     
     */
    public TPEGLoc04HeightTypeEnum getTpegloc04HeightTypeEnum() {
        return tpegloc04HeightTypeEnum;
    }

    /**
     * Sets the value of the tpegloc04HeightTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc04HeightTypeEnum }
     *     
     */
    public void setTpegloc04HeightTypeEnum(TPEGLoc04HeightTypeEnum value) {
        this.tpegloc04HeightTypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc03JunctionPointDescriptorSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03JunctionPointDescriptorSubtypeEnum getTpegloc03JunctionPointDescriptorSubtypeEnum() {
        return tpegloc03JunctionPointDescriptorSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc03JunctionPointDescriptorSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegloc03JunctionPointDescriptorSubtypeEnum(TPEGLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegloc03JunctionPointDescriptorSubtypeEnum = value;
    }

    /**
     * Gets the value of the tpegloc03AreaDescriptorSubtypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link TPEGLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public TPEGLoc03AreaDescriptorSubtypeEnum getTpegloc03AreaDescriptorSubtypeEnum() {
        return tpegloc03AreaDescriptorSubtypeEnum;
    }

    /**
     * Sets the value of the tpegloc03AreaDescriptorSubtypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegloc03AreaDescriptorSubtypeEnum(TPEGLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegloc03AreaDescriptorSubtypeEnum = value;
    }

}
