
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the supplier's data catalogue in a data exchange context.
 * 
 * <p>Java class for CatalogueReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyCatalogueReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="catalogueReferenceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueReference", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "keyCatalogueReference",
    "catalogueReferenceExtension"
})
public class CatalogueReference {

    @XmlElement(required = true)
    protected String keyCatalogueReference;
    protected ExtensionType catalogueReferenceExtension;

    /**
     * Gets the value of the keyCatalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCatalogueReference() {
        return keyCatalogueReference;
    }

    /**
     * Sets the value of the keyCatalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCatalogueReference(String value) {
        this.keyCatalogueReference = value;
    }

    /**
     * Gets the value of the catalogueReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCatalogueReferenceExtension() {
        return catalogueReferenceExtension;
    }

    /**
     * Sets the value of the catalogueReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCatalogueReferenceExtension(ExtensionType value) {
        this.catalogueReferenceExtension = value;
    }

}
