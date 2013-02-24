
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Service Request Type for Production Timetables.
 * 
 * <p>Java class for ProductionTimetableRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProductionTimetableTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProductionTimetableRequestPolicyGroup"/>
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
@XmlType(name = "ProductionTimetableRequestStructure", propOrder = {
    "validityPeriod",
    "timetableVersionRef",
    "operatorRef",
    "lines",
    "language",
    "incrementalUpdates",
    "extensions"
})
public class ProductionTimetableRequestStructure
    extends AbstractFunctionalServiceRequestStructure
{

    @XmlElement(name = "ValidityPeriod")
    protected ClosedTimeRangeStructure validityPeriod;
    @XmlElement(name = "TimetableVersionRef")
    protected VersionRefStructure timetableVersionRef;
    @XmlElement(name = "OperatorRef")
    protected List<OperatorRefStructure> operatorRef;
    @XmlElement(name = "Lines")
    protected ProductionTimetableRequestStructure.Lines lines;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedTimeRangeStructure }
     *     
     */
    public ClosedTimeRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedTimeRangeStructure }
     *     
     */
    public void setValidityPeriod(ClosedTimeRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the timetableVersionRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionRefStructure }
     *     
     */
    public VersionRefStructure getTimetableVersionRef() {
        return timetableVersionRef;
    }

    /**
     * Sets the value of the timetableVersionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionRefStructure }
     *     
     */
    public void setTimetableVersionRef(VersionRefStructure value) {
        this.timetableVersionRef = value;
    }

    /**
     * Gets the value of the operatorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getOperatorRef() {
        if (operatorRef == null) {
            operatorRef = new ArrayList<OperatorRefStructure>();
        }
        return this.operatorRef;
    }

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableRequestStructure.Lines }
     *     
     */
    public ProductionTimetableRequestStructure.Lines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableRequestStructure.Lines }
     *     
     */
    public void setLines(ProductionTimetableRequestStructure.Lines value) {
        this.lines = value;
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
     * Gets the value of the incrementalUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalUpdates() {
        return incrementalUpdates;
    }

    /**
     * Sets the value of the incrementalUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalUpdates(Boolean value) {
        this.incrementalUpdates = value;
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
     *         &lt;element name="LineDirection" type="{http://www.siri.org.uk/siri}LineDirectionStructure" maxOccurs="unbounded"/>
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
        "lineDirection"
    })
    public static class Lines {

        @XmlElement(name = "LineDirection", required = true)
        protected List<LineDirectionStructure> lineDirection;

        /**
         * Gets the value of the lineDirection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineDirection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineDirection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LineDirectionStructure }
         * 
         * 
         */
        public List<LineDirectionStructure> getLineDirection() {
            if (lineDirection == null) {
                lineDirection = new ArrayList<LineDirectionStructure>();
            }
            return this.lineDirection;
        }

    }

}
