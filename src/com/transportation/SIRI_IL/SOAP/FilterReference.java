
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a supplier's filter in a data exchange context.
 * 
 * <p>Java class for FilterReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteFilter" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="filterOperationApproved" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="keyFilterReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="filterReferenceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReference", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "deleteFilter",
    "filterOperationApproved",
    "keyFilterReference",
    "filterReferenceExtension"
})
public class FilterReference {

    protected Boolean deleteFilter;
    protected Boolean filterOperationApproved;
    @XmlElement(required = true)
    protected String keyFilterReference;
    protected ExtensionType filterReferenceExtension;

    /**
     * Gets the value of the deleteFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteFilter() {
        return deleteFilter;
    }

    /**
     * Sets the value of the deleteFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteFilter(Boolean value) {
        this.deleteFilter = value;
    }

    /**
     * Gets the value of the filterOperationApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterOperationApproved() {
        return filterOperationApproved;
    }

    /**
     * Sets the value of the filterOperationApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterOperationApproved(Boolean value) {
        this.filterOperationApproved = value;
    }

    /**
     * Gets the value of the keyFilterReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFilterReference() {
        return keyFilterReference;
    }

    /**
     * Sets the value of the keyFilterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFilterReference(String value) {
        this.keyFilterReference = value;
    }

    /**
     * Gets the value of the filterReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterReferenceExtension() {
        return filterReferenceExtension;
    }

    /**
     * Sets the value of the filterReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterReferenceExtension(ExtensionType value) {
        this.filterReferenceExtension = value;
    }

}
