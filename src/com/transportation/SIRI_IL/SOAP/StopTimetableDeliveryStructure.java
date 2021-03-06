
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
 * Data type Delivery for Stop Timetable Service.
 * 
 * <p>Java class for StopTimetableDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopTimetablePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimetableDeliveryStructure", propOrder = {
    "timetabledStopVisit",
    "timetabledStopVisitCancellation",
    "extensions"
})
public class StopTimetableDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "TimetabledStopVisit")
    protected List<TimetabledStopVisitStructure> timetabledStopVisit;
    @XmlElement(name = "TimetabledStopVisitCancellation")
    protected List<TimetabledStopVisitCancellationStructure> timetabledStopVisitCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the timetabledStopVisit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledStopVisit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledStopVisit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledStopVisitStructure }
     * 
     * 
     */
    public List<TimetabledStopVisitStructure> getTimetabledStopVisit() {
        if (timetabledStopVisit == null) {
            timetabledStopVisit = new ArrayList<TimetabledStopVisitStructure>();
        }
        return this.timetabledStopVisit;
    }

    /**
     * Gets the value of the timetabledStopVisitCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timetabledStopVisitCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimetabledStopVisitCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimetabledStopVisitCancellationStructure }
     * 
     * 
     */
    public List<TimetabledStopVisitCancellationStructure> getTimetabledStopVisitCancellation() {
        if (timetabledStopVisitCancellation == null) {
            timetabledStopVisitCancellation = new ArrayList<TimetabledStopVisitCancellationStructure>();
        }
        return this.timetabledStopVisitCancellation;
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
        if (version == null) {
            return "1.3";
        } else {
            return version;
        }
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
