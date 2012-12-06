
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Planned Connection between two vehicle journeys.
 * 
 * <p>Java class for TargetedInterchangeStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetedInterchangeStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="InterchangeCode" type="{http://www.siri.org.uk/siri}InterchangeCodeType" minOccurs="0"/>
 *           &lt;element name="DistributorVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure"/>
 *           &lt;choice>
 *             &lt;element name="DistributorConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure"/>
 *             &lt;element name="DistributorConnectionLink" type="{http://www.siri.org.uk/siri}ContextualisedConnectionLinkStructure"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="DistributorVisitNumber" type="{http://www.siri.org.uk/siri}VisitNumberType" minOccurs="0"/>
 *         &lt;element name="DistributorOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/>
 *         &lt;element name="MaximumWaitTime" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetedInterchangeStructure", propOrder = {
    "interchangeCode",
    "distributorVehicleJourneyRef",
    "distributorConnectionLinkRef",
    "distributorConnectionLink",
    "distributorVisitNumber",
    "distributorOrder",
    "staySeated",
    "guaranteed",
    "advertised",
    "maximumWaitTime"
})
public class TargetedInterchangeStructure {

    @XmlElement(name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interchangeCode;
    @XmlElement(name = "DistributorVehicleJourneyRef", required = true)
    protected DatedVehicleJourneyRefStructure distributorVehicleJourneyRef;
    @XmlElement(name = "DistributorConnectionLinkRef")
    protected ConnectionLinkRefStructure distributorConnectionLinkRef;
    @XmlElement(name = "DistributorConnectionLink")
    protected ContextualisedConnectionLinkStructure distributorConnectionLink;
    @XmlElement(name = "DistributorVisitNumber")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "DistributorOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorOrder;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "false")
    protected Boolean advertised;
    @XmlElement(name = "MaximumWaitTime")
    protected Duration maximumWaitTime;

    /**
     * Gets the value of the interchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeCode() {
        return interchangeCode;
    }

    /**
     * Sets the value of the interchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeCode(String value) {
        this.interchangeCode = value;
    }

    /**
     * Gets the value of the distributorVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public DatedVehicleJourneyRefStructure getDistributorVehicleJourneyRef() {
        return distributorVehicleJourneyRef;
    }

    /**
     * Sets the value of the distributorVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyRefStructure }
     *     
     */
    public void setDistributorVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.distributorVehicleJourneyRef = value;
    }

    /**
     * Gets the value of the distributorConnectionLinkRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getDistributorConnectionLinkRef() {
        return distributorConnectionLinkRef;
    }

    /**
     * Sets the value of the distributorConnectionLinkRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setDistributorConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.distributorConnectionLinkRef = value;
    }

    /**
     * Gets the value of the distributorConnectionLink property.
     * 
     * @return
     *     possible object is
     *     {@link ContextualisedConnectionLinkStructure }
     *     
     */
    public ContextualisedConnectionLinkStructure getDistributorConnectionLink() {
        return distributorConnectionLink;
    }

    /**
     * Sets the value of the distributorConnectionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextualisedConnectionLinkStructure }
     *     
     */
    public void setDistributorConnectionLink(ContextualisedConnectionLinkStructure value) {
        this.distributorConnectionLink = value;
    }

    /**
     * Gets the value of the distributorVisitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorVisitNumber() {
        return distributorVisitNumber;
    }

    /**
     * Sets the value of the distributorVisitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorVisitNumber(BigInteger value) {
        this.distributorVisitNumber = value;
    }

    /**
     * Gets the value of the distributorOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorOrder() {
        return distributorOrder;
    }

    /**
     * Sets the value of the distributorOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorOrder(BigInteger value) {
        this.distributorOrder = value;
    }

    /**
     * Gets the value of the staySeated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Sets the value of the staySeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Gets the value of the guaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Sets the value of the guaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Gets the value of the advertised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Sets the value of the advertised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Gets the value of the maximumWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Sets the value of the maximumWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

}
