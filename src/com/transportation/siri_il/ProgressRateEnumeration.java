
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressRateEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgressRateEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="noProgress"/>
 *     &lt;enumeration value="slowProgress"/>
 *     &lt;enumeration value="normalProgress"/>
 *     &lt;enumeration value="fastProgress"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgressRateEnumeration")
@XmlEnum
public enum ProgressRateEnumeration {


    /**
     * Vehicle is stationary.
     * 
     */
    @XmlEnumValue("noProgress")
    NO_PROGRESS("noProgress"),

    /**
     * Vehicle is proceeding slower than normal.
     * 
     */
    @XmlEnumValue("slowProgress")
    SLOW_PROGRESS("slowProgress"),

    /**
     * Vehicle is proceeding at a normal rate.
     * 
     */
    @XmlEnumValue("normalProgress")
    NORMAL_PROGRESS("normalProgress"),

    /**
     * Vehicle is proceeding faster than normal.
     * 
     */
    @XmlEnumValue("fastProgress")
    FAST_PROGRESS("fastProgress"),

    /**
     * There is no data
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ProgressRateEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgressRateEnumeration fromValue(String v) {
        for (ProgressRateEnumeration c: ProgressRateEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
