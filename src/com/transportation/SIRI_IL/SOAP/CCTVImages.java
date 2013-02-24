
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of CCTV images which form part of a traffic view record.
 * 
 * <p>Java class for CCTVImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTVImages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvUri" type="{http://datex2.eu/schema/1_0/1_0}String" maxOccurs="unbounded"/>
 *         &lt;element name="cctvimagesExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCTVImages", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "cctvUri",
    "cctvimagesExtension"
})
public class CCTVImages {

    @XmlElement(required = true)
    protected List<String> cctvUri;
    protected ExtensionType cctvimagesExtension;

    /**
     * Gets the value of the cctvUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCctvUri() {
        if (cctvUri == null) {
            cctvUri = new ArrayList<String>();
        }
        return this.cctvUri;
    }

    /**
     * Gets the value of the cctvimagesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvimagesExtension() {
        return cctvimagesExtension;
    }

    /**
     * Sets the value of the cctvimagesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvimagesExtension(ExtensionType value) {
        this.cctvimagesExtension = value;
    }

}
