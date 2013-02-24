
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for an Info Message. @formatRef.
 * 
 * <p>Java class for InfoMessageStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoMessageStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InfoMessageGroup"/>
 *         &lt;element name="ValidUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="formatRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoMessageStructure", propOrder = {
    "infoMessageIdentifier",
    "infoMessageVersion",
    "infoChannelRef",
    "validUntilTime",
    "situationRef",
    "content"
})
public class InfoMessageStructure
    extends AbstractIdentifiedItemStructure
{

    @XmlElement(name = "InfoMessageIdentifier", required = true)
    protected InfoMessageRefStructure infoMessageIdentifier;
    @XmlElement(name = "InfoMessageVersion")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger infoMessageVersion;
    @XmlElement(name = "InfoChannelRef")
    protected InfoChannelRefStructure infoChannelRef;
    @XmlElement(name = "ValidUntilTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntilTime;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Content", required = true)
    protected Object content;
    @XmlAttribute(name = "formatRef")
    @XmlSchemaType(name = "anySimpleType")
    protected String formatRef;

    /**
     * Gets the value of the infoMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public InfoMessageRefStructure getInfoMessageIdentifier() {
        return infoMessageIdentifier;
    }

    /**
     * Sets the value of the infoMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public void setInfoMessageIdentifier(InfoMessageRefStructure value) {
        this.infoMessageIdentifier = value;
    }

    /**
     * Gets the value of the infoMessageVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInfoMessageVersion() {
        return infoMessageVersion;
    }

    /**
     * Sets the value of the infoMessageVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInfoMessageVersion(BigInteger value) {
        this.infoMessageVersion = value;
    }

    /**
     * Gets the value of the infoChannelRef property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public InfoChannelRefStructure getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Sets the value of the infoChannelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public void setInfoChannelRef(InfoChannelRefStructure value) {
        this.infoChannelRef = value;
    }

    /**
     * Gets the value of the validUntilTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntilTime() {
        return validUntilTime;
    }

    /**
     * Sets the value of the validUntilTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntilTime(XMLGregorianCalendar value) {
        this.validUntilTime = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefStructure }
     *     
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Sets the value of the situationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefStructure }
     *     
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContent(Object value) {
        this.content = value;
    }

    /**
     * Gets the value of the formatRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatRef() {
        return formatRef;
    }

    /**
     * Sets the value of the formatRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatRef(String value) {
        this.formatRef = value;
    }

}
