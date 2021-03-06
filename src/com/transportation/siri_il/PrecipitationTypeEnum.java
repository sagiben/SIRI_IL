
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecipitationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrecipitationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="drizzle"/>
 *     &lt;enumeration value="hail"/>
 *     &lt;enumeration value="rain"/>
 *     &lt;enumeration value="sleet"/>
 *     &lt;enumeration value="snow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrecipitationTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PrecipitationTypeEnum {


    /**
     * Light, fine rain.
     * 
     */
    @XmlEnumValue("drizzle")
    DRIZZLE("drizzle"),

    /**
     * Small balls of ice and compacted snow.
     * 
     */
    @XmlEnumValue("hail")
    HAIL("hail"),

    /**
     * Rain.
     * 
     */
    @XmlEnumValue("rain")
    RAIN("rain"),

    /**
     * Wet snow mixed with rain.
     * 
     */
    @XmlEnumValue("sleet")
    SLEET("sleet"),

    /**
     * Snow.
     * 
     */
    @XmlEnumValue("snow")
    SNOW("snow");
    private final String value;

    PrecipitationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrecipitationTypeEnum fromValue(String v) {
        for (PrecipitationTypeEnum c: PrecipitationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
