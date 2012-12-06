
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="impossible"/>
 *     &lt;enumeration value="congested"/>
 *     &lt;enumeration value="heavy"/>
 *     &lt;enumeration value="freeFlow"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficStatusEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TrafficStatusEnum {


    /**
     * Traffic in the specified direction is completely congested, effectively at a standstill, making driving impossible.
     * 
     */
    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),

    /**
     * Traffic in the specified direction is congested making driving very slow and difficult.
     * 
     */
    @XmlEnumValue("congested")
    CONGESTED("congested"),

    /**
     * Traffic in the specified direction is heavier than usual making driving conditions more difficult than normal.
     * 
     */
    @XmlEnumValue("heavy")
    HEAVY("heavy"),

    /**
     * Traffic in the specified direction is free flowing.
     * 
     */
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),

    /**
     * Traffic conditions are unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficStatusEnum fromValue(String v) {
        for (TrafficStatusEnum c: TrafficStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
