
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An identifiable instance of a single record within a traffic view.
 * 
 * <p>Java class for TrafficViewRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficViewRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordSequenceNumber" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger"/>
 *         &lt;element name="trafficElement" type="{http://datex2.eu/schema/1_0/1_0}TrafficElement" minOccurs="0"/>
 *         &lt;element name="operatorAction" type="{http://datex2.eu/schema/1_0/1_0}OperatorAction" minOccurs="0"/>
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/1_0/1_0}ElaboratedData" minOccurs="0"/>
 *         &lt;element name="cctvimages" type="{http://datex2.eu/schema/1_0/1_0}CCTVImages" minOccurs="0"/>
 *         &lt;element name="trafficViewRecordExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficViewRecord", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "recordSequenceNumber",
    "trafficElement",
    "operatorAction",
    "elaboratedData",
    "cctvimages",
    "trafficViewRecordExtension"
})
public class TrafficViewRecord {

    @XmlElement(required = true)
    protected BigInteger recordSequenceNumber;
    protected TrafficElement trafficElement;
    protected OperatorAction operatorAction;
    protected ElaboratedData elaboratedData;
    protected CCTVImages cctvimages;
    protected ExtensionType trafficViewRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the recordSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRecordSequenceNumber() {
        return recordSequenceNumber;
    }

    /**
     * Sets the value of the recordSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRecordSequenceNumber(BigInteger value) {
        this.recordSequenceNumber = value;
    }

    /**
     * Gets the value of the trafficElement property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficElement }
     *     
     */
    public TrafficElement getTrafficElement() {
        return trafficElement;
    }

    /**
     * Sets the value of the trafficElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficElement }
     *     
     */
    public void setTrafficElement(TrafficElement value) {
        this.trafficElement = value;
    }

    /**
     * Gets the value of the operatorAction property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorAction }
     *     
     */
    public OperatorAction getOperatorAction() {
        return operatorAction;
    }

    /**
     * Sets the value of the operatorAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorAction }
     *     
     */
    public void setOperatorAction(OperatorAction value) {
        this.operatorAction = value;
    }

    /**
     * Gets the value of the elaboratedData property.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedData }
     *     
     */
    public ElaboratedData getElaboratedData() {
        return elaboratedData;
    }

    /**
     * Sets the value of the elaboratedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedData }
     *     
     */
    public void setElaboratedData(ElaboratedData value) {
        this.elaboratedData = value;
    }

    /**
     * Gets the value of the cctvimages property.
     * 
     * @return
     *     possible object is
     *     {@link CCTVImages }
     *     
     */
    public CCTVImages getCctvimages() {
        return cctvimages;
    }

    /**
     * Sets the value of the cctvimages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTVImages }
     *     
     */
    public void setCctvimages(CCTVImages value) {
        this.cctvimages = value;
    }

    /**
     * Gets the value of the trafficViewRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewRecordExtension() {
        return trafficViewRecordExtension;
    }

    /**
     * Sets the value of the trafficViewRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewRecordExtension(ExtensionType value) {
        this.trafficViewRecordExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
