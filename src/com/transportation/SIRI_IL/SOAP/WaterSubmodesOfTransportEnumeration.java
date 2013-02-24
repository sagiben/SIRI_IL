
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaterSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WaterSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti7_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti7_1"/>
 *     &lt;enumeration value="internationalCarFerryService"/>
 *     &lt;enumeration value="pti7_2"/>
 *     &lt;enumeration value="nationalCarFerryService"/>
 *     &lt;enumeration value="pti7_3"/>
 *     &lt;enumeration value="regionalCarFerryService"/>
 *     &lt;enumeration value="pti7_4"/>
 *     &lt;enumeration value="localCarFerryService"/>
 *     &lt;enumeration value="pti7_5"/>
 *     &lt;enumeration value="internationalPassengerFerry"/>
 *     &lt;enumeration value="pti7_6"/>
 *     &lt;enumeration value="nationalPassengerFerry"/>
 *     &lt;enumeration value="pti7_7"/>
 *     &lt;enumeration value="regionalPassengerFerry"/>
 *     &lt;enumeration value="pti7_8"/>
 *     &lt;enumeration value="localPassengerFerry"/>
 *     &lt;enumeration value="pti7_9"/>
 *     &lt;enumeration value="postBoat"/>
 *     &lt;enumeration value="pti7_10"/>
 *     &lt;enumeration value="trainFerry"/>
 *     &lt;enumeration value="pti7_11"/>
 *     &lt;enumeration value="roadFerryLink"/>
 *     &lt;enumeration value="pti7_12"/>
 *     &lt;enumeration value="airportBoatLink"/>
 *     &lt;enumeration value="pti7_13"/>
 *     &lt;enumeration value="highSpeedVehicleService"/>
 *     &lt;enumeration value="pti7_14"/>
 *     &lt;enumeration value="highSpeedPassengerService"/>
 *     &lt;enumeration value="pti7_15"/>
 *     &lt;enumeration value="sightseeingService"/>
 *     &lt;enumeration value="pti7_16"/>
 *     &lt;enumeration value="schoolBoat"/>
 *     &lt;enumeration value="pti7_17"/>
 *     &lt;enumeration value="cableFerry"/>
 *     &lt;enumeration value="pti7_18"/>
 *     &lt;enumeration value="riverBus"/>
 *     &lt;enumeration value="pti7_19"/>
 *     &lt;enumeration value="scheduledFerry"/>
 *     &lt;enumeration value="pti7_20"/>
 *     &lt;enumeration value="shuttleFerryService"/>
 *     &lt;enumeration value="pti7_21"/>
 *     &lt;enumeration value="allWaterTransportServices"/>
 *     &lt;enumeration value="pti7_255"/>
 *     &lt;enumeration value="undefinedWaterTransport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WaterSubmodesOfTransportEnumeration")
