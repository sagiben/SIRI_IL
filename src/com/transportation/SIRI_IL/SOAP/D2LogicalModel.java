
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The DATEX II logical model comprising exchange, content payload and management sub-models.
 * 
 * <p>Java class for D2LogicalModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D2LogicalModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchange" type="{http://datex2.eu/schema/1_0/1_0}Exchange"/>
 *         &lt;element name="payloadPublication" type="{http://datex2.eu/schema/1_0/1_0}PayloadPublication" minOccurs="0"/>
 *         &lt;element name="d2LogicalModelExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D2LogicalModel", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "exchange",
    "payloadPublication",
    "d2LogicalModelExtension"
})
public class D2LogicalModel {

    @XmlElement(required = true)
    protected Exchange exchange;
    protected PayloadPublication payloadPublication;
    protected ExtensionType d2LogicalModelExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modelBaseVersion;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link Exchange }
     *     
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exchange }
     *     
     */
    public void setExchange(Exchange value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the payloadPublication property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadPublication }
     *     
     */
    public PayloadPublication getPayloadPublication() {
        return payloadPublication;
    }

    /**
     * Sets the value of the payloadPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadPublication }
     *     
     */
    public void setPayloadPublication(PayloadPublication value) {
        this.payloadPublication = value;
    }

    /**
     * Gets the value of the d2LogicalModelExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getD2LogicalModelExtension() {
        return d2LogicalModelExtension;
    }

    /**
     * Sets the value of the d2LogicalModelExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setD2LogicalModelExtension(ExtensionType value) {
        this.d2LogicalModelExtension = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "1.0";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

}
