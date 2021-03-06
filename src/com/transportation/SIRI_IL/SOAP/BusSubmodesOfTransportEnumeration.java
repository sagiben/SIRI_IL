
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti5_0"/>
 *     &lt;enumeration value="loc10_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti5_1"/>
 *     &lt;enumeration value="loc10_6"/>
 *     &lt;enumeration value="regionalBus"/>
 *     &lt;enumeration value="pti5_2"/>
 *     &lt;enumeration value="loc10_1"/>
 *     &lt;enumeration value="expressBus"/>
 *     &lt;enumeration value="pti5_3"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="pti5_4"/>
 *     &lt;enumeration value="loc10_5"/>
 *     &lt;enumeration value="localBusService"/>
 *     &lt;enumeration value="pti5_5"/>
 *     &lt;enumeration value="loc10_2"/>
 *     &lt;enumeration value="nightBus"/>
 *     &lt;enumeration value="pti5_6"/>
 *     &lt;enumeration value="loc10_4"/>
 *     &lt;enumeration value="postBus"/>
 *     &lt;enumeration value="pti5_7"/>
 *     &lt;enumeration value="loc10_8"/>
 *     &lt;enumeration value="specialNeedsBus"/>
 *     &lt;enumeration value="pti5_8"/>
 *     &lt;enumeration value="mobilityBus"/>
 *     &lt;enumeration value="pti5_9"/>
 *     &lt;enumeration value="mobilityBusForRegisteredDisabled"/>
 *     &lt;enumeration value="pti5_10"/>
 *     &lt;enumeration value="loc10_9"/>
 *     &lt;enumeration value="sightseeingBus"/>
 *     &lt;enumeration value="pti5_11"/>
 *     &lt;enumeration value="shuttleBus"/>
 *     &lt;enumeration value="pti5_12"/>
 *     &lt;enumeration value="loc10_7"/>
 *     &lt;enumeration value="schoolBus"/>
 *     &lt;enumeration value="pti5_13"/>
 *     &lt;enumeration value="loc10_13"/>
 *     &lt;enumeration value="schoolAndPublicServiceBus"/>
 *     &lt;enumeration value="pti5_14"/>
 *     &lt;enumeration value="railReplacementBus"/>
 *     &lt;enumeration value="pti5_15"/>
 *     &lt;enumeration value="demandAndResponseBus"/>
 *     &lt;enumeration value="pti5_16"/>
 *     &lt;enumeration value="allBusServices"/>
 *     &lt;enumeration value="loc_10"/>
 *     &lt;enumeration value="airportLinkBus"/>
 *     &lt;enumeration value="pti5_255"/>
 *     &lt;enumeration value="loc10_255"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusSubmodesOfTransportEnumeration")
@XmlEnum
public enum BusSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti5_0")
    PTI_5_0("pti5_0"),
    @XmlEnumValue("loc10_0")
    LOC_10_0("loc10_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti5_1")
    PTI_5_1("pti5_1"),
    @XmlEnumValue("loc10_6")
    LOC_10_6("loc10_6"),
    @XmlEnumValue("regionalBus")
    REGIONAL_BUS("regionalBus"),
    @XmlEnumValue("pti5_2")
    PTI_5_2("pti5_2"),
    @XmlEnumValue("loc10_1")
    LOC_10_1("loc10_1"),
    @XmlEnumValue("expressBus")
    EXPRESS_BUS("expressBus"),
    @XmlEnumValue("pti5_3")
    PTI_5_3("pti5_3"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("pti5_4")
    PTI_5_4("pti5_4"),
    @XmlEnumValue("loc10_5")
    LOC_10_5("loc10_5"),
    @XmlEnumValue("localBusService")
    LOCAL_BUS_SERVICE("localBusService"),
    @XmlEnumValue("pti5_5")
    PTI_5_5("pti5_5"),
    @XmlEnumValue("loc10_2")
    LOC_10_2("loc10_2"),
    @XmlEnumValue("nightBus")
    NIGHT_BUS("nightBus"),
    @XmlEnumValue("pti5_6")
    PTI_5_6("pti5_6"),
    @XmlEnumValue("loc10_4")
    LOC_10_4("loc10_4"),
    @XmlEnumValue("postBus")
    POST_BUS("postBus"),
    @XmlEnumValue("pti5_7")
    PTI_5_7("pti5_7"),
    @XmlEnumValue("loc10_8")
    LOC_10_8("loc10_8"),
    @XmlEnumValue("specialNeedsBus")
    SPECIAL_NEEDS_BUS("specialNeedsBus"),
    @XmlEnumValue("pti5_8")
    PTI_5_8("pti5_8"),
    @XmlEnumValue("mobilityBus")
    MOBILITY_BUS("mobilityBus"),
    @XmlEnumValue("pti5_9")
    PTI_5_9("pti5_9"),
    @XmlEnumValue("mobilityBusForRegisteredDisabled")
    MOBILITY_BUS_FOR_REGISTERED_DISABLED("mobilityBusForRegisteredDisabled"),
    @XmlEnumValue("pti5_10")
    PTI_5_10("pti5_10"),
    @XmlEnumValue("loc10_9")
    LOC_10_9("loc10_9"),
    @XmlEnumValue("sightseeingBus")
    SIGHTSEEING_BUS("sightseeingBus"),
    @XmlEnumValue("pti5_11")
    PTI_5_11("pti5_11"),
    @XmlEnumValue("shuttleBus")
    SHUTTLE_BUS("shuttleBus"),
    @XmlEnumValue("pti5_12")
    PTI_5_12("pti5_12"),
    @XmlEnumValue("loc10_7")
    LOC_10_7("loc10_7"),
    @XmlEnumValue("schoolBus")
    SCHOOL_BUS("schoolBus"),
    @XmlEnumValue("pti5_13")
    PTI_5_13("pti5_13"),
    @XmlEnumValue("loc10_13")
    LOC_10_13("loc10_13"),
    @XmlEnumValue("schoolAndPublicServiceBus")
    SCHOOL_AND_PUBLIC_SERVICE_BUS("schoolAndPublicServiceBus"),
    @XmlEnumValue("pti5_14")
    PTI_5_14("pti5_14"),
    @XmlEnumValue("railReplacementBus")
    RAIL_REPLACEMENT_BUS("railReplacementBus"),
    @XmlEnumValue("pti5_15")
    PTI_5_15("pti5_15"),
    @XmlEnumValue("demandAndResponseBus")
    DEMAND_AND_RESPONSE_BUS("demandAndResponseBus"),
    @XmlEnumValue("pti5_16")
    PTI_5_16("pti5_16"),
    @XmlEnumValue("allBusServices")
    ALL_BUS_SERVICES("allBusServices"),
    @XmlEnumValue("loc_10")
    LOC_10("loc_10"),
    @XmlEnumValue("airportLinkBus")
    AIRPORT_LINK_BUS("airportLinkBus"),
    @XmlEnumValue("pti5_255")
    PTI_5_255("pti5_255"),
    @XmlEnumValue("loc10_255")
    LOC_10_255("loc10_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    BusSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusSubmodesOfTransportEnumeration fromValue(String v) {
        for (BusSubmodesOfTransportEnumeration c: BusSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
