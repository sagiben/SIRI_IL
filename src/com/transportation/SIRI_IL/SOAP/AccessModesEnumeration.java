
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessModesEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessModesEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="foot"/>
 *     &lt;enumeration value="bicycle"/>
 *     &lt;enumeration value="car"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="shuttle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessModesEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum AccessModesEnumeration {

    @XmlEnumValue("foot")
    FOOT("foot"),
    @XmlEnumValue("bicycle")
    BICYCLE("bicycle"),
    @XmlEnumValue("car")
    CAR("car"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle");
    private final String value;

    AccessModesEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessModesEnumeration fromValue(String v) {
        for (AccessModesEnumeration c: AccessModesEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
