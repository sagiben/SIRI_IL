
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadsideAssistanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadsideAssistanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airAmbulance"/>
 *     &lt;enumeration value="busPassengerAssistance"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="firstAid"/>
 *     &lt;enumeration value="foodDelivery"/>
 *     &lt;enumeration value="helicopterRescue"/>
 *     &lt;enumeration value="vehicleRepair"/>
 *     &lt;enumeration value="vehicleRecovery"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadsideAssistanceTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RoadsideAssistanceTypeEnum {


    /**
     * Air ambulance assistance.
     * 
     */
    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),

    /**
     * Bus passenger assistance.
     * 
     */
    @XmlEnumValue("busPassengerAssistance")
    BUS_PASSENGER_ASSISTANCE("busPassengerAssistance"),

    /**
     * Emergency services assistance.
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * First aid assistance.
     * 
     */
    @XmlEnumValue("firstAid")
    FIRST_AID("firstAid"),

    /**
     * Food delivery.
     * 
     */
    @XmlEnumValue("foodDelivery")
    FOOD_DELIVERY("foodDelivery"),

    /**
     * Helicopter rescue.
     * 
     */
    @XmlEnumValue("helicopterRescue")
    HELICOPTER_RESCUE("helicopterRescue"),

    /**
     * Vehicle repair assistance.
     * 
     */
    @XmlEnumValue("vehicleRepair")
    VEHICLE_REPAIR("vehicleRepair"),

    /**
     * Vehicle recovery.
     * 
     */
    @XmlEnumValue("vehicleRecovery")
    VEHICLE_RECOVERY("vehicleRecovery"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadsideAssistanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadsideAssistanceTypeEnum fromValue(String v) {
        for (RoadsideAssistanceTypeEnum c: RoadsideAssistanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
