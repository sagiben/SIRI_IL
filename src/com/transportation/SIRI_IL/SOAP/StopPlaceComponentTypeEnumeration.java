
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopPlaceComponentTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StopPlaceComponentTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="quay"/>
 *     &lt;enumeration value="accessSpace"/>
 *     &lt;enumeration value="entrance"/>
 *     &lt;enumeration value="boardingPosition"/>
 *     &lt;enumeration value="stoppingPlace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StopPlaceComponentTypeEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum StopPlaceComponentTypeEnumeration {

    @XmlEnumValue("quay")
    QUAY("quay"),
    @XmlEnumValue("accessSpace")
    ACCESS_SPACE("accessSpace"),
    @XmlEnumValue("entrance")
    ENTRANCE("entrance"),
    @XmlEnumValue("boardingPosition")
    BOARDING_POSITION("boardingPosition"),
    @XmlEnumValue("stoppingPlace")
    STOPPING_PLACE("stoppingPlace");
    private final String value;

    StopPlaceComponentTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StopPlaceComponentTypeEnumeration fromValue(String v) {
        for (StopPlaceComponentTypeEnumeration c: StopPlaceComponentTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
