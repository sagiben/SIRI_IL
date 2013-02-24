
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="inactive"/>
 *     &lt;enumeration value="pending"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum StatusEnumeration {


    /**
     * Entity is active.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Entity is inactive.
     * 
     */
    @XmlEnumValue("inactive")
    INACTIVE("inactive"),

    /**
     * Entity is still active but is in the process of being made inactive..
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending");
    private final String value;

    StatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnumeration fromValue(String v) {
        for (StatusEnumeration c: StatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
