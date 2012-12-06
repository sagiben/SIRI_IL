
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for information about a vehicle journey affected by an Situation
 * 
 * <p>Java class for AffectedVehicleJourneyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleJourneyRef" type="{http://www.siri.org.uk/siri}VehicleJourneyRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JourneyName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" minOccurs="0"/>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}PublishedLineName" minOccurs="0"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/>
 *         &lt;element name="Origins" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
 *         &lt;element name="OriginAimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DestinationAimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;element name="Calls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "AffectedVehicleJourneyStructure", propOrder = {
    "vehicleJourneyRef",
    "datedVehicleJourneyRef",
    "journeyName",
    "operator",
    "lineRef",
    "publishedLineName",
    "directionRef",
    "origins",
    "destinations",
    "route",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "accessibilityAssessment",
    "calls",
    "extensions"
})
public class AffectedVehicleJourneyStructure {

    @XmlElement(name = "VehicleJourneyRef")
    protected List<VehicleJourneyRefStructure> vehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyRef")
    protected List<DatedVehicleJourneyRefStructure> datedVehicleJourneyRef;
    @XmlElement(name = "JourneyName")
    protected NaturalLanguageStringStructure journeyName;
    @XmlElement(name = "Operator")
    protected AffectedOperatorStructure operator;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Origins")
    protected List<AffectedStopPointStructure> origins;
    @XmlElement(name = "Destinations")
    protected List<AffectedStopPointStructure> destinations;
    @XmlElement(name = "Route", required = true)
    protected List<AffectedRouteStructure> route;
    @XmlElement(name = "OriginAimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar destinationAimedArrivalTime;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Calls")
    protected AffectedVehicleJourneyStructure.Calls calls;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the vehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourneyRefStructure }
     * 
     * 
     */
    public List<VehicleJourneyRefStructure> getVehicleJourneyRef() {
        if (vehicleJourneyRef == null) {
            vehicleJourneyRef = new ArrayList<VehicleJourneyRefStructure>();
        }
        return this.vehicleJourneyRef;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<DatedVehicleJourneyRefStructure> getDatedVehicleJourneyRef() {
        if (datedVehicleJourneyRef == null) {
            datedVehicleJourneyRef = new ArrayList<DatedVehicleJourneyRefStructure>();
        }
        return this.datedVehicleJourneyRef;
    }

    /**
     * Gets the value of the journeyName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getJourneyName() {
        return journeyName;
    }

    /**
     * Sets the value of the journeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setJourneyName(NaturalLanguageStringStructure value) {
        this.journeyName = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public AffectedOperatorStructure getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public void setOperator(AffectedOperatorStructure value) {
        this.operator = value;
    }

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
     * Gets the value of the publishedLineName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Sets the value of the publishedLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the origins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<AffectedStopPointStructure>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPointStructure>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRouteStructure }
     * 
     * 
     */
    public List<AffectedRouteStructure> getRoute() {
        if (route == null) {
            route = new ArrayList<AffectedRouteStructure>();
        }
        return this.route;
    }

    /**
     * Gets the value of the originAimedDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginAimedDepartureTime() {
        return originAimedDepartureTime;
    }

    /**
     * Sets the value of the originAimedDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginAimedDepartureTime(XMLGregorianCalendar value) {
        this.originAimedDepartureTime = value;
    }

    /**
     * Gets the value of the destinationAimedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDestinationAimedArrivalTime() {
        return destinationAimedArrivalTime;
    }

    /**
     * Sets the value of the destinationAimedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDestinationAimedArrivalTime(XMLGregorianCalendar value) {
        this.destinationAimedArrivalTime = value;
    }

    /**
     * Gets the value of the accessibilityAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Sets the value of the accessibilityAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the calls property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public AffectedVehicleJourneyStructure.Calls getCalls() {
        return calls;
    }

    /**
     * Sets the value of the calls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public void setCalls(AffectedVehicleJourneyStructure.Calls value) {
        this.calls = value;
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
     *         &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/>
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
        "call"
    })
    public static class Calls {

        @XmlElement(name = "Call", required = true)
        protected List<AffectedCallStructure> call;

        /**
         * Gets the value of the call property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the call property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedCallStructure }
         * 
         * 
         */
        public List<AffectedCallStructure> getCall() {
            if (call == null) {
                call = new ArrayList<AffectedCallStructure>();
            }
            return this.call;
        }

    }

}