
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a  Affected stop.
 * 
 * <p>Java class for AffectedStopPointStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/>
 *         &lt;element name="PrivateRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointName" minOccurs="0"/>
 *         &lt;element name="StopPointType" type="{http://www.siri.org.uk/siri}StopPointTypeEnumeration" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="AffectedModes" type="{http://www.siri.org.uk/siri}AffectedModesStructure" minOccurs="0"/>
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;element name="ConnectionLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedStopPointStructure", propOrder = {
    "stopPointRef",
    "privateRef",
    "stopPointName",
    "stopPointType",
    "location",
    "affectedModes",
    "placeRef",
    "placeName",
    "accessibilityAssessment",
    "connectionLinks",
    "extensions"
})
@XmlSeeAlso({
    AffectedCallStructure.class
})
public class AffectedStopPointStructure {

    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "PrivateRef")
    protected String privateRef;
    @XmlElement(name = "StopPointName")
    protected NaturalLanguageStringStructure stopPointName;
    @XmlElement(name = "StopPointType")
    protected StopPointTypeEnumeration stopPointType;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "AffectedModes")
    protected AffectedModesStructure affectedModes;
    @XmlElement(name = "PlaceRef")
    protected ZoneRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected NaturalLanguageStringStructure placeName;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "ConnectionLinks")
    protected AffectedStopPointStructure.ConnectionLinks connectionLinks;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the stopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Sets the value of the stopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Gets the value of the privateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateRef() {
        return privateRef;
    }

    /**
     * Sets the value of the privateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateRef(String value) {
        this.privateRef = value;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Sets the value of the stopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setStopPointName(NaturalLanguageStringStructure value) {
        this.stopPointName = value;
    }

    /**
     * Gets the value of the stopPointType property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public StopPointTypeEnumeration getStopPointType() {
        return stopPointType;
    }

    /**
     * Sets the value of the stopPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public void setStopPointType(StopPointTypeEnumeration value) {
        this.stopPointType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Gets the value of the affectedModes property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedModesStructure }
     *     
     */
    public AffectedModesStructure getAffectedModes() {
        return affectedModes;
    }

    /**
     * Sets the value of the affectedModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedModesStructure }
     *     
     */
    public void setAffectedModes(AffectedModesStructure value) {
        this.affectedModes = value;
    }

    /**
     * Gets the value of the placeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Sets the value of the placeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setPlaceRef(ZoneRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPlaceName(NaturalLanguageStringStructure value) {
        this.placeName = value;
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
     * Gets the value of the connectionLinks property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public AffectedStopPointStructure.ConnectionLinks getConnectionLinks() {
        return connectionLinks;
    }

    /**
     * Sets the value of the connectionLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public void setConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        this.connectionLinks = value;
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
     *         &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/>
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
        "affectedConnectionLink"
    })
    public static class ConnectionLinks {

        @XmlElement(name = "AffectedConnectionLink", required = true)
        protected List<AffectedConnectionLinkStructure> affectedConnectionLink;

        /**
         * Gets the value of the affectedConnectionLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedConnectionLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedConnectionLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedConnectionLinkStructure }
         * 
         * 
         */
        public List<AffectedConnectionLinkStructure> getAffectedConnectionLink() {
            if (affectedConnectionLink == null) {
                affectedConnectionLink = new ArrayList<AffectedConnectionLinkStructure>();
            }
            return this.affectedConnectionLink;
        }

    }

}
