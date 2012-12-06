
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonWeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonWeatherRelatedRoadConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="leavesOnRoad"/>
 *     &lt;enumeration value="looseChippings"/>
 *     &lt;enumeration value="looseSandOnRoad"/>
 *     &lt;enumeration value="mudOnRoad"/>
 *     &lt;enumeration value="oilOnRoad"/>
 *     &lt;enumeration value="petrolOnRoadway"/>
 *     &lt;enumeration value="roadSurfaceInPoorCondition"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonWeatherRelatedRoadConditionTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum NonWeatherRelatedRoadConditionTypeEnum {


    /**
     * Increased skid risk due to leaves on road.
     * 
     */
    @XmlEnumValue("leavesOnRoad")
    LEAVES_ON_ROAD("leavesOnRoad"),

    /**
     * Increased skid risk and injury risk due to loose chippings on road.
     * 
     */
    @XmlEnumValue("looseChippings")
    LOOSE_CHIPPINGS("looseChippings"),

    /**
     * Increased skid risk due to loose sand on road.
     * 
     */
    @XmlEnumValue("looseSandOnRoad")
    LOOSE_SAND_ON_ROAD("looseSandOnRoad"),

    /**
     * Increased skid risk due to mud on road.
     * 
     */
    @XmlEnumValue("mudOnRoad")
    MUD_ON_ROAD("mudOnRoad"),

    /**
     * Increased skid risk due to oil on road.
     * 
     */
    @XmlEnumValue("oilOnRoad")
    OIL_ON_ROAD("oilOnRoad"),

    /**
     * Increased skid risk due to fuel on road.
     * 
     */
    @XmlEnumValue("petrolOnRoadway")
    PETROL_ON_ROADWAY("petrolOnRoadway"),

    /**
     * The road surface is damaged, severely rutted or potholed (i.e. it is in a poor state of repair).
     * 
     */
    @XmlEnumValue("roadSurfaceInPoorCondition")
    ROAD_SURFACE_IN_POOR_CONDITION("roadSurfaceInPoorCondition"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NonWeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonWeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (NonWeatherRelatedRoadConditionTypeEnum c: NonWeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
