
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionCompassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DirectionCompassEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="east"/>
 *     &lt;enumeration value="eastNorthEast"/>
 *     &lt;enumeration value="eastSouthEast"/>
 *     &lt;enumeration value="north"/>
 *     &lt;enumeration value="northEast"/>
 *     &lt;enumeration value="northNorthEast"/>
 *     &lt;enumeration value="northNorthWest"/>
 *     &lt;enumeration value="northWest"/>
 *     &lt;enumeration value="south"/>
 *     &lt;enumeration value="southEast"/>
 *     &lt;enumeration value="southSouthEast"/>
 *     &lt;enumeration value="southSouthWest"/>
 *     &lt;enumeration value="southWest"/>
 *     &lt;enumeration value="west"/>
 *     &lt;enumeration value="westNorthWest"/>
 *     &lt;enumeration value="westSouthWest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DirectionCompassEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DirectionCompassEnum {


    /**
     * East.
     * 
     */
    @XmlEnumValue("east")
    EAST("east"),

    /**
     * East north east.
     * 
     */
    @XmlEnumValue("eastNorthEast")
    EAST_NORTH_EAST("eastNorthEast"),

    /**
     * East south east.
     * 
     */
    @XmlEnumValue("eastSouthEast")
    EAST_SOUTH_EAST("eastSouthEast"),

    /**
     * North.
     * 
     */
    @XmlEnumValue("north")
    NORTH("north"),

    /**
     * North east.
     * 
     */
    @XmlEnumValue("northEast")
    NORTH_EAST("northEast"),

    /**
     * North north east.
     * 
     */
    @XmlEnumValue("northNorthEast")
    NORTH_NORTH_EAST("northNorthEast"),

    /**
     * North north west.
     * 
     */
    @XmlEnumValue("northNorthWest")
    NORTH_NORTH_WEST("northNorthWest"),

    /**
     * North west.
     * 
     */
    @XmlEnumValue("northWest")
    NORTH_WEST("northWest"),

    /**
     * South.
     * 
     */
    @XmlEnumValue("south")
    SOUTH("south"),

    /**
     * South east.
     * 
     */
    @XmlEnumValue("southEast")
    SOUTH_EAST("southEast"),

    /**
     * South south east.
     * 
     */
    @XmlEnumValue("southSouthEast")
    SOUTH_SOUTH_EAST("southSouthEast"),

    /**
     * South south west.
     * 
     */
    @XmlEnumValue("southSouthWest")
    SOUTH_SOUTH_WEST("southSouthWest"),

    /**
     * South west.
     * 
     */
    @XmlEnumValue("southWest")
    SOUTH_WEST("southWest"),

    /**
     * West.
     * 
     */
    @XmlEnumValue("west")
    WEST("west"),

    /**
     * West north west.
     * 
     */
    @XmlEnumValue("westNorthWest")
    WEST_NORTH_WEST("westNorthWest"),

    /**
     * West south west.
     * 
     */
    @XmlEnumValue("westSouthWest")
    WEST_SOUTH_WEST("westSouthWest");
    private final String value;

    DirectionCompassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionCompassEnum fromValue(String v) {
        for (DirectionCompassEnum c: DirectionCompassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
