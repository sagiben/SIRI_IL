
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about the sectons affected by an Situation
 * 
 * <p>Java class for AffectedSectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedSectionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SectionRef" type="{http://www.siri.org.uk/siri}SectionRefStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedSectionStructure", propOrder = {
    "sectionRef",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedSectionStructure {

    @XmlElement(name = "SectionRef")
    protected SectionRefStructure sectionRef;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the sectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link SectionRefStructure }
     *     
     */
    public SectionRefStructure getSectionRef() {
        return sectionRef;
    }

    /**
     * Sets the value of the sectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRefStructure }
     *     
     */
    public void setSectionRef(SectionRefStructure value) {
        this.sectionRef = value;
    }

    /**
     * Gets the value of the linkProjection property.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Sets the value of the linkProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
