
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of supplementary positional information which improves the precision of the location.
 * 
 * <p>Java class for SupplementaryPositionalDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPositionalDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/1_0/1_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="lanes" type="{http://datex2.eu/schema/1_0/1_0}LanesEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/1_0/1_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="locationDescriptor" type="{http://datex2.eu/schema/1_0/1_0}LocationDescriptorEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "carriageway",
    "footpath",
    "lanes",
    "lengthAffected",
    "locationDescriptor",
    "supplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription {

    protected List<CarriagewayEnum> carriageway;
    protected Boolean footpath;
    protected List<LanesEnum> lanes;
    protected Float lengthAffected;
    protected List<LocationDescriptorEnum> locationDescriptor;
    protected ExtensionType supplementaryPositionalDescriptionExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getCarriageway() {
        if (carriageway == null) {
            carriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.carriageway;
    }

    /**
     * Gets the value of the footpath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Sets the value of the footpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lanes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lanes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanesEnum }
     * 
     * 
     */
    public List<LanesEnum> getLanes() {
        if (lanes == null) {
            lanes = new ArrayList<LanesEnum>();
        }
        return this.lanes;
    }

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescriptorEnum }
     * 
     * 
     */
    public List<LocationDescriptorEnum> getLocationDescriptor() {
        if (locationDescriptor == null) {
            locationDescriptor = new ArrayList<LocationDescriptorEnum>();
        }
        return this.locationDescriptor;
    }

    /**
     * Gets the value of the supplementaryPositionalDescriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPositionalDescriptionExtension() {
        return supplementaryPositionalDescriptionExtension;
    }

    /**
     * Sets the value of the supplementaryPositionalDescriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        this.supplementaryPositionalDescriptionExtension = value;
    }

}
