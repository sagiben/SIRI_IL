
package com.transportation.SIRI_IL.SOAP;

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
 * An identifiable instance of a traffic view at a single point in time relating to a predefined location set, comprising one or more linear traffic views each of which comprise one or more traffic view records.
 * 
 * <p>Java class for TrafficView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficViewTime" type="{http://datex2.eu/schema/1_0/1_0}DateTime"/>
 *         &lt;element name="predefinedLocationSetReference" type="{http://datex2.eu/schema/1_0/1_0}Reference"/>
 *         &lt;element name="linearTrafficView" type="{http://datex2.eu/schema/1_0/1_0}LinearTrafficView" maxOccurs="unbounded"/>
 *         &lt;element name="trafficViewExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "TrafficView", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "trafficViewTime",
    "predefinedLocationSetReference",
    "linearTrafficView",
    "trafficViewExtension"
})
public class TrafficView {

    @XmlElement(required = true)
    protected DateTime trafficViewTime;
    @XmlElement(required = true)
    protected String predefinedLocationSetReference;
    @XmlElement(required = true)
    protected List<LinearTrafficView> linearTrafficView;
    protected ExtensionType trafficViewExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the trafficViewTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTrafficViewTime() {
        return trafficViewTime;
    }

    /**
     * Sets the value of the trafficViewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTrafficViewTime(DateTime value) {
        this.trafficViewTime = value;
    }

    /**
     * Gets the value of the predefinedLocationSetReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredefinedLocationSetReference() {
        return predefinedLocationSetReference;
    }

    /**
     * Sets the value of the predefinedLocationSetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredefinedLocationSetReference(String value) {
        this.predefinedLocationSetReference = value;
    }

    /**
     * Gets the value of the linearTrafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearTrafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearTrafficView }
     * 
     * 
     */
    public List<LinearTrafficView> getLinearTrafficView() {
        if (linearTrafficView == null) {
            linearTrafficView = new ArrayList<LinearTrafficView>();
        }
        return this.linearTrafficView;
    }

    /**
     * Gets the value of the trafficViewExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewExtension() {
        return trafficViewExtension;
    }

    /**
     * Sets the value of the trafficViewExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewExtension(ExtensionType value) {
        this.trafficViewExtension = value;
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
