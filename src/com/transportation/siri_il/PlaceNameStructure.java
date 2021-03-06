
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Names of via points, used to help identify the line, for example, Luton to Luton via Sutton. Currently 3 in VDV. Should only be included if  the detail level was requested. 
 * 
 * <p>Java class for PlaceNameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceNameStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}JourneyPlaceRefStructure" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *         &lt;element name="PlaceShortName" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceNameStructure", propOrder = {
    "placeRef",
    "placeName",
    "placeShortName"
})
public class PlaceNameStructure {

    @XmlElement(name = "PlaceRef")
    protected JourneyPlaceRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected NaturalLanguagePlaceNameStructure placeName;
    @XmlElement(name = "PlaceShortName")
    protected List<NaturalLanguagePlaceNameStructure> placeShortName;

    /**
     * Gets the value of the placeRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public JourneyPlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Sets the value of the placeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public void setPlaceRef(JourneyPlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public NaturalLanguagePlaceNameStructure getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public void setPlaceName(NaturalLanguagePlaceNameStructure value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the placeShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getPlaceShortName() {
        if (placeShortName == null) {
            placeShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.placeShortName;
    }

}
