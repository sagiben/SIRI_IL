
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A point on the road network which is a road junction point.
 * 
 * <p>Java class for TPEGJunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGJunction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGPoint">
 *       &lt;sequence>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/1_0/1_0}PointCoordinates"/>
 *         &lt;element name="name" type="{http://datex2.eu/schema/1_0/1_0}TPEGJunctionPointDescriptor" minOccurs="0"/>
 *         &lt;element name="ilc" type="{http://datex2.eu/schema/1_0/1_0}TPEGILCPointDescriptor" maxOccurs="3"/>
 *         &lt;element name="otherName" type="{http://datex2.eu/schema/1_0/1_0}TPEGOtherPointDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tpegjunctionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGJunction", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "pointCoordinates",
    "name",
    "ilc",
    "otherName",
    "tpegjunctionExtension"
})
public class TPEGJunction
    extends TPEGPoint
{

    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    protected TPEGJunctionPointDescriptor name;
    @XmlElement(required = true)
    protected List<TPEGILCPointDescriptor> ilc;
    protected List<TPEGOtherPointDescriptor> otherName;
    protected ExtensionType tpegjunctionExtension;

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
     * @return
     *     possible object is
     *     {@link TPEGJunctionPointDescriptor }
     *     
     */
    public TPEGJunctionPointDescriptor getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPEGJunctionPointDescriptor }
     *     
     */
    public void setName(TPEGJunctionPointDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the ilc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPEGILCPointDescriptor }
     * 
     * 
     */
    public List<TPEGILCPointDescriptor> getIlc() {
        if (ilc == null) {
            ilc = new ArrayList<TPEGILCPointDescriptor>();
        }
        return this.ilc;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPEGOtherPointDescriptor }
     * 
     * 
     */
    public List<TPEGOtherPointDescriptor> getOtherName() {
        if (otherName == null) {
            otherName = new ArrayList<TPEGOtherPointDescriptor>();
        }
        return this.otherName;
    }

    /**
     * Gets the value of the tpegjunctionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegjunctionExtension() {
        return tpegjunctionExtension;
    }

    /**
     * Sets the value of the tpegjunctionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegjunctionExtension(ExtensionType value) {
        this.tpegjunctionExtension = value;
    }

}
