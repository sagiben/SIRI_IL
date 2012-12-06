
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvolvementRolesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvolvementRolesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cyclist"/>
 *     &lt;enumeration value="pedestrian"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="vehicleDriver"/>
 *     &lt;enumeration value="vehicleOccupant"/>
 *     &lt;enumeration value="vehiclePassenger"/>
 *     &lt;enumeration value="witness"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvolvementRolesEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum InvolvementRolesEnum {


    /**
     * Cyclist.
     * 
     */
    @XmlEnumValue("cyclist")
    CYCLIST("cyclist"),

    /**
     * Pedestrian.
     * 
     */
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),

    /**
     * Involvement role is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Vehicle driver.
     * 
     */
    @XmlEnumValue("vehicleDriver")
    VEHICLE_DRIVER("vehicleDriver"),

    /**
     * Vehicle occupant (driver or passenger not specified).
     * 
     */
    @XmlEnumValue("vehicleOccupant")
    VEHICLE_OCCUPANT("vehicleOccupant"),

    /**
     * Vehicle passenger.
     * 
     */
    @XmlEnumValue("vehiclePassenger")
    VEHICLE_PASSENGER("vehiclePassenger"),

    /**
     * Witness.
     * 
     */
    @XmlEnumValue("witness")
    WITNESS("witness");
    private final String value;

    InvolvementRolesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvolvementRolesEnum fromValue(String v) {
        for (InvolvementRolesEnum c: InvolvementRolesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
