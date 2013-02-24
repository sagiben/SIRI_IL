
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Change to a Distributor stop position.
 * 
 * <p>Java class for StoppingPositionChangedDepartureStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoppingPositionChangedDepartureStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDistributorItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ChangeNote" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *         &lt;element name="NewLocation" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoppingPositionChangedDepartureStructure", propOrder = {
    "changeNote",
    "newLocation",
    "extensions"
})
public class StoppingPositionChangedDepartureStructure
    extends AbstractDistributorItemStructure
{

    @XmlElement(name = "ChangeNote")
    protected NaturalLanguagePlaceNameStructure changeNote;
    @XmlElement(name = "NewLocation")
    protected LocationStructure newLocation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the changeNote property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public NaturalLanguagePlaceNameStructure getChangeNote() {
        return changeNote;
    }

    /**
     * Sets the value of the changeNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public void setChangeNote(NaturalLanguagePlaceNameStructure value) {
        this.changeNote = value;
    }

    /**
     * Gets the value of the newLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getNewLocation() {
        return newLocation;
    }

    /**
     * Sets the value of the newLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setNewLocation(LocationStructure value) {
        this.newLocation = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
