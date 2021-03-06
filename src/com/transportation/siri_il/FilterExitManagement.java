
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Filter indicators management information.
 * 
 * <p>Java class for FilterExitManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterExitManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterEnd" type="{http://datex2.eu/schema/1_0/1_0}Boolean"/>
 *         &lt;element name="filterOutOfRange" type="{http://datex2.eu/schema/1_0/1_0}Boolean"/>
 *         &lt;element name="filterExitManagementExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExitManagement", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "filterEnd",
    "filterOutOfRange",
    "filterExitManagementExtension"
})
public class FilterExitManagement {

    protected boolean filterEnd;
    protected boolean filterOutOfRange;
    protected ExtensionType filterExitManagementExtension;

    /**
     * Gets the value of the filterEnd property.
     * 
     */
    public boolean isFilterEnd() {
        return filterEnd;
    }

    /**
     * Sets the value of the filterEnd property.
     * 
     */
    public void setFilterEnd(boolean value) {
        this.filterEnd = value;
    }

    /**
     * Gets the value of the filterOutOfRange property.
     * 
     */
    public boolean isFilterOutOfRange() {
        return filterOutOfRange;
    }

    /**
     * Sets the value of the filterOutOfRange property.
     * 
     */
    public void setFilterOutOfRange(boolean value) {
        this.filterOutOfRange = value;
    }

    /**
     * Gets the value of the filterExitManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterExitManagementExtension() {
        return filterExitManagementExtension;
    }

    /**
     * Sets the value of the filterExitManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterExitManagementExtension(ExtensionType value) {
        this.filterExitManagementExtension = value;
    }

}
