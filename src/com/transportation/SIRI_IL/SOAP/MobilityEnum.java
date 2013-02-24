
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mobile"/>
 *     &lt;enumeration value="stationary"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobilityEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum MobilityEnum {


    /**
     * The described event is moving.
     * 
     */
    @XmlEnumValue("mobile")
    MOBILE("mobile"),

    /**
     * The described event is stationary.
     * 
     */
    @XmlEnumValue("stationary")
    STATIONARY("stationary"),

    /**
     * The mobility of the described event is unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    MobilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobilityEnum fromValue(String v) {
        for (MobilityEnum c: MobilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
