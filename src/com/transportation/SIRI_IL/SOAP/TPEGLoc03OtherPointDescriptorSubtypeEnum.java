
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc03OtherPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc03OtherPointDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airportName"/>
 *     &lt;enumeration value="buildingName"/>
 *     &lt;enumeration value="busStopIdentifier"/>
 *     &lt;enumeration value="busStopName"/>
 *     &lt;enumeration value="canalName"/>
 *     &lt;enumeration value="ferryPortName"/>
 *     &lt;enumeration value="intersectionName"/>
 *     &lt;enumeration value="lakeName"/>
 *     &lt;enumeration value="linkName"/>
 *     &lt;enumeration value="localLinkName"/>
 *     &lt;enumeration value="metroStationName"/>
 *     &lt;enumeration value="nonLinkedPointName"/>
 *     &lt;enumeration value="parkingFacilityName"/>
 *     &lt;enumeration value="pointName"/>
 *     &lt;enumeration value="pointOfInterestName"/>
 *     &lt;enumeration value="railwayStation"/>
 *     &lt;enumeration value="riverName"/>
 *     &lt;enumeration value="seaName"/>
 *     &lt;enumeration value="serviceAreaName"/>
 *     &lt;enumeration value="tidalRiverName"/>
 *     &lt;enumeration value="townName"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc03OtherPointDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc03OtherPointDescriptorSubtypeEnum {


    /**
     * Name of an airport.
     * 
     */
    @XmlEnumValue("airportName")
    AIRPORT_NAME("airportName"),

    /**
     * Name of a building.
     * 
     */
    @XmlEnumValue("buildingName")
    BUILDING_NAME("buildingName"),

    /**
     * Identifier of a bus stop on the road network.
     * 
     */
    @XmlEnumValue("busStopIdentifier")
    BUS_STOP_IDENTIFIER("busStopIdentifier"),

    /**
     * Name of a bus stop on the road network.
     * 
     */
    @XmlEnumValue("busStopName")
    BUS_STOP_NAME("busStopName"),

    /**
     * Name of a canal.
     * 
     */
    @XmlEnumValue("canalName")
    CANAL_NAME("canalName"),

    /**
     * Name of a ferry port.
     * 
     */
    @XmlEnumValue("ferryPortName")
    FERRY_PORT_NAME("ferryPortName"),

    /**
     * Name of a road network intersection.
     * 
     */
    @XmlEnumValue("intersectionName")
    INTERSECTION_NAME("intersectionName"),

    /**
     * Name of a lake.
     * 
     */
    @XmlEnumValue("lakeName")
    LAKE_NAME("lakeName"),

    /**
     * Name of a road link.
     * 
     */
    @XmlEnumValue("linkName")
    LINK_NAME("linkName"),

    /**
     * Local name of a road link.
     * 
     */
    @XmlEnumValue("localLinkName")
    LOCAL_LINK_NAME("localLinkName"),

    /**
     * Name of a metro/underground station.
     * 
     */
    @XmlEnumValue("metroStationName")
    METRO_STATION_NAME("metroStationName"),

    /**
     * Name of a point on the road network which is not at a junction or intersection. 
     * 
     */
    @XmlEnumValue("nonLinkedPointName")
    NON_LINKED_POINT_NAME("nonLinkedPointName"),

    /**
     * Name of a parking facility.
     * 
     */
    @XmlEnumValue("parkingFacilityName")
    PARKING_FACILITY_NAME("parkingFacilityName"),

    /**
     * Name of a specific point.
     * 
     */
    @XmlEnumValue("pointName")
    POINT_NAME("pointName"),

    /**
     * Name of general point of interest.
     * 
     */
    @XmlEnumValue("pointOfInterestName")
    POINT_OF_INTEREST_NAME("pointOfInterestName"),

    /**
     * Name of a railway station.
     * 
     */
    @XmlEnumValue("railwayStation")
    RAILWAY_STATION("railwayStation"),

    /**
     * Name of a river.
     * 
     */
    @XmlEnumValue("riverName")
    RIVER_NAME("riverName"),

    /**
     * Name of a sea.
     * 
     */
    @XmlEnumValue("seaName")
    SEA_NAME("seaName"),

    /**
     * Name of a service area on a road network.
     * 
     */
    @XmlEnumValue("serviceAreaName")
    SERVICE_AREA_NAME("serviceAreaName"),

    /**
     * Name of a river which is of a tidal nature.
     * 
     */
    @XmlEnumValue("tidalRiverName")
    TIDAL_RIVER_NAME("tidalRiverName"),

    /**
     * Name of a town.
     * 
     */
    @XmlEnumValue("townName")
    TOWN_NAME("townName"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TPEGLoc03OtherPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc03OtherPointDescriptorSubtypeEnum fromValue(String v) {
        for (TPEGLoc03OtherPointDescriptorSubtypeEnum c: TPEGLoc03OtherPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
