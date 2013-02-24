
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MiscellaneousReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MiscellaneousReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti19_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti19_1"/>
 *     &lt;enumeration value="incident"/>
 *     &lt;enumeration value="pti19_1_Alias_1"/>
 *     &lt;enumeration value="nearMiss"/>
 *     &lt;enumeration value="pti19_1_Alias_2"/>
 *     &lt;enumeration value="safetyViolation"/>
 *     &lt;enumeration value="pti19_1_Alias_3"/>
 *     &lt;enumeration value="signalPassedAtDanger"/>
 *     &lt;enumeration value="pti19_1_Alias_4"/>
 *     &lt;enumeration value="stationOverrun"/>
 *     &lt;enumeration value="pti19_1_Alias_5"/>
 *     &lt;enumeration value="trainDoor"/>
 *     &lt;enumeration value="pti19_1_Alias_6"/>
 *     &lt;enumeration value="emergencyServicesCall"/>
 *     &lt;enumeration value="pti19_2"/>
 *     &lt;enumeration value="bombExplosion"/>
 *     &lt;enumeration value="pti19_3"/>
 *     &lt;enumeration value="securityAlert"/>
 *     &lt;enumeration value="pti19_3_Alias_1"/>
 *     &lt;enumeration value="policeRequest"/>
 *     &lt;enumeration value="pti19_3_Alias_2"/>
 *     &lt;enumeration value="fireBrigadeSafetyChecks"/>
 *     &lt;enumeration value="pti19_3_Alias_3"/>
 *     &lt;enumeration value="unattendedBag"/>
 *     &lt;enumeration value="pti19_3_Alias_4"/>
 *     &lt;enumeration value="telephonedThreat"/>
 *     &lt;enumeration value="pti19_3_Alias_5"/>
 *     &lt;enumeration value="suspectVehicle"/>
 *     &lt;enumeration value="pti19_3_Alias_6"/>
 *     &lt;enumeration value="civilEmergency"/>
 *     &lt;enumeration value="pti19_3_Alias_7"/>
 *     &lt;enumeration value="airRaid"/>
 *     &lt;enumeration value="pti19_3_Alias_8"/>
 *     &lt;enumeration value="sabotage"/>
 *     &lt;enumeration value="pti19_3_Alias_9"/>
 *     &lt;enumeration value="bombAlert"/>
 *     &lt;enumeration value="pti19_3_Alias_10"/>
 *     &lt;enumeration value="attach"/>
 *     &lt;enumeration value="pti19_3_Alias_11"/>
 *     &lt;enumeration value="evacuation"/>
 *     &lt;enumeration value="pti19_3_Alias_12"/>
 *     &lt;enumeration value="terroristIncident"/>
 *     &lt;enumeration value="pti19_3_Alias_13"/>
 *     &lt;enumeration value="gunfireOnRoadway"/>
 *     &lt;enumeration value="pti19_3_Alias_14"/>
 *     &lt;enumeration value="explosion"/>
 *     &lt;enumeration value="pti19_3_Alias_15"/>
 *     &lt;enumeration value="explosionHazard"/>
 *     &lt;enumeration value="pti19_3_Alias_16"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="pti19_4"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="pti19_4_Alias_1"/>
 *     &lt;enumeration value="linesideFire"/>
 *     &lt;enumeration value="pti19_5"/>
 *     &lt;enumeration value="vandalism"/>
 *     &lt;enumeration value="pti19_5_Alias_1"/>
 *     &lt;enumeration value="passengerAction"/>
 *     &lt;enumeration value="pti19_5_Alias_2"/>
 *     &lt;enumeration value="staffAssault"/>
 *     &lt;enumeration value="pti19_5_Alias_3"/>
 *     &lt;enumeration value="railwayCrime"/>
 *     &lt;enumeration value="pti19_6"/>
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="pti19_6_Alias_1"/>
 *     &lt;enumeration value="fatality"/>
 *     &lt;enumeration value="pti19_6_Alias_2"/>
 *     &lt;enumeration value="personUnderTrain"/>
 *     &lt;enumeration value="pti19_6_Alias_3"/>
 *     &lt;enumeration value="personHitByTrain"/>
 *     &lt;enumeration value="pti19_6_Alias_4"/>
 *     &lt;enumeration value="personIllOnVehicle"/>
 *     &lt;enumeration value="pti19_6_Alias_5"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="pti19_6_Alias_6"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="pti19_7"/>
 *     &lt;enumeration value="overcrowded"/>
 *     &lt;enumeration value="pti19_8"/>
 *     &lt;enumeration value="insufficientDemand"/>
 *     &lt;enumeration value="pti19_9"/>
 *     &lt;enumeration value="lightingFailure"/>
 *     &lt;enumeration value="pti19_10"/>
 *     &lt;enumeration value="leaderBoardFailure"/>
 *     &lt;enumeration value="pti19_11"/>
 *     &lt;enumeration value="serviceIndicatorFailure"/>
 *     &lt;enumeration value="pti19_12"/>
 *     &lt;enumeration value="serviceFailure"/>
 *     &lt;enumeration value="pti19_13"/>
 *     &lt;enumeration value="operatorCeasedTrading"/>
 *     &lt;enumeration value="pti19_14"/>
 *     &lt;enumeration value="operatorSuspended"/>
 *     &lt;enumeration value="pti19_15"/>
 *     &lt;enumeration value="congestion"/>
 *     &lt;enumeration value="pti19_16"/>
 *     &lt;enumeration value="routeBlockage"/>
 *     &lt;enumeration value="pti19_17"/>
 *     &lt;enumeration value="personOnTheLine"/>
 *     &lt;enumeration value="pti19_18"/>
 *     &lt;enumeration value="vehicleOnTheLine"/>
 *     &lt;enumeration value="pti19_18_Alias_1"/>
 *     &lt;enumeration value="levelCrossingIncident"/>
 *     &lt;enumeration value="pti19_19"/>
 *     &lt;enumeration value="objectOnTheLine"/>
 *     &lt;enumeration value="pti19_19_Alias_1"/>
 *     &lt;enumeration value="fallenTreeOnTheLine"/>
 *     &lt;enumeration value="pti19_19_Alias_2"/>
 *     &lt;enumeration value="vegetation"/>
 *     &lt;enumeration value="pti19_19_Alias_3"/>
 *     &lt;enumeration value="trainStruckAnimal"/>
 *     &lt;enumeration value="pti19_19_Alias_4"/>
 *     &lt;enumeration value="trainStruckObject"/>
 *     &lt;enumeration value="pti19_20"/>
 *     &lt;enumeration value="animalOnTheLine"/>
 *     &lt;enumeration value="pti19_21"/>
 *     &lt;enumeration value="routeDiversion"/>
 *     &lt;enumeration value="pti19_22"/>
 *     &lt;enumeration value="roadClosed"/>
 *     &lt;enumeration value="pti19_23"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="pti19_24"/>
 *     &lt;enumeration value="specialEvent"/>
 *     &lt;enumeration value="pti19_24_Alias_1"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="pti19_24_Alias_2"/>
 *     &lt;enumeration value="procession"/>
 *     &lt;enumeration value="pti19_24_Alias_3"/>
 *     &lt;enumeration value="demonstration"/>
 *     &lt;enumeration value="pti19_24_Alias_4"/>
 *     &lt;enumeration value="publicDisturbance"/>
 *     &lt;enumeration value="pti19_24_Alias_5"/>
 *     &lt;enumeration value="filterBlockade"/>
 *     &lt;enumeration value="pti19_24_Alias_6"/>
 *     &lt;enumeration value="sightseersObstructingAccess"/>
 *     &lt;enumeration value="pti19_25"/>
 *     &lt;enumeration value="bridgeStrike"/>
 *     &lt;enumeration value="pti19_26"/>
 *     &lt;enumeration value="overheadObstruction"/>
 *     &lt;enumeration value="pti19_27"/>
 *     &lt;enumeration value="undefinedProblem"/>
 *     &lt;enumeration value=" pti19_255_Alias_1"/>
 *     &lt;enumeration value="problemsAtBorderPost"/>
 *     &lt;enumeration value=" pti19_255_Alias_2"/>
 *     &lt;enumeration value="problemsAtCustomsPost"/>
 *     &lt;enumeration value=" pti19_255_Alias_3"/>
 *     &lt;enumeration value="problemsOnLocalRoad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MiscellaneousReasonEnumeration")
