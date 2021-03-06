
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is not a road junction point.
 * 
 * <p>Java class for TPEGNonJunctionPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGNonJunctionPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPoint">
 *       &lt;sequence>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/1_0/1_0}PointCoordinates"/>
 *         &lt;element name="name" type="{http://datex2.eu/schema/1_0/1_0}TPEGOtherPointDescriptor" maxOccurs="unbounded"/>
 *         &lt;element name="tpegnonJunctionPointExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGNonJunctionPoint", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "pointCoordinates",
    "name",
    "tpegnonJunctionPointExtension"
})
public class TPEGNonJunctionPoint
    extends TPEGPoint
{

    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(required = true)
    protected List<TPEGOtherPointDescriptor> name;
    protected ExtensionType tpegnonJunctionPointExtension;

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPEGOtherPointDescriptor }
     * 
     * 
     */
    public List<TPEGOtherPointDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TPEGOtherPointDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegnonJunctionPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegnonJunctionPointExtension() {
        return tpegnonJunctionPointExtension;
    }

    /**
     * Sets the value of the tpegnonJunctionPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegnonJunctionPointExtension(ExtensionType value) {
        this.tpegnonJunctionPointExtension = value;
    }

}
