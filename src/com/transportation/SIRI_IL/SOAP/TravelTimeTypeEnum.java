
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelTimeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="best"/>
 *     &lt;enumeration value="estimated"/>
 *     &lt;enumeration value="instantaneous"/>
 *     &lt;enumeration value="reconstituted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TravelTimeTypeEnum {


    /**
     * Travel time is derived from the best out of a monitored sample.
     * 
     */
    @XmlEnumValue("best")
    BEST("best"),

    /**
     * Travel time is an automated estimate.
     * 
     */
    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),

    /**
     * Travel time is derived from instantaneous measurements.
     * 
     */
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),

    /**
     * Travel time is reconstituted from other measurements.
     * 
     */
    @XmlEnumValue("reconstituted")
    RECONSTITUTED("reconstituted");
    private final String value;

    TravelTimeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTypeEnum fromValue(String v) {
        for (TravelTimeTypeEnum c: TravelTimeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
