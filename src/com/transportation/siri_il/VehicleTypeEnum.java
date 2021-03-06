
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anyVehicle"/>
 *     &lt;enumeration value="articulatedVehicle"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="carOrLightVehicle"/>
 *     &lt;enumeration value="carWithCaravan"/>
 *     &lt;enumeration value="carWithTrailer"/>
 *     &lt;enumeration value="fourWheelDrive"/>
 *     &lt;enumeration value="goodsVehicle"/>
 *     &lt;enumeration value="heavyLorry"/>
 *     &lt;enumeration value="heavyVehicle"/>
 *     &lt;enumeration value="highSidedVehicle"/>
 *     &lt;enumeration value="lightVehicle"/>
 *     &lt;enumeration value="lorry"/>
 *     &lt;enumeration value="motorcycle"/>
 *     &lt;enumeration value="twoWheeledVehicle"/>
 *     &lt;enumeration value="van"/>
 *     &lt;enumeration value="vehicleWithCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithoutCatalyticConverter"/>
 *     &lt;enumeration value="vehicleWithCaravan"/>
 *     &lt;enumeration value="vehicleWithTrailer"/>
 *     &lt;enumeration value="withEvenNumberedRegistrationPlates"/>
 *     &lt;enumeration value="withOddNumberedRegistrationPlates"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VehicleTypeEnum {


    /**
     * Vehicle of any type.
     * 
     */
    @XmlEnumValue("anyVehicle")
    ANY_VEHICLE("anyVehicle"),

    /**
     * Articulated vehicle.
     * 
     */
    @XmlEnumValue("articulatedVehicle")
    ARTICULATED_VEHICLE("articulatedVehicle"),

    /**
     * Bus.
     * 
     */
    @XmlEnumValue("bus")
    BUS("bus"),

    /**
     * Car.
     * 
     */
    @XmlEnumValue("car")
    CAR("car"),

    /**
     * Car or light vehicle.
     * 
     */
    @XmlEnumValue("carOrLightVehicle")
    CAR_OR_LIGHT_VEHICLE("carOrLightVehicle"),

    /**
     * Car towing a caravan.
     * 
     */
    @XmlEnumValue("carWithCaravan")
    CAR_WITH_CARAVAN("carWithCaravan"),

    /**
     * Car towing a trailer.
     * 
     */
    @XmlEnumValue("carWithTrailer")
    CAR_WITH_TRAILER("carWithTrailer"),

    /**
     * Four wheel drive vehicle.
     * 
     */
    @XmlEnumValue("fourWheelDrive")
    FOUR_WHEEL_DRIVE("fourWheelDrive"),

    /**
     * Goods vehicle.
     * 
     */
    @XmlEnumValue("goodsVehicle")
    GOODS_VEHICLE("goodsVehicle"),

    /**
     * Heavy lorry.
     * 
     */
    @XmlEnumValue("heavyLorry")
    HEAVY_LORRY("heavyLorry"),

    /**
     * Heavy vehicle.
     * 
     */
    @XmlEnumValue("heavyVehicle")
    HEAVY_VEHICLE("heavyVehicle"),

    /**
     * High sided vehicle.
     * 
     */
    @XmlEnumValue("highSidedVehicle")
    HIGH_SIDED_VEHICLE("highSidedVehicle"),

    /**
     * Light vehicle.
     * 
     */
    @XmlEnumValue("lightVehicle")
    LIGHT_VEHICLE("lightVehicle"),

    /**
     * Lorry of any type.
     * 
     */
    @XmlEnumValue("lorry")
    LORRY("lorry"),

    /**
     * Motorcycle.
     * 
     */
    @XmlEnumValue("motorcycle")
    MOTORCYCLE("motorcycle"),

    /**
     * Two wheeled vehicle of unspecified type.
     * 
     */
    @XmlEnumValue("twoWheeledVehicle")
    TWO_WHEELED_VEHICLE("twoWheeledVehicle"),

    /**
     * Van.
     * 
     */
    @XmlEnumValue("van")
    VAN("van"),

    /**
     * Vehicle with catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithCatalyticConverter")
    VEHICLE_WITH_CATALYTIC_CONVERTER("vehicleWithCatalyticConverter"),

    /**
     * Vehicle without catalytic converter.
     * 
     */
    @XmlEnumValue("vehicleWithoutCatalyticConverter")
    VEHICLE_WITHOUT_CATALYTIC_CONVERTER("vehicleWithoutCatalyticConverter"),

    /**
     * Vehicle (of unspecified type) towing a caravan.
     * 
     */
    @XmlEnumValue("vehicleWithCaravan")
    VEHICLE_WITH_CARAVAN("vehicleWithCaravan"),

    /**
     * Vehicle (of unspecified type) towing a trailer.
     * 
     */
    @XmlEnumValue("vehicleWithTrailer")
    VEHICLE_WITH_TRAILER("vehicleWithTrailer"),

    /**
     * Vehicle with even numbered registration plate.
     * 
     */
    @XmlEnumValue("withEvenNumberedRegistrationPlates")
    WITH_EVEN_NUMBERED_REGISTRATION_PLATES("withEvenNumberedRegistrationPlates"),

    /**
     * Vehicle with odd numbered registration plate.
     * 
     */
    @XmlEnumValue("withOddNumberedRegistrationPlates")
    WITH_ODD_NUMBERED_REGISTRATION_PLATES("withOddNumberedRegistrationPlates"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VehicleTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleTypeEnum fromValue(String v) {
        for (VehicleTypeEnum c: VehicleTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
