
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for image 
 * 
 * <p>Java class for ImageStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="ImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *         &lt;element name="ImageContent" type="{http://www.siri.org.uk/siri}ImageContentEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageStructure", propOrder = {
    "imageRef",
    "imageBinary",
    "imageContent"
})
@XmlSeeAlso({
    com.transportation.SIRI_IL.SOAP.RoadSituationElementStructure.Images.Image.class
})
public class ImageStructure {

    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "ImageBinary")
    protected byte[] imageBinary;
    @XmlElement(name = "ImageContent")
    protected ImageContentEnumeration imageContent;

    /**
     * Gets the value of the imageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Sets the value of the imageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    /**
     * Gets the value of the imageBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageBinary() {
        return imageBinary;
    }

    /**
     * Sets the value of the imageBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageBinary(byte[] value) {
        this.imageBinary = value;
    }

    /**
     * Gets the value of the imageContent property.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public ImageContentEnumeration getImageContent() {
        return imageContent;
    }

    /**
     * Sets the value of the imageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public void setImageContent(ImageContentEnumeration value) {
        this.imageContent = value;
    }

}
