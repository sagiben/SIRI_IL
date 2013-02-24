
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeekOfMonthEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeekOfMonthEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="firstWeekOfMonth"/>
 *     &lt;enumeration value="secondWeekOfMonth"/>
 *     &lt;enumeration value="thirdWeekOfMonth"/>
 *     &lt;enumeration value="fouthWeekOfMonth"/>
 *     &lt;enumeration value="fifthWeekOfMonth"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeekOfMonthEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum WeekOfMonthEnum {


    /**
     * First week of the month.
     * 
     */
    @XmlEnumValue("firstWeekOfMonth")
    FIRST_WEEK_OF_MONTH("firstWeekOfMonth"),

    /**
     * Second week of the month.
     * 
     */
    @XmlEnumValue("secondWeekOfMonth")
    SECOND_WEEK_OF_MONTH("secondWeekOfMonth"),

    /**
     * Third week of the month.
     * 
     */
    @XmlEnumValue("thirdWeekOfMonth")
    THIRD_WEEK_OF_MONTH("thirdWeekOfMonth"),

    /**
     * Fourth week of the month.
     * 
     */
    @XmlEnumValue("fouthWeekOfMonth")
    FOUTH_WEEK_OF_MONTH("fouthWeekOfMonth"),

    /**
     * Fifth week of the month (at most only 3 days and non in February when not a leap year). 
     * 
     */
    @XmlEnumValue("fifthWeekOfMonth")
    FIFTH_WEEK_OF_MONTH("fifthWeekOfMonth");
    private final String value;

    WeekOfMonthEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeekOfMonthEnum fromValue(String v) {
        for (WeekOfMonthEnum c: WeekOfMonthEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
