
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about a line type.
 * 
 * <p>Java class for AnnotatedLineStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedLineStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/>
 *         &lt;element name="LineName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure"/>
 *         &lt;element name="Monitored" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Destinations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}Destination" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Directions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}Direction" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedLineStructure", propOrder = {
    "lineRef",
    "lineName",
    "monitored",
    "destinations",
    "directions"
})
public class AnnotatedLineStructure {

    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "LineName", required = true)
    protected NaturalLanguageStringStructure lineName;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected boolean monitored;
    @XmlElement(name = "Destinations")
    protected AnnotatedLineStructure.Destinations destinations;
    @XmlElement(name = "Directions")
    protected AnnotatedLineStructure.Directions directions;

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the lineName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getLineName() {
        return lineName;
    }

    /**
     * Sets the value of the lineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setLineName(NaturalLanguageStringStructure value) {
        this.lineName = value;
    }

    /**
     * Gets the value of the monitored property.
     * 
     */
    public boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     */
    public void setMonitored(boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedLineStructure.Destinations }
     *     
     */
    public AnnotatedLineStructure.Destinations getDestinations() {
        return destinations;
    }

    /**
     * Sets the value of the destinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedLineStructure.Destinations }
     *     
     */
    public void setDestinations(AnnotatedLineStructure.Destinations value) {
        this.destinations = value;
    }

    /**
     * Gets the value of the directions property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotatedLineStructure.Directions }
     *     
     */
    public AnnotatedLineStructure.Directions getDirections() {
        return directions;
    }

    /**
     * Sets the value of the directions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotatedLineStructure.Directions }
     *     
     */
    public void setDirections(AnnotatedLineStructure.Directions value) {
        this.directions = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}Destination" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destination"
    })
    public static class Destinations {

        @XmlElement(name = "Destination", required = true)
        protected List<AnnotatedDestinationStructure> destination;

        /**
         * Gets the value of the destination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnnotatedDestinationStructure }
         * 
         * 
         */
        public List<AnnotatedDestinationStructure> getDestination() {
            if (destination == null) {
                destination = new ArrayList<AnnotatedDestinationStructure>();
            }
            return this.destination;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}Direction" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "direction"
    })
    public static class Directions {

        @XmlElement(name = "Direction", required = true)
        protected List<DirectionStructure> direction;

        /**
         * Gets the value of the direction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the direction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DirectionStructure }
         * 
         * 
         */
        public List<DirectionStructure> getDirection() {
            if (direction == null) {
                direction = new ArrayList<DirectionStructure>();
            }
            return this.direction;
        }

    }

}
