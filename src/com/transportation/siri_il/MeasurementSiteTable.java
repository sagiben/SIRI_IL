
package com.transportation.siri_il;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * A Measurement Site Table comprising a number of sets of data, each describing the location from where a stream of measured data may be derived.  Each location is known as a "measurement site" which can be a point, a linear road section or an area.
 * 
 * <p>Java class for MeasurementSiteTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteTableReference" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="measurementSiteTableVersion" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="measurementSiteRecord" type="{http://datex2.eu/schema/1_0/1_0}MeasurementSiteRecord" maxOccurs="unbounded"/>
 *         &lt;element name="measurementSiteTableExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "MeasurementSiteTable", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "measurementSiteTableReference",
    "measurementSiteTableVersion",
    "measurementSiteRecord",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable {

    protected String measurementSiteTableReference;
    protected BigInteger measurementSiteTableVersion;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord> measurementSiteRecord;
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the measurementSiteTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableReference() {
        return measurementSiteTableReference;
    }

    /**
     * Sets the value of the measurementSiteTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableReference(String value) {
        this.measurementSiteTableReference = value;
    }

    /**
     * Gets the value of the measurementSiteTableVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteTableVersion() {
        return measurementSiteTableVersion;
    }

    /**
     * Sets the value of the measurementSiteTableVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteTableVersion(BigInteger value) {
        this.measurementSiteTableVersion = value;
    }

    /**
     * Gets the value of the measurementSiteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord }
     * 
     * 
     */
    public List<MeasurementSiteRecord> getMeasurementSiteRecord() {
        if (measurementSiteRecord == null) {
            measurementSiteRecord = new ArrayList<MeasurementSiteRecord>();
        }
        return this.measurementSiteRecord;
    }

    /**
     * Gets the value of the measurementSiteTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Sets the value of the measurementSiteTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
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
