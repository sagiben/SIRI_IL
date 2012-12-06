
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationDescriptorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationDescriptorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aroundABendInRoad"/>
 *     &lt;enumeration value="atMotorwayInterchange"/>
 *     &lt;enumeration value="atRestArea"/>
 *     &lt;enumeration value="atServiceArea"/>
 *     &lt;enumeration value="atTollPlaza"/>
 *     &lt;enumeration value="atTunnelEntryOrExit"/>
 *     &lt;enumeration value="inGallery"/>
 *     &lt;enumeration value="inTheCentre"/>
 *     &lt;enumeration value="inTheOppositeDirection"/>
 *     &lt;enumeration value="inTunnel"/>
 *     &lt;enumeration value="onBorder"/>
 *     &lt;enumeration value="onBridge"/>
 *     &lt;enumeration value="onConnector"/>
 *     &lt;enumeration value="onIceRoad"/>
 *     &lt;enumeration value="onLevelCrossing"/>
 *     &lt;enumeration value="onLinkRoad"/>
 *     &lt;enumeration value="onPass"/>
 *     &lt;enumeration value="onRoundabout"/>
 *     &lt;enumeration value="onTheLeft"/>
 *     &lt;enumeration value="onTheRight"/>
 *     &lt;enumeration value="onTheRoadway"/>
 *     &lt;enumeration value="overCrestOfHill"/>
 *     &lt;enumeration value="withinJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationDescriptorEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum LocationDescriptorEnum {


    /**
     * Around a bend in the road.
     * 
     */
    @XmlEnumValue("aroundABendInRoad")
    AROUND_A_BEND_IN_ROAD("aroundABendInRoad"),

    /**
     * At a motorway interchange.
     * 
     */
    @XmlEnumValue("atMotorwayInterchange")
    AT_MOTORWAY_INTERCHANGE("atMotorwayInterchange"),

    /**
     * At rest area off the carriageway.
     * 
     */
    @XmlEnumValue("atRestArea")
    AT_REST_AREA("atRestArea"),

    /**
     * At service area.
     * 
     */
    @XmlEnumValue("atServiceArea")
    AT_SERVICE_AREA("atServiceArea"),

    /**
     * At toll plaza.
     * 
     */
    @XmlEnumValue("atTollPlaza")
    AT_TOLL_PLAZA("atTollPlaza"),

    /**
     * At entry or exit of tunnel.
     * 
     */
    @XmlEnumValue("atTunnelEntryOrExit")
    AT_TUNNEL_ENTRY_OR_EXIT("atTunnelEntryOrExit"),

    /**
     * In galley.
     * 
     */
    @XmlEnumValue("inGallery")
    IN_GALLERY("inGallery"),

    /**
     * In the centre of the roadway.
     * 
     */
    @XmlEnumValue("inTheCentre")
    IN_THE_CENTRE("inTheCentre"),

    /**
     * In the opposite direction.
     * 
     */
    @XmlEnumValue("inTheOppositeDirection")
    IN_THE_OPPOSITE_DIRECTION("inTheOppositeDirection"),

    /**
     * In tunnel.
     * 
     */
    @XmlEnumValue("inTunnel")
    IN_TUNNEL("inTunnel"),

    /**
     * On border crossing.
     * 
     */
    @XmlEnumValue("onBorder")
    ON_BORDER("onBorder"),

    /**
     * On bridge.
     * 
     */
    @XmlEnumValue("onBridge")
    ON_BRIDGE("onBridge"),

    /**
     * On connecting carriageway between two different roads or road sections.
     * 
     */
    @XmlEnumValue("onConnector")
    ON_CONNECTOR("onConnector"),

    /**
     * On ice road.
     * 
     */
    @XmlEnumValue("onIceRoad")
    ON_ICE_ROAD("onIceRoad"),

    /**
     * On level-crossing.
     * 
     */
    @XmlEnumValue("onLevelCrossing")
    ON_LEVEL_CROSSING("onLevelCrossing"),

    /**
     * On road section linking two different roads.
     * 
     */
    @XmlEnumValue("onLinkRoad")
    ON_LINK_ROAD("onLinkRoad"),

    /**
     * On mountain pass.
     * 
     */
    @XmlEnumValue("onPass")
    ON_PASS("onPass"),

    /**
     * On roundabout.
     * 
     */
    @XmlEnumValue("onRoundabout")
    ON_ROUNDABOUT("onRoundabout"),

    /**
     * On the left of the roadway.
     * 
     */
    @XmlEnumValue("onTheLeft")
    ON_THE_LEFT("onTheLeft"),

    /**
     * On the right of the roadway.
     * 
     */
    @XmlEnumValue("onTheRight")
    ON_THE_RIGHT("onTheRight"),

    /**
     * On the roadway.
     * 
     */
    @XmlEnumValue("onTheRoadway")
    ON_THE_ROADWAY("onTheRoadway"),

    /**
     * Over the crest of a hill.
     * 
     */
    @XmlEnumValue("overCrestOfHill")
    OVER_CREST_OF_HILL("overCrestOfHill"),

    /**
     * On the main carriageway within a junction between exit slip road and entry slip road.
     * 
     */
    @XmlEnumValue("withinJunction")
    WITHIN_JUNCTION("withinJunction");
    private final String value;

    LocationDescriptorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationDescriptorEnum fromValue(String v) {
        for (LocationDescriptorEnum c: LocationDescriptorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}