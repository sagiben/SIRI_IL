
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abandoned"/>
 *     &lt;enumeration value="brokenDown"/>
 *     &lt;enumeration value="burntOut"/>
 *     &lt;enumeration value="damaged"/>
 *     &lt;enumeration value="damagedAndImmobililized"/>
 *     &lt;enumeration value="onFire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleStatusEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VehicleStatusEnum {


    /**
     * Abandoned vehicle.
     * 
     */
    @XmlEnumValue("abandoned")
    ABANDONED("abandoned"),

    /**
     * Broken down vehicle (i.e. it is immobile due to mechanical breakdown).
     * 
     */
    @XmlEnumValue("brokenDown")
    BROKEN_DOWN("brokenDown"),

    /**
     * Burnt out vehicle, but fire is extinguished.
     * 
     */
    @XmlEnumValue("burntOut")
    BURNT_OUT("burntOut"),

    /**
     * Vehicle is damaged following an incident or collision. It may or may not be able to move by itself.
     * 
     */
    @XmlEnumValue("damaged")
    DAMAGED("damaged"),

    /**
     * Vehicle is damaged following an incident or collision. It is immobilized and therefore needs assistance to be moved.
     * 
     */
    @XmlEnumValue("damagedAndImmobililized")
    DAMAGED_AND_IMMOBILILIZED("damagedAndImmobililized"),

    /**
     * Vehicle is on fire.
     * 
     */
    @XmlEnumValue("onFire")
    ON_FIRE("onFire");
    private final String value;

    VehicleStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleStatusEnum fromValue(String v) {
        for (VehicleStatusEnum c: VehicleStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
