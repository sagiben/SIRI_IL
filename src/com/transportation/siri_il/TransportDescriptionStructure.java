
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for implementation structure.
 * 
 * <p>Java class for TransportDescriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportDescriptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommunicationsTransportMethod" type="{http://www.siri.org.uk/siri}CommunicationsTransportMethodEnumeration"/>
 *         &lt;element name="CompressionMethod" type="{http://www.siri.org.uk/siri}CompressionMethodEnumeration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDescriptionStructure", propOrder = {
    "communicationsTransportMethod",
    "compressionMethod"
})
public class TransportDescriptionStructure {

    @XmlElement(name = "CommunicationsTransportMethod", required = true, defaultValue = "httpPost")
    protected CommunicationsTransportMethodEnumeration communicationsTransportMethod;
    @XmlElement(name = "CompressionMethod", required = true, defaultValue = "none")
    protected CompressionMethodEnumeration compressionMethod;

    /**
     * Gets the value of the communicationsTransportMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public CommunicationsTransportMethodEnumeration getCommunicationsTransportMethod() {
        return communicationsTransportMethod;
    }

    /**
     * Sets the value of the communicationsTransportMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public void setCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        this.communicationsTransportMethod = value;
    }

    /**
     * Gets the value of the compressionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public CompressionMethodEnumeration getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Sets the value of the compressionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public void setCompressionMethod(CompressionMethodEnumeration value) {
        this.compressionMethod = value;
    }

}
