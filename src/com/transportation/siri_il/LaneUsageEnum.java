
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaneUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LaneUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="heavyVehiclesUseLeftLane"/>
 *     &lt;enumeration value="heavyVehiclesUseRightLane"/>
 *     &lt;enumeration value="keepToTheLeft"/>
 *     &lt;enumeration value="keepToTheRight"/>
 *     &lt;enumeration value="useBusLane"/>
 *     &lt;enumeration value="useHardShoulder"/>
 *     &lt;enumeration value="useHeavyVehicleLane"/>
 *     &lt;enumeration value="useLeftHandParallelCarriageway"/>
 *     &lt;enumeration value="useLeftLane"/>
 *     &lt;enumeration value="useLocalTrafficLanes"/>
 *     &lt;enumeration value="useRightHandParallelCarriageway"/>
 *     &lt;enumeration value="useRightLane"/>
 *     &lt;enumeration value="useThroughTrafficLanes"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaneUsageEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum LaneUsageEnum {


    /**
     * Heavy vehicles use left lane.
     * 
     */
    @XmlEnumValue("heavyVehiclesUseLeftLane")
    HEAVY_VEHICLES_USE_LEFT_LANE("heavyVehiclesUseLeftLane"),

    /**
     * Heavy vehicles use right lane.
     * 
     */
    @XmlEnumValue("heavyVehiclesUseRightLane")
    HEAVY_VEHICLES_USE_RIGHT_LANE("heavyVehiclesUseRightLane"),

    /**
     * Keep to the left.
     * 
     */
    @XmlEnumValue("keepToTheLeft")
    KEEP_TO_THE_LEFT("keepToTheLeft"),

    /**
     * Keep to the right.
     * 
     */
    @XmlEnumValue("keepToTheRight")
    KEEP_TO_THE_RIGHT("keepToTheRight"),

    /**
     * Use the bus lane.
     * 
     */
    @XmlEnumValue("useBusLane")
    USE_BUS_LANE("useBusLane"),

    /**
     * Use the hard shoulder as a lane.
     * 
     */
    @XmlEnumValue("useHardShoulder")
    USE_HARD_SHOULDER("useHardShoulder"),

    /**
     * Use heavy vehicle lane.
     * 
     */
    @XmlEnumValue("useHeavyVehicleLane")
    USE_HEAVY_VEHICLE_LANE("useHeavyVehicleLane"),

    /**
     * Use left-hand parallel carriageway.
     * 
     */
    @XmlEnumValue("useLeftHandParallelCarriageway")
    USE_LEFT_HAND_PARALLEL_CARRIAGEWAY("useLeftHandParallelCarriageway"),

    /**
     * Use left lane.
     * 
     */
    @XmlEnumValue("useLeftLane")
    USE_LEFT_LANE("useLeftLane"),

    /**
     * Use local traffic lanes.
     * 
     */
    @XmlEnumValue("useLocalTrafficLanes")
    USE_LOCAL_TRAFFIC_LANES("useLocalTrafficLanes"),

    /**
     * Use right-hand parallel carriageway.
     * 
     */
    @XmlEnumValue("useRightHandParallelCarriageway")
    USE_RIGHT_HAND_PARALLEL_CARRIAGEWAY("useRightHandParallelCarriageway"),

    /**
     * Use right lane.
     * 
     */
    @XmlEnumValue("useRightLane")
    USE_RIGHT_LANE("useRightLane"),

    /**
     * Use through traffic lanes.
     * 
     */
    @XmlEnumValue("useThroughTrafficLanes")
    USE_THROUGH_TRAFFIC_LANES("useThroughTrafficLanes"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LaneUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaneUsageEnum fromValue(String v) {
        for (LaneUsageEnum c: LaneUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
