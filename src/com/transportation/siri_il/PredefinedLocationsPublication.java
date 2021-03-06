
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A publication containing one or more sets of predfined locations.
 * 
 * <p>Java class for PredefinedLocationsPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationsPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/1_0/1_0}HeaderInformation"/>
 *         &lt;element name="predefinedLocationSet" type="{http://datex2.eu/schema/1_0/1_0}PredefinedLocationSet" maxOccurs="unbounded"/>
 *         &lt;element name="predefinedLocationsPublicationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationsPublication", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "headerInformation",
    "predefinedLocationSet",
    "predefinedLocationsPublicationExtension"
})
public class PredefinedLocationsPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<PredefinedLocationSet> predefinedLocationSet;
    protected ExtensionType predefinedLocationsPublicationExtension;

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the predefinedLocationSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocationSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocationSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocationSet }
     * 
     * 
     */
    public List<PredefinedLocationSet> getPredefinedLocationSet() {
        if (predefinedLocationSet == null) {
            predefinedLocationSet = new ArrayList<PredefinedLocationSet>();
        }
        return this.predefinedLocationSet;
    }

    /**
     * Gets the value of the predefinedLocationsPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationsPublicationExtension() {
        return predefinedLocationsPublicationExtension;
    }

    /**
     * Sets the value of the predefinedLocationsPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationsPublicationExtension(ExtensionType value) {
        this.predefinedLocationsPublicationExtension = value;
    }

}
