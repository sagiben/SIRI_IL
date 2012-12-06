
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentSubReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnvironmentSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="heavySnowFall"/>
 *     &lt;enumeration value="strongWinds"/>
 *     &lt;enumeration value="stormConditions"/>
 *     &lt;enumeration value="stormDamage"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="lighteningStrike"/>
 *     &lt;enumeration value="avalanches"/>
 *     &lt;enumeration value="flashFloods"/>
 *     &lt;enumeration value="mudslip"/>
 *     &lt;enumeration value="rockfalls"/>
 *     &lt;enumeration value="subsidence"/>
 *     &lt;enumeration value="earthquakeDamage"/>
 *     &lt;enumeration value="sewerOverflow"/>
 *     &lt;enumeration value="grassFire"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnvironmentSubReasonEnumeration")
@XmlEnum
public enum EnvironmentSubReasonEnumeration {

    @XmlEnumValue("heavySnowFall")
    HEAVY_SNOW_FALL("heavySnowFall"),
    @XmlEnumValue("strongWinds")
    STRONG_WINDS("strongWinds"),
    @XmlEnumValue("stormConditions")
    STORM_CONDITIONS("stormConditions"),
    @XmlEnumValue("stormDamage")
    STORM_DAMAGE("stormDamage"),
    @XmlEnumValue("hail")
    HAIL("hail"),
    @XmlEnumValue("lighteningStrike")
    LIGHTENING_STRIKE("lighteningStrike"),
    @XmlEnumValue("avalanches")
    AVALANCHES("avalanches"),
    @XmlEnumValue("flashFloods")
    FLASH_FLOODS("flashFloods"),
    @XmlEnumValue("mudslip")
    MUDSLIP("mudslip"),
    @XmlEnumValue("rockfalls")
    ROCKFALLS("rockfalls"),
    @XmlEnumValue("subsidence")
    SUBSIDENCE("subsidence"),
    @XmlEnumValue("earthquakeDamage")
    EARTHQUAKE_DAMAGE("earthquakeDamage"),
    @XmlEnumValue("sewerOverflow")
    SEWER_OVERFLOW("sewerOverflow"),
    @XmlEnumValue("grassFire")
    GRASS_FIRE("grassFire");
    private final String value;

    EnvironmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvironmentSubReasonEnumeration fromValue(String v) {
        for (EnvironmentSubReasonEnumeration c: EnvironmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
