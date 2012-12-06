
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuayTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuayTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airlineGate"/>
 *     &lt;enumeration value="railPlatform"/>
 *     &lt;enumeration value="metroPlatform"/>
 *     &lt;enumeration value="coachStop"/>
 *     &lt;enumeration value="busStop"/>
 *     &lt;enumeration value="tramStop"/>
 *     &lt;enumeration value="boatQuay"/>
 *     &lt;enumeration value="ferryLanding"/>
 *     &lt;enumeration value="telecabinePlatfrom"/>
 *     &lt;enumeration value="taxiStand"/>
 *     &lt;enumeration value="setDownPlace"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuayTypeEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum QuayTypeEnumeration {

    @XmlEnumValue("airlineGate")
    AIRLINE_GATE("airlineGate"),
    @XmlEnumValue("railPlatform")
    RAIL_PLATFORM("railPlatform"),
    @XmlEnumValue("metroPlatform")
    METRO_PLATFORM("metroPlatform"),
    @XmlEnumValue("coachStop")
    COACH_STOP("coachStop"),
    @XmlEnumValue("busStop")
    BUS_STOP("busStop"),
    @XmlEnumValue("tramStop")
    TRAM_STOP("tramStop"),
    @XmlEnumValue("boatQuay")
    BOAT_QUAY("boatQuay"),
    @XmlEnumValue("ferryLanding")
    FERRY_LANDING("ferryLanding"),
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("taxiStand")
    TAXI_STAND("taxiStand"),
    @XmlEnumValue("setDownPlace")
    SET_DOWN_PLACE("setDownPlace"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    QuayTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuayTypeEnumeration fromValue(String v) {
        for (QuayTypeEnumeration c: QuayTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
