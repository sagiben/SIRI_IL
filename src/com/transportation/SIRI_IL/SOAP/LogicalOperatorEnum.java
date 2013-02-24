
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalOperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="and"/>
 *     &lt;enumeration value="or"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogicalOperatorEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum LogicalOperatorEnum {


    /**
     * Logical operator "AND".
     * 
     */
    @XmlEnumValue("and")
    AND("and"),

    /**
     * Logical operator "OR".
     * 
     */
    @XmlEnumValue("or")
    OR("or");
    private final String value;

    LogicalOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogicalOperatorEnum fromValue(String v) {
        for (LogicalOperatorEnum c: LogicalOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
