
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of the destination of a defined route or itinerary which is an area.
 * 
 * <p>Java class for AreaDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaDestination">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Destination">
 *       &lt;sequence>
 *         &lt;element name="area" type="{http://datex2.eu/schema/1_0/1_0}Area"/>
 *         &lt;element name="areaDestinationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "area",
    "areaDestinationExtension"
})
public class AreaDestination
    extends Destination
{

    @XmlElement(required = true)
    protected Area area;
    protected ExtensionType areaDestinationExtension;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setArea(Area value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAreaDestinationExtension() {
        return areaDestinationExtension;
    }

    /**
     * Sets the value of the areaDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAreaDestinationExtension(ExtensionType value) {
        this.areaDestinationExtension = value;
    }

}
