
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayGroupEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayGroupEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allDaysOfWeek"/>
 *     &lt;enumeration value="mondayToFriday"/>
 *     &lt;enumeration value="mondayToSaturday"/>
 *     &lt;enumeration value="sundayToFriday"/>
 *     &lt;enumeration value="weekend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayGroupEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DayGroupEnum {


    /**
     * All days of the week (Monday to Sunday).
     * 
     */
    @XmlEnumValue("allDaysOfWeek")
    ALL_DAYS_OF_WEEK("allDaysOfWeek"),

    /**
     * Monday to Friday (inclusive).
     * 
     */
    @XmlEnumValue("mondayToFriday")
    MONDAY_TO_FRIDAY("mondayToFriday"),

    /**
     * Monday to Saturday (inclusive).
     * 
     */
    @XmlEnumValue("mondayToSaturday")
    MONDAY_TO_SATURDAY("mondayToSaturday"),

    /**
     * Sunday to Friday (inclusive).
     * 
     */
    @XmlEnumValue("sundayToFriday")
    SUNDAY_TO_FRIDAY("sundayToFriday"),

    /**
     * Saturday and Sunday.
     * 
     */
    @XmlEnumValue("weekend")
    WEEKEND("weekend");
    private final String value;

    DayGroupEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayGroupEnum fromValue(String v) {
        for (DayGroupEnum c: DayGroupEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
