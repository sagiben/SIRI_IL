
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for a reference.
 * 
 * <p>Java class for RelatedSituationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedSituationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationSharedIdentityGroup"/>
 *         &lt;element name="ExternalReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedAs" type="{http://www.siri.org.uk/siri}RelatedToEnumeration" minOccurs="0"/>
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
@XmlType(name = "RelatedSituationStructure", propOrder = {
    "creationTime",
    "countryRef",
    "participantRef",
    "situationNumber",
    "updateCountryRef",
    "updateParticipantRef",
    "version",
    "externalReference",
    "relatedAs",
    "extensions"
})
public class RelatedSituationStructure {

    @XmlElement(name = "CreationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlElement(name = "CountryRef")
    protected CountryRefStructure countryRef;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "SituationNumber", required = true)
    protected EntryQualifierStructure situationNumber;
    @XmlElement(name = "UpdateCountryRef")
    protected CountryRefStructure updateCountryRef;
    @XmlElement(name = "UpdateParticipantRef")
    protected ParticipantRefStructure updateParticipantRef;
    @XmlElement(name = "Version")
    protected SituationVersion version;
    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "RelatedAs")
    protected RelatedToEnumeration relatedAs;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the countryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getCountryRef() {
        return countryRef;
    }

    /**
     * Sets the value of the countryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setCountryRef(CountryRefStructure value) {
        this.countryRef = value;
    }

    /**
     * Gets the value of the participantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Sets the value of the participantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    /**
     * Unique identifier of  Situation within a Participant. Excludes any version number.
     * 
     * @return
     *     possible object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public EntryQualifierStructure getSituationNumber() {
        return situationNumber;
    }

    /**
     * Sets the value of the situationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryQualifierStructure }
     *     
     */
    public void setSituationNumber(EntryQualifierStructure value) {
        this.situationNumber = value;
    }

    /**
     * Gets the value of the updateCountryRef property.
     * 
     * @return
     *     possible object is
     *     {@link CountryRefStructure }
     *     
     */
    public CountryRefStructure getUpdateCountryRef() {
        return updateCountryRef;
    }

    /**
     * Sets the value of the updateCountryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRefStructure }
     *     
     */
    public void setUpdateCountryRef(CountryRefStructure value) {
        this.updateCountryRef = value;
    }

    /**
     * Gets the value of the updateParticipantRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getUpdateParticipantRef() {
        return updateParticipantRef;
    }

    /**
     * Sets the value of the updateParticipantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setUpdateParticipantRef(ParticipantRefStructure value) {
        this.updateParticipantRef = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersion }
     *     
     */
    public SituationVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersion }
     *     
     */
    public void setVersion(SituationVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the relatedAs property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public RelatedToEnumeration getRelatedAs() {
        return relatedAs;
    }

    /**
     * Sets the value of the relatedAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToEnumeration }
     *     
     */
    public void setRelatedAs(RelatedToEnumeration value) {
        this.relatedAs = value;
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