@XmlEnum
public enum WaterSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti7_0")
    PTI_7_0("pti7_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti7_1")
    PTI_7_1("pti7_1"),
    @XmlEnumValue("internationalCarFerryService")
    INTERNATIONAL_CAR_FERRY_SERVICE("internationalCarFerryService"),
    @XmlEnumValue("pti7_2")
    PTI_7_2("pti7_2"),
    @XmlEnumValue("nationalCarFerryService")
    NATIONAL_CAR_FERRY_SERVICE("nationalCarFerryService"),
    @XmlEnumValue("pti7_3")
    PTI_7_3("pti7_3"),
    @XmlEnumValue("regionalCarFerryService")
    REGIONAL_CAR_FERRY_SERVICE("regionalCarFerryService"),
    @XmlEnumValue("pti7_4")
    PTI_7_4("pti7_4"),
    @XmlEnumValue("localCarFerryService")
    LOCAL_CAR_FERRY_SERVICE("localCarFerryService"),
    @XmlEnumValue("pti7_5")
    PTI_7_5("pti7_5"),
    @XmlEnumValue("internationalPassengerFerry")
    INTERNATIONAL_PASSENGER_FERRY("internationalPassengerFerry"),
    @XmlEnumValue("pti7_6")
    PTI_7_6("pti7_6"),
    @XmlEnumValue("nationalPassengerFerry")
    NATIONAL_PASSENGER_FERRY("nationalPassengerFerry"),
    @XmlEnumValue("pti7_7")
    PTI_7_7("pti7_7"),
    @XmlEnumValue("regionalPassengerFerry")
    REGIONAL_PASSENGER_FERRY("regionalPassengerFerry"),
    @XmlEnumValue("pti7_8")
    PTI_7_8("pti7_8"),
    @XmlEnumValue("localPassengerFerry")
    LOCAL_PASSENGER_FERRY("localPassengerFerry"),
    @XmlEnumValue("pti7_9")
    PTI_7_9("pti7_9"),
    @XmlEnumValue("postBoat")
    POST_BOAT("postBoat"),
    @XmlEnumValue("pti7_10")
    PTI_7_10("pti7_10"),
    @XmlEnumValue("trainFerry")
    TRAIN_FERRY("trainFerry"),
    @XmlEnumValue("pti7_11")
    PTI_7_11("pti7_11"),
    @XmlEnumValue("roadFerryLink")
    ROAD_FERRY_LINK("roadFerryLink"),
    @XmlEnumValue("pti7_12")
    PTI_7_12("pti7_12"),
    @XmlEnumValue("airportBoatLink")
    AIRPORT_BOAT_LINK("airportBoatLink"),
    @XmlEnumValue("pti7_13")
    PTI_7_13("pti7_13"),
    @XmlEnumValue("highSpeedVehicleService")
    HIGH_SPEED_VEHICLE_SERVICE("highSpeedVehicleService"),
    @XmlEnumValue("pti7_14")
    PTI_7_14("pti7_14"),
    @XmlEnumValue("highSpeedPassengerService")
    HIGH_SPEED_PASSENGER_SERVICE("highSpeedPassengerService"),
    @XmlEnumValue("pti7_15")
    PTI_7_15("pti7_15"),
    @XmlEnumValue("sightseeingService")
    SIGHTSEEING_SERVICE("sightseeingService"),
    @XmlEnumValue("pti7_16")
    PTI_7_16("pti7_16"),
    @XmlEnumValue("schoolBoat")
    SCHOOL_BOAT("schoolBoat"),
    @XmlEnumValue("pti7_17")
    PTI_7_17("pti7_17"),
    @XmlEnumValue("cableFerry")
    CABLE_FERRY("cableFerry"),
    @XmlEnumValue("pti7_18")
    PTI_7_18("pti7_18"),
    @XmlEnumValue("riverBus")
    RIVER_BUS("riverBus"),
    @XmlEnumValue("pti7_19")
    PTI_7_19("pti7_19"),
    @XmlEnumValue("scheduledFerry")
    SCHEDULED_FERRY("scheduledFerry"),
    @XmlEnumValue("pti7_20")
    PTI_7_20("pti7_20"),
    @XmlEnumValue("shuttleFerryService")
    SHUTTLE_FERRY_SERVICE("shuttleFerryService"),
    @XmlEnumValue("pti7_21")
    PTI_7_21("pti7_21"),
    @XmlEnumValue("allWaterTransportServices")
    ALL_WATER_TRANSPORT_SERVICES("allWaterTransportServices"),
    @XmlEnumValue("pti7_255")
    PTI_7_255("pti7_255"),
    @XmlEnumValue("undefinedWaterTransport")
    UNDEFINED_WATER_TRANSPORT("undefinedWaterTransport");
    private final String value;

    WaterSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaterSubmodesOfTransportEnumeration fromValue(String v) {
        for (WaterSubmodesOfTransportEnumeration c: WaterSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
