
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="monday"/>
 *     &lt;enumeration value="tuesday"/>
 *     &lt;enumeration value="wednesday"/>
 *     &lt;enumeration value="thursday"/>
 *     &lt;enumeration value="friday"/>
 *     &lt;enumeration value="saturday"/>
 *     &lt;enumeration value="sunday"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DayEnum {


    /**
     * Monday.
     * 
     */
    @XmlEnumValue("monday")
    MONDAY("monday"),

    /**
     * Tuesday.
     * 
     */
    @XmlEnumValue("tuesday")
    TUESDAY("tuesday"),

    /**
     * Wednesday.
     * 
     */
    @XmlEnumValue("wednesday")
    WEDNESDAY("wednesday"),

    /**
     * Thursday.
     * 
     */
    @XmlEnumValue("thursday")
    THURSDAY("thursday"),

    /**
     * Friday.
     * 
     */
    @XmlEnumValue("friday")
    FRIDAY("friday"),

    /**
     * Saturday.
     * 
     */
    @XmlEnumValue("saturday")
    SATURDAY("saturday"),

    /**
     * Sunday.
     * 
     */
    @XmlEnumValue("sunday")
    SUNDAY("sunday");
    private final String value;

    DayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayEnum fromValue(String v) {
        for (DayEnum c: DayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
