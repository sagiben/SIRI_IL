
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacesAdviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlacesAdviceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aroundBendsInTheRoad"/>
 *     &lt;enumeration value="atCustomsPosts"/>
 *     &lt;enumeration value="atHighAltitudes"/>
 *     &lt;enumeration value="atTollPlazas"/>
 *     &lt;enumeration value="inGallaries"/>
 *     &lt;enumeration value="inLowLyingAreas"/>
 *     &lt;enumeration value="inShadedAreas"/>
 *     &lt;enumeration value="inTheCityCentre"/>
 *     &lt;enumeration value="inTheInnerCityAreas"/>
 *     &lt;enumeration value="inRoadworksAreas"/>
 *     &lt;enumeration value="inTunnels"/>
 *     &lt;enumeration value="onBridges"/>
 *     &lt;enumeration value="onEnteringOrLeavingTunnels"/>
 *     &lt;enumeration value="onSlipRoads"/>
 *     &lt;enumeration value="overTheCrestOfHills"/>
 *     &lt;enumeration value="onMotorways"/>
 *     &lt;enumeration value="onRoundabouts"/>
 *     &lt;enumeration value="onUndergroundSections"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlacesAdviceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PlacesAdviceEnum {


    /**
     * Around bends in the road.
     * 
     */
    @XmlEnumValue("aroundBendsInTheRoad")
    AROUND_BENDS_IN_THE_ROAD("aroundBendsInTheRoad"),

    /**
     * At customs posts.
     * 
     */
    @XmlEnumValue("atCustomsPosts")
    AT_CUSTOMS_POSTS("atCustomsPosts"),

    /**
     * At high altitudes.
     * 
     */
    @XmlEnumValue("atHighAltitudes")
    AT_HIGH_ALTITUDES("atHighAltitudes"),

    /**
     * At toll plazas.
     * 
     */
    @XmlEnumValue("atTollPlazas")
    AT_TOLL_PLAZAS("atTollPlazas"),

    /**
     * In gallaries.
     * 
     */
    @XmlEnumValue("inGallaries")
    IN_GALLARIES("inGallaries"),

    /**
     * In low lying areas.
     * 
     */
    @XmlEnumValue("inLowLyingAreas")
    IN_LOW_LYING_AREAS("inLowLyingAreas"),

    /**
     * In shaded areas.
     * 
     */
    @XmlEnumValue("inShadedAreas")
    IN_SHADED_AREAS("inShadedAreas"),

    /**
     * In the city centre.
     * 
     */
    @XmlEnumValue("inTheCityCentre")
    IN_THE_CITY_CENTRE("inTheCityCentre"),

    /**
     * In the inner city areas.
     * 
     */
    @XmlEnumValue("inTheInnerCityAreas")
    IN_THE_INNER_CITY_AREAS("inTheInnerCityAreas"),

    /**
     * In roadworks areas.
     * 
     */
    @XmlEnumValue("inRoadworksAreas")
    IN_ROADWORKS_AREAS("inRoadworksAreas"),

    /**
     * In tunnels.
     * 
     */
    @XmlEnumValue("inTunnels")
    IN_TUNNELS("inTunnels"),

    /**
     * On bridges.
     * 
     */
    @XmlEnumValue("onBridges")
    ON_BRIDGES("onBridges"),

    /**
     * On entering or leaving tunnels.
     * 
     */
    @XmlEnumValue("onEnteringOrLeavingTunnels")
    ON_ENTERING_OR_LEAVING_TUNNELS("onEnteringOrLeavingTunnels"),

    /**
     * On slip roads.
     * 
     */
    @XmlEnumValue("onSlipRoads")
    ON_SLIP_ROADS("onSlipRoads"),

    /**
     * Over the crest of hills.
     * 
     */
    @XmlEnumValue("overTheCrestOfHills")
    OVER_THE_CREST_OF_HILLS("overTheCrestOfHills"),

    /**
     * On motorways.
     * 
     */
    @XmlEnumValue("onMotorways")
    ON_MOTORWAYS("onMotorways"),

    /**
     * On roundabouts.
     * 
     */
    @XmlEnumValue("onRoundabouts")
    ON_ROUNDABOUTS("onRoundabouts"),

    /**
     * On underground sections of the road.
     * 
     */
    @XmlEnumValue("onUndergroundSections")
    ON_UNDERGROUND_SECTIONS("onUndergroundSections"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PlacesAdviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlacesAdviceEnum fromValue(String v) {
        for (PlacesAdviceEnum c: PlacesAdviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
