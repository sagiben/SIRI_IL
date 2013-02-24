
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleModesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleModesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti1_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti1_1"/>
 *     &lt;enumeration value="railwayService"/>
 *     &lt;enumeration value="rail"/>
 *     &lt;enumeration value="pti1_2"/>
 *     &lt;enumeration value="coachService"/>
 *     &lt;enumeration value="coach"/>
 *     &lt;enumeration value="pti1_3"/>
 *     &lt;enumeration value="suburbanRailwayService"/>
 *     &lt;enumeration value="suburbanRail"/>
 *     &lt;enumeration value="pti1_4"/>
 *     &lt;enumeration value="urbanRailwayService"/>
 *     &lt;enumeration value="urbanRail"/>
 *     &lt;enumeration value="pti1_5"/>
 *     &lt;enumeration value="metroService"/>
 *     &lt;enumeration value="metro"/>
 *     &lt;enumeration value="pti1_6"/>
 *     &lt;enumeration value="undergroundService"/>
 *     &lt;enumeration value="underground"/>
 *     &lt;enumeration value="pti1_7"/>
 *     &lt;enumeration value="busService"/>
 *     &lt;enumeration value="bus"/>
 *     &lt;enumeration value="pti1_8"/>
 *     &lt;enumeration value="trolleyBusService"/>
 *     &lt;enumeration value="trolleyBus"/>
 *     &lt;enumeration value="pti1_9"/>
 *     &lt;enumeration value="tramService"/>
 *     &lt;enumeration value="tram"/>
 *     &lt;enumeration value="pti1_10"/>
 *     &lt;enumeration value="waterTransportService"/>
 *     &lt;enumeration value="waterTransport"/>
 *     &lt;enumeration value="pti1_11"/>
 *     &lt;enumeration value="airService"/>
 *     &lt;enumeration value="air"/>
 *     &lt;enumeration value="pti1_12"/>
 *     &lt;enumeration value="ferryService"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="pti1_13"/>
 *     &lt;enumeration value="telecabinService"/>
 *     &lt;enumeration value="telecabin"/>
 *     &lt;enumeration value="pti1_14"/>
 *     &lt;enumeration value="funicularService"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="pti1_15"/>
 *     &lt;enumeration value="taxiService"/>
 *     &lt;enumeration value="taxi"/>
 *     &lt;enumeration value="pti1_16"/>
 *     &lt;enumeration value="selfDrive"/>
 *     &lt;enumeration value="pti1_17"/>
 *     &lt;enumeration value="allServices"/>
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="pti1_18"/>
 *     &lt;enumeration value="allServicesExcept"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleModesOfTransportEnumeration")
@XmlEnum
public enum VehicleModesOfTransportEnumeration {

    @XmlEnumValue("pti1_0")
    PTI_1_0("pti1_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti1_1")
    PTI_1_1("pti1_1"),

    /**
     * See pti2_x
     * 
     */
    @XmlEnumValue("railwayService")
    RAILWAY_SERVICE("railwayService"),
    @XmlEnumValue("rail")
    RAIL("rail"),
    @XmlEnumValue("pti1_2")
    PTI_1_2("pti1_2"),

    /**
     * See pti3_x
     * 
     */
    @XmlEnumValue("coachService")
    COACH_SERVICE("coachService"),
    @XmlEnumValue("coach")
    COACH("coach"),
    @XmlEnumValue("pti1_3")
    PTI_1_3("pti1_3"),
    @XmlEnumValue("suburbanRailwayService")
    SUBURBAN_RAILWAY_SERVICE("suburbanRailwayService"),
    @XmlEnumValue("suburbanRail")
    SUBURBAN_RAIL("suburbanRail"),
    @XmlEnumValue("pti1_4")
    PTI_1_4("pti1_4"),

    /**
     * See pti4_x
     * 
     */
    @XmlEnumValue("urbanRailwayService")
    URBAN_RAILWAY_SERVICE("urbanRailwayService"),
    @XmlEnumValue("urbanRail")
    URBAN_RAIL("urbanRail"),
    @XmlEnumValue("pti1_5")
    PTI_1_5("pti1_5"),
    @XmlEnumValue("metroService")
    METRO_SERVICE("metroService"),
    @XmlEnumValue("metro")
    METRO("metro"),
    @XmlEnumValue("pti1_6")
    PTI_1_6("pti1_6"),
    @XmlEnumValue("undergroundService")
    UNDERGROUND_SERVICE("undergroundService"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),
    @XmlEnumValue("pti1_7")
    PTI_1_7("pti1_7"),

    /**
     * See pti5_x
     * 
     */
    @XmlEnumValue("busService")
    BUS_SERVICE("busService"),
    @XmlEnumValue("bus")
    BUS("bus"),
    @XmlEnumValue("pti1_8")
    PTI_1_8("pti1_8"),
    @XmlEnumValue("trolleyBusService")
    TROLLEY_BUS_SERVICE("trolleyBusService"),
    @XmlEnumValue("trolleyBus")
    TROLLEY_BUS("trolleyBus"),
    @XmlEnumValue("pti1_9")
    PTI_1_9("pti1_9"),

    /**
     * See pti6_x
     * 
     */
    @XmlEnumValue("tramService")
    TRAM_SERVICE("tramService"),
    @XmlEnumValue("tram")
    TRAM("tram"),
    @XmlEnumValue("pti1_10")
    PTI_1_10("pti1_10"),

    /**
     * See pti7_x
     * 
     */
    @XmlEnumValue("waterTransportService")
    WATER_TRANSPORT_SERVICE("waterTransportService"),
    @XmlEnumValue("waterTransport")
    WATER_TRANSPORT("waterTransport"),
    @XmlEnumValue("pti1_11")
    PTI_1_11("pti1_11"),

    /**
     * See pti8_x
     * 
     */
    @XmlEnumValue("airService")
    AIR_SERVICE("airService"),
    @XmlEnumValue("air")
    AIR("air"),
    @XmlEnumValue("pti1_12")
    PTI_1_12("pti1_12"),
    @XmlEnumValue("ferryService")
    FERRY_SERVICE("ferryService"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("pti1_13")
    PTI_1_13("pti1_13"),

    /**
     * See pti9_x
     * 
     */
    @XmlEnumValue("telecabinService")
    TELECABIN_SERVICE("telecabinService"),
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),
    @XmlEnumValue("pti1_14")
    PTI_1_14("pti1_14"),

    /**
     * See pti10_x
     * 
     */
    @XmlEnumValue("funicularService")
    FUNICULAR_SERVICE("funicularService"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("pti1_15")
    PTI_1_15("pti1_15"),

    /**
     * pti11_x
     * 
     */
    @XmlEnumValue("taxiService")
    TAXI_SERVICE("taxiService"),
    @XmlEnumValue("taxi")
    TAXI("taxi"),
    @XmlEnumValue("pti1_16")
    PTI_1_16("pti1_16"),

    /**
     * See pti12_x
     * 
     */
    @XmlEnumValue("selfDrive")
    SELF_DRIVE("selfDrive"),
    @XmlEnumValue("pti1_17")
    PTI_1_17("pti1_17"),
    @XmlEnumValue("allServices")
    ALL_SERVICES("allServices"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("pti1_18")
    PTI_1_18("pti1_18"),
    @XmlEnumValue("allServicesExcept")
    ALL_SERVICES_EXCEPT("allServicesExcept");
    private final String value;

    VehicleModesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleModesOfTransportEnumeration fromValue(String v) {
        for (VehicleModesOfTransportEnumeration c: VehicleModesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
