
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc03AreaDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc03AreaDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="administrativeAreaName"/>
 *     &lt;enumeration value="administrativeReferenceName"/>
 *     &lt;enumeration value="areaName"/>
 *     &lt;enumeration value="countyName"/>
 *     &lt;enumeration value="lakeName"/>
 *     &lt;enumeration value="nationName"/>
 *     &lt;enumeration value="policeForceControlAreaName"/>
 *     &lt;enumeration value="regionName"/>
 *     &lt;enumeration value="seaName"/>
 *     &lt;enumeration value="townName"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc03AreaDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc03AreaDescriptorSubtypeEnum {


    /**
     * Name of an administrative area.
     * 
     */
    @XmlEnumValue("administrativeAreaName")
    ADMINISTRATIVE_AREA_NAME("administrativeAreaName"),

    /**
     * Reference name by which administrative area is known.
     * 
     */
    @XmlEnumValue("administrativeReferenceName")
    ADMINISTRATIVE_REFERENCE_NAME("administrativeReferenceName"),

    /**
     * Name of area.
     * 
     */
    @XmlEnumValue("areaName")
    AREA_NAME("areaName"),

    /**
     * Name of county (administrative sub-division).
     * 
     */
    @XmlEnumValue("countyName")
    COUNTY_NAME("countyName"),

    /**
     * Name of lake.
     * 
     */
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),

    /**
     * Name of nation (e.g. Wales) which is a sub-division of a ISO recognised country.
     * 
     */
    @XmlEnumValue("nationName")
    NATION_NAME("nationName"),

    /**
     * Name of a police force control area.
     * 
     */
    @XmlEnumValue("policeForceControlAreaName")
    POLICE_FORCE_CONTROL_AREA_NAME("policeForceControlAreaName"),

    /**
     * Name of a geographic region.
     * 
     */
    @XmlEnumValue("regionName")
    REGION_NAME("regionName"),

    /**
     * Name of a sea.
     * 
     */
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),

    /**
     * Name of a town.
     * 
     */
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TPEGLoc03AreaDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc03AreaDescriptorSubtypeEnum fromValue(String v) {
        for (TPEGLoc03AreaDescriptorSubtypeEnum c: TPEGLoc03AreaDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
