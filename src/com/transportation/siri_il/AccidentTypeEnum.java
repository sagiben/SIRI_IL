
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccidentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccidentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="accidentInvestigationWork"/>
 *     &lt;enumeration value="accidentInvolvingBicycles"/>
 *     &lt;enumeration value="accidentInvolvingBuses"/>
 *     &lt;enumeration value="accidentInvolvingHazardousMaterials"/>
 *     &lt;enumeration value="accidentInvolvingHeavyLorries"/>
 *     &lt;enumeration value="accidentInvolvingMopeds"/>
 *     &lt;enumeration value="accidentInvolvingMotorcycles"/>
 *     &lt;enumeration value="accidentInvolvingTrain"/>
 *     &lt;enumeration value="chemicalSpillageAccident"/>
 *     &lt;enumeration value="collision"/>
 *     &lt;enumeration value="collisionWithAnimal"/>
 *     &lt;enumeration value="collisionWithObstruction"/>
 *     &lt;enumeration value="collisionWithPerson"/>
 *     &lt;enumeration value="earlierAccident"/>
 *     &lt;enumeration value="fuelSpillageAccident"/>
 *     &lt;enumeration value="headOnCollision"/>
 *     &lt;enumeration value="headOnOrSideCollision"/>
 *     &lt;enumeration value="jackknifedArticulatedLorry"/>
 *     &lt;enumeration value="jackknifedCaravan"/>
 *     &lt;enumeration value="jackknifedTrailer"/>
 *     &lt;enumeration value="multipleVehicleCollision"/>
 *     &lt;enumeration value="multivehicleAccident"/>
 *     &lt;enumeration value="oilSpillageAccident"/>
 *     &lt;enumeration value="overturnedHeavyLorry"/>
 *     &lt;enumeration value="overturnedTrailer"/>
 *     &lt;enumeration value="overturnedVehicle"/>
 *     &lt;enumeration value="rearCollision"/>
 *     &lt;enumeration value="secondaryAccident"/>
 *     &lt;enumeration value="seriousAccident"/>
 *     &lt;enumeration value="sideCollision"/>
 *     &lt;enumeration value="vehicleOffRoad"/>
 *     &lt;enumeration value="vehicleSpunAround"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccidentTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum AccidentTypeEnum {


    /**
     * Accidents are situations in which one or more vehicles lose control and do not recover.  They include collisions between vehicle(s) or other road user(s), between vehicle(s) and fixed obstacle(s), or they result from a vehicle running off the road.
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * Authorised investigation work connected to an earlier reported accident that may disrupt traffic.
     * 
     */
    @XmlEnumValue("accidentInvestigationWork")
    ACCIDENT_INVESTIGATION_WORK("accidentInvestigationWork"),

    /**
     * Includes all accidents involving at least one bicycle.
     * 
     */
    @XmlEnumValue("accidentInvolvingBicycles")
    ACCIDENT_INVOLVING_BICYCLES("accidentInvolvingBicycles"),

    /**
     * Includes all accidents involving at least one passenger vehicle.
     * 
     */
    @XmlEnumValue("accidentInvolvingBuses")
    ACCIDENT_INVOLVING_BUSES("accidentInvolvingBuses"),

    /**
     * Includes all accidents involving at least one vehicle believed to be carrying materials, which could present an additional hazard to road users.
     * 
     */
    @XmlEnumValue("accidentInvolvingHazardousMaterials")
    ACCIDENT_INVOLVING_HAZARDOUS_MATERIALS("accidentInvolvingHazardousMaterials"),

    /**
     * Includes all accidents involving at least one heavy goods vehicle.
     * 
     */
    @XmlEnumValue("accidentInvolvingHeavyLorries")
    ACCIDENT_INVOLVING_HEAVY_LORRIES("accidentInvolvingHeavyLorries"),

    /**
     * Includes all accidents involving at least one moped.
     * 
     */
    @XmlEnumValue("accidentInvolvingMopeds")
    ACCIDENT_INVOLVING_MOPEDS("accidentInvolvingMopeds"),

    /**
     * Includes all accidents involving at least one motorcycle.
     * 
     */
    @XmlEnumValue("accidentInvolvingMotorcycles")
    ACCIDENT_INVOLVING_MOTORCYCLES("accidentInvolvingMotorcycles"),

    /**
     * Includes all accidents involving collision with a train.
     * 
     */
    @XmlEnumValue("accidentInvolvingTrain")
    ACCIDENT_INVOLVING_TRAIN("accidentInvolvingTrain"),

    /**
     * Includes all situations resulting in a spillage of chemicals on the carriageway.
     * 
     */
    @XmlEnumValue("chemicalSpillageAccident")
    CHEMICAL_SPILLAGE_ACCIDENT("chemicalSpillageAccident"),

    /**
     * Collision of vehicle with another object of unspecified type.
     * 
     */
    @XmlEnumValue("collision")
    COLLISION("collision"),

    /**
     * Collision of vehicle with one or more animals.
     * 
     */
    @XmlEnumValue("collisionWithAnimal")
    COLLISION_WITH_ANIMAL("collisionWithAnimal"),

    /**
     * Collision of vehicle with an object of a stationary nature.
     * 
     */
    @XmlEnumValue("collisionWithObstruction")
    COLLISION_WITH_OBSTRUCTION("collisionWithObstruction"),

    /**
     * Collision of vehicle with one or more pedestrians.
     * 
     */
    @XmlEnumValue("collisionWithPerson")
    COLLISION_WITH_PERSON("collisionWithPerson"),

    /**
     * An earlier reported accident that is causing disruption to traffic or is resulting in further accidents.
     * 
     */
    @XmlEnumValue("earlierAccident")
    EARLIER_ACCIDENT("earlierAccident"),

    /**
     * Includes all situations resulting in a spillage of fuel on the carriageway.
     * 
     */
    @XmlEnumValue("fuelSpillageAccident")
    FUEL_SPILLAGE_ACCIDENT("fuelSpillageAccident"),

    /**
     * Collision of vehicle with another vehicle head on.
     * 
     */
    @XmlEnumValue("headOnCollision")
    HEAD_ON_COLLISION("headOnCollision"),

    /**
     * Collision of vehicle with another vehicle either head on or sideways.
     * 
     */
    @XmlEnumValue("headOnOrSideCollision")
    HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),

    /**
     * Includes all situations resulting in a heavy goods vehicle folding together in an accidental skidding movement on the carriageway.
     * 
     */
    @XmlEnumValue("jackknifedArticulatedLorry")
    JACKKNIFED_ARTICULATED_LORRY("jackknifedArticulatedLorry"),

    /**
     * Includes all situations resulting in a vehicle and caravan folding together in an accidental skidding movement on the carriageway.
     * 
     */
    @XmlEnumValue("jackknifedCaravan")
    JACKKNIFED_CARAVAN("jackknifedCaravan"),

    /**
     * Includes all situations resulting in a vehicle and trailer folding together in an accidental skidding movement on the carriageway.
     * 
     */
    @XmlEnumValue("jackknifedTrailer")
    JACKKNIFED_TRAILER("jackknifedTrailer"),

    /**
     * Multiple vehicles involved in a collision.
     * 
     */
    @XmlEnumValue("multipleVehicleCollision")
    MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),

    /**
     * Includes all accidents involving three or more vehicles.
     * 
     */
    @XmlEnumValue("multivehicleAccident")
    MULTIVEHICLE_ACCIDENT("multivehicleAccident"),

    /**
     * Includes all situations resulting in a spillage of oil on the carriageway.
     * 
     */
    @XmlEnumValue("oilSpillageAccident")
    OIL_SPILLAGE_ACCIDENT("oilSpillageAccident"),

    /**
     * Includes all situations resulting in the overturning of a heavy goods vehicle on the carriageway.
     * 
     */
    @XmlEnumValue("overturnedHeavyLorry")
    OVERTURNED_HEAVY_LORRY("overturnedHeavyLorry"),

    /**
     * Includes all situations resulting in the overturning of a trailer.
     * 
     */
    @XmlEnumValue("overturnedTrailer")
    OVERTURNED_TRAILER("overturnedTrailer"),

    /**
     * Includes all situations resulting in the overturning of a vehicle (of unspecified type) on the carriageway.
     * 
     */
    @XmlEnumValue("overturnedVehicle")
    OVERTURNED_VEHICLE("overturnedVehicle"),

    /**
     * Includes all accidents where one or more vehicles have collided with the rear of one or more other vehicles.
     * 
     */
    @XmlEnumValue("rearCollision")
    REAR_COLLISION("rearCollision"),

    /**
     * Includes all situations resulting from vehicles avoiding or being distracted by earlier accidents.
     * 
     */
    @XmlEnumValue("secondaryAccident")
    SECONDARY_ACCIDENT("secondaryAccident"),

    /**
     * Includes all accidents believed to involve fatality or injury expected to require overnight hospitalisation.
     * 
     */
    @XmlEnumValue("seriousAccident")
    SERIOUS_ACCIDENT("seriousAccident"),

    /**
     * Includes all accidents where one or more vehicles have collided with the side of one or more other vehicles.
     * 
     */
    @XmlEnumValue("sideCollision")
    SIDE_COLLISION("sideCollision"),

    /**
     * Includes all accidents where one or more vehicles have left the roadway.
     * 
     */
    @XmlEnumValue("vehicleOffRoad")
    VEHICLE_OFF_ROAD("vehicleOffRoad"),

    /**
     * Includes all accidents where a vehicle has skidded and has come to rest not facing its intended line of travel.
     * 
     */
    @XmlEnumValue("vehicleSpunAround")
    VEHICLE_SPUN_AROUND("vehicleSpunAround"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AccidentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccidentTypeEnum fromValue(String v) {
        for (AccidentTypeEnum c: AccidentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}