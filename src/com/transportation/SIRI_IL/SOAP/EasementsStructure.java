
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for easement info.
 * 
 * <p>Java class for EasementsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EasementsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketRestrictions" type="{http://www.siri.org.uk/siri}TicketRestrictionEnumeration" minOccurs="0"/>
 *         &lt;element name="Easement" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="EasementRef" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EasementsStructure", propOrder = {
    "ticketRestrictions",
    "easement",
    "easementRef"
})
public class EasementsStructure {

    @XmlElement(name = "TicketRestrictions")
    protected TicketRestrictionEnumeration ticketRestrictions;
    @XmlElement(name = "Easement")
    protected NaturalLanguageStringStructure easement;
    @XmlElement(name = "EasementRef")
    protected NaturalLanguagePlaceNameStructure easementRef;

    /**
     * Gets the value of the ticketRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public TicketRestrictionEnumeration getTicketRestrictions() {
        return ticketRestrictions;
    }

    /**
     * Sets the value of the ticketRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketRestrictionEnumeration }
     *     
     */
    public void setTicketRestrictions(TicketRestrictionEnumeration value) {
        this.ticketRestrictions = value;
    }

    /**
     * Gets the value of the easement property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEasement() {
        return easement;
    }

    /**
     * Sets the value of the easement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEasement(NaturalLanguageStringStructure value) {
        this.easement = value;
    }

    /**
     * Gets the value of the easementRef property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public NaturalLanguagePlaceNameStructure getEasementRef() {
        return easementRef;
    }

    /**
     * Sets the value of the easementRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguagePlaceNameStructure }
     *     
     */
    public void setEasementRef(NaturalLanguagePlaceNameStructure value) {
        this.easementRef = value;
    }

}
