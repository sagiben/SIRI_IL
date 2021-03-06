
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarningAdviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarningAdviceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aquaplaningRisk"/>
 *     &lt;enumeration value="danger"/>
 *     &lt;enumeration value="dangerOfExplosion"/>
 *     &lt;enumeration value="dangerOfFire"/>
 *     &lt;enumeration value="emergencyVehiclesAtScene"/>
 *     &lt;enumeration value="extraPolicePatrolsInOperation"/>
 *     &lt;enumeration value="firemenDirectingTraffic"/>
 *     &lt;enumeration value="helicopterRescueInProgress"/>
 *     &lt;enumeration value="increasedRiskOfAccident"/>
 *     &lt;enumeration value="lookOutForFlagman"/>
 *     &lt;enumeration value="pilotCarInOperation"/>
 *     &lt;enumeration value="policeDirectingTraffic"/>
 *     &lt;enumeration value="policeInAttendance"/>
 *     &lt;enumeration value="radiationHazard"/>
 *     &lt;enumeration value="repairsInProgress"/>
 *     &lt;enumeration value="rescueAndRecoveryWorkInProgress"/>
 *     &lt;enumeration value="severalAccidentsHaveTakenPlace"/>
 *     &lt;enumeration value="skidRisk"/>
 *     &lt;enumeration value="slipperyPavements"/>
 *     &lt;enumeration value="surfaceWaterHazard"/>
 *     &lt;enumeration value="toxicLeak"/>
 *     &lt;enumeration value="trafficBeingDirectedAroundAccidentArea"/>
 *     &lt;enumeration value="trafficWardensDirectingTraffic"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WarningAdviceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum WarningAdviceEnum {


    /**
     * Water lying on the road surface is producing aquaplaning conditions.
     * 
     */
    @XmlEnumValue("aquaplaningRisk")
    AQUAPLANING_RISK("aquaplaningRisk"),

    /**
     * Danger.
     * 
     */
    @XmlEnumValue("danger")
    DANGER("danger"),

    /**
     * Danger of explosion.
     * 
     */
    @XmlEnumValue("dangerOfExplosion")
    DANGER_OF_EXPLOSION("dangerOfExplosion"),

    /**
     * Danger of fire.
     * 
     */
    @XmlEnumValue("dangerOfFire")
    DANGER_OF_FIRE("dangerOfFire"),

    /**
     * Emergency vehicles are at the accident scene.
     * 
     */
    @XmlEnumValue("emergencyVehiclesAtScene")
    EMERGENCY_VEHICLES_AT_SCENE("emergencyVehiclesAtScene"),

    /**
     * Extra police patrols are in operation.
     * 
     */
    @XmlEnumValue("extraPolicePatrolsInOperation")
    EXTRA_POLICE_PATROLS_IN_OPERATION("extraPolicePatrolsInOperation"),

    /**
     * Firemen are directing traffic.
     * 
     */
    @XmlEnumValue("firemenDirectingTraffic")
    FIREMEN_DIRECTING_TRAFFIC("firemenDirectingTraffic"),

    /**
     * Helicopter rescue is in progress.
     * 
     */
    @XmlEnumValue("helicopterRescueInProgress")
    HELICOPTER_RESCUE_IN_PROGRESS("helicopterRescueInProgress"),

    /**
     * There is an increased risk of accidents.
     * 
     */
    @XmlEnumValue("increasedRiskOfAccident")
    INCREASED_RISK_OF_ACCIDENT("increasedRiskOfAccident"),

    /**
     * Look out for flagman who is controlling traffic.
     * 
     */
    @XmlEnumValue("lookOutForFlagman")
    LOOK_OUT_FOR_FLAGMAN("lookOutForFlagman"),

    /**
     * Pilot car is in operation.
     * 
     */
    @XmlEnumValue("pilotCarInOperation")
    PILOT_CAR_IN_OPERATION("pilotCarInOperation"),

    /**
     * Police are directing traffic.
     * 
     */
    @XmlEnumValue("policeDirectingTraffic")
    POLICE_DIRECTING_TRAFFIC("policeDirectingTraffic"),

    /**
     * Police are in attendance.
     * 
     */
    @XmlEnumValue("policeInAttendance")
    POLICE_IN_ATTENDANCE("policeInAttendance"),

    /**
     * There is a radiation hazard.
     * 
     */
    @XmlEnumValue("radiationHazard")
    RADIATION_HAZARD("radiationHazard"),

    /**
     * Repairs are in progress.
     * 
     */
    @XmlEnumValue("repairsInProgress")
    REPAIRS_IN_PROGRESS("repairsInProgress"),

    /**
     * Rescue and recovery work is in progress.
     * 
     */
    @XmlEnumValue("rescueAndRecoveryWorkInProgress")
    RESCUE_AND_RECOVERY_WORK_IN_PROGRESS("rescueAndRecoveryWorkInProgress"),

    /**
     * Several accidents have taken place.
     * 
     */
    @XmlEnumValue("severalAccidentsHaveTakenPlace")
    SEVERAL_ACCIDENTS_HAVE_TAKEN_PLACE("severalAccidentsHaveTakenPlace"),

    /**
     * Increased risk of skidding.
     * 
     */
    @XmlEnumValue("skidRisk")
    SKID_RISK("skidRisk"),

    /**
     * Increased risk of pedestrians slipping on the pavements.
     * 
     */
    @XmlEnumValue("slipperyPavements")
    SLIPPERY_PAVEMENTS("slipperyPavements"),

    /**
     * Water is resting on the roadway which provides an increased hazard to vehicles.
     * 
     */
    @XmlEnumValue("surfaceWaterHazard")
    SURFACE_WATER_HAZARD("surfaceWaterHazard"),

    /**
     * There is a toxic leak.
     * 
     */
    @XmlEnumValue("toxicLeak")
    TOXIC_LEAK("toxicLeak"),

    /**
     * Traffic is being directed around the accident area.
     * 
     */
    @XmlEnumValue("trafficBeingDirectedAroundAccidentArea")
    TRAFFIC_BEING_DIRECTED_AROUND_ACCIDENT_AREA("trafficBeingDirectedAroundAccidentArea"),

    /**
     * Traffic wardens are directing traffic.
     * 
     */
    @XmlEnumValue("trafficWardensDirectingTraffic")
    TRAFFIC_WARDENS_DIRECTING_TRAFFIC("trafficWardensDirectingTraffic"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WarningAdviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarningAdviceEnum fromValue(String v) {
        for (WarningAdviceEnum c: WarningAdviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
