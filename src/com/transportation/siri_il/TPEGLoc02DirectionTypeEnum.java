
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc02DirectionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc02DirectionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allDirections"/>
 *     &lt;enumeration value="anticlockwise"/>
 *     &lt;enumeration value="bothWays"/>
 *     &lt;enumeration value="clockwise"/>
 *     &lt;enumeration value="eastBound"/>
 *     &lt;enumeration value="innerRing"/>
 *     &lt;enumeration value="northBound"/>
 *     &lt;enumeration value="northEastBound"/>
 *     &lt;enumeration value="northWestBound"/>
 *     &lt;enumeration value="opposite"/>
 *     &lt;enumeration value="outerRing"/>
 *     &lt;enumeration value="southBound"/>
 *     &lt;enumeration value="southEastBound"/>
 *     &lt;enumeration value="southWestBound"/>
 *     &lt;enumeration value="westBound"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc02DirectionTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc02DirectionTypeEnum {


    /**
     * All directions (where more than two are applicable) at this point on the road network.
     * 
     */
    @XmlEnumValue("allDirections")
    ALL_DIRECTIONS("allDirections"),

    /**
     * Anti-clockwise.
     * 
     */
    @XmlEnumValue("anticlockwise")
    ANTICLOCKWISE("anticlockwise"),

    /**
     * Both directions that are applicable at this point on the road network.
     * 
     */
    @XmlEnumValue("bothWays")
    BOTH_WAYS("bothWays"),

    /**
     * Clockwise.
     * 
     */
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),

    /**
     * East bound general direction.
     * 
     */
    @XmlEnumValue("eastBound")
    EAST_BOUND("eastBound"),

    /**
     * Inner ring direction.
     * 
     */
    @XmlEnumValue("innerRing")
    INNER_RING("innerRing"),

    /**
     * North bound general direction.
     * 
     */
    @XmlEnumValue("northBound")
    NORTH_BOUND("northBound"),

    /**
     * North east bound general direction.
     * 
     */
    @XmlEnumValue("northEastBound")
    NORTH_EAST_BOUND("northEastBound"),

    /**
     * North west bound general direction.
     * 
     */
    @XmlEnumValue("northWestBound")
    NORTH_WEST_BOUND("northWestBound"),

    /**
     * Opposite direction to the normal direction of flow at this point on the road network.
     * 
     */
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),

    /**
     * Outer ring direction.
     * 
     */
    @XmlEnumValue("outerRing")
    OUTER_RING("outerRing"),

    /**
     * South bound general direction.
     * 
     */
    @XmlEnumValue("southBound")
    SOUTH_BOUND("southBound"),

    /**
     * South east bound general direction.
     * 
     */
    @XmlEnumValue("southEastBound")
    SOUTH_EAST_BOUND("southEastBound"),

    /**
     * South west bound general direction.
     * 
     */
    @XmlEnumValue("southWestBound")
    SOUTH_WEST_BOUND("southWestBound"),

    /**
     * West bound general direction.
     * 
     */
    @XmlEnumValue("westBound")
    WEST_BOUND("westBound"),

    /**
     * Direction is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TPEGLoc02DirectionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc02DirectionTypeEnum fromValue(String v) {
        for (TPEGLoc02DirectionTypeEnum c: TPEGLoc02DirectionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
