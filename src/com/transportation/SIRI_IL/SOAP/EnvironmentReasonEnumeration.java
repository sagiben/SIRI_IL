
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti22_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti22_1"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="pti22_2"/>
 *     &lt;enumeration value="roughSea"/>
 *     &lt;enumeration value="pti22_3"/>
 *     &lt;enumeration value="heavySnowFall"/>
 *     &lt;enumeration value="pti22_3_Alias_1"/>
 *     &lt;enumeration value="driftingSnow"/>
 *     &lt;enumeration value="pti22_3_Alias_2"/>
 *     &lt;enumeration value="blizzardConditions"/>
 *     &lt;enumeration value="pti22_4"/>
 *     &lt;enumeration value="heavyRain"/>
 *     &lt;enumeration value="pti22_5"/>
 *     &lt;enumeration value="strongWinds"/>
 *     &lt;enumeration value="pti22_5_Alias_1"/>
 *     &lt;enumeration value="stormConditions"/>
 *     &lt;enumeration value="pti22_5_Alias_2"/>
 *     &lt;enumeration value="stormDamage"/>
 *     &lt;enumeration value="pti22_6"/>
 *     &lt;enumeration value="tidalRestrictions"/>
 *     &lt;enumeration value="pti22_7"/>
 *     &lt;enumeration value="highTide"/>
 *     &lt;enumeration value="pti22_8"/>
 *     &lt;enumeration value="lowTide"/>
 *     &lt;enumeration value="pti22_9"/>
 *     &lt;enumeration value="ice"/>
 *     &lt;enumeration value="pti22_10"/>
 *     &lt;enumeration value="frozen"/>
 *     &lt;enumeration value="pti22_11"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="pti22_11_Alias_1"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="pti22_12"/>
 *     &lt;enumeration value="highTemperatures"/>
 *     &lt;enumeration value="pti22_13"/>
 *     &lt;enumeration value="flooding"/>
 *     &lt;enumeration value="pti22_14"/>
 *     &lt;enumeration value="waterlogged"/>
 *     &lt;enumeration value="pti22_15"/>
 *     &lt;enumeration value="lowWaterLevel"/>
 *     &lt;enumeration value="pti22_16"/>
 *     &lt;enumeration value="highWaterLevel"/>
 *     &lt;enumeration value="pti22_17"/>
 *     &lt;enumeration value="fallenLeaves"/>
 *     &lt;enumeration value="pti22_18"/>
 *     &lt;enumeration value="fallenTree"/>
 *     &lt;enumeration value="pti22_19"/>
 *     &lt;enumeration value="landslide"/>
 *     &lt;enumeration value="pti22_255"/>
 *     &lt;enumeration value="undefinedEnvironmentalProblem"/>
 *     &lt;enumeration value="pti22_255_Alias_1"/>
 *     &lt;enumeration value="lightningStrike"/>
 *     &lt;enumeration value="pti22_255_Alias_2"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="pti22_255_Alias_3"/>
 *     &lt;enumeration value="grassFire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentReasonEnumeration")
@XmlEnum
public enum EnvironmentReasonEnumeration {

    @XmlEnumValue("pti22_0")
    PTI_22_0("pti22_0"),

    /**
     * TPEG Pti22_0   unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti22_1")
    PTI_22_1("pti22_1"),

    /**
     * TPEG Pti22_1   fog
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),
    @XmlEnumValue("pti22_2")
    PTI_22_2("pti22_2"),

    /**
     * TPEG Pti22_2   rough sea
     * 
     */
    @XmlEnumValue("roughSea")
    ROUGH_SEA("roughSea"),
    @XmlEnumValue("pti22_3")
    PTI_22_3("pti22_3"),

