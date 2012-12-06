
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a interchange at link from a given stop.
 * 
 * <p>Java class for AffectedInterchangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterchangeRef" type="{http://www.siri.org.uk/siri}InterchangeRefStructure" minOccurs="0"/>
 *         &lt;element name="InterchangeStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *         &lt;element name="InterchangeStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ConnectingVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeStatusType" minOccurs="0"/>
 *         &lt;element name="ConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffectedInterchangeStructure", propOrder = {
    "interchangeRef",
    "interchangeStopPointRef",
    "interchangeStopPointName",
    "connectingVehicleJourneyRef",
    "interchangeStatusType",
    "connectionLink",
    "extensions"
})
public class AffectedInterchangeStructure {

    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "InterchangeStopPointRef")
    protected StopPointRefStructure interchangeStopPointRef;
    @XmlElement(name = "InterchangeStopPointName")
    protected NaturalLanguageStringStructure interchangeStopPointName;
    @XmlElement(name = "ConnectingVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure connectingVehicleJourneyRef;
    @XmlElement(name = "InterchangeStatusType", defaultValue = "unknown")
    protected InterchangeStatusEnumeration interchangeStatusType;
    @XmlElement(name = "ConnectionLink")
    protected List<AffectedConnectionLinkStructure> connectionLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the interchangeRef property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Sets the value of the interchangeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getInterchangeStopPointRef() {
        return interchangeStopPointRef;
    }

    /**
     * Sets the value of the interchangeStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setInterchangeStopPointRef(StopPointRefStructure value) {
        this.interchangeStopPointRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getInterchangeStopPointName() {
        return interchangeStopPointName;
    }

    /**
     * Sets the value of the interchangeStopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setInterchangeStopPointName(NaturalLanguageStringStructure value) {
        this.interchangeStopPointName = value;
    }

    /**
     * Gets the value of the connectingVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getConnectingVehicleJourneyRef() {
        return connectingVehicleJourneyRef;
    }

    /**
     * Sets the value of the connectingVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.connectingVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the interchangeStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public InterchangeStatusEnumeration getInterchangeStatusType() {
        return interchangeStatusType;
    }

    /**
     * Sets the value of the interchangeStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeStatusEnumeration }
     *     
     */
    public void setInterchangeStatusType(InterchangeStatusEnumeration value) {
        this.interchangeStatusType = value;
    }

    /**
     * Gets the value of the connectionLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedConnectionLinkStructure }
     * 
     * 
     */
    public List<AffectedConnectionLinkStructure> getConnectionLink() {
        if (connectionLink == null) {
            connectionLink = new ArrayList<AffectedConnectionLinkStructure>();
        }
        return this.connectionLink;
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
