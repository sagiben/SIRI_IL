
package com.transportation.siri_il;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for individual PT situation.
 * 
 * <p>Java class for PtSituationElementStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtSituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}PtSituationBodyGroup"/>
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
@XmlType(name = "PtSituationElementStructure", propOrder = {
    "verification",
    "progress",
    "qualityIndex",
    "reality",
    "likelihood",
    "publication",
    "validityPeriod",
    "repetitions",
    "publicationWindow",
    "unknownReason",
    "miscellaneousReason",
    "personnelReason",
    "equipmentReason",
    "environmentReason",
    "undefinedReason",
    "publicEventReason",
    "reasonName",
    "severity",
    "priority",
    "sensitivity",
    "audience",
    "scopeType",
    "reportType",
    "planned",
    "keywords",
    "secondaryReasons",
    "language",
    "summary",
    "description",
    "detail",
    "advice",
    "internal",
    "images",
    "infoLinks",
    "affects",
    "consequences",
    "publishingActions",
    "extensions"
})
public class PtSituationElementStructure
    extends SituationElementStructure
{

    @XmlElement(name = "Verification")
    protected VerificationStatusEnumeration verification;
    @XmlElement(name = "Progress", defaultValue = "open")
    protected WorkflowStatusEnumeration progress;
    @XmlElement(name = "QualityIndex")
    protected QualityEnumeration qualityIndex;
    @XmlElement(name = "Reality")
    protected InformationStatusEnum reality;
    @XmlElement(name = "Likelihood")
    protected ProbabilityOfOccurrenceEnum likelihood;
    @XmlElement(name = "Publication")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> publication;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected List<com.transportation.siri_il.RoadSituationElementStructure.ValidityPeriod> validityPeriod;
    @XmlElement(name = "Repetitions")
    protected com.transportation.siri_il.RoadSituationElementStructure.Repetitions repetitions;
    @XmlElement(name = "PublicationWindow")
    protected HalfOpenTimestampRangeStructure publicationWindow;
    @XmlElement(name = "UnknownReason")
    protected String unknownReason;
    @XmlElement(name = "MiscellaneousReason")
    protected MiscellaneousReasonEnumeration miscellaneousReason;
    @XmlElement(name = "PersonnelReason")
    protected PersonnelReasonEnumeration personnelReason;
    @XmlElement(name = "EquipmentReason")
    protected EquipmentReasonEnumeration equipmentReason;
    @XmlElement(name = "EnvironmentReason")
    protected EnvironmentReasonEnumeration environmentReason;
    @XmlElement(name = "UndefinedReason")
    protected String undefinedReason;
    @XmlElement(name = "PublicEventReason")
    protected PublicEventTypeEnum publicEventReason;
    @XmlElement(name = "ReasonName")
    protected NaturalLanguageStringStructure reasonName;
    @XmlElement(name = "Severity", defaultValue = "normal")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;
    @XmlElement(name = "Sensitivity")
    protected SensitivityEnumeration sensitivity;
    @XmlElement(name = "Audience", defaultValue = "public")
    protected AudienceEnumeration audience;
    @XmlElement(name = "ScopeType")
    protected ScopeTypeEnumeration scopeType;
    @XmlElement(name = "ReportType", defaultValue = "unknown")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reportType;
    @XmlElement(name = "Planned", defaultValue = "false")
    protected Boolean planned;
    @XmlList
    @XmlElement(name = "Keywords")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> keywords;
    @XmlElement(name = "SecondaryReasons")
    protected com.transportation.siri_il.RoadSituationElementStructure.SecondaryReasons secondaryReasons;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String language;
    @XmlElement(name = "Summary")
    protected DefaultedTextStructure summary;
    @XmlElement(name = "Description")
    protected DefaultedTextStructure description;
    @XmlElement(name = "Detail")
    protected DefaultedTextStructure detail;
    @XmlElement(name = "Advice")
    protected DefaultedTextStructure advice;
    @XmlElement(name = "Internal")
    protected DefaultedTextStructure internal;
    @XmlElement(name = "Images")
    protected com.transportation.siri_il.RoadSituationElementStructure.Images images;
    @XmlElement(name = "InfoLinks")
    protected com.transportation.siri_il.RoadSituationElementStructure.InfoLinks infoLinks;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Consequences")
    protected PtConsequencesStructure consequences;
    @XmlElement(name = "PublishingActions")
    protected ActionsStructure publishingActions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the verification property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public VerificationStatusEnumeration getVerification() {
        return verification;
    }

    /**
     * Sets the value of the verification property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationStatusEnumeration }
     *     
     */
    public void setVerification(VerificationStatusEnumeration value) {
        this.verification = value;
    }

    /**
     * Gets the value of the progress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public WorkflowStatusEnumeration getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatusEnumeration }
     *     
     */
    public void setProgress(WorkflowStatusEnumeration value) {
        this.progress = value;
    }

    /**
     * Gets the value of the qualityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link QualityEnumeration }
     *     
     */
    public QualityEnumeration getQualityIndex() {
        return qualityIndex;
    }

    /**
     * Sets the value of the qualityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityEnumeration }
     *     
     */
    public void setQualityIndex(QualityEnumeration value) {
        this.qualityIndex = value;
    }

    /**
     * Gets the value of the reality property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getReality() {
        return reality;
    }

    /**
     * Sets the value of the reality property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setReality(InformationStatusEnum value) {
        this.reality = value;
    }

    /**
     * Gets the value of the likelihood property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getLikelihood() {
        return likelihood;
    }

    /**
     * Sets the value of the likelihood property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setLikelihood(ProbabilityOfOccurrenceEnum value) {
        this.likelihood = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPublication() {
        if (publication == null) {
            publication = new ArrayList<String>();
        }
        return this.publication;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.transportation.siri_il.RoadSituationElementStructure.ValidityPeriod }
     * 
     * 
     */
    public List<com.transportation.siri_il.RoadSituationElementStructure.ValidityPeriod> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<com.transportation.siri_il.RoadSituationElementStructure.ValidityPeriod>();
        }
        return this.validityPeriod;
    }

    /**
     * Gets the value of the repetitions property.
     * 
     * @return
     *     possible object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.Repetitions }
     *     
     */
    public com.transportation.siri_il.RoadSituationElementStructure.Repetitions getRepetitions() {
        return repetitions;
    }

    /**
     * Sets the value of the repetitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.Repetitions }
     *     
     */
    public void setRepetitions(com.transportation.siri_il.RoadSituationElementStructure.Repetitions value) {
        this.repetitions = value;
    }

    /**
     * Gets the value of the publicationWindow property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public HalfOpenTimestampRangeStructure getPublicationWindow() {
        return publicationWindow;
    }

    /**
     * Sets the value of the publicationWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public void setPublicationWindow(HalfOpenTimestampRangeStructure value) {
        this.publicationWindow = value;
    }

    /**
     * Gets the value of the unknownReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnknownReason() {
        return unknownReason;
    }

    /**
     * Sets the value of the unknownReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnknownReason(String value) {
        this.unknownReason = value;
    }

    /**
     * Gets the value of the miscellaneousReason property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public MiscellaneousReasonEnumeration getMiscellaneousReason() {
        return miscellaneousReason;
    }

    /**
     * Sets the value of the miscellaneousReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousReasonEnumeration }
     *     
     */
    public void setMiscellaneousReason(MiscellaneousReasonEnumeration value) {
        this.miscellaneousReason = value;
    }

    /**
     * Personnel reason.
     * 
     * @return
     *     possible object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public PersonnelReasonEnumeration getPersonnelReason() {
        return personnelReason;
    }

    /**
     * Sets the value of the personnelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonnelReasonEnumeration }
     *     
     */
    public void setPersonnelReason(PersonnelReasonEnumeration value) {
        this.personnelReason = value;
    }

    /**
     * Gets the value of the equipmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public EquipmentReasonEnumeration getEquipmentReason() {
        return equipmentReason;
    }

    /**
     * Sets the value of the equipmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentReasonEnumeration }
     *     
     */
    public void setEquipmentReason(EquipmentReasonEnumeration value) {
        this.equipmentReason = value;
    }

    /**
     * Environment reason.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public EnvironmentReasonEnumeration getEnvironmentReason() {
        return environmentReason;
    }

    /**
     * Sets the value of the environmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentReasonEnumeration }
     *     
     */
    public void setEnvironmentReason(EnvironmentReasonEnumeration value) {
        this.environmentReason = value;
    }

    /**
     * Gets the value of the undefinedReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndefinedReason() {
        return undefinedReason;
    }

    /**
     * Sets the value of the undefinedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndefinedReason(String value) {
        this.undefinedReason = value;
    }

    /**
     * Gets the value of the publicEventReason property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventReason() {
        return publicEventReason;
    }

    /**
     * Sets the value of the publicEventReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventReason(PublicEventTypeEnum value) {
        this.publicEventReason = value;
    }

    /**
     * Gets the value of the reasonName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getReasonName() {
        return reasonName;
    }

    /**
     * Sets the value of the reasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setReasonName(NaturalLanguageStringStructure value) {
        this.reasonName = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public SensitivityEnumeration getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityEnumeration }
     *     
     */
    public void setSensitivity(SensitivityEnumeration value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceEnumeration }
     *     
     */
    public AudienceEnumeration getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceEnumeration }
     *     
     */
    public void setAudience(AudienceEnumeration value) {
        this.audience = value;
    }

    /**
     * Gets the value of the scopeType property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public ScopeTypeEnumeration getScopeType() {
        return scopeType;
    }

    /**
     * Sets the value of the scopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeTypeEnumeration }
     *     
     */
    public void setScopeType(ScopeTypeEnumeration value) {
        this.scopeType = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the planned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanned() {
        return planned;
    }

    /**
     * Sets the value of the planned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanned(Boolean value) {
        this.planned = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
    }

    /**
     * Gets the value of the secondaryReasons property.
     * 
     * @return
     *     possible object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public com.transportation.siri_il.RoadSituationElementStructure.SecondaryReasons getSecondaryReasons() {
        return secondaryReasons;
    }

    /**
     * Sets the value of the secondaryReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.SecondaryReasons }
     *     
     */
    public void setSecondaryReasons(com.transportation.siri_il.RoadSituationElementStructure.SecondaryReasons value) {
        this.secondaryReasons = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setSummary(DefaultedTextStructure value) {
        this.summary = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setDescription(DefaultedTextStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setDetail(DefaultedTextStructure value) {
        this.detail = value;
    }

    /**
     * Gets the value of the advice property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getAdvice() {
        return advice;
    }

    /**
     * Sets the value of the advice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setAdvice(DefaultedTextStructure value) {
        this.advice = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public DefaultedTextStructure getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultedTextStructure }
     *     
     */
    public void setInternal(DefaultedTextStructure value) {
        this.internal = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.Images }
     *     
     */
    public com.transportation.siri_il.RoadSituationElementStructure.Images getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.Images }
     *     
     */
    public void setImages(com.transportation.siri_il.RoadSituationElementStructure.Images value) {
        this.images = value;
    }

    /**
     * Gets the value of the infoLinks property.
     * 
     * @return
     *     possible object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public com.transportation.siri_il.RoadSituationElementStructure.InfoLinks getInfoLinks() {
        return infoLinks;
    }

    /**
     * Sets the value of the infoLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.transportation.siri_il.RoadSituationElementStructure.InfoLinks }
     *     
     */
    public void setInfoLinks(com.transportation.siri_il.RoadSituationElementStructure.InfoLinks value) {
        this.infoLinks = value;
    }

    /**
     * Gets the value of the affects property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Sets the value of the affects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Gets the value of the consequences property.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public PtConsequencesStructure getConsequences() {
        return consequences;
    }

    /**
     * Sets the value of the consequences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequencesStructure }
     *     
     */
    public void setConsequences(PtConsequencesStructure value) {
        this.consequences = value;
    }

    /**
     * Gets the value of the publishingActions property.
     * 
     * @return
     *     possible object is
     *     {@link ActionsStructure }
     *     
     */
    public ActionsStructure getPublishingActions() {
        return publishingActions;
    }

    /**
     * Sets the value of the publishingActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionsStructure }
     *     
     */
    public void setPublishingActions(ActionsStructure value) {
        this.publishingActions = value;
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
