
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc04HeightTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc04HeightTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="aboveSeaLevel"/>
 *     &lt;enumeration value="aboveStreetLevel"/>
 *     &lt;enumeration value="at"/>
 *     &lt;enumeration value="atSeaLevel"/>
 *     &lt;enumeration value="atStreetLevel"/>
 *     &lt;enumeration value="below"/>
 *     &lt;enumeration value="belowSeaLevel"/>
 *     &lt;enumeration value="belowStreetLevel"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc04HeightTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc04HeightTypeEnum {


    /**
     * Height above specified location.
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * Height above mean sea high water level.
     * 
     */
    @XmlEnumValue("aboveSeaLevel")
    ABOVE_SEA_LEVEL("aboveSeaLevel"),

    /**
     * Height above street level.
     * 
     */
    @XmlEnumValue("aboveStreetLevel")
    ABOVE_STREET_LEVEL("aboveStreetLevel"),

    /**
     * At height of specified location.
     * 
     */
    @XmlEnumValue("at")
    AT("at"),

    /**
     * At mean sea high water level.
     * 
     */
    @XmlEnumValue("atSeaLevel")
    AT_SEA_LEVEL("atSeaLevel"),

    /**
     * At street level.
     * 
     */
    @XmlEnumValue("atStreetLevel")
    AT_STREET_LEVEL("atStreetLevel"),

    /**
     * Height below specified location.
     * 
     */
    @XmlEnumValue("below")
    BELOW("below"),

    /**
     * Height below mean sea high water level.
     * 
     */
    @XmlEnumValue("belowSeaLevel")
    BELOW_SEA_LEVEL("belowSeaLevel"),

    /**
     * Height below street level.
     * 
     */
    @XmlEnumValue("belowStreetLevel")
    BELOW_STREET_LEVEL("belowStreetLevel"),

    /**
     * Undefined height reference.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * Unknown height reference.
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

    TPEGLoc04HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc04HeightTypeEnum fromValue(String v) {
        for (TPEGLoc04HeightTypeEnum c: TPEGLoc04HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
