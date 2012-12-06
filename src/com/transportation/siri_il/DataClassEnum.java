
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataClassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abnormalTraffic"/>
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="activity"/>
 *     &lt;enumeration value="elaboratedData"/>
 *     &lt;enumeration value="elaboratedTravelTime"/>
 *     &lt;enumeration value="information"/>
 *     &lt;enumeration value="massData"/>
 *     &lt;enumeration value="obstruction"/>
 *     &lt;enumeration value="operatorAction"/>
 *     &lt;enumeration value="planActivation"/>
 *     &lt;enumeration value="poorDrivingConditions"/>
 *     &lt;enumeration value="poorRoadInfrastructure"/>
 *     &lt;enumeration value="roadMaintenance"/>
 *     &lt;enumeration value="roadsideAssistance"/>
 *     &lt;enumeration value="situation"/>
 *     &lt;enumeration value="trafficElement"/>
 *     &lt;enumeration value="trafficManagement"/>
 *     &lt;enumeration value="trafficMeasurement"/>
 *     &lt;enumeration value="weatherMeasurement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataClassEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DataClassEnum {


    /**
     * Abnormal traffic information.
     * 
     */
    @XmlEnumValue("abnormalTraffic")
    ABNORMAL_TRAFFIC("abnormalTraffic"),

    /**
     * Accident information.
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * Activity information.
     * 
     */
    @XmlEnumValue("activity")
    ACTIVITY("activity"),

    /**
     * Elaborated data information.
     * 
     */
    @XmlEnumValue("elaboratedData")
    ELABORATED_DATA("elaboratedData"),

    /**
     * Elaborated travel time information.
     * 
     */
    @XmlEnumValue("elaboratedTravelTime")
    ELABORATED_TRAVEL_TIME("elaboratedTravelTime"),

    /**
     * Information.
     * 
     */
    @XmlEnumValue("information")
    INFORMATION("information"),

    /**
     * Mass data information.
     * 
     */
    @XmlEnumValue("massData")
    MASS_DATA("massData"),

    /**
     * Obstruction information.
     * 
     */
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),

    /**
     * Operator action information.
     * 
     */
    @XmlEnumValue("operatorAction")
    OPERATOR_ACTION("operatorAction"),

    /**
     * Plan activation information.
     * 
     */
    @XmlEnumValue("planActivation")
    PLAN_ACTIVATION("planActivation"),

    /**
     * Poor driving conditions information.
     * 
     */
    @XmlEnumValue("poorDrivingConditions")
    POOR_DRIVING_CONDITIONS("poorDrivingConditions"),

    /**
     * Poor road infrastructure information.
     * 
     */
    @XmlEnumValue("poorRoadInfrastructure")
    POOR_ROAD_INFRASTRUCTURE("poorRoadInfrastructure"),

    /**
     * Road maintenance information.
     * 
     */
    @XmlEnumValue("roadMaintenance")
    ROAD_MAINTENANCE("roadMaintenance"),

    /**
     * Roadside Assistance information.
     * 
     */
    @XmlEnumValue("roadsideAssistance")
    ROADSIDE_ASSISTANCE("roadsideAssistance"),

    /**
     * Situation information.
     * 
     */
    @XmlEnumValue("situation")
    SITUATION("situation"),

    /**
     * Traffic element information.
     * 
     */
    @XmlEnumValue("trafficElement")
    TRAFFIC_ELEMENT("trafficElement"),

    /**
     * Traffic management information.
     * 
     */
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),

    /**
     * Traffic measurement information.
     * 
     */
    @XmlEnumValue("trafficMeasurement")
    TRAFFIC_MEASUREMENT("trafficMeasurement"),

    /**
     * Weather measurement information.
     * 
     */
    @XmlEnumValue("weatherMeasurement")
    WEATHER_MEASUREMENT("weatherMeasurement");
    private final String value;

    DataClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataClassEnum fromValue(String v) {
        for (DataClassEnum c: DataClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
