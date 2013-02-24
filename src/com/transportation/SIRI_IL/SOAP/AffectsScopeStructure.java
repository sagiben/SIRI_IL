
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Location model for scope of situation or effect.
 * 
 * <p>Java class for AffectsScopeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectsScopeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaOfInterest" type="{http://datex2.eu/schema/1_0/1_0}AreaOfInterestEnum" minOccurs="0"/>
 *         &lt;element name="Operators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *                   &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Networks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedNetwork" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StopPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StopPlaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Places" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleJourneys" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roads" type="{http://www.siri.org.uk/siri}AffectedRoadsStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectsScopeStructure", propOrder = {
    "areaOfInterest",
    "operators",
    "networks",
    "stopPoints",
    "stopPlaces",
    "places",
    "vehicleJourneys",
    "roads",
    "extensions"
})
public class AffectsScopeStructure {

    @XmlElement(name = "AreaOfInterest")
    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(name = "Operators")
    protected AffectsScopeStructure.Operators operators;
    @XmlElement(name = "Networks")
    protected AffectsScopeStructure.Networks networks;
    @XmlElement(name = "StopPoints")
    protected AffectsScopeStructure.StopPoints stopPoints;
    @XmlElement(name = "StopPlaces")
    protected AffectsScopeStructure.StopPlaces stopPlaces;
    @XmlElement(name = "Places")
    protected AffectsScopeStructure.Places places;
    @XmlElement(name = "VehicleJourneys")
    protected AffectsScopeStructure.VehicleJourneys vehicleJourneys;
    @XmlElement(name = "Roads")
    protected AffectedRoadsStructure roads;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the areaOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Sets the value of the areaOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Gets the value of the operators property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Operators }
     *     
     */
    public AffectsScopeStructure.Operators getOperators() {
        return operators;
    }

    /**
     * Sets the value of the operators property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Operators }
     *     
     */
    public void setOperators(AffectsScopeStructure.Operators value) {
        this.operators = value;
    }

    /**
     * Gets the value of the networks property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Networks }
     *     
     */
    public AffectsScopeStructure.Networks getNetworks() {
        return networks;
    }

    /**
     * Sets the value of the networks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Networks }
     *     
     */
    public void setNetworks(AffectsScopeStructure.Networks value) {
        this.networks = value;
    }

    /**
     * Gets the value of the stopPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.StopPoints }
     *     
     */
    public AffectsScopeStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Sets the value of the stopPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.StopPoints }
     *     
     */
    public void setStopPoints(AffectsScopeStructure.StopPoints value) {
        this.stopPoints = value;
    }

    /**
     * Gets the value of the stopPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.StopPlaces }
     *     
     */
    public AffectsScopeStructure.StopPlaces getStopPlaces() {
        return stopPlaces;
    }

    /**
     * Sets the value of the stopPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.StopPlaces }
     *     
     */
    public void setStopPlaces(AffectsScopeStructure.StopPlaces value) {
        this.stopPlaces = value;
    }

    /**
     * Gets the value of the places property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.Places }
     *     
     */
    public AffectsScopeStructure.Places getPlaces() {
        return places;
    }

    /**
     * Sets the value of the places property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.Places }
     *     
     */
    public void setPlaces(AffectsScopeStructure.Places value) {
        this.places = value;
    }

    /**
     * Gets the value of the vehicleJourneys property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure.VehicleJourneys }
     *     
     */
    public AffectsScopeStructure.VehicleJourneys getVehicleJourneys() {
        return vehicleJourneys;
    }

    /**
     * Sets the value of the vehicleJourneys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure.VehicleJourneys }
     *     
     */
    public void setVehicleJourneys(AffectsScopeStructure.VehicleJourneys value) {
        this.vehicleJourneys = value;
    }

    /**
     * Gets the value of the roads property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedRoadsStructure }
     *     
     */
    public AffectedRoadsStructure getRoads() {
        return roads;
    }

    /**
     * Sets the value of the roads property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedRoadsStructure }
     *     
     */
    public void setRoads(AffectedRoadsStructure value) {
        this.roads = value;
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
     *         &lt;element name="AffectedNetwork" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "affectedNetwork"
    })
    public static class Networks {

        @XmlElement(name = "AffectedNetwork", required = true)
        protected List<AffectsScopeStructure.Networks.AffectedNetwork> affectedNetwork;

        /**
         * Gets the value of the affectedNetwork property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedNetwork property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedNetwork().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectsScopeStructure.Networks.AffectedNetwork }
         * 
         * 
         */
        public List<AffectsScopeStructure.Networks.AffectedNetwork> getAffectedNetwork() {
            if (affectedNetwork == null) {
                affectedNetwork = new ArrayList<AffectsScopeStructure.Networks.AffectedNetwork>();
            }
            return this.affectedNetwork;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedNetworkStructure">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AffectedNetwork
            extends AffectedNetworkStructure
        {


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
     *       &lt;choice>
     *         &lt;element name="AllOperators" type="{http://www.siri.org.uk/siri}EmptyType"/>
     *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allOperators",
        "affectedOperator"
    })
    public static class Operators {

        @XmlElement(name = "AllOperators")
        protected String allOperators;
        @XmlElement(name = "AffectedOperator")
        protected List<AffectedOperatorStructure> affectedOperator;

        /**
         * Gets the value of the allOperators property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllOperators() {
            return allOperators;
        }

        /**
         * Sets the value of the allOperators property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllOperators(String value) {
            this.allOperators = value;
        }

        /**
         * Gets the value of the affectedOperator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedOperator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedOperatorStructure }
         * 
         * 
         */
        public List<AffectedOperatorStructure> getAffectedOperator() {
            if (affectedOperator == null) {
                affectedOperator = new ArrayList<AffectedOperatorStructure>();
            }
            return this.affectedOperator;
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
     *         &lt;element name="AffectedPlace" type="{http://www.siri.org.uk/siri}AffectedPlaceStructure" maxOccurs="unbounded"/>
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
        "affectedPlace"
    })
    public static class Places {

        @XmlElement(name = "AffectedPlace", required = true)
        protected List<AffectedPlaceStructure> affectedPlace;

        /**
         * Gets the value of the affectedPlace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedPlace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedPlaceStructure }
         * 
         * 
         */
        public List<AffectedPlaceStructure> getAffectedPlace() {
            if (affectedPlace == null) {
                affectedPlace = new ArrayList<AffectedPlaceStructure>();
            }
            return this.affectedPlace;
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
     *         &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/>
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
        "affectedStopPlace"
    })
    public static class StopPlaces {

        @XmlElement(name = "AffectedStopPlace", required = true)
        protected List<AffectedStopPlaceStructure> affectedStopPlace;

        /**
         * Gets the value of the affectedStopPlace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPlace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPlaceStructure }
         * 
         * 
         */
        public List<AffectedStopPlaceStructure> getAffectedStopPlace() {
            if (affectedStopPlace == null) {
                affectedStopPlace = new ArrayList<AffectedStopPlaceStructure>();
            }
            return this.affectedStopPlace;
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
     *         &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/>
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
        "affectedStopPoint"
    })
    public static class StopPoints {

        @XmlElement(name = "AffectedStopPoint", required = true)
        protected List<AffectedStopPointStructure> affectedStopPoint;

        /**
         * Gets the value of the affectedStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPointStructure }
         * 
         * 
         */
        public List<AffectedStopPointStructure> getAffectedStopPoint() {
            if (affectedStopPoint == null) {
                affectedStopPoint = new ArrayList<AffectedStopPointStructure>();
            }
            return this.affectedStopPoint;
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
     *         &lt;element name="AffectedVehicleJourney" type="{http://www.siri.org.uk/siri}AffectedVehicleJourneyStructure"/>
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
        "affectedVehicleJourney"
    })
    public static class VehicleJourneys {

        @XmlElement(name = "AffectedVehicleJourney", required = true)
        protected AffectedVehicleJourneyStructure affectedVehicleJourney;

        /**
         * Gets the value of the affectedVehicleJourney property.
         * 
         * @return
         *     possible object is
         *     {@link AffectedVehicleJourneyStructure }
         *     
         */
        public AffectedVehicleJourneyStructure getAffectedVehicleJourney() {
            return affectedVehicleJourney;
        }

        /**
         * Sets the value of the affectedVehicleJourney property.
         * 
         * @param value
         *     allowed object is
         *     {@link AffectedVehicleJourneyStructure }
         *     
         */
        public void setAffectedVehicleJourney(AffectedVehicleJourneyStructure value) {
            this.affectedVehicleJourney = value;
        }

    }

}
