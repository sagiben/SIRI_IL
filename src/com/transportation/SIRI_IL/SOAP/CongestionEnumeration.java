
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CongestionEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CongestionEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noWaiting"/>
 *     &lt;enumeration value="queue"/>
 *     &lt;enumeration value="crowding"/>
 *     &lt;enumeration value="full"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CongestionEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum CongestionEnumeration {

    @XmlEnumValue("noWaiting")
    NO_WAITING("noWaiting"),
    @XmlEnumValue("queue")
    QUEUE("queue"),
    @XmlEnumValue("crowding")
    CROWDING("crowding"),
    @XmlEnumValue("full")
    FULL("full");
    private final String value;

    CongestionEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CongestionEnumeration fromValue(String v) {
        for (CongestionEnumeration c: CongestionEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
