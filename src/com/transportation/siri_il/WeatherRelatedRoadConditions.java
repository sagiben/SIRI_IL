
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Road surface conditions that are related to the weather which may affect the driving conditions, such as ice, snow or water.
 * 
 * <p>Java class for WeatherRelatedRoadConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherRelatedRoadConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}RoadConditions">
 *       &lt;sequence>
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/1_0/1_0}WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/1_0/1_0}RoadSurfaceConditionMeasurements" minOccurs="0"/>
 *         &lt;element name="weatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelatedRoadConditions", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "weatherRelatedRoadConditionsExtension"
})
public class WeatherRelatedRoadConditions
    extends RoadConditions
{

    @XmlElement(required = true)
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType weatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Gets the value of the roadSurfaceConditionMeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Sets the value of the roadSurfaceConditionMeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadSurfaceConditionMeasurements }
     *     
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    /**
     * Gets the value of the weatherRelatedRoadConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherRelatedRoadConditionsExtension() {
        return weatherRelatedRoadConditionsExtension;
    }

    /**
     * Sets the value of the weatherRelatedRoadConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.weatherRelatedRoadConditionsExtension = value;
    }

}
