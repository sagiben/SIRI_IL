
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for an Activity.
 * 
 * <p>Java class for AbstractItemStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractItemStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordedAtTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractItemStructure", propOrder = {
    "recordedAtTime"
})
@XmlSeeAlso({
    DatedTimetableVersionFrameStructure.class,
    AbstractDistributorItemStructure.class,
    AbstractIdentifiedItemStructure.class,
    EstimatedVersionFrameStructure.class,
    AbstractReferencingItemStructure.class
})
public class AbstractItemStructure {

    @XmlElement(name = "RecordedAtTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recordedAtTime;

    /**
     * Gets the value of the recordedAtTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecordedAtTime() {
        return recordedAtTime;
    }

    /**
     * Sets the value of the recordedAtTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecordedAtTime(XMLGregorianCalendar value) {
        this.recordedAtTime = value;
    }

}
