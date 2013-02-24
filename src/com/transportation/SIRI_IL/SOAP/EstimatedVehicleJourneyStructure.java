
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type for Realtime info about a Vehicle Journey.
 * 
 * <p>Java class for EstimatedVehicleJourneyStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineIdentityGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}EstimatedTimetableAlterationGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyInfoGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}EstimatedJourneyInfoGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}EstimatedRealtimeInfoGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OperationalInfoGroup"/>
 *         &lt;sequence>
 *           &lt;choice>
 *             &lt;element name="EstimatedCalls" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{http://www.siri.org.uk/siri}EstimatedCall" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;group ref="{http://www.siri.org.uk/siri}EstimatedCallsAsFlatGroup"/>
 *           &lt;/choice>
 *           &lt;element name="IsCompleteStopSequence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/sequence>
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
@XmlType(name = "EstimatedVehicleJourneyStructure", propOrder = {
    "lineRef",
    "directionRef",
    "datedVehicleJourneyRef",
    "datedVehicleJourneyIndirectRef",
    "estimatedVehicleJourneyCode",
    "extraJourney",
    "cancellation",
    "journeyPatternRef",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "directionName",
    "externalLineRef",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "vehicleJourneyName",
    "journeyNote",
    "headwayService",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "monitored",
    "predictionInaccurate",
    "occupancy",
    "blockRef",
    "courseOfJourneyRef",
    "vehicleRef",
    "estimatedCalls",
    "estimatedCall",
    "isCompleteStopSequence",
    "extensions"
})
public class EstimatedVehicleJourneyStructure {

    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", required = true)
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DatedVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure datedVehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyIndirectRef")
    protected DatedVehicleJourneyIndirectRefStructure datedVehicleJourneyIndirectRef;
    @XmlElement(name = "EstimatedVehicleJourneyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String estimatedVehicleJourneyCode;
    @XmlElement(name = "ExtraJourney", defaultValue = "false")
    protected Boolean extraJourney;
    @XmlElement(name = "Cancellation", defaultValue = "false")
    protected Boolean cancellation;
    @XmlElement(name = "JourneyPatternRef")
    protected JourneyPatternRefStructure journeyPatternRef;
    @XmlElement(name = "VehicleMode")
    protected List<VehicleModesEnumeration> vehicleMode;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "DirectionName")
    protected NaturalLanguageStringStructure directionName;
    @XmlElement(name = "ExternalLineRef")
    protected LineRefStructure externalLineRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "VehicleJourneyName")
    protected NaturalLanguageStringStructure vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "HeadwayService")
    protected Boolean headwayService;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    @XmlElement(name = "PredictionInaccurate", defaultValue = "false")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "Occupancy")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyStructure courseOfJourneyRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "EstimatedCalls")
    protected EstimatedVehicleJourneyStructure.EstimatedCalls estimatedCalls;
    @XmlElement(name = "EstimatedCall")
    protected List<EstimatedCallStructure> estimatedCall;
    @XmlElement(name = "IsCompleteStopSequence", defaultValue = "false")
    protected Boolean isCompleteStopSequence;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Sets the value of the datedVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.datedVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the datedVehicleJourneyIndirectRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyIndirectRefStructure }
     *     
     */
    public DatedVehicleJourneyIndirectRefStructure getDatedVehicleJourneyIndirectRef() {
        return datedVehicleJourneyIndirectRef;
    }

    /**
     * Sets the value of the datedVehicleJourneyIndirectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyIndirectRefStructure }
     *     
     */
    public void setDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        this.datedVehicleJourneyIndirectRef = value;
    }

    /**
     * Gets the value of the estimatedVehicleJourneyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedVehicleJourneyCode() {
        return estimatedVehicleJourneyCode;
    }

    /**
     * Sets the value of the estimatedVehicleJourneyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedVehicleJourneyCode(String value) {
        this.estimatedVehicleJourneyCode = value;
    }

    /**
     * Gets the value of the extraJourney property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraJourney() {
        return extraJourney;
    }

    /**
     * Sets the value of the extraJourney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraJourney(Boolean value) {
        this.extraJourney = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the journeyPatternRef property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Sets the value of the journeyPatternRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setJourneyPatternRef(JourneyPatternRefStructure value) {
        this.journeyPatternRef = value;
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModesEnumeration }
     * 
     * 
     */
    public List<VehicleModesEnumeration> getVehicleMode() {
        if (vehicleMode == null) {
            vehicleMode = new ArrayList<VehicleModesEnumeration>();
        }
        return this.vehicleMode;
    }

    /**
     * Gets the value of the routeRef property.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Sets the value of the routeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
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
     * Gets the value of the directionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDirectionName() {
        return directionName;
    }

    /**
     * Sets the value of the directionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDirectionName(NaturalLanguageStringStructure value) {
        this.directionName = value;
    }

    /**
     * Gets the value of the externalLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Sets the value of the externalLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setExternalLineRef(LineRefStructure value) {
        this.externalLineRef = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the productCategoryRef property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Sets the value of the productCategoryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRefStructure }
     * 
     * 
     */
    public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRefStructure }
     * 
     * 
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Gets the value of the vehicleJourneyName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getVehicleJourneyName() {
        return vehicleJourneyName;
    }

    /**
     * Sets the value of the vehicleJourneyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setVehicleJourneyName(NaturalLanguageStringStructure value) {
        this.vehicleJourneyName = value;
    }

    /**
     * Gets the value of the journeyNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getJourneyNote() {
        if (journeyNote == null) {
            journeyNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyNote;
    }

    /**
     * Gets the value of the headwayService property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Sets the value of the headwayService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    /**
     * Information about a change of Equipment availabiltiy at stop that may affect access or use.Gets the value of the facilityConditionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityConditionStructure }
     * 
     * 
     */
    public List<FacilityConditionStructure> getFacilityConditionElement() {
        if (facilityConditionElement == null) {
            facilityConditionElement = new ArrayList<FacilityConditionStructure>();
        }
        return this.facilityConditionElement;
    }

    /**
     * Gets the value of the facilityChangeElement property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Sets the value of the facilityChangeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    /**
     * Gets the value of the monitored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Sets the value of the monitored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the predictionInaccurate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredictionInaccurate() {
        return predictionInaccurate;
    }

    /**
     * Sets the value of the predictionInaccurate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredictionInaccurate(Boolean value) {
        this.predictionInaccurate = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the blockRef property.
     * 
     * @return
     *     possible object is
     *     {@link BlockRefStructure }
     *     
     */
    public BlockRefStructure getBlockRef() {
        return blockRef;
    }

    /**
     * Sets the value of the blockRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRefStructure }
     *     
     */
    public void setBlockRef(BlockRefStructure value) {
        this.blockRef = value;
    }

    /**
     * Gets the value of the courseOfJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourneyStructure }
     *     
     */
    public CourseOfJourneyStructure getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Sets the value of the courseOfJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourneyStructure }
     *     
     */
    public void setCourseOfJourneyRef(CourseOfJourneyStructure value) {
        this.courseOfJourneyRef = value;
    }

    /**
     * Gets the value of the vehicleRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Sets the value of the vehicleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the estimatedCalls property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedVehicleJourneyStructure.EstimatedCalls }
     *     
     */
    public EstimatedVehicleJourneyStructure.EstimatedCalls getEstimatedCalls() {
        return estimatedCalls;
    }

    /**
     * Sets the value of the estimatedCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedVehicleJourneyStructure.EstimatedCalls }
     *     
     */
    public void setEstimatedCalls(EstimatedVehicleJourneyStructure.EstimatedCalls value) {
        this.estimatedCalls = value;
    }

    /**
     * Gets the value of the estimatedCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedCallStructure }
     * 
     * 
     */
    public List<EstimatedCallStructure> getEstimatedCall() {
        if (estimatedCall == null) {
            estimatedCall = new ArrayList<EstimatedCallStructure>();
        }
        return this.estimatedCall;
    }

    /**
     * Gets the value of the isCompleteStopSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleteStopSequence() {
        return isCompleteStopSequence;
    }

    /**
     * Sets the value of the isCompleteStopSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleteStopSequence(Boolean value) {
        this.isCompleteStopSequence = value;
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedCall" maxOccurs="unbounded"/>
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
        "estimatedCall"
    })
    public static class EstimatedCalls {

        @XmlElement(name = "EstimatedCall", required = true)
        protected List<EstimatedCallStructure> estimatedCall;

        /**
         * Gets the value of the estimatedCall property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the estimatedCall property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEstimatedCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EstimatedCallStructure }
         * 
         * 
         */
        public List<EstimatedCallStructure> getEstimatedCall() {
            if (estimatedCall == null) {
                estimatedCall = new ArrayList<EstimatedCallStructure>();
            }
            return this.estimatedCall;
        }

    }

}
