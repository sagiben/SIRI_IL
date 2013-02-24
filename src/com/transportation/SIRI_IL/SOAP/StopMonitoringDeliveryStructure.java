
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data type for Delivery for Stop Monitoring Service
 * 
 * <p>Java class for StopMonitoringDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopMonitoringPayloadGroup"/>
 *         &lt;element name="Note" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
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
@XmlType(name = "StopMonitoringDeliveryStructure", propOrder = {
    "monitoringRef",
    "monitoredStopVisit",
    "monitoredStopVisitCancellation",
    "stopLineNotice",
    "stopLineNoticeCancellation",
    "note",
    "extensions"
})
public class StopMonitoringDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "MonitoringRef")
    protected List<MonitoringRefStructure> monitoringRef;
    @XmlElement(name = "MonitoredStopVisit")
    protected List<MonitoredStopVisitStructure> monitoredStopVisit;
    @XmlElement(name = "MonitoredStopVisitCancellation")
    protected List<MonitoredStopVisitCancellationStructure> monitoredStopVisitCancellation;
    @XmlElement(name = "StopLineNotice")
    protected List<StopLineNoticeStructure> stopLineNotice;
    @XmlElement(name = "StopLineNoticeCancellation")
    protected List<StopLineNoticeCancellationStructure> stopLineNoticeCancellation;
    @XmlElement(name = "Note")
    protected NaturalLanguageStringStructure note;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the monitoringRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoringRefStructure }
     * 
     * 
     */
    public List<MonitoringRefStructure> getMonitoringRef() {
        if (monitoringRef == null) {
            monitoringRef = new ArrayList<MonitoringRefStructure>();
        }
        return this.monitoringRef;
    }

    /**
     * Gets the value of the monitoredStopVisit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredStopVisit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredStopVisit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredStopVisitStructure }
     * 
     * 
     */
    public List<MonitoredStopVisitStructure> getMonitoredStopVisit() {
        if (monitoredStopVisit == null) {
            monitoredStopVisit = new ArrayList<MonitoredStopVisitStructure>();
        }
        return this.monitoredStopVisit;
    }

    /**
     * Gets the value of the monitoredStopVisitCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoredStopVisitCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredStopVisitCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonitoredStopVisitCancellationStructure }
     * 
     * 
     */
    public List<MonitoredStopVisitCancellationStructure> getMonitoredStopVisitCancellation() {
        if (monitoredStopVisitCancellation == null) {
            monitoredStopVisitCancellation = new ArrayList<MonitoredStopVisitCancellationStructure>();
        }
        return this.monitoredStopVisitCancellation;
    }

    /**
     * Gets the value of the stopLineNotice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLineNotice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLineNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLineNoticeStructure }
     * 
     * 
     */
    public List<StopLineNoticeStructure> getStopLineNotice() {
        if (stopLineNotice == null) {
            stopLineNotice = new ArrayList<StopLineNoticeStructure>();
        }
        return this.stopLineNotice;
    }

    /**
     * Gets the value of the stopLineNoticeCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLineNoticeCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLineNoticeCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLineNoticeCancellationStructure }
     * 
     * 
     */
    public List<StopLineNoticeCancellationStructure> getStopLineNoticeCancellation() {
        if (stopLineNoticeCancellation == null) {
            stopLineNoticeCancellation = new ArrayList<StopLineNoticeCancellationStructure>();
        }
        return this.stopLineNoticeCancellation;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setNote(NaturalLanguageStringStructure value) {
        this.note = value;
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
