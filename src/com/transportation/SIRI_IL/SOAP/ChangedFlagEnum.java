
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangedFlagEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChangedFlagEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="catalogue"/>
 *     &lt;enumeration value="filter"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChangedFlagEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ChangedFlagEnum {


    /**
     * Catalogue has changed indicator.
     * 
     */
    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),

    /**
     * Filter has changed indicator.
     * 
     */
    @XmlEnumValue("filter")
    FILTER("filter");
    private final String value;

    ChangedFlagEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangedFlagEnum fromValue(String v) {
        for (ChangedFlagEnum c: ChangedFlagEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
