
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Measurements of atmospheric pollution.
 * 
 * <p>Java class for PollutionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/1_0/1_0}PollutionMeasurement" maxOccurs="unbounded"/>
 *         &lt;element name="pollutionInformationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionInformation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "pollutionMeasurement",
    "pollutionInformationExtension"
})
public class PollutionInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected ExtensionType pollutionInformationExtension;

    /**
     * Gets the value of the pollutionMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pollutionMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollutionMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PollutionMeasurement }
     * 
     * 
     */
    public List<PollutionMeasurement> getPollutionMeasurement() {
        if (pollutionMeasurement == null) {
            pollutionMeasurement = new ArrayList<PollutionMeasurement>();
        }
        return this.pollutionMeasurement;
    }

    /**
     * Gets the value of the pollutionInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionInformationExtension() {
        return pollutionInformationExtension;
    }

    /**
     * Sets the value of the pollutionInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionInformationExtension(ExtensionType value) {
        this.pollutionInformationExtension = value;
    }

}
