
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Service Request Type for Stop Monitoring Service.
 * 
 * <p>Java class for StopMonitoringRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringRequestStructure", propOrder = {
    "previewInterval",
    "startTime",
    "monitoringRef",
    "operatorRef",
    "lineRef",
    "directionRef",
    "destinationRef",
    "stopVisitTypes",
    "language",
    "maximumStopVisits",
    "minimumStopVisitsPerLine",
    "maximumTextLength",
    "stopMonitoringDetailLevel",
    "maximumNumberOfCalls",
    "extensions"
})
public class StopMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "MonitoringRef", required = true)
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "StopVisitTypes", defaultValue = "all")
    protected StopVisitTypeEnumeration stopVisitTypes;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "MaximumStopVisits")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumStopVisits;
    @XmlElement(name = "MinimumStopVisitsPerLine")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumStopVisitsPerLine;
    @XmlElement(name = "MaximumTextLength", defaultValue = "30")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumTextLength;
    @XmlElement(name = "StopMonitoringDetailLevel", defaultValue = "normal")
    protected StopMonitoringDetailEnumeration stopMonitoringDetailLevel;
    @XmlElement(name = "MaximumNumberOfCalls")
    protected com.transportation.SIRI_IL.SOAP.StopMonitoringFilterStructure.MaximumNumberOfCalls maximumNumberOfCalls;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the previewInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Sets the value of the previewInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviewInterval(Duration value) {
        this.previewInterval = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the monitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Sets the value of the monitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Sets the value of the operatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Gets the value of the lineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Sets the value of the lineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Gets the value of the directionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Sets the value of the directionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the destinationRef property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationRefStructure }
     *     
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Sets the value of the destinationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationRefStructure }
     *     
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the stopVisitTypes property.
     * 
     * @return
     *     possible object is
     *     {@link StopVisitTypeEnumeration }
     *     
     */
    public StopVisitTypeEnumeration getStopVisitTypes() {
        return stopVisitTypes;
    }

    /**
     * Sets the value of the stopVisitTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopVisitTypeEnumeration }
     *     
     */
    public void setStopVisitTypes(StopVisitTypeEnumeration value) {
        this.stopVisitTypes = value;
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
     * Gets the value of the maximumStopVisits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumStopVisits() {
        return maximumStopVisits;
    }

    /**
     * Sets the value of the maximumStopVisits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumStopVisits(BigInteger value) {
        this.maximumStopVisits = value;
    }

    /**
     * Gets the value of the minimumStopVisitsPerLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumStopVisitsPerLine() {
        return minimumStopVisitsPerLine;
    }

    /**
     * Sets the value of the minimumStopVisitsPerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumStopVisitsPerLine(BigInteger value) {
        this.minimumStopVisitsPerLine = value;
    }

    /**
     * Gets the value of the maximumTextLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumTextLength() {
        return maximumTextLength;
    }

    /**
     * Sets the value of the maximumTextLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumTextLength(BigInteger value) {
        this.maximumTextLength = value;
    }

    /**
     * Gets the value of the stopMonitoringDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StopMonitoringDetailEnumeration }
     *     
     */
    public StopMonitoringDetailEnumeration getStopMonitoringDetailLevel() {
        return stopMonitoringDetailLevel;
    }

    /**
     * Sets the value of the stopMonitoringDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopMonitoringDetailEnumeration }
     *     
     */
    public void setStopMonitoringDetailLevel(StopMonitoringDetailEnumeration value) {
        this.stopMonitoringDetailLevel = value;
    }

    /**
     * Gets the value of the maximumNumberOfCalls property.
     * 
     * @return
     *     possible object is
     *     {@link com.transportation.SIRI_IL.SOAP.StopMonitoringFilterStructure.MaximumNumberOfCalls }
     *     
     */
    public com.transportation.SIRI_IL.SOAP.StopMonitoringFilterStructure.MaximumNumberOfCalls getMaximumNumberOfCalls() {
        return maximumNumberOfCalls;
    }

    /**
     * Sets the value of the maximumNumberOfCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.transportation.SIRI_IL.SOAP.StopMonitoringFilterStructure.MaximumNumberOfCalls }
     *     
     */
    public void setMaximumNumberOfCalls(com.transportation.SIRI_IL.SOAP.StopMonitoringFilterStructure.MaximumNumberOfCalls value) {
        this.maximumNumberOfCalls = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }
    
    @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
