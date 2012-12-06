
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bridgeSwingInOperation"/>
 *     &lt;enumeration value="carPoolLaneInOperation"/>
 *     &lt;enumeration value="closedPermanentlyForTheWinter"/>
 *     &lt;enumeration value="contraflow"/>
 *     &lt;enumeration value="convoyServiceDueToBadWeather"/>
 *     &lt;enumeration value="intermittentClosures"/>
 *     &lt;enumeration value="intermittentShortTermClosures"/>
 *     &lt;enumeration value="laneOrCarriagewayClosed"/>
 *     &lt;enumeration value="narrowLanes"/>
 *     &lt;enumeration value="noOvertaking"/>
 *     &lt;enumeration value="noThroughTraffic"/>
 *     &lt;enumeration value="overnightClosures"/>
 *     &lt;enumeration value="restrictions"/>
 *     &lt;enumeration value="roadClosed"/>
 *     &lt;enumeration value="rushHourLaneInOperation"/>
 *     &lt;enumeration value="singleAlternateLineTraffic"/>
 *     &lt;enumeration value="tidalFlowLaneInOperation"/>
 *     &lt;enumeration value="trafficContolInOperation"/>
 *     &lt;enumeration value="trafficHeld"/>
 *     &lt;enumeration value="useOfSpecifiedLaneAllowed"/>
 *     &lt;enumeration value="useSpecifiedLane"/>
 *     &lt;enumeration value="useUnderSpecifiedRestrictions"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkManagementTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum NetworkManagementTypeEnum {


    /**
     * The bridge at the specified location has swung or lifted and is therfore temporarily closed to traffic.
     * 
     */
    @XmlEnumValue("bridgeSwingInOperation")
    BRIDGE_SWING_IN_OPERATION("bridgeSwingInOperation"),

    /**
     * Dedicated car pool lane(s) are in operation for vehicles carrying at least the specified number of occupants.
     * 
     */
    @XmlEnumValue("carPoolLaneInOperation")
    CAR_POOL_LANE_IN_OPERATION("carPoolLaneInOperation"),

    /**
     * The road is closed to vehicles with the specified characteristics or all, if none defined, for the duration of the winter.
     * 
     */
    @XmlEnumValue("closedPermanentlyForTheWinter")
    CLOSED_PERMANENTLY_FOR_THE_WINTER("closedPermanentlyForTheWinter"),

    /**
     * Two-way traffic is temporarily sharing a single carriageway.
     * 
     */
    @XmlEnumValue("contraflow")
    CONTRAFLOW("contraflow"),

    /**
     * Traffic is only possible in convoys due to bad weather conditions.
     * 
     */
    @XmlEnumValue("convoyServiceDueToBadWeather")
    CONVOY_SERVICE_DUE_TO_BAD_WEATHER("convoyServiceDueToBadWeather"),

    /**
     * Road closures occur intermittently on the specified road in the specified direction.
     * 
     */
    @XmlEnumValue("intermittentClosures")
    INTERMITTENT_CLOSURES("intermittentClosures"),

    /**
     * Road closures occur intermittently on the specified road in the specified direction for short durations.
     * 
     */
    @XmlEnumValue("intermittentShortTermClosures")
    INTERMITTENT_SHORT_TERM_CLOSURES("intermittentShortTermClosures"),

    /**
     * One or more lanes or carriageways (as specified in the location elements) are closed to vehicles with the specified characteristics or all, if none defined, in the specified direction.
     * 
     */
    @XmlEnumValue("laneOrCarriagewayClosed")
    LANE_OR_CARRIAGEWAY_CLOSED("laneOrCarriagewayClosed"),

    /**
     * Normal lane widths are temporarily reduced.
     * 
     */
    @XmlEnumValue("narrowLanes")
    NARROW_LANES("narrowLanes"),

    /**
     * Overtaking is prohibited for vehicles with the specified characteristics or all, if none defined, on the specified section of road.
     * 
     */
    @XmlEnumValue("noOvertaking")
    NO_OVERTAKING("noOvertaking"),

    /**
     * The road is closed to vehicles with the specified characteristics or all, if none defined, in the specified direction, except for local access.
     * 
     */
    @XmlEnumValue("noThroughTraffic")
    NO_THROUGH_TRAFFIC("noThroughTraffic"),

    /**
     * Every night the road is closed to vehicles with the specified characteristics or all, if none defined, in the specified direction by decision of the appropriate authorities.
     * 
     */
    @XmlEnumValue("overnightClosures")
    OVERNIGHT_CLOSURES("overnightClosures"),

    /**
     * Restrictions different from the normal highway restrictions have been imposed on specific sections of the road.
     * 
     */
    @XmlEnumValue("restrictions")
    RESTRICTIONS("restrictions"),

    /**
     * The road is closed to vehicles with the specified characteristics or all, if none defined, in the specified direction.
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),

    /**
     * Dedicated rush (peak) hour lane(s) are in operation.
     * 
     */
    @XmlEnumValue("rushHourLaneInOperation")
    RUSH_HOUR_LANE_IN_OPERATION("rushHourLaneInOperation"),

    /**
     * Traffic is being controlled to move in alternate single lines. This control may be undertaken by traffic lights or flagman. Congestion is expected.
     * 
     */
    @XmlEnumValue("singleAlternateLineTraffic")
    SINGLE_ALTERNATE_LINE_TRAFFIC("singleAlternateLineTraffic"),

    /**
     * Dedicated tidal flow lane(s) are in operation in the specified direction.
     * 
     */
    @XmlEnumValue("tidalFlowLaneInOperation")
    TIDAL_FLOW_LANE_IN_OPERATION("tidalFlowLaneInOperation"),

    /**
     * Traffic control measures are in operation.
     * 
     */
    @XmlEnumValue("trafficContolInOperation")
    TRAFFIC_CONTOL_IN_OPERATION("trafficContolInOperation"),

    /**
     * Traffic in the specified direction is temporarily held up due to an unplanned event (e.g. for clearance of wreckage following an accident).
     * 
     */
    @XmlEnumValue("trafficHeld")
    TRAFFIC_HELD("trafficHeld"),

    /**
     * All vehicles may currently use the specified lane (as defined by the location elements). The normal lane restrictions are not currently in force.
     * 
     */
    @XmlEnumValue("useOfSpecifiedLaneAllowed")
    USE_OF_SPECIFIED_LANE_ALLOWED("useOfSpecifiedLaneAllowed"),

    /**
     * Use the specified lane (as defined by the location elements).
     * 
     */
    @XmlEnumValue("useSpecifiedLane")
    USE_SPECIFIED_LANE("useSpecifiedLane"),

    /**
     * Vehicles satisfying the defined restrictions may use the specified lane (as defined by the location elements).
     * 
     */
    @XmlEnumValue("useUnderSpecifiedRestrictions")
    USE_UNDER_SPECIFIED_RESTRICTIONS("useUnderSpecifiedRestrictions"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NetworkManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkManagementTypeEnum fromValue(String v) {
        for (NetworkManagementTypeEnum c: NetworkManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
