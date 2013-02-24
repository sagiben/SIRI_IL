
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarParkStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarParkStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="carParkClosed"/>
 *     &lt;enumeration value="allCarParksFull"/>
 *     &lt;enumeration value="carParkFacilityFaulty"/>
 *     &lt;enumeration value="carParkFull"/>
 *     &lt;enumeration value="carParkStatusUnknown"/>
 *     &lt;enumeration value="enoughSpacesAvailable"/>
 *     &lt;enumeration value="multiStoryCarParksFull"/>
 *     &lt;enumeration value="noMoreParkingSpacesAvailable"/>
 *     &lt;enumeration value="noParkAndRideInformation"/>
 *     &lt;enumeration value="noParkingAllowed"/>
 *     &lt;enumeration value="noParkingInformationAvailable"/>
 *     &lt;enumeration value="normalParkingRestrictionsLifted"/>
 *     &lt;enumeration value="onlyAFewSpacesAvailable"/>
 *     &lt;enumeration value="parkAndRideServiceNotOperating"/>
 *     &lt;enumeration value="parkAndRideServiceOperating"/>
 *     &lt;enumeration value="specialParkingRestrictionsInForce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarParkStatusEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum CarParkStatusEnum {


    /**
     * The specified car park is closed.
     * 
     */
    @XmlEnumValue("carParkClosed")
    CAR_PARK_CLOSED("carParkClosed"),

    /**
     * All car parks are full within a specified area.
     * 
     */
    @XmlEnumValue("allCarParksFull")
    ALL_CAR_PARKS_FULL("allCarParksFull"),

    /**
     * The specified car parking facility is not operating normally.
     * 
     */
    @XmlEnumValue("carParkFacilityFaulty")
    CAR_PARK_FACILITY_FAULTY("carParkFacilityFaulty"),

    /**
     * A specified car park is completely occupied.
     * 
     */
    @XmlEnumValue("carParkFull")
    CAR_PARK_FULL("carParkFull"),

    /**
     * The status of the specified car park(s) is unknown.
     * 
     */
    @XmlEnumValue("carParkStatusUnknown")
    CAR_PARK_STATUS_UNKNOWN("carParkStatusUnknown"),

    /**
     * Specified car parks have car-parking spaces available.
     * 
     */
    @XmlEnumValue("enoughSpacesAvailable")
    ENOUGH_SPACES_AVAILABLE("enoughSpacesAvailable"),

    /**
     * Multi level car parks are fully occupied.
     * 
     */
    @XmlEnumValue("multiStoryCarParksFull")
    MULTI_STORY_CAR_PARKS_FULL("multiStoryCarParksFull"),

    /**
     * Specified car parks are fully occupied.
     * 
     */
    @XmlEnumValue("noMoreParkingSpacesAvailable")
    NO_MORE_PARKING_SPACES_AVAILABLE("noMoreParkingSpacesAvailable"),

    /**
     * No park and ride information will be available until the specified time.
     * 
     */
    @XmlEnumValue("noParkAndRideInformation")
    NO_PARK_AND_RIDE_INFORMATION("noParkAndRideInformation"),

    /**
     * No parking allowed until the specified time.
     * 
     */
    @XmlEnumValue("noParkingAllowed")
    NO_PARKING_ALLOWED("noParkingAllowed"),

    /**
     * Car-parking information is not available until a specified time.
     * 
     */
    @XmlEnumValue("noParkingInformationAvailable")
    NO_PARKING_INFORMATION_AVAILABLE("noParkingInformationAvailable"),

    /**
     * The parking restrictions that normally apply in the specified location have been temporarily lifted.
     * 
     */
    @XmlEnumValue("normalParkingRestrictionsLifted")
    NORMAL_PARKING_RESTRICTIONS_LIFTED("normalParkingRestrictionsLifted"),

    /**
     * Specified car parks have 95% or greater occupancy.
     * 
     */
    @XmlEnumValue("onlyAFewSpacesAvailable")
    ONLY_A_FEW_SPACES_AVAILABLE("onlyAFewSpacesAvailable"),

    /**
     * Park and ride services are not operating until the specified time.
     * 
     */
    @XmlEnumValue("parkAndRideServiceNotOperating")
    PARK_AND_RIDE_SERVICE_NOT_OPERATING("parkAndRideServiceNotOperating"),

    /**
     * Park and ride services are operating until the specified time.
     * 
     */
    @XmlEnumValue("parkAndRideServiceOperating")
    PARK_AND_RIDE_SERVICE_OPERATING("parkAndRideServiceOperating"),

    /**
     * Parking restrictions, other than those that normally apply, are in force in a specified area.
     * 
     */
    @XmlEnumValue("specialParkingRestrictionsInForce")
    SPECIAL_PARKING_RESTRICTIONS_IN_FORCE("specialParkingRestrictionsInForce");
    private final String value;

    CarParkStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkStatusEnum fromValue(String v) {
        for (CarParkStatusEnum c: CarParkStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