@XmlEnum
public enum MiscellaneousReasonEnumeration {

    @XmlEnumValue("pti19_0")
    PTI_19_0("pti19_0"),

    /**
     * TPEG Pti_19_0   unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti19_1")
    PTI_19_1("pti19_1"),

    /**
     * TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("incident")
    INCIDENT("incident"),
    @XmlEnumValue("pti19_1_Alias_1")
    PTI_19_1_ALIAS_1("pti19_1_Alias_1"),

    /**
     * Near Miss - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("nearMiss")
    NEAR_MISS("nearMiss"),
    @XmlEnumValue("pti19_1_Alias_2")
    PTI_19_1_ALIAS_2("pti19_1_Alias_2"),

    /**
     * Near Miss - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("safetyViolation")
    SAFETY_VIOLATION("safetyViolation"),
    @XmlEnumValue("pti19_1_Alias_3")
    PTI_19_1_ALIAS_3("pti19_1_Alias_3"),

    /**
     * Signal passed at danger - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("signalPassedAtDanger")
    SIGNAL_PASSED_AT_DANGER("signalPassedAtDanger"),
    @XmlEnumValue("pti19_1_Alias_4")
    PTI_19_1_ALIAS_4("pti19_1_Alias_4"),

    /**
     * Station overrun - alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("stationOverrun")
    STATION_OVERRUN("stationOverrun"),
    @XmlEnumValue("pti19_1_Alias_5")
    PTI_19_1_ALIAS_5("pti19_1_Alias_5"),

    /**
     * trainDoor- alias to TPEG Pti_19_1   incident
     * 
     */
    @XmlEnumValue("trainDoor")
    TRAIN_DOOR("trainDoor"),
    @XmlEnumValue("pti19_1_Alias_6")
    PTI_19_1_ALIAS_6("pti19_1_Alias_6"),

