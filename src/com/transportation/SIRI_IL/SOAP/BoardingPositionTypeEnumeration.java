
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoardingPositionTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoardingPositionTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="doorFromAirlineGate"/>
 *     &lt;enumeration value="positionOnRailPlatform"/>
 *     &lt;enumeration value="positionOnMetroPlatform"/>
 *     &lt;enumeration value="positionAtCoachStop"/>
 *     &lt;enumeration value="positionAtBusStop"/>
 *     &lt;enumeration value="boatGangway"/>
 *     &lt;enumeration value="ferryGangway"/>
 *     &lt;enumeration value="telecabinePlatfrom"/>
 *     &lt;enumeration value="setDownPoint"/>
 *     &lt;enumeration value="taxiBay"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BoardingPositionTypeEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum BoardingPositionTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("doorFromAirlineGate")
    DOOR_FROM_AIRLINE_GATE("doorFromAirlineGate"),
    @XmlEnumValue("positionOnRailPlatform")
    POSITION_ON_RAIL_PLATFORM("positionOnRailPlatform"),
    @XmlEnumValue("positionOnMetroPlatform")
    POSITION_ON_METRO_PLATFORM("positionOnMetroPlatform"),
    @XmlEnumValue("positionAtCoachStop")
    POSITION_AT_COACH_STOP("positionAtCoachStop"),
    @XmlEnumValue("positionAtBusStop")
    POSITION_AT_BUS_STOP("positionAtBusStop"),
    @XmlEnumValue("boatGangway")
    BOAT_GANGWAY("boatGangway"),
    @XmlEnumValue("ferryGangway")
    FERRY_GANGWAY("ferryGangway"),
    @XmlEnumValue("telecabinePlatfrom")
    TELECABINE_PLATFROM("telecabinePlatfrom"),
    @XmlEnumValue("setDownPoint")
    SET_DOWN_POINT("setDownPoint"),
    @XmlEnumValue("taxiBay")
    TAXI_BAY("taxiBay"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    BoardingPositionTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BoardingPositionTypeEnumeration fromValue(String v) {
        for (BoardingPositionTypeEnumeration c: BoardingPositionTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
