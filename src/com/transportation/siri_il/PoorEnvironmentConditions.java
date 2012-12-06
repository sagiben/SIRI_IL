
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Any environmental conditions which may be affecting the driving conditions on the road.
 * 
 * <p>Java class for PoorEnvironmentConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoorEnvironmentConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Conditions">
 *       &lt;sequence>
 *         &lt;element name="poorEnvironmentType" type="{http://datex2.eu/schema/1_0/1_0}PoorEnvironmentTypeEnum"/>
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/1_0/1_0}PrecipitationDetail" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/1_0/1_0}Visibility" minOccurs="0"/>
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/1_0/1_0}PollutionMeasurement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/1_0/1_0}Temperature" minOccurs="0"/>
 *         &lt;element name="wind" type="{http://datex2.eu/schema/1_0/1_0}Wind" minOccurs="0"/>
 *         &lt;element name="poorEnvironmentConditionsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorEnvironmentConditions", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "poorEnvironmentType",
    "precipitationDetail",
    "visibility",
    "pollutionMeasurement",
    "temperature",
    "wind",
    "poorEnvironmentConditionsExtension"
})
public class PoorEnvironmentConditions
    extends Conditions
{

    @XmlElement(required = true)
    protected PoorEnvironmentTypeEnum poorEnvironmentType;
    protected PrecipitationDetail precipitationDetail;
    protected Visibility visibility;
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected Temperature temperature;
    protected Wind wind;
    protected ExtensionType poorEnvironmentConditionsExtension;

    /**
     * Gets the value of the poorEnvironmentType property.
     * 
     * @return
     *     possible object is
     *     {@link PoorEnvironmentTypeEnum }
     *     
     */
    public PoorEnvironmentTypeEnum getPoorEnvironmentType() {
        return poorEnvironmentType;
    }

    /**
     * Sets the value of the poorEnvironmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoorEnvironmentTypeEnum }
     *     
     */
    public void setPoorEnvironmentType(PoorEnvironmentTypeEnum value) {
        this.poorEnvironmentType = value;
    }

    /**
     * Gets the value of the precipitationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Sets the value of the precipitationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

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
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Gets the value of the poorEnvironmentConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPoorEnvironmentConditionsExtension() {
        return poorEnvironmentConditionsExtension;
    }

    /**
     * Sets the value of the poorEnvironmentConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPoorEnvironmentConditionsExtension(ExtensionType value) {
        this.poorEnvironmentConditionsExtension = value;
    }

}
