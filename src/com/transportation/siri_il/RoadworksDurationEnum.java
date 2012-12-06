
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksDurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadworksDurationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="longTerm"/>
 *     &lt;enumeration value="mediumTerm"/>
 *     &lt;enumeration value="shortTerm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadworksDurationEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RoadworksDurationEnum {


    /**
     * The roadworks are expected to last for a long term ( duration > 6 months)
     * 
     */
    @XmlEnumValue("longTerm")
    LONG_TERM("longTerm"),

    /**
     * The roadworks are expected to last for a medium term (1 month < duration < = 6 months).
     * 
     */
    @XmlEnumValue("mediumTerm")
    MEDIUM_TERM("mediumTerm"),

    /**
     * The roadworks are expected to last for a short term ( duration < = 1 month)
     * 
     */
    @XmlEnumValue("shortTerm")
    SHORT_TERM("shortTerm");
    private final String value;

    RoadworksDurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksDurationEnum fromValue(String v) {
        for (RoadworksDurationEnum c: RoadworksDurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
