
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficRestrictionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficRestrictionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carriagewayBlocked"/>
 *     &lt;enumeration value="carriagewayPartiallyObstructed"/>
 *     &lt;enumeration value="laneDeviated"/>
 *     &lt;enumeration value="lanesBlocked"/>
 *     &lt;enumeration value="lanesPartiallyObstructed"/>
 *     &lt;enumeration value="roadBlocked"/>
 *     &lt;enumeration value="roadPartiallyObstructed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficRestrictionTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TrafficRestrictionTypeEnum {


    /**
     * The carriageway is totally obstructed in the specified direction due to an unplanned event.
     * 
     */
    @XmlEnumValue("carriagewayBlocked")
    CARRIAGEWAY_BLOCKED("carriagewayBlocked"),

    /**
     * The carriageway is partially obstructed in the specified direction due to an unplanned event.
     * 
     */
    @XmlEnumValue("carriagewayPartiallyObstructed")
    CARRIAGEWAY_PARTIALLY_OBSTRUCTED("carriagewayPartiallyObstructed"),

    /**
     * Traffic in the specified direction is required to deviate from the normal lane(s) due to an unplanned event (e.g. via hard shoulder).
     * 
     */
    @XmlEnumValue("laneDeviated")
    LANE_DEVIATED("laneDeviated"),

    /**
     * One or more lanes is totally obstructed in the specified direction due to an unplanned event.
     * 
     */
    @XmlEnumValue("lanesBlocked")
    LANES_BLOCKED("lanesBlocked"),

    /**
     * One or more lanes is partially obstructed in the specified direction due to an unplanned event.
     * 
     */
    @XmlEnumValue("lanesPartiallyObstructed")
    LANES_PARTIALLY_OBSTRUCTED("lanesPartiallyObstructed"),

    /**
     * The road is totally obstructed, for all vehicles in both directions, due to an unplanned event.
     * 
     */
    @XmlEnumValue("roadBlocked")
    ROAD_BLOCKED("roadBlocked"),

    /**
     * The road is partially obstructed in both directions due to an unplanned event.
     * 
     */
    @XmlEnumValue("roadPartiallyObstructed")
    ROAD_PARTIALLY_OBSTRUCTED("roadPartiallyObstructed");
    private final String value;

    TrafficRestrictionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficRestrictionTypeEnum fromValue(String v) {
        for (TrafficRestrictionTypeEnum c: TrafficRestrictionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
