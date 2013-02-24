
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InjuryStatusTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InjuryStatusTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dead"/>
 *     &lt;enumeration value="seriouslyInjured"/>
 *     &lt;enumeration value="slightInjury"/>
 *     &lt;enumeration value="uninjured"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InjuryStatusTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum InjuryStatusTypeEnum {


    /**
     * Dead.
     * 
     */
    @XmlEnumValue("dead")
    DEAD("dead"),

    /**
     * Seriously injured requiring urgent hospital treatment.
     * 
     */
    @XmlEnumValue("seriouslyInjured")
    SERIOUSLY_INJURED("seriouslyInjured"),

    /**
     * Slightly injured requiring medical treatment.
     * 
     */
    @XmlEnumValue("slightInjury")
    SLIGHT_INJURY("slightInjury"),

    /**
     * Uninjured.
     * 
     */
    @XmlEnumValue("uninjured")
    UNINJURED("uninjured"),

    /**
     * Injury status unknown.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    InjuryStatusTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InjuryStatusTypeEnum fromValue(String v) {
        for (InjuryStatusTypeEnum c: InjuryStatusTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
