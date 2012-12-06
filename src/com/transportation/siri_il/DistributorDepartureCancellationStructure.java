
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Cancellation of a Distributor vehicle journey from a connection.
 * 
 * <p>Java class for DistributorDepartureCancellationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributorDepartureCancellationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDistributorItemStructure">
 *       &lt;sequence>
 *         &lt;element name="Reason" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributorDepartureCancellationStructure", propOrder = {
    "reason",
    "extensions"
})
public class DistributorDepartureCancellationStructure
    extends AbstractDistributorItemStructure
{

    @XmlElement(name = "Reason")
    protected NaturalLanguageStringStructure reason;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setReason(NaturalLanguageStringStructure value) {
        this.reason = value;
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

}
