
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeTrendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelTimeTrendTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="decreasing"/>
 *     &lt;enumeration value="increasing"/>
 *     &lt;enumeration value="stable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTrendTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TravelTimeTrendTypeEnum {


    /**
     * Travel times are decreasing.
     * 
     */
    @XmlEnumValue("decreasing")
    DECREASING("decreasing"),

    /**
     * Travel times are increasing.
     * 
     */
    @XmlEnumValue("increasing")
    INCREASING("increasing"),

    /**
     * Travel times are stable.
     * 
     */
    @XmlEnumValue("stable")
    STABLE("stable");
    private final String value;

    TravelTimeTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTrendTypeEnum fromValue(String v) {
        for (TravelTimeTrendTypeEnum c: TravelTimeTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
