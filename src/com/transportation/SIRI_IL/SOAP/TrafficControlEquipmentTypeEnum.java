
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficControlEquipmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficControlEquipmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="laneControlSigns"/>
 *     &lt;enumeration value="rampControls"/>
 *     &lt;enumeration value="speedControlSigns"/>
 *     &lt;enumeration value="tollGates"/>
 *     &lt;enumeration value="trafficLightSets"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficControlEquipmentTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TrafficControlEquipmentTypeEnum {


    /**
     * Signs used to control lane usage (e.g. in tidal flow systems or hard shoulder running).
     * 
     */
    @XmlEnumValue("laneControlSigns")
    LANE_CONTROL_SIGNS("laneControlSigns"),

    /**
     * Ramp control equipment.
     * 
     */
    @XmlEnumValue("rampControls")
    RAMP_CONTROLS("rampControls"),

    /**
     * Signs used to control traffic speed.
     * 
     */
    @XmlEnumValue("speedControlSigns")
    SPEED_CONTROL_SIGNS("speedControlSigns"),

    /**
     * Toll gates.
     * 
     */
    @XmlEnumValue("tollGates")
    TOLL_GATES("tollGates"),

    /**
     * Sets of traffic lights.
     * 
     */
    @XmlEnumValue("trafficLightSets")
    TRAFFIC_LIGHT_SETS("trafficLightSets");
    private final String value;

    TrafficControlEquipmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficControlEquipmentTypeEnum fromValue(String v) {
        for (TrafficControlEquipmentTypeEnum c: TrafficControlEquipmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
