
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti8_0"/>
 *     &lt;enumeration value="loc15_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti8_1"/>
 *     &lt;enumeration value="loc15_2"/>
 *     &lt;enumeration value="internationalFlight"/>
 *     &lt;enumeration value="pti8_2"/>
 *     &lt;enumeration value="domesticFlight"/>
 *     &lt;enumeration value="pti8_3"/>
 *     &lt;enumeration value="loc15_1"/>
 *     &lt;enumeration value="intercontinentalFlight"/>
 *     &lt;enumeration value="pti8_4"/>
 *     &lt;enumeration value="loc15_4"/>
 *     &lt;enumeration value="domesticScheduledFlight"/>
 *     &lt;enumeration value="pti8_5"/>
 *     &lt;enumeration value="loc15_9"/>
 *     &lt;enumeration value="shuttleFlight"/>
 *     &lt;enumeration value="pti8_6"/>
 *     &lt;enumeration value="loc15_5"/>
 *     &lt;enumeration value="intercontinentalCharterFlight"/>
 *     &lt;enumeration value="pti8_7"/>
 *     &lt;enumeration value="loc15_6"/>
 *     &lt;enumeration value="internationalCharterFlight"/>
 *     &lt;enumeration value="pti8_8"/>
 *     &lt;enumeration value="roundTripCharterFlight"/>
 *     &lt;enumeration value="pti8_9"/>
 *     &lt;enumeration value="loc15_8"/>
 *     &lt;enumeration value="sightseeingFlight"/>
 *     &lt;enumeration value="pti8_10"/>
 *     &lt;enumeration value="loc15_10"/>
 *     &lt;enumeration value="helicopterService"/>
 *     &lt;enumeration value="pti8_11"/>
 *     &lt;enumeration value="loc15_7"/>
 *     &lt;enumeration value="domesticCharterFlight"/>
 *     &lt;enumeration value="pti8_12"/>
 *     &lt;enumeration value="SchengenAreaFlight"/>
 *     &lt;enumeration value="pti8_13"/>
 *     &lt;enumeration value="airshipService"/>
 *     &lt;enumeration value="pti8_14"/>
 *     &lt;enumeration value="allAirServices"/>
 *     &lt;enumeration value="loc14_3"/>
 *     &lt;enumeration value="shortHaulInternationalFlight"/>
 *     &lt;enumeration value="pti8_255"/>
 *     &lt;enumeration value="loc15_255"/>
 *     &lt;enumeration value="undefinedAircraftService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirSubmodesOfTransportEnumeration")
@XmlEnum
public enum AirSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti8_0")
    PTI_8_0("pti8_0"),
    @XmlEnumValue("loc15_0")
    LOC_15_0("loc15_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti8_1")
    PTI_8_1("pti8_1"),
    @XmlEnumValue("loc15_2")
    LOC_15_2("loc15_2"),
    @XmlEnumValue("internationalFlight")
    INTERNATIONAL_FLIGHT("internationalFlight"),
    @XmlEnumValue("pti8_2")
    PTI_8_2("pti8_2"),
    @XmlEnumValue("domesticFlight")
    DOMESTIC_FLIGHT("domesticFlight"),
    @XmlEnumValue("pti8_3")
    PTI_8_3("pti8_3"),
    @XmlEnumValue("loc15_1")
    LOC_15_1("loc15_1"),
    @XmlEnumValue("intercontinentalFlight")
    INTERCONTINENTAL_FLIGHT("intercontinentalFlight"),
    @XmlEnumValue("pti8_4")
    PTI_8_4("pti8_4"),
    @XmlEnumValue("loc15_4")
    LOC_15_4("loc15_4"),
    @XmlEnumValue("domesticScheduledFlight")
    DOMESTIC_SCHEDULED_FLIGHT("domesticScheduledFlight"),
    @XmlEnumValue("pti8_5")
    PTI_8_5("pti8_5"),
    @XmlEnumValue("loc15_9")
    LOC_15_9("loc15_9"),
    @XmlEnumValue("shuttleFlight")
    SHUTTLE_FLIGHT("shuttleFlight"),
    @XmlEnumValue("pti8_6")
    PTI_8_6("pti8_6"),
    @XmlEnumValue("loc15_5")
    LOC_15_5("loc15_5"),
    @XmlEnumValue("intercontinentalCharterFlight")
    INTERCONTINENTAL_CHARTER_FLIGHT("intercontinentalCharterFlight"),
    @XmlEnumValue("pti8_7")
    PTI_8_7("pti8_7"),
    @XmlEnumValue("loc15_6")
    LOC_15_6("loc15_6"),
    @XmlEnumValue("internationalCharterFlight")
    INTERNATIONAL_CHARTER_FLIGHT("internationalCharterFlight"),
    @XmlEnumValue("pti8_8")
    PTI_8_8("pti8_8"),
    @XmlEnumValue("roundTripCharterFlight")
    ROUND_TRIP_CHARTER_FLIGHT("roundTripCharterFlight"),
    @XmlEnumValue("pti8_9")
    PTI_8_9("pti8_9"),
    @XmlEnumValue("loc15_8")
    LOC_15_8("loc15_8"),
    @XmlEnumValue("sightseeingFlight")
    SIGHTSEEING_FLIGHT("sightseeingFlight"),
    @XmlEnumValue("pti8_10")
    PTI_8_10("pti8_10"),
    @XmlEnumValue("loc15_10")
    LOC_15_10("loc15_10"),
    @XmlEnumValue("helicopterService")
    HELICOPTER_SERVICE("helicopterService"),
    @XmlEnumValue("pti8_11")
    PTI_8_11("pti8_11"),
    @XmlEnumValue("loc15_7")
    LOC_15_7("loc15_7"),
    @XmlEnumValue("domesticCharterFlight")
    DOMESTIC_CHARTER_FLIGHT("domesticCharterFlight"),
    @XmlEnumValue("pti8_12")
    PTI_8_12("pti8_12"),
    @XmlEnumValue("SchengenAreaFlight")
    SCHENGEN_AREA_FLIGHT("SchengenAreaFlight"),
    @XmlEnumValue("pti8_13")
    PTI_8_13("pti8_13"),
    @XmlEnumValue("airshipService")
    AIRSHIP_SERVICE("airshipService"),
    @XmlEnumValue("pti8_14")
    PTI_8_14("pti8_14"),
    @XmlEnumValue("allAirServices")
    ALL_AIR_SERVICES("allAirServices"),
    @XmlEnumValue("loc14_3")
    LOC_14_3("loc14_3"),
    @XmlEnumValue("shortHaulInternationalFlight")
    SHORT_HAUL_INTERNATIONAL_FLIGHT("shortHaulInternationalFlight"),
    @XmlEnumValue("pti8_255")
    PTI_8_255("pti8_255"),
    @XmlEnumValue("loc15_255")
    LOC_15_255("loc15_255"),
    @XmlEnumValue("undefinedAircraftService")
    UNDEFINED_AIRCRAFT_SERVICE("undefinedAircraftService");
    private final String value;

    AirSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirSubmodesOfTransportEnumeration fromValue(String v) {
        for (AirSubmodesOfTransportEnumeration c: AirSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
