
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObstructionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObstructionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airCrash"/>
 *     &lt;enumeration value="childrenOnRoadway"/>
 *     &lt;enumeration value="clearanceWork"/>
 *     &lt;enumeration value="craneOperating"/>
 *     &lt;enumeration value="cyclistsOnRoadway"/>
 *     &lt;enumeration value="damagedCrashBarrier"/>
 *     &lt;enumeration value="fallingIce"/>
 *     &lt;enumeration value="fallingLightIceOrSnow"/>
 *     &lt;enumeration value="highSpeedChase"/>
 *     &lt;enumeration value="houseFire"/>
 *     &lt;enumeration value="incident"/>
 *     &lt;enumeration value="industrialAccident"/>
 *     &lt;enumeration value="movingHazardsOnTheRoad"/>
 *     &lt;enumeration value="objectOnTheRoad"/>
 *     &lt;enumeration value="objectsFallingFromMovingVehicle"/>
 *     &lt;enumeration value="obstructionOnTheRoad"/>
 *     &lt;enumeration value="peopleOnRoadway"/>
 *     &lt;enumeration value="railCrash"/>
 *     &lt;enumeration value="recklessDriver"/>
 *     &lt;enumeration value="rescueAndRecoveryWork"/>
 *     &lt;enumeration value="severeFrostDamagedRoadway"/>
 *     &lt;enumeration value="shedLoad"/>
 *     &lt;enumeration value="snowAndIceDebris"/>
 *     &lt;enumeration value="spillageOccurringFromMovingVehicle"/>
 *     &lt;enumeration value="spillageOnTheRoad"/>
 *     &lt;enumeration value="unprotectedAccidentArea"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObstructionTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ObstructionTypeEnum {


    /**
     * An air crash adjacent to the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("airCrash")
    AIR_CRASH("airCrash"),

    /**
     * Children on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("childrenOnRoadway")
    CHILDREN_ON_ROADWAY("childrenOnRoadway"),

    /**
     * Clearance work associated with an earlier traffic problem which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),

    /**
     * A crane is operating either on or adjacent to the road which may cause an obstruction to traffic.
     * 
     */
    @XmlEnumValue("craneOperating")
    CRANE_OPERATING("craneOperating"),

    /**
     * Cyclists on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("cyclistsOnRoadway")
    CYCLISTS_ON_ROADWAY("cyclistsOnRoadway"),

    /**
     * Damaged crash barrier which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedCrashBarrier")
    DAMAGED_CRASH_BARRIER("damagedCrashBarrier"),

    /**
     * Falling ice off trees, powerlines or structures which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("fallingIce")
    FALLING_ICE("fallingIce"),

    /**
     * Falling light ice or snow off trees, powerlines or structures which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("fallingLightIceOrSnow")
    FALLING_LIGHT_ICE_OR_SNOW("fallingLightIceOrSnow"),

    /**
     * Authorised and unauthorised vehicles are travelling at high speeds along the roadway.  This may present a hazard to other vehicles.
     * 
     */
    @XmlEnumValue("highSpeedChase")
    HIGH_SPEED_CHASE("highSpeedChase"),

    /**
     * House fire(s) near the road way resulting in smoke and driver distraction which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("houseFire")
    HOUSE_FIRE("houseFire"),

    /**
     * Incidents are chance occurrences involving vehicles from the traffic stream, which could present potential hazards to road users.  This item excludes accidents.
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),

    /**
     * The road is obstructed or partially obstructed due to the output or outcome of an industrial accident.
     * 
     */
    @XmlEnumValue("industrialAccident")
    INDUSTRIAL_ACCIDENT("industrialAccident"),

    /**
     * Unspecified moving hazard(s) on the road which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("movingHazardsOnTheRoad")
    MOVING_HAZARDS_ON_THE_ROAD("movingHazardsOnTheRoad"),

    /**
     * The road may be obstructed or traffic hindered due to objects laying on the roadway.
     * 
     */
    @XmlEnumValue("objectOnTheRoad")
    OBJECT_ON_THE_ROAD("objectOnTheRoad"),

    /**
     * Objects falling from moving vehicles which are presenting a hazard to other vehicles.
     * 
     */
    @XmlEnumValue("objectsFallingFromMovingVehicle")
    OBJECTS_FALLING_FROM_MOVING_VEHICLE("objectsFallingFromMovingVehicle"),

    /**
     * Unspecified obstruction on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("obstructionOnTheRoad")
    OBSTRUCTION_ON_THE_ROAD("obstructionOnTheRoad"),

    /**
     * People on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("peopleOnRoadway")
    PEOPLE_ON_ROADWAY("peopleOnRoadway"),

    /**
     * A rail crash adjacent to the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("railCrash")
    RAIL_CRASH("railCrash"),

    /**
     * A vehicle being driven without due care and attention is causing a harzard to other vehicles.
     * 
     */
    @XmlEnumValue("recklessDriver")
    RECKLESS_DRIVER("recklessDriver"),

    /**
     * Work is being undertaken by emergency services which may present a hazard to road users.
     * 
     */
    @XmlEnumValue("rescueAndRecoveryWork")
    RESCUE_AND_RECOVERY_WORK("rescueAndRecoveryWork"),

    /**
     * Severe frost damage to the roadway causing an obstruction to traffic.
     * 
     */
    @XmlEnumValue("severeFrostDamagedRoadway")
    SEVERE_FROST_DAMAGED_ROADWAY("severeFrostDamagedRoadway"),

    /**
     * Spillage of transported goods on the roadway which may cause traffic disruption.
     * 
     */
    @XmlEnumValue("shedLoad")
    SHED_LOAD("shedLoad"),

    /**
     * Snow and ice debris on the roadway which may present a hazard to road users.
     * 
     */
    @XmlEnumValue("snowAndIceDebris")
    SNOW_AND_ICE_DEBRIS("snowAndIceDebris"),

    /**
     * Substances are spilling out from a moving vehicle which is presenting a hazard to other road users.
     * 
     */
    @XmlEnumValue("spillageOccurringFromMovingVehicle")
    SPILLAGE_OCCURRING_FROM_MOVING_VEHICLE("spillageOccurringFromMovingVehicle"),

    /**
     * Includes all situations where a spillage has occurred on the roadway due to an earlier incident.
     * 
     */
    @XmlEnumValue("spillageOnTheRoad")
    SPILLAGE_ON_THE_ROAD("spillageOnTheRoad"),

    /**
     * An accident area which has not been protected and may present a hazard to road users.
     * 
     */
    @XmlEnumValue("unprotectedAccidentArea")
    UNPROTECTED_ACCIDENT_AREA("unprotectedAccidentArea"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ObstructionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObstructionTypeEnum fromValue(String v) {
        for (ObstructionTypeEnum c: ObstructionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
