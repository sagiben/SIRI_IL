
package com.transportation.siri_il;

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
 * An identifiable instance of data which is derived/computed from one or more measurements over a period of time. It may be a current value or a forecast value predicted from historical measurements.
 * 
 * <p>Java class for ElaboratedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecast" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="sourceInformation" type="{http://datex2.eu/schema/1_0/1_0}SourceInformation" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://datex2.eu/schema/1_0/1_0}Validity" minOccurs="0"/>
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/1_0/1_0}BasicDataValue"/>
 *         &lt;element name="elaboratedDataExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "ElaboratedData", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "forecast",
    "sourceInformation",
    "validity",
    "basicDataValue",
    "elaboratedDataExtension"
})
public class ElaboratedData {

    protected Boolean forecast;
    protected SourceInformation sourceInformation;
    protected Validity validity;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType elaboratedDataExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecast(Boolean value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the sourceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SourceInformation }
     *     
     */
    public SourceInformation getSourceInformation() {
        return sourceInformation;
    }

    /**
     * Sets the value of the sourceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceInformation }
     *     
     */
    public void setSourceInformation(SourceInformation value) {
        this.sourceInformation = value;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the basicDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Sets the value of the basicDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    /**
     * Gets the value of the elaboratedDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataExtension() {
        return elaboratedDataExtension;
    }

    /**
     * Sets the value of the elaboratedDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataExtension(ExtensionType value) {
        this.elaboratedDataExtension = value;
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
