
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of road side assistance required.
 * 
 * <p>Java class for RoadsideAssistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadsideAssistance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/1_0/1_0}RoadsideAssistanceTypeEnum"/>
 *         &lt;element name="roadsideAssistanceExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideAssistance", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "roadsideAssistanceType",
    "roadsideAssistanceExtension"
})
public class RoadsideAssistance
    extends OperatorAction
{

    @XmlElement(required = true)
    protected RoadsideAssistanceTypeEnum roadsideAssistanceType;
    protected ExtensionType roadsideAssistanceExtension;

    /**
     * Gets the value of the roadsideAssistanceType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Sets the value of the roadsideAssistanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    /**
     * Gets the value of the roadsideAssistanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideAssistanceExtension() {
        return roadsideAssistanceExtension;
    }

    /**
     * Sets the value of the roadsideAssistanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideAssistanceExtension(ExtensionType value) {
        this.roadsideAssistanceExtension = value;
    }

}
