
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonOperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equalTo"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="lessThan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonOperatorEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ComparisonOperatorEnum {


    /**
     * Logical comparison operator of "equal to".
     * 
     */
    @XmlEnumValue("equalTo")
    EQUAL_TO("equalTo"),

    /**
     * Logical comparison operator of "greater than".
     * 
     */
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),

    /**
     * Logical comparison operator of "less than".
     * 
     */
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan");
    private final String value;

    ComparisonOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperatorEnum fromValue(String v) {
        for (ComparisonOperatorEnum c: ComparisonOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
