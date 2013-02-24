
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for loggable Entry.
 * 
 * <p>Java class for SituationElementStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationElementStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSituationElementStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationInfoGroup"/>
 *         &lt;element name="VersionedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationElementStructure", propOrder = {
    "references",
    "source",
    "versionedAtTime"
})
@XmlSeeAlso({
    PtSituationElementStructure.class,
    RoadSituationElementStructure.class
})
public class SituationElementStructure
    extends AbstractSituationElementStructure
{

    @XmlElement(name = "References")
    protected ReferencesStructure references;
    @XmlElement(name = "Source", required = true)
    protected SituationSourceStructure source;
    @XmlElement(name = "VersionedAtTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar versionedAtTime;

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesStructure }
     *     
     */
    public ReferencesStructure getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesStructure }
     *     
     */
    public void setReferences(ReferencesStructure value) {
        this.references = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SituationSourceStructure }
     *     
     */
    public SituationSourceStructure getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationSourceStructure }
     *     
     */
    public void setSource(SituationSourceStructure value) {
        this.source = value;
    }

    /**
     * Gets the value of the versionedAtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVersionedAtTime() {
        return versionedAtTime;
    }

    /**
     * Sets the value of the versionedAtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVersionedAtTime(XMLGregorianCalendar value) {
        this.versionedAtTime = value;
    }

}
