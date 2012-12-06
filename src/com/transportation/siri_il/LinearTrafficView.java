
package com.transportation.siri_il;

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
 * An identifiable instance of a linear traffic view at a single point in time relating to a linear section of road, comprising one or more traffic view records.
 * 
 * <p>Java class for LinearTrafficView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearTrafficView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linearPredefinedLocationReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="trafficViewRecord" type="{http://datex2.eu/schema/1_0/1_0}TrafficViewRecord" maxOccurs="unbounded"/>
 *         &lt;element name="linearTrafficViewExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "LinearTrafficView", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "linearPredefinedLocationReference",
    "trafficViewRecord",
    "linearTrafficViewExtension"
})
public class LinearTrafficView {

    @XmlElement(required = true)
    protected String linearPredefinedLocationReference;
    @XmlElement(required = true)
    protected List<TrafficViewRecord> trafficViewRecord;
    protected ExtensionType linearTrafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the linearPredefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearPredefinedLocationReference() {
        return linearPredefinedLocationReference;
    }

    /**
     * Sets the value of the linearPredefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearPredefinedLocationReference(String value) {
        this.linearPredefinedLocationReference = value;
    }

    /**
     * Gets the value of the trafficViewRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficViewRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficViewRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficViewRecord }
     * 
     * 
     */
    public List<TrafficViewRecord> getTrafficViewRecord() {
        if (trafficViewRecord == null) {
            trafficViewRecord = new ArrayList<TrafficViewRecord>();
        }
        return this.trafficViewRecord;
    }

    /**
     * Gets the value of the linearTrafficViewExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearTrafficViewExtension() {
        return linearTrafficViewExtension;
    }

    /**
     * Sets the value of the linearTrafficViewExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearTrafficViewExtension(ExtensionType value) {
        this.linearTrafficViewExtension = value;
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
