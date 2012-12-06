
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abandonedVehicle"/>
 *     &lt;enumeration value="abnormalLoad"/>
 *     &lt;enumeration value="brokenDownBus"/>
 *     &lt;enumeration value="brokenDownHeavyLorry"/>
 *     &lt;enumeration value="brokenDownVehicle"/>
 *     &lt;enumeration value="convoy"/>
 *     &lt;enumeration value="damagedVehicle"/>
 *     &lt;enumeration value="dangerousSlowMovingVehicle"/>
 *     &lt;enumeration value="emergencyVehicle"/>
 *     &lt;enumeration value="highSpeedEmergencyVehicle"/>
 *     &lt;enumeration value="longLoad"/>
 *     &lt;enumeration value="militaryConvoy"/>
 *     &lt;enumeration value="overheightVehicle"/>
 *     &lt;enumeration value="prohibitedVehicleOnTheRoadway"/>
 *     &lt;enumeration value="saltingOrGrittingVehicleInUse"/>
 *     &lt;enumeration value="slowMovingMaintenanceVehicle"/>
 *     &lt;enumeration value="slowVehicle"/>
 *     &lt;enumeration value="snowplough"/>
 *     &lt;enumeration value="trackLayingVehicle"/>
 *     &lt;enumeration value="unlitVehicleOnTheRoad"/>
 *     &lt;enumeration value="vehicleOnFire"/>
 *     &lt;enumeration value="vehicleCarryingHazardousMaterials"/>
 *     &lt;enumeration value="vehicleOnWrongCarriageway"/>
 *     &lt;enumeration value="vehiclesSlowingToLookAtAccidents"/>
 *     &lt;enumeration value="vehicleStuck"/>
 *     &lt;enumeration value="vehicleStuckUnderBridge"/>
 *     &lt;enumeration value="vehicleWithOverheightLoad"/>
 *     &lt;enumeration value="vehicleWithOverwideLoad"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleObstructionTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VehicleObstructionTypeEnum {


    /**
     * Abandoned vehicle(s) on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("abandonedVehicle")
    ABANDONED_VEHICLE("abandonedVehicle"),

    /**
     * Vehicle(s) carrying exceptional load(s) which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),

    /**
     * Broken down passenger vehicle(s) on the carriageway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("brokenDownBus")
    BROKEN_DOWN_BUS("brokenDownBus"),

    /**
     * Broken down heavy lorry/lorries on the carriageway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("brokenDownHeavyLorry")
    BROKEN_DOWN_HEAVY_LORRY("brokenDownHeavyLorry"),

    /**
     * Broken down vehicle(s) on the carriageway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("brokenDownVehicle")
    BROKEN_DOWN_VEHICLE("brokenDownVehicle"),

    /**
     * A group of vehicles moving together in formation which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("convoy")
    CONVOY("convoy"),

    /**
     * Damaged vehicle(s) on the carriageway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedVehicle")
    DAMAGED_VEHICLE("damagedVehicle"),

    /**
     * Dangerous slow moving vehicles which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("dangerousSlowMovingVehicle")
    DANGEROUS_SLOW_MOVING_VEHICLE("dangerousSlowMovingVehicle"),

    /**
     * Emergency service vehicles on the roadway in response to an emergency situation.
     * 
     */
    @XmlEnumValue("emergencyVehicle")
    EMERGENCY_VEHICLE("emergencyVehicle"),

    /**
     * Emergency service vehicles progressing at high speed along the roadway in response to or en route from an emergency situation.
     * 
     */
    @XmlEnumValue("highSpeedEmergencyVehicle")
    HIGH_SPEED_EMERGENCY_VEHICLE("highSpeedEmergencyVehicle"),

    /**
     * A vehicle of length greater than that normally allowed which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("longLoad")
    LONG_LOAD("longLoad"),

    /**
     * A group of military vehicles moving together in formation which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("militaryConvoy")
    MILITARY_CONVOY("militaryConvoy"),

    /**
     * Vehicles of height greater than normally allowed which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("overheightVehicle")
    OVERHEIGHT_VEHICLE("overheightVehicle"),

    /**
     * Vehicles not normally permitted on the highway are present which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("prohibitedVehicleOnTheRoadway")
    PROHIBITED_VEHICLE_ON_THE_ROADWAY("prohibitedVehicleOnTheRoadway"),

    /**
     * Salting and gritting vehicles are in use which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("saltingOrGrittingVehicleInUse")
    SALTING_OR_GRITTING_VEHICLE_IN_USE("saltingOrGrittingVehicleInUse"),

    /**
     * Slow moving vehicles undertaking maintenance work may pose a hazard to other vehicles on the carriageway.
     * 
     */
    @XmlEnumValue("slowMovingMaintenanceVehicle")
    SLOW_MOVING_MAINTENANCE_VEHICLE("slowMovingMaintenanceVehicle"),

    /**
     * A vehicle travelling at well below normal highway speeds which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("slowVehicle")
    SLOW_VEHICLE("slowVehicle"),

    /**
     * Snowploughs are in use which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("snowplough")
    SNOWPLOUGH("snowplough"),

    /**
     * Tracked vehicles are in use which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("trackLayingVehicle")
    TRACK_LAYING_VEHICLE("trackLayingVehicle"),

    /**
     * Vehicles without lights are in use which may present a hazard to road users.
     * 
     */
    @XmlEnumValue("unlitVehicleOnTheRoad")
    UNLIT_VEHICLE_ON_THE_ROAD("unlitVehicleOnTheRoad"),

    /**
     * A vehicle is or has been on fire and may cause traffic disruption.
     * 
     */
    @XmlEnumValue("vehicleOnFire")
    VEHICLE_ON_FIRE("vehicleOnFire"),

    /**
     * Vehicles carrying materials of a hazardous nature are present and these could expose road users to additional hazards.
     * 
     */
    @XmlEnumValue("vehicleCarryingHazardousMaterials")
    VEHICLE_CARRYING_HAZARDOUS_MATERIALS("vehicleCarryingHazardousMaterials"),

    /**
     * A vehicle is travelling the wrong way along a divided highway (i.e. on the wrong side).
     * 
     */
    @XmlEnumValue("vehicleOnWrongCarriageway")
    VEHICLE_ON_WRONG_CARRIAGEWAY("vehicleOnWrongCarriageway"),

    /**
     * Traffic disruption is resulting from passing vehicles slowing to look at an accident.
     * 
     */
    @XmlEnumValue("vehiclesSlowingToLookAtAccidents")
    VEHICLES_SLOWING_TO_LOOK_AT_ACCIDENTS("vehiclesSlowingToLookAtAccidents"),

    /**
     * One or more vehicles are stuck (i.e. unable to move) due to environmental conditions such as a snow drift or severe icy road.
     * 
     */
    @XmlEnumValue("vehicleStuck")
    VEHICLE_STUCK("vehicleStuck"),

    /**
     * A vehicle is stuck under a bridge.
     * 
     */
    @XmlEnumValue("vehicleStuckUnderBridge")
    VEHICLE_STUCK_UNDER_BRIDGE("vehicleStuckUnderBridge"),

    /**
     * An overheight vehicle which may present a hazard to road users.
     * 
     */
    @XmlEnumValue("vehicleWithOverheightLoad")
    VEHICLE_WITH_OVERHEIGHT_LOAD("vehicleWithOverheightLoad"),

    /**
     * A vehicle of width greater than that normally allowed which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("vehicleWithOverwideLoad")
    VEHICLE_WITH_OVERWIDE_LOAD("vehicleWithOverwideLoad"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleObstructionTypeEnum fromValue(String v) {
        for (VehicleObstructionTypeEnum c: VehicleObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
