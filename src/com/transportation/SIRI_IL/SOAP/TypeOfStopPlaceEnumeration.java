
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfStopPlaceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfStopPlaceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onstreetBus"/>
 *     &lt;enumeration value="onstreetTram"/>
 *     &lt;enumeration value="ferryStop"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="railStation"/>
 *     &lt;enumeration value="metroStation"/>
 *     &lt;enumeration value="coachStation"/>
 *     &lt;enumeration value="ferryPort"/>
 *     &lt;enumeration value="harbourPort"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfStopPlaceEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum TypeOfStopPlaceEnumeration {

    @XmlEnumValue("onstreetBus")
    ONSTREET_BUS("onstreetBus"),
    @XmlEnumValue("onstreetTram")
    ONSTREET_TRAM("onstreetTram"),
    @XmlEnumValue("ferryStop")
    FERRY_STOP("ferryStop"),
    @XmlEnumValue("airport")
    AIRPORT("airport"),
    @XmlEnumValue("railStation")
    RAIL_STATION("railStation"),
    @XmlEnumValue("metroStation")
    METRO_STATION("metroStation"),
    @XmlEnumValue("coachStation")
    COACH_STATION("coachStation"),
    @XmlEnumValue("ferryPort")
    FERRY_PORT("ferryPort"),
    @XmlEnumValue("harbourPort")
    HARBOUR_PORT("harbourPort"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TypeOfStopPlaceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfStopPlaceEnumeration fromValue(String v) {
        for (TypeOfStopPlaceEnumeration c: TypeOfStopPlaceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
