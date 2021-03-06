
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueCompareOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueCompareOperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="containedIn"/>
 *     &lt;enumeration value="contains"/>
 *     &lt;enumeration value="containsNot"/>
 *     &lt;enumeration value="equal"/>
 *     &lt;enumeration value="greater"/>
 *     &lt;enumeration value="greaterEqual"/>
 *     &lt;enumeration value="less"/>
 *     &lt;enumeration value="lessEqual"/>
 *     &lt;enumeration value="notContainedIn"/>
 *     &lt;enumeration value="unequal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueCompareOperatorEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ValueCompareOperatorEnum {


    /**
     * Contained in.
     * 
     */
    @XmlEnumValue("containedIn")
    CONTAINED_IN("containedIn"),

    /**
     * Contains.
     * 
     */
    @XmlEnumValue("contains")
    CONTAINS("contains"),

    /**
     * Does not contain.
     * 
     */
    @XmlEnumValue("containsNot")
    CONTAINS_NOT("containsNot"),

    /**
     * Equal to.
     * 
     */
    @XmlEnumValue("equal")
    EQUAL("equal"),

    /**
     * Greater than.
     * 
     */
    @XmlEnumValue("greater")
    GREATER("greater"),

    /**
     * Greater than or equal to.
     * 
     */
    @XmlEnumValue("greaterEqual")
    GREATER_EQUAL("greaterEqual"),

    /**
     * Less than.
     * 
     */
    @XmlEnumValue("less")
    LESS("less"),

    /**
     * Less than or equal to.
     * 
     */
    @XmlEnumValue("lessEqual")
    LESS_EQUAL("lessEqual"),

    /**
     * Not contained in.
     * 
     */
    @XmlEnumValue("notContainedIn")
    NOT_CONTAINED_IN("notContainedIn"),

    /**
     * Not equal to.
     * 
     */
    @XmlEnumValue("unequal")
    UNEQUAL("unequal");
    private final String value;

    ValueCompareOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueCompareOperatorEnum fromValue(String v) {
        for (ValueCompareOperatorEnum c: ValueCompareOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
