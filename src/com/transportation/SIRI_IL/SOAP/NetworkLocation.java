
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of a location on a network (as a point or a linear location).
 * 
 * <p>Java class for NetworkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Location">
 *       &lt;sequence>
 *         &lt;element name="supplementaryPositionalDescription" type="{http://datex2.eu/schema/1_0/1_0}SupplementaryPositionalDescription" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://datex2.eu/schema/1_0/1_0}Destination" minOccurs="0"/>
 *         &lt;element name="networkLocationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "supplementaryPositionalDescription",
    "destination",
    "networkLocationExtension"
})
@XmlSeeAlso({
    Point.class,
    Linear.class
})
public abstract class NetworkLocation
    extends Location
{

    protected SupplementaryPositionalDescription supplementaryPositionalDescription;
    protected Destination destination;
    protected ExtensionType networkLocationExtension;

    /**
     * Gets the value of the supplementaryPositionalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public SupplementaryPositionalDescription getSupplementaryPositionalDescription() {
        return supplementaryPositionalDescription;
    }

    /**
     * Sets the value of the supplementaryPositionalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public void setSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        this.supplementaryPositionalDescription = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the networkLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkLocationExtension() {
        return networkLocationExtension;
    }

    /**
     * Sets the value of the networkLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkLocationExtension(ExtensionType value) {
        this.networkLocationExtension = value;
    }

}