    /**
     * TPEG Pti22_3   heavy snow fall
     * 
     */
    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),
    @XmlEnumValue("pti22_3_Alias_1")
    PTI_22_3_ALIAS_1("pti22_3_Alias_1"),

    /**
     * drifting snow - Alias to TPEG Pti22_3   heavySnowFall
     * 
     */
    @XmlEnumValue("driftingSnow")
    DRIFTING_SNOW("driftingSnow"),
    @XmlEnumValue("pti22_3_Alias_2")
    PTI_22_3_ALIAS_2("pti22_3_Alias_2"),

    /**
     * Blizzard Conditions - Alias to TPEG Pti22_3   heavySnowFall
     * 
     */
    @XmlEnumValue("blizzardConditions")
    BLIZZARD_CONDITIONS("blizzardConditions"),
    @XmlEnumValue("pti22_4")
    PTI_22_4("pti22_4"),

    /**
     * TPEG Pti22_4   heavy rain
     * 
     */
    @XmlEnumValue("heavyRain")
    HEAVY_RAIN("heavyRain"),
    @XmlEnumValue("pti22_5")
    PTI_22_5("pti22_5"),

    /**
     * TPEG Pti22_5   strong winds
     * 
     */
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("pti22_5_Alias_1")
    PTI_22_5_ALIAS_1("pti22_5_Alias_1"),

    /**
     * stormConditions alias to TPEG Pti22_5   strong winds
     * 
     */
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),
    @XmlEnumValue("pti22_5_Alias_2")
    PTI_22_5_ALIAS_2("pti22_5_Alias_2"),

    /**
     * storm damage alias to TPEG Pti22_5   strong winds
     * 
     */
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("pti22_6")
    PTI_22_6("pti22_6"),

    /**
     * TPEG Pti22_6   tidal restrictions
     * 
     */
    @XmlEnumValue("tidalRestrictions")
    TIDAL_RESTRICTIONS("tidalRestrictions"),
    @XmlEnumValue("pti22_7")
    PTI_22_7("pti22_7"),

    /**
     * TPEG Pti22_7   high tide
     * 
     */
    @XmlEnumValue("highTide")
    HIGH_TIDE("highTide"),
    @XmlEnumValue("pti22_8")
    PTI_22_8("pti22_8"),

    /**
     * TPEG Pti22_8   low tide
     * 
     */
    @XmlEnumValue("lowTide")
    LOW_TIDE("lowTide"),
    @XmlEnumValue("pti22_9")
    PTI_22_9("pti22_9"),

    /**
     * TPEG Pti22_9   ice
     * 
     */
    @XmlEnumValue("ice")
    ICE("ice"),
    @XmlEnumValue("pti22_10")
    PTI_22_10("pti22_10"),

    /**
     * TPEG Pti22_10  frozen
     * 
     */
    @XmlEnumValue("frozen")
    FROZEN("frozen"),
    @XmlEnumValue("pti22_11")
    PTI_22_11("pti22_11"),

    /**
     * TPEG Pti22_11  hail
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("pti22_11_Alias_1")
    PTI_22_11_ALIAS_1("pti22_11_Alias_1"),

    /**
     * Sleet Alias to  TPEG Pti22_11  hail
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),
    @XmlEnumValue("pti22_12")
    PTI_22_12("pti22_12"),

    /**
     * TPEG Pti22_12  high temperatures
     * 
     */
    @XmlEnumValue("highTemperatures")
    HIGH_TEMPERATURES("highTemperatures"),
    @XmlEnumValue("pti22_13")
    PTI_22_13("pti22_13"),

    /**
     * TPEG Pti22_13  flooding
     * 
     */
    @XmlEnumValue("flooding")
    FLOODING("flooding"),
    @XmlEnumValue("pti22_14")
    PTI_22_14("pti22_14"),

    /**
     * TPEG Pti22_14  waterlogged
     * 
     */
    @XmlEnumValue("waterlogged")
    WATERLOGGED("waterlogged"),
    @XmlEnumValue("pti22_15")
    PTI_22_15("pti22_15"),

    /**
     * TPEG Pti22_15  low water level
     * 
     */
    @XmlEnumValue("lowWaterLevel")
    LOW_WATER_LEVEL("lowWaterLevel"),
    @XmlEnumValue("pti22_16")
    PTI_22_16("pti22_16"),

    /**
     * TPEG Pti22_16  high water level
     * 
     */
    @XmlEnumValue("highWaterLevel")
    HIGH_WATER_LEVEL("highWaterLevel"),
    @XmlEnumValue("pti22_17")
    PTI_22_17("pti22_17"),

    /**
     * TPEG Pti22_17  fallen leaves
     * 
     */
    @XmlEnumValue("fallenLeaves")
    FALLEN_LEAVES("fallenLeaves"),
    @XmlEnumValue("pti22_18")
    PTI_22_18("pti22_18"),

    /**
     * TPEG Pti22_18  fallen tree
     * 
     */
    @XmlEnumValue("fallenTree")
    FALLEN_TREE("fallenTree"),
    @XmlEnumValue("pti22_19")
    PTI_22_19("pti22_19"),

    /**
     * TPEG Pti22_19  landslide
     * 
     */
    @XmlEnumValue("landslide")
    LANDSLIDE("landslide"),
    @XmlEnumValue("pti22_255")
    PTI_22_255("pti22_255"),

    /**
     * TPEG Pti22_255 undefined environmental problem
     * 
     */
    @XmlEnumValue("undefinedEnvironmentalProblem")
    UNDEFINED_ENVIRONMENTAL_PROBLEM("undefinedEnvironmentalProblem"),
    @XmlEnumValue("pti22_255_Alias_1")
    PTI_22_255_ALIAS_1("pti22_255_Alias_1"),

    /**
     * lightningStrike alias to TPEG Pti22_255 undefined environmental problem
     * 
     */
    @XmlEnumValue("lightningStrike")
    LIGHTNING_STRIKE("lightningStrike"),
    @XmlEnumValue("pti22_255_Alias_2")
    PTI_22_255_ALIAS_2("pti22_255_Alias_2"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("pti22_255_Alias_3")
    PTI_22_255_ALIAS_3("pti22_255_Alias_3"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire");
    private final String value;

    EnvironmentReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentReasonEnumeration fromValue(String v) {
        for (EnvironmentReasonEnumeration c: EnvironmentReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
