
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  Place Equipment.
 * 
 * <p>Java class for PlaceEquipmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceEquipmentStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "extensions"
})
public class PlaceEquipmentStructure
    extends InstalledEquipmentStructure
{

    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}
