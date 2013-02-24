
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Raod scope for scope of situation or effect.
 * 
 * <p>Java class for AffectedRoadStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedRoadStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Road" type="{http://datex2.eu/schema/1_0/1_0}ReferencePointLinear" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadStructure", propOrder = {
    "road",
    "linkProjection",
    "offset"
})
public class AffectedRoadStructure {

    @XmlElement(name = "Road")
    protected ReferencePointLinear road;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;

    /**
     * Gets the value of the road property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointLinear }
     *     
     */
    public ReferencePointLinear getRoad() {
        return road;
    }

    /**
     * Sets the value of the road property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointLinear }
     *     
     */
    public void setRoad(ReferencePointLinear value) {
        this.road = value;
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

}
