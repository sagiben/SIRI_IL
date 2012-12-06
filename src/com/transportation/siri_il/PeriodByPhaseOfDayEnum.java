
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodByPhaseOfDayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodByPhaseOfDayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="duringDarknessHours"/>
 *     &lt;enumeration value="duringDayLightHours"/>
 *     &lt;enumeration value="duringEveningBeforeSunset"/>
 *     &lt;enumeration value="duringEveningRushHour"/>
 *     &lt;enumeration value="duringMorningBeforeSunrise"/>
 *     &lt;enumeration value="duringMorningRushHour"/>
 *     &lt;enumeration value="fromMidnightToSunrise"/>
 *     &lt;enumeration value="fromSunsetToMidnight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodByPhaseOfDayEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PeriodByPhaseOfDayEnum {


    /**
     * Period during hours of darkness from sunset to sunrise.
     * 
     */
    @XmlEnumValue("duringDarknessHours")
    DURING_DARKNESS_HOURS("duringDarknessHours"),

    /**
     * Period during hours of daylight from sunrise to sunset.
     * 
     */
    @XmlEnumValue("duringDayLightHours")
    DURING_DAY_LIGHT_HOURS("duringDayLightHours"),

    /**
     * Period from 5 pm until sunset.
     * 
     */
    @XmlEnumValue("duringEveningBeforeSunset")
    DURING_EVENING_BEFORE_SUNSET("duringEveningBeforeSunset"),

    /**
     * Period of the normally recognised evening local rush hour.
     * 
     */
    @XmlEnumValue("duringEveningRushHour")
    DURING_EVENING_RUSH_HOUR("duringEveningRushHour"),

    /**
     * Period from 5 am until sunrise.
     * 
     */
    @XmlEnumValue("duringMorningBeforeSunrise")
    DURING_MORNING_BEFORE_SUNRISE("duringMorningBeforeSunrise"),

    /**
     * Period of the normally recognised morning local rush hour.
     * 
     */
    @XmlEnumValue("duringMorningRushHour")
    DURING_MORNING_RUSH_HOUR("duringMorningRushHour"),

    /**
     * Period from midnight until sunrise.
     * 
     */
    @XmlEnumValue("fromMidnightToSunrise")
    FROM_MIDNIGHT_TO_SUNRISE("fromMidnightToSunrise"),

    /**
     * Period from sunset until midnight.
     * 
     */
    @XmlEnumValue("fromSunsetToMidnight")
    FROM_SUNSET_TO_MIDNIGHT("fromSunsetToMidnight");
    private final String value;

    PeriodByPhaseOfDayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PeriodByPhaseOfDayEnum fromValue(String v) {
        for (PeriodByPhaseOfDayEnum c: PeriodByPhaseOfDayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
