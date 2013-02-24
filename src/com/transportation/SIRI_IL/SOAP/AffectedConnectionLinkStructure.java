
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a reference Information about a connection link from a given stop.
 * 
 * <p>Java class for AffectedConnectionLinkStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedConnectionLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="AllLines" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *           &lt;sequence>
 *             &lt;group ref="{http://www.siri.org.uk/siri}LineGroup" minOccurs="0"/>
 *             &lt;element name="ConnectingStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/>
 *             &lt;element name="ConnectingStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *             &lt;element name="ConnectingZoneRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="ConnectionDirection" type="{http://www.siri.org.uk/siri}ConnectionDirectionEnumeration" minOccurs="0"/>
 *         &lt;element name="AffectedPathLink" type="{http://www.siri.org.uk/siri}AffectedPathLinkStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffectedConnectionLinkStructure", propOrder = {
    "connectionLinkRef",
    "connectionName",
    "allLines",
    "lineRef",
    "connectingStopPointRef",
    "connectingStopPointName",
    "connectingZoneRef",
    "connectionDirection",
    "affectedPathLink",
    "extensions"
})
public class AffectedConnectionLinkStructure {

    @XmlElement(name = "ConnectionLinkRef")
    protected List<ConnectionLinkRefStructure> connectionLinkRef;
    @XmlElement(name = "ConnectionName")
    protected NaturalLanguageStringStructure connectionName;
    @XmlElement(name = "AllLines")
    protected Object allLines;
    @XmlElement(name = "LineRef")
    protected List<LineRefStructure> lineRef;
    @XmlElement(name = "ConnectingStopPointRef")
    protected StopPointRefStructure connectingStopPointRef;
    @XmlElement(name = "ConnectingStopPointName")
    protected NaturalLanguageStringStructure connectingStopPointName;
    @XmlElement(name = "ConnectingZoneRef")
    protected ZoneRefStructure connectingZoneRef;
    @XmlElement(name = "ConnectionDirection", defaultValue = "both")
    protected ConnectionDirectionEnumeration connectionDirection;
    @XmlElement(name = "AffectedPathLink")
    protected List<AffectedPathLinkStructure> affectedPathLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the connectionLinkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionLinkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionLinkRefStructure }
     * 
     * 
     */
    public List<ConnectionLinkRefStructure> getConnectionLinkRef() {
        if (connectionLinkRef == null) {
            connectionLinkRef = new ArrayList<ConnectionLinkRefStructure>();
        }
        return this.connectionLinkRef;
    }

    /**
     * Gets the value of the connectionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getConnectionName() {
        return connectionName;
    }

    /**
     * Sets the value of the connectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setConnectionName(NaturalLanguageStringStructure value) {
        this.connectionName = value;
    }

    /**
     * Gets the value of the allLines property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAllLines() {
        return allLines;
    }

    /**
     * Sets the value of the allLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAllLines(Object value) {
        this.allLines = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineRefStructure }
     * 
     * 
     */
    public List<LineRefStructure> getLineRef() {
        if (lineRef == null) {
            lineRef = new ArrayList<LineRefStructure>();
        }
        return this.lineRef;
    }

    /**
     * Gets the value of the connectingStopPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getConnectingStopPointRef() {
        return connectingStopPointRef;
    }

    /**
     * Sets the value of the connectingStopPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setConnectingStopPointRef(StopPointRefStructure value) {
        this.connectingStopPointRef = value;
    }

    /**
     * Gets the value of the connectingStopPointName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getConnectingStopPointName() {
        return connectingStopPointName;
    }

    /**
     * Sets the value of the connectingStopPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setConnectingStopPointName(NaturalLanguageStringStructure value) {
        this.connectingStopPointName = value;
    }

    /**
     * Gets the value of the connectingZoneRef property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getConnectingZoneRef() {
        return connectingZoneRef;
    }

    /**
     * Sets the value of the connectingZoneRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setConnectingZoneRef(ZoneRefStructure value) {
        this.connectingZoneRef = value;
    }

    /**
     * Gets the value of the connectionDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public ConnectionDirectionEnumeration getConnectionDirection() {
        return connectionDirection;
    }

    /**
     * Sets the value of the connectionDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDirectionEnumeration }
     *     
     */
    public void setConnectionDirection(ConnectionDirectionEnumeration value) {
        this.connectionDirection = value;
    }

    /**
     * Gets the value of the affectedPathLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPathLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPathLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedPathLinkStructure }
     * 
     * 
     */
    public List<AffectedPathLinkStructure> getAffectedPathLink() {
        if (affectedPathLink == null) {
            affectedPathLink = new ArrayList<AffectedPathLinkStructure>();
        }
        return this.affectedPathLink;
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
