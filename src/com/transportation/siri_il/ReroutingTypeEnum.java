
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReroutingTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReroutingTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reroutingUseEntry"/>
 *     &lt;enumeration value="reroutingUseExit"/>
 *     &lt;enumeration value="reroutingUseIntersectionOrJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReroutingTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ReroutingTypeEnum {


    /**
     * Rerouted traffic is to use the specified entry onto the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("reroutingUseEntry")
    REROUTING_USE_ENTRY("reroutingUseEntry"),

    /**
     * Rerouted traffic is to use the specified exit from the identified road to commence the alternative route.
     * 
     */
    @XmlEnumValue("reroutingUseExit")
    REROUTING_USE_EXIT("reroutingUseExit"),

    /**
     * Rerouted traffic is to use the specified intersection or junction to commence the alternative route.
     * 
     */
    @XmlEnumValue("reroutingUseIntersectionOrJunction")
    REROUTING_USE_INTERSECTION_OR_JUNCTION("reroutingUseIntersectionOrJunction");
    private final String value;

    ReroutingTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReroutingTypeEnum fromValue(String v) {
        for (ReroutingTypeEnum c: ReroutingTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
