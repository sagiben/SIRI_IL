
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a general hyperlink.
 * 
 * <p>Java class for InfoLinkStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="Label" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.siri.org.uk/siri}ImageStructure" minOccurs="0"/>
 *         &lt;element name="LinkContent" type="{http://www.siri.org.uk/siri}LinkContentEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinkStructure", propOrder = {
    "uri",
    "label",
    "image",
    "linkContent"
})
public class InfoLinkStructure {

    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "Label")
    protected NaturalLanguageStringStructure label;
    @XmlElement(name = "Image")
    protected ImageStructure image;
    @XmlElement(name = "LinkContent")
    protected LinkContentEnumeration linkContent;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setLabel(NaturalLanguageStringStructure value) {
        this.label = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageStructure }
     *     
     */
    public ImageStructure getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageStructure }
     *     
     */
    public void setImage(ImageStructure value) {
        this.image = value;
    }

    /**
     * Gets the value of the linkContent property.
     * 
     * @return
     *     possible object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public LinkContentEnumeration getLinkContent() {
        return linkContent;
    }

    /**
     * Sets the value of the linkContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public void setLinkContent(LinkContentEnumeration value) {
        this.linkContent = value;
    }

}