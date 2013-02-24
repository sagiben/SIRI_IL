
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonthOfYearEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthOfYearEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="january"/>
 *     &lt;enumeration value="february"/>
 *     &lt;enumeration value="march"/>
 *     &lt;enumeration value="april"/>
 *     &lt;enumeration value="may"/>
 *     &lt;enumeration value="june"/>
 *     &lt;enumeration value="july"/>
 *     &lt;enumeration value="august"/>
 *     &lt;enumeration value="september"/>
 *     &lt;enumeration value="october"/>
 *     &lt;enumeration value="november"/>
 *     &lt;enumeration value="december"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonthOfYearEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum MonthOfYearEnum {


    /**
     * The month of January.
     * 
     */
    @XmlEnumValue("january")
    JANUARY("january"),

    /**
     * The month of February.
     * 
     */
    @XmlEnumValue("february")
    FEBRUARY("february"),

    /**
     * The month of March.
     * 
     */
    @XmlEnumValue("march")
    MARCH("march"),

    /**
     * The month of April.
     * 
     */
    @XmlEnumValue("april")
    APRIL("april"),

    /**
     * The month of May.
     * 
     */
    @XmlEnumValue("may")
    MAY("may"),

    /**
     * The month of June.
     * 
     */
    @XmlEnumValue("june")
    JUNE("june"),

    /**
     * The month of July.
     * 
     */
    @XmlEnumValue("july")
    JULY("july"),

    /**
     * The month of August.
     * 
     */
    @XmlEnumValue("august")
    AUGUST("august"),

    /**
     * The month of September.
     * 
     */
    @XmlEnumValue("september")
    SEPTEMBER("september"),

    /**
     * The month of October.
     * 
     */
    @XmlEnumValue("october")
    OCTOBER("october"),

    /**
     * The month of November.
     * 
     */
    @XmlEnumValue("november")
    NOVEMBER("november"),

    /**
     * The month of December.
     * 
     */
    @XmlEnumValue("december")
    DECEMBER("december");
    private final String value;

    MonthOfYearEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthOfYearEnum fromValue(String v) {
        for (MonthOfYearEnum c: MonthOfYearEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
