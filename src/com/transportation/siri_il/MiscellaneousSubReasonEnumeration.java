
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscellaneousSubReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscellaneousSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="nearMiss"/>
 *     &lt;enumeration value="safetyViolation"/>
 *     &lt;enumeration value="signalPassedAtDanger"/>
 *     &lt;enumeration value="stationOverrun"/>
 *     &lt;enumeration value="trainDoor"/>
 *     &lt;enumeration value="emergencyServicesCall"/>
 *     &lt;enumeration value="policeRequest"/>
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/>
 *     &lt;enumeration value="unattendedBag"/>
 *     &lt;enumeration value="telephonedThreat"/>
 *     &lt;enumeration value="suspectVehicle"/>
 *     &lt;enumeration value="vandalism"/>
 *     &lt;enumeration value="passengerAction"/>
 *     &lt;enumeration value="staffAssault"/>
 *     &lt;enumeration value="railwayCrime"/>
 *     &lt;enumeration value="altercation"/>
 *     &lt;enumeration value="theft"/>
 *     &lt;enumeration value="fatality"/>
 *     &lt;enumeration value="illVehicleOccupants"/>
 *     &lt;enumeration value="personUnderTrain"/>
 *     &lt;enumeration value="personHitByTrain"/>
 *     &lt;enumeration value="personIllOnVehicle"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="linesideFire"/>
 *     &lt;enumeration value="levelCrossingIncident"/>
 *     &lt;enumeration value="fallenTreeOnTheLine"/>
 *     &lt;enumeration value="vegetation"/>
 *     &lt;enumeration value="trainStruckAnimal"/>
 *     &lt;enumeration value="trainStruckObject"/>
 *     &lt;enumeration value="animalOnTheLine"/>
 *     &lt;enumeration value="routeDiversion"/>
 *     &lt;enumeration value="roadClosed"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="specialEvent"/>
 *     &lt;enumeration value="bridgeStrike"/>
 *     &lt;enumeration value="overheadObstruction"/>
 *     &lt;enumeration value="undefinedProblem"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="procession"/>
 *     &lt;enumeration value="demonstration"/>
 *     &lt;enumeration value="publicDisturbance"/>
 *     &lt;enumeration value="filterBlockade"/>
 *     &lt;enumeration value="sightseersObstructingAccess"/>
 *     &lt;enumeration value="problemsAtBorderPost"/>
 *     &lt;enumeration value="problemsAtCustomePost"/>
 *     &lt;enumeration value="problemsOnLocalRoad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiscellaneousSubReasonEnumeration")
@XmlEnum
public enum MiscellaneousSubReasonEnumeration {


    /**
     * Near Miss - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),

    /**
     * Near Miss - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),

    /**
     * Signal passed at danger - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),

    /**
     * Station overrun - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),

    /**
     * trainDoor- alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),

    /**
     * Unspecified emergency service visit. Alias to pti19
     * 
     */
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),

    /**
     * request of the police Alias to TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("policeRequest")
    POLICE_REQUEST("policeRequest"),

    /**
     * fire brigade safety checksAlias to TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),

    /**
     * an unattended bag TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),

    /**
     * telephoned threat TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),

    /**
     * telephoned threat TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),

    /**
     * TPEG Pti_19_5   vandalism
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),

    /**
     * passengerActionAlias to pti19
     * 
     */
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),

    /**
     * Assault on stafft.Alias to pti19
     * 
     */
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),

    /**
     * Railway Crime Alias to pti19
     * 
     */
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),
    @XmlEnumValue("altercation")
    ALTERCATION("altercation"),
    @XmlEnumValue("theft")
    THEFT("theft"),

    /**
     * fatality alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("fatality")
    FATALITY("fatality"),
    @XmlEnumValue("illVehicleOccupants")
    ILL_VEHICLE_OCCUPANTS("illVehicleOccupants"),

    /**
     * a person under a train  - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),

    /**
     * a person hit by  a train  - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),

    /**
     * person ill On Vehicle -Alias to pti19_6
     * 
     */
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),

    /**
     * emergencyServices - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * Collision - Alias to pti19_6
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),

    /**
     * Level Crossing Incident - alias to TPEG Pti_19_18  vehicle on the line
     * 
     */
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),

    /**
     * fallen tree on line- alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),

    /**
     * vegetation -  alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),

    /**
     * Train struck animal   alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),

    /**
     * Train struck object   alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),

    /**
     * TPEG Pti_19_20  animal on the line
     * 
     */
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),

    /**
     * TPEG Pti_19_21  route diversion
     * 
     */
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),

    /**
     * TPEG Pti_19_22  road closed
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),

    /**
     * TPEG Pti_19_23  roadworks
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * TPEG Pti_19_24  special event
     * 
     */
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),

    /**
     * TPEG Pti_19_25  bridge strike
     * 
     */
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),

    /**
     * TPEG Pti_19_26  overhead obstruction
     * 
     */
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),

    /**
     * TPEG Pti_19_255 undefined problem
     * 
     */
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue("problemsAtCustomePost")
    PROBLEMS_AT_CUSTOME_POST("problemsAtCustomePost"),
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad");
    private final String value;

    MiscellaneousSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscellaneousSubReasonEnumeration fromValue(String v) {
        for (MiscellaneousSubReasonEnumeration c: MiscellaneousSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
