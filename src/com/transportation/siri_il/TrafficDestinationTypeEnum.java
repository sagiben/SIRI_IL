
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficDestinationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficDestinationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="destinedForAirport"/>
 *     &lt;enumeration value="destinedForFerryService"/>
 *     &lt;enumeration value="destinedForRailService"/>
 *     &lt;enumeration value="throughTraffic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficDestinationTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TrafficDestinationTypeEnum {


    /**
     * Vehicle(s) destined for the airport.
     * 
     */
    @XmlEnumValue("destinedForAirport")
    DESTINED_FOR_AIRPORT("destinedForAirport"),

    /**
     * Vehicle(s) destined for the ferry service.
     * 
     */
    @XmlEnumValue("destinedForFerryService")
    DESTINED_FOR_FERRY_SERVICE("destinedForFerryService"),

    /**
     * Vehicle(s) destined for the rail service.
     * 
     */
    @XmlEnumValue("destinedForRailService")
    DESTINED_FOR_RAIL_SERVICE("destinedForRailService"),

    /**
     * Vehicle(s) not destined for local town, city or built up area but for transit though the area.
     * 
     */
    @XmlEnumValue("throughTraffic")
    THROUGH_TRAFFIC("throughTraffic");
    private final String value;

    TrafficDestinationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficDestinationTypeEnum fromValue(String v) {
        for (TrafficDestinationTypeEnum c: TrafficDestinationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