    /**
     * Unspecified emergency service visit. Alias to pti19
     * 
     */
    @XmlEnumValue("emergencyServicesCall")
    EMERGENCY_SERVICES_CALL("emergencyServicesCall"),
    @XmlEnumValue("pti19_2")
    PTI_19_2("pti19_2"),

    /**
     * TPEG Pti_19_2   bomb explosion
     * 
     */
    @XmlEnumValue("bombExplosion")
    BOMB_EXPLOSION("bombExplosion"),
    @XmlEnumValue("pti19_3")
    PTI_19_3("pti19_3"),

    /**
     * TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("securityAlert")
    SECURITY_ALERT("securityAlert"),
    @XmlEnumValue("pti19_3_Alias_1")
    PTI_19_3_ALIAS_1("pti19_3_Alias_1"),

    /**
     * request of the police Alias to TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("policeRequest")
    POLICE_REQUEST("policeRequest"),
    @XmlEnumValue("pti19_3_Alias_2")
    PTI_19_3_ALIAS_2("pti19_3_Alias_2"),

    /**
     * fire brigade safety checksAlias to TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("fireBrigadeSafetyChecks")
    FIRE_BRIGADE_SAFETY_CHECKS("fireBrigadeSafetyChecks"),
    @XmlEnumValue("pti19_3_Alias_3")
    PTI_19_3_ALIAS_3("pti19_3_Alias_3"),

    /**
     * an unattended bag TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("unattendedBag")
    UNATTENDED_BAG("unattendedBag"),
    @XmlEnumValue("pti19_3_Alias_4")
    PTI_19_3_ALIAS_4("pti19_3_Alias_4"),

    /**
     * telephoned threat TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("telephonedThreat")
    TELEPHONED_THREAT("telephonedThreat"),
    @XmlEnumValue("pti19_3_Alias_5")
    PTI_19_3_ALIAS_5("pti19_3_Alias_5"),

    /**
     * telephoned threat TPEG Pti_19_3   security alert
     * 
     */
    @XmlEnumValue("suspectVehicle")
    SUSPECT_VEHICLE("suspectVehicle"),
    @XmlEnumValue("pti19_3_Alias_6")
    PTI_19_3_ALIAS_6("pti19_3_Alias_6"),
    @XmlEnumValue("civilEmergency")
    CIVIL_EMERGENCY("civilEmergency"),
    @XmlEnumValue("pti19_3_Alias_7")
    PTI_19_3_ALIAS_7("pti19_3_Alias_7"),
    @XmlEnumValue("airRaid")
    AIR_RAID("airRaid"),
    @XmlEnumValue("pti19_3_Alias_8")
    PTI_19_3_ALIAS_8("pti19_3_Alias_8"),
    @XmlEnumValue("sabotage")
    SABOTAGE("sabotage"),
    @XmlEnumValue("pti19_3_Alias_9")
    PTI_19_3_ALIAS_9("pti19_3_Alias_9"),
    @XmlEnumValue("bombAlert")
    BOMB_ALERT("bombAlert"),
    @XmlEnumValue("pti19_3_Alias_10")
    PTI_19_3_ALIAS_10("pti19_3_Alias_10"),
    @XmlEnumValue("attach")
    ATTACH("attach"),
    @XmlEnumValue("pti19_3_Alias_11")
    PTI_19_3_ALIAS_11("pti19_3_Alias_11"),
    @XmlEnumValue("evacuation")
    EVACUATION("evacuation"),
    @XmlEnumValue("pti19_3_Alias_12")
    PTI_19_3_ALIAS_12("pti19_3_Alias_12"),
    @XmlEnumValue("terroristIncident")
    TERRORIST_INCIDENT("terroristIncident"),
    @XmlEnumValue("pti19_3_Alias_13")
    PTI_19_3_ALIAS_13("pti19_3_Alias_13"),
    @XmlEnumValue("gunfireOnRoadway")
    GUNFIRE_ON_ROADWAY("gunfireOnRoadway"),
    @XmlEnumValue("pti19_3_Alias_14")
    PTI_19_3_ALIAS_14("pti19_3_Alias_14"),
    @XmlEnumValue("explosion")
    EXPLOSION("explosion"),
    @XmlEnumValue("pti19_3_Alias_15")
    PTI_19_3_ALIAS_15("pti19_3_Alias_15"),
    @XmlEnumValue("explosionHazard")
    EXPLOSION_HAZARD("explosionHazard"),
    @XmlEnumValue("pti19_3_Alias_16")
    PTI_19_3_ALIAS_16("pti19_3_Alias_16"),
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),
    @XmlEnumValue("pti19_4")
    PTI_19_4("pti19_4"),

    /**
     * TPEG Pti_19_4   fire
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),
    @XmlEnumValue("pti19_4_Alias_1")
    PTI_19_4_ALIAS_1("pti19_4_Alias_1"),

    /**
     * linesideFire alias to TPEG Pti_19_4   fire
     * 
     */
    @XmlEnumValue("linesideFire")
    LINESIDE_FIRE("linesideFire"),
    @XmlEnumValue("pti19_5")
    PTI_19_5("pti19_5"),

    /**
     * TPEG Pti_19_5   vandalism
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism"),
    @XmlEnumValue("pti19_5_Alias_1")
    PTI_19_5_ALIAS_1("pti19_5_Alias_1"),

    /**
     * passengerActionAlias to pti19
     * 
     */
    @XmlEnumValue("passengerAction")
    PASSENGER_ACTION("passengerAction"),
    @XmlEnumValue("pti19_5_Alias_2")
    PTI_19_5_ALIAS_2("pti19_5_Alias_2"),

    /**
     * Assault on stafft.Alias to pti19
     * 
     */
    @XmlEnumValue("staffAssault")
    STAFF_ASSAULT("staffAssault"),
    @XmlEnumValue("pti19_5_Alias_3")
    PTI_19_5_ALIAS_3("pti19_5_Alias_3"),

    /**
     * Railway Crime Alias to pti19
     * 
     */
    @XmlEnumValue("railwayCrime")
    RAILWAY_CRIME("railwayCrime"),
    @XmlEnumValue("pti19_6")
    PTI_19_6("pti19_6"),

    /**
     * TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),
    @XmlEnumValue("pti19_6_Alias_1")
    PTI_19_6_ALIAS_1("pti19_6_Alias_1"),

    /**
     * fatality alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("fatality")
    FATALITY("fatality"),
    @XmlEnumValue("pti19_6_Alias_2")
    PTI_19_6_ALIAS_2("pti19_6_Alias_2"),

    /**
     * a person under a train  - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("personUnderTrain")
    PERSON_UNDER_TRAIN("personUnderTrain"),
    @XmlEnumValue("pti19_6_Alias_3")
    PTI_19_6_ALIAS_3("pti19_6_Alias_3"),

    /**
     * a person hit by  a train  - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("personHitByTrain")
    PERSON_HIT_BY_TRAIN("personHitByTrain"),
    @XmlEnumValue("pti19_6_Alias_4")
    PTI_19_6_ALIAS_4("pti19_6_Alias_4"),

    /**
     * person ill On Vehicle -Alias to pti19_6
     * 
     */
    @XmlEnumValue("personIllOnVehicle")
    PERSON_ILL_ON_VEHICLE("personIllOnVehicle"),
    @XmlEnumValue("pti19_6_Alias_5")
    PTI_19_6_ALIAS_5("pti19_6_Alias_5"),

    /**
     * emergencyServices - alias to TPEG Pti_19_6   accident
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("pti19_6_Alias_6")
    PTI_19_6_ALIAS_6("pti19_6_Alias_6"),

    /**
     * Collision - Alias to pti19_6
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),
    @XmlEnumValue("pti19_7")
    PTI_19_7("pti19_7"),

    /**
     * TPEG Pti_19_7   overcrowded
     * 
     */
    @XmlEnumValue("overcrowded")
    OVERCROWDED("overcrowded"),
    @XmlEnumValue("pti19_8")
    PTI_19_8("pti19_8"),

    /**
     * TPEG Pti_19_8   insufficient demand
     * 
     */
    @XmlEnumValue("insufficientDemand")
    INSUFFICIENT_DEMAND("insufficientDemand"),
    @XmlEnumValue("pti19_9")
    PTI_19_9("pti19_9"),

    /**
     * TPEG Pti_19_9   lighting failure
     * 
     */
    @XmlEnumValue("lightingFailure")
    LIGHTING_FAILURE("lightingFailure"),
    @XmlEnumValue("pti19_10")
    PTI_19_10("pti19_10"),

    /**
     * TPEG Pti_19_10  leader board failure
     * 
     */
    @XmlEnumValue("leaderBoardFailure")
    LEADER_BOARD_FAILURE("leaderBoardFailure"),
    @XmlEnumValue("pti19_11")
    PTI_19_11("pti19_11"),

    /**
     * TPEG Pti_19_11  service indicator failure
     * 
     */
    @XmlEnumValue("serviceIndicatorFailure")
    SERVICE_INDICATOR_FAILURE("serviceIndicatorFailure"),
    @XmlEnumValue("pti19_12")
    PTI_19_12("pti19_12"),

    /**
     * TPEG Pti_19_12  service failure
     * 
     */
    @XmlEnumValue("serviceFailure")
    SERVICE_FAILURE("serviceFailure"),
    @XmlEnumValue("pti19_13")
    PTI_19_13("pti19_13"),

    /**
     * TPEG Pti_19_13  operator ceased trading
     * 
     */
    @XmlEnumValue("operatorCeasedTrading")
    OPERATOR_CEASED_TRADING("operatorCeasedTrading"),
    @XmlEnumValue("pti19_14")
    PTI_19_14("pti19_14"),

    /**
     * TPEG Pti_19_14  operator suspended
     * 
     */
    @XmlEnumValue("operatorSuspended")
    OPERATOR_SUSPENDED("operatorSuspended"),
    @XmlEnumValue("pti19_15")
    PTI_19_15("pti19_15"),

    /**
     * TPEG Pti_19_15  congestion
     * 
     */
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),
    @XmlEnumValue("pti19_16")
    PTI_19_16("pti19_16"),

    /**
     * TPEG Pti_19_16  route blockage
     * 
     */
    @XmlEnumValue("routeBlockage")
    ROUTE_BLOCKAGE("routeBlockage"),
    @XmlEnumValue("pti19_17")
    PTI_19_17("pti19_17"),

    /**
     * TPEG Pti_19_17  person on the line
     * 
     */
    @XmlEnumValue("personOnTheLine")
    PERSON_ON_THE_LINE("personOnTheLine"),
    @XmlEnumValue("pti19_18")
    PTI_19_18("pti19_18"),

    /**
     * TPEG Pti_19_18  vehicle on the line
     * 
     */
    @XmlEnumValue("vehicleOnTheLine")
    VEHICLE_ON_THE_LINE("vehicleOnTheLine"),
    @XmlEnumValue("pti19_18_Alias_1")
    PTI_19_18_ALIAS_1("pti19_18_Alias_1"),

    /**
     * Level Crossing Incident - alias to TPEG Pti_19_18  vehicle on the line
     * 
     */
    @XmlEnumValue("levelCrossingIncident")
    LEVEL_CROSSING_INCIDENT("levelCrossingIncident"),
    @XmlEnumValue("pti19_19")
    PTI_19_19("pti19_19"),

    /**
     * TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("objectOnTheLine")
    OBJECT_ON_THE_LINE("objectOnTheLine"),
    @XmlEnumValue("pti19_19_Alias_1")
    PTI_19_19_ALIAS_1("pti19_19_Alias_1"),

    /**
     * fallen tree on line- alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("fallenTreeOnTheLine")
    FALLEN_TREE_ON_THE_LINE("fallenTreeOnTheLine"),
    @XmlEnumValue("pti19_19_Alias_2")
    PTI_19_19_ALIAS_2("pti19_19_Alias_2"),

    /**
     * vegetation -  alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("vegetation")
    VEGETATION("vegetation"),
    @XmlEnumValue("pti19_19_Alias_3")
    PTI_19_19_ALIAS_3("pti19_19_Alias_3"),

    /**
     * Train struck animal   alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("trainStruckAnimal")
    TRAIN_STRUCK_ANIMAL("trainStruckAnimal"),
    @XmlEnumValue("pti19_19_Alias_4")
    PTI_19_19_ALIAS_4("pti19_19_Alias_4"),

    /**
     * Train struck object   alias to TPEG Pti_19_19  object on the line
     * 
     */
    @XmlEnumValue("trainStruckObject")
    TRAIN_STRUCK_OBJECT("trainStruckObject"),
    @XmlEnumValue("pti19_20")
    PTI_19_20("pti19_20"),

    /**
     * TPEG Pti_19_20  animal on the line
     * 
     */
    @XmlEnumValue("animalOnTheLine")
    ANIMAL_ON_THE_LINE("animalOnTheLine"),
    @XmlEnumValue("pti19_21")
    PTI_19_21("pti19_21"),

    /**
     * TPEG Pti_19_21  route diversion
     * 
     */
    @XmlEnumValue("routeDiversion")
    ROUTE_DIVERSION("routeDiversion"),
    @XmlEnumValue("pti19_22")
    PTI_19_22("pti19_22"),

    /**
     * TPEG Pti_19_22  road closed
     * 
     */
    @XmlEnumValue("roadClosed")
    ROAD_CLOSED("roadClosed"),
    @XmlEnumValue("pti19_23")
    PTI_19_23("pti19_23"),

    /**
     * TPEG Pti_19_23  roadworks
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("pti19_24")
    PTI_19_24("pti19_24"),

    /**
     * TPEG Pti_19_24  special event
     * 
     */
    @XmlEnumValue("specialEvent")
    SPECIAL_EVENT("specialEvent"),
    @XmlEnumValue("pti19_24_Alias_1")
    PTI_19_24_ALIAS_1("pti19_24_Alias_1"),
    @XmlEnumValue("march")
    MARCH("march"),
    @XmlEnumValue("pti19_24_Alias_2")
    PTI_19_24_ALIAS_2("pti19_24_Alias_2"),
    @XmlEnumValue("procession")
    PROCESSION("procession"),
    @XmlEnumValue("pti19_24_Alias_3")
    PTI_19_24_ALIAS_3("pti19_24_Alias_3"),
    @XmlEnumValue("demonstration")
    DEMONSTRATION("demonstration"),
    @XmlEnumValue("pti19_24_Alias_4")
    PTI_19_24_ALIAS_4("pti19_24_Alias_4"),
    @XmlEnumValue("publicDisturbance")
    PUBLIC_DISTURBANCE("publicDisturbance"),
    @XmlEnumValue("pti19_24_Alias_5")
    PTI_19_24_ALIAS_5("pti19_24_Alias_5"),
    @XmlEnumValue("filterBlockade")
    FILTER_BLOCKADE("filterBlockade"),
    @XmlEnumValue("pti19_24_Alias_6")
    PTI_19_24_ALIAS_6("pti19_24_Alias_6"),
    @XmlEnumValue("sightseersObstructingAccess")
    SIGHTSEERS_OBSTRUCTING_ACCESS("sightseersObstructingAccess"),
    @XmlEnumValue("pti19_25")
    PTI_19_25("pti19_25"),

    /**
     * TPEG Pti_19_25  bridge strike
     * 
     */
    @XmlEnumValue("bridgeStrike")
    BRIDGE_STRIKE("bridgeStrike"),
    @XmlEnumValue("pti19_26")
    PTI_19_26("pti19_26"),

    /**
     * TPEG Pti_19_26  overhead obstruction
     * 
     */
    @XmlEnumValue("overheadObstruction")
    OVERHEAD_OBSTRUCTION("overheadObstruction"),
    @XmlEnumValue("pti19_27")
    PTI_19_27("pti19_27"),

    /**
     * TPEG Pti_19_255 undefined problem
     * 
     */
    @XmlEnumValue("undefinedProblem")
    UNDEFINED_PROBLEM("undefinedProblem"),
    @XmlEnumValue(" pti19_255_Alias_1")
    PTI_19_255_ALIAS_1(" pti19_255_Alias_1"),
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),
    @XmlEnumValue(" pti19_255_Alias_2")
    PTI_19_255_ALIAS_2(" pti19_255_Alias_2"),
    @XmlEnumValue("problemsAtCustomsPost")
    PROBLEMS_AT_CUSTOMS_POST("problemsAtCustomsPost"),
    @XmlEnumValue(" pti19_255_Alias_3")
    PTI_19_255_ALIAS_3(" pti19_255_Alias_3"),
    @XmlEnumValue("problemsOnLocalRoad")
    PROBLEMS_ON_LOCAL_ROAD("problemsOnLocalRoad");
    private final String value;

    MiscellaneousReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MiscellaneousReasonEnumeration fromValue(String v) {
        for (MiscellaneousReasonEnumeration c: MiscellaneousReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}