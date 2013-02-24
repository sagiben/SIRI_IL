
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An event which is not planned by the traffic operator, which is affecting, or has the potential to affect traffic flow. This SIRI-SX element embeds the Datex2 TrafficElement, making all elements optional because  they may alternatvielky be specified by common  SIRI-SRX situation elements
 * 
 * <p>Java class for OptionalTrafficElementStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalTrafficElementStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2ManagementGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2SituationGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2RoadGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}Datex2OtherGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalTrafficElementStructure", propOrder = {
    "situationRecordCreationReference",
    "situationRecordCreationTime",
    "situationRecordObservationTime",
    "situationRecordVersion",
    "situationRecordVersionTime",
    "situationRecordFirstSupplierVersionTime",
    "informationUsageOverride",
    "probabilityOfOccurrence",
    "sourceInformation",
    "validity",
    "impact",
    "cause",
    "advice",
    "generalPublicComment",
    "nonGeneralPublicComment",
    "groupOfLocations",
    "management",
    "situationRecordExtension",
    "trafficElementExtension"
})
public abstract class OptionalTrafficElementStructure {

    @XmlElement(required = true)
    protected String situationRecordCreationReference;
    protected DateTime situationRecordCreationTime;
    protected DateTime situationRecordObservationTime;
    protected BigInteger situationRecordVersion;
    protected DateTime situationRecordVersionTime;
    @XmlElement(required = true)
    protected DateTime situationRecordFirstSupplierVersionTime;
    protected InformationUsageEnum informationUsageOverride;
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrence;
    protected SourceInformation sourceInformation;
    protected Validity validity;
    protected Impact impact;
    protected Cause cause;
    protected List<Advice> advice;
    protected List<Comment> generalPublicComment;
    protected List<Comment> nonGeneralPublicComment;
    protected GroupOfLocations groupOfLocations;
    protected Management management;
    protected ExtensionType situationRecordExtension;
    protected ExtensionType trafficElementExtension;

    /**
     * Gets the value of the situationRecordCreationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationRecordCreationReference() {
        return situationRecordCreationReference;
    }

    /**
     * Sets the value of the situationRecordCreationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationRecordCreationReference(String value) {
        this.situationRecordCreationReference = value;
    }

    /**
     * Gets the value of the situationRecordCreationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSituationRecordCreationTime() {
        return situationRecordCreationTime;
    }

    /**
     * Sets the value of the situationRecordCreationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSituationRecordCreationTime(DateTime value) {
        this.situationRecordCreationTime = value;
    }

    /**
     * Gets the value of the situationRecordObservationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSituationRecordObservationTime() {
        return situationRecordObservationTime;
    }

    /**
     * Sets the value of the situationRecordObservationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSituationRecordObservationTime(DateTime value) {
        this.situationRecordObservationTime = value;
    }

    /**
     * Gets the value of the situationRecordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSituationRecordVersion() {
        return situationRecordVersion;
    }

    /**
     * Sets the value of the situationRecordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSituationRecordVersion(BigInteger value) {
        this.situationRecordVersion = value;
    }

    /**
     * Gets the value of the situationRecordVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSituationRecordVersionTime() {
        return situationRecordVersionTime;
    }

    /**
     * Sets the value of the situationRecordVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSituationRecordVersionTime(DateTime value) {
        this.situationRecordVersionTime = value;
    }

    /**
     * Gets the value of the situationRecordFirstSupplierVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSituationRecordFirstSupplierVersionTime() {
        return situationRecordFirstSupplierVersionTime;
    }

    /**
     * Sets the value of the situationRecordFirstSupplierVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSituationRecordFirstSupplierVersionTime(DateTime value) {
        this.situationRecordFirstSupplierVersionTime = value;
    }

    /**
     * Gets the value of the informationUsageOverride property.
     * 
     * @return
     *     possible object is
     *     {@link InformationUsageEnum }
     *     
     */
    public InformationUsageEnum getInformationUsageOverride() {
        return informationUsageOverride;
    }

    /**
     * Sets the value of the informationUsageOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationUsageEnum }
     *     
     */
    public void setInformationUsageOverride(InformationUsageEnum value) {
        this.informationUsageOverride = value;
    }

    /**
     * Gets the value of the probabilityOfOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrence() {
        return probabilityOfOccurrence;
    }

    /**
     * Sets the value of the probabilityOfOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrence = value;
    }

    /**
     * Gets the value of the sourceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInformation }
     *     
     */
    public SourceInformation getSourceInformation() {
        return sourceInformation;
    }

    /**
     * Sets the value of the sourceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInformation }
     *     
     */
    public void setSourceInformation(SourceInformation value) {
        this.sourceInformation = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the impact property.
     * 
     * @return
     *     possible object is
     *     {@link Impact }
     *     
     */
    public Impact getImpact() {
        return impact;
    }

    /**
     * Sets the value of the impact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impact }
     *     
     */
    public void setImpact(Impact value) {
        this.impact = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link Cause }
     *     
     */
    public Cause getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cause }
     *     
     */
    public void setCause(Cause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the advice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Advice }
     * 
     * 
     */
    public List<Advice> getAdvice() {
        if (advice == null) {
            advice = new ArrayList<Advice>();
        }
        return this.advice;
    }

    /**
     * Gets the value of the generalPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getGeneralPublicComment() {
        if (generalPublicComment == null) {
            generalPublicComment = new ArrayList<Comment>();
        }
        return this.generalPublicComment;
    }

    /**
     * Gets the value of the nonGeneralPublicComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonGeneralPublicComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonGeneralPublicComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getNonGeneralPublicComment() {
        if (nonGeneralPublicComment == null) {
            nonGeneralPublicComment = new ArrayList<Comment>();
        }
        return this.nonGeneralPublicComment;
    }

    /**
     * Gets the value of the groupOfLocations property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getGroupOfLocations() {
        return groupOfLocations;
    }

    /**
     * Sets the value of the groupOfLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setGroupOfLocations(GroupOfLocations value) {
        this.groupOfLocations = value;
    }

    /**
     * Gets the value of the management property.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getManagement() {
        return management;
    }

    /**
     * Sets the value of the management property.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setManagement(Management value) {
        this.management = value;
    }

    /**
     * Gets the value of the situationRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordExtension() {
        return situationRecordExtension;
    }

    /**
     * Sets the value of the situationRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordExtension(ExtensionType value) {
        this.situationRecordExtension = value;
    }

    /**
     * Gets the value of the trafficElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficElementExtension() {
        return trafficElementExtension;
    }

    /**
     * Sets the value of the trafficElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficElementExtension(ExtensionType value) {
        this.trafficElementExtension = value;
    }

}
