
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficControlOptionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficControlOptionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="advisory"/>
 *     &lt;enumeration value="mandatory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficControlOptionsEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TrafficControlOptionsEnum {


    /**
     * Defined traffic control is advisory.
     * 
     */
    @XmlEnumValue("advisory")
    ADVISORY("advisory"),

    /**
     * Defined traffic control is mandatory.
     * 
     */
    @XmlEnumValue("mandatory")
    MANDATORY("mandatory");
    private final String value;

    TrafficControlOptionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficControlOptionsEnum fromValue(String v) {
        for (TrafficControlOptionsEnum c: TrafficControlOptionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
