
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicEventTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicEventTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="athleticsMeeting"/>
 *     &lt;enumeration value="ballGame"/>
 *     &lt;enumeration value="baseballGame"/>
 *     &lt;enumeration value="basketballGame"/>
 *     &lt;enumeration value="bicycleRace"/>
 *     &lt;enumeration value="boatRace"/>
 *     &lt;enumeration value="boxingTournament"/>
 *     &lt;enumeration value="bullFight"/>
 *     &lt;enumeration value="ceremonialEvent"/>
 *     &lt;enumeration value="concert"/>
 *     &lt;enumeration value="cricketMatch"/>
 *     &lt;enumeration value="exhibition"/>
 *     &lt;enumeration value="fair"/>
 *     &lt;enumeration value="festival"/>
 *     &lt;enumeration value="filmTVMaking"/>
 *     &lt;enumeration value="footballMatch"/>
 *     &lt;enumeration value="funfair"/>
 *     &lt;enumeration value="golfTournament"/>
 *     &lt;enumeration value="hockeyGame"/>
 *     &lt;enumeration value="horseRaceMeeting"/>
 *     &lt;enumeration value="internationalSportsMeeting"/>
 *     &lt;enumeration value="majorEvent"/>
 *     &lt;enumeration value="marathon"/>
 *     &lt;enumeration value="market"/>
 *     &lt;enumeration value="match"/>
 *     &lt;enumeration value="motorSportRaceMeeting"/>
 *     &lt;enumeration value="parade"/>
 *     &lt;enumeration value="raceMeeting"/>
 *     &lt;enumeration value="rugbyMatch"/>
 *     &lt;enumeration value="severalMajorEvents"/>
 *     &lt;enumeration value="show"/>
 *     &lt;enumeration value="showJumping"/>
 *     &lt;enumeration value="sportsMeeting"/>
 *     &lt;enumeration value="stateOccasion"/>
 *     &lt;enumeration value="tennisTournament"/>
 *     &lt;enumeration value="tournament"/>
 *     &lt;enumeration value="tradeFair"/>
 *     &lt;enumeration value="waterSportsMeeting"/>
 *     &lt;enumeration value="winterSportsMeeting"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PublicEventTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PublicEventTypeEnum {


    /**
     * Athletics event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("athleticsMeeting")
    ATHLETICS_MEETING("athleticsMeeting"),

    /**
     * Ball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("ballGame")
    BALL_GAME("ballGame"),

    /**
     * Baseball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("baseballGame")
    BASEBALL_GAME("baseballGame"),

    /**
     * Basketball game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("basketballGame")
    BASKETBALL_GAME("basketballGame"),

    /**
     * Bicycle race that could disrupt traffic.
     * 
     */
    @XmlEnumValue("bicycleRace")
    BICYCLE_RACE("bicycleRace"),

    /**
     * Regatta (boat race event of sailing, powerboat or rowing) that could disrupt traffic.
     * 
     */
    @XmlEnumValue("boatRace")
    BOAT_RACE("boatRace"),

    /**
     * Boxing event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("boxingTournament")
    BOXING_TOURNAMENT("boxingTournament"),

    /**
     * Bull fighting event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("bullFight")
    BULL_FIGHT("bullFight"),

    /**
     * Formal or religious act, rite or ceremony that could disrupt traffic.
     * 
     */
    @XmlEnumValue("ceremonialEvent")
    CEREMONIAL_EVENT("ceremonialEvent"),

    /**
     * Concert event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("concert")
    CONCERT("concert"),

    /**
     * Cricket match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("cricketMatch")
    CRICKET_MATCH("cricketMatch"),

    /**
     * Major display or trade show which could disrupt traffic.
     * 
     */
    @XmlEnumValue("exhibition")
    EXHIBITION("exhibition"),

    /**
     * Periodic (e.g. annual), often traditional, gathering for entertainment or trade promotion, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("fair")
    FAIR("fair"),

    /**
     * Celebratory event or series of events which could disrupt traffic.
     * 
     */
    @XmlEnumValue("festival")
    FESTIVAL("festival"),

    /**
     * Film or TV making event which could disrupt traffic.
     * 
     */
    @XmlEnumValue("filmTVMaking")
    FILM_TV_MAKING("filmTVMaking"),

    /**
     * Football match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("footballMatch")
    FOOTBALL_MATCH("footballMatch"),

    /**
     * Periodic (e.g. annual), often traditional, gathering for entertainment, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("funfair")
    FUNFAIR("funfair"),

    /**
     * Golf tournament event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("golfTournament")
    GOLF_TOURNAMENT("golfTournament"),

    /**
     * Hockey game event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("hockeyGame")
    HOCKEY_GAME("hockeyGame"),

    /**
     * Horse race meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("horseRaceMeeting")
    HORSE_RACE_MEETING("horseRaceMeeting"),

    /**
     * Large sporting event of an international nature that could disrupt traffic.
     * 
     */
    @XmlEnumValue("internationalSportsMeeting")
    INTERNATIONAL_SPORTS_MEETING("internationalSportsMeeting"),

    /**
     * Significant organised event either on or near the roadway which could disrupt traffic.
     * 
     */
    @XmlEnumValue("majorEvent")
    MAJOR_EVENT("majorEvent"),

    /**
     * Marathon, cross-country or road running event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("marathon")
    MARATHON("marathon"),

    /**
     * Periodic (e.g. weekly) gathering for buying and selling, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("market")
    MARKET("market"),

    /**
     * Sports match of unspecified type that could disrupt traffic.
     * 
     */
    @XmlEnumValue("match")
    MATCH("match"),

    /**
     * Motor sport race meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("motorSportRaceMeeting")
    MOTOR_SPORT_RACE_MEETING("motorSportRaceMeeting"),

    /**
     * Formal display or organised procession which could disrupt traffic.
     * 
     */
    @XmlEnumValue("parade")
    PARADE("parade"),

    /**
     * Race meeting (other than horse or motor sport) that could disrupt traffic.
     * 
     */
    @XmlEnumValue("raceMeeting")
    RACE_MEETING("raceMeeting"),

    /**
     * Rugby match that could disrupt traffic.
     * 
     */
    @XmlEnumValue("rugbyMatch")
    RUGBY_MATCH("rugbyMatch"),

    /**
     * A series of significant organised events either on or near the roadway which could disrupt traffic.
     * 
     */
    @XmlEnumValue("severalMajorEvents")
    SEVERAL_MAJOR_EVENTS("severalMajorEvents"),

    /**
     * Entertainment event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("show")
    SHOW("show"),

    /**
     * Horse showing jumping and tournament event that could disrupt traffic.
     * 
     */
    @XmlEnumValue("showJumping")
    SHOW_JUMPING("showJumping"),

    /**
     * Sports event of unspecified type that could disrupt traffic.
     * 
     */
    @XmlEnumValue("sportsMeeting")
    SPORTS_MEETING("sportsMeeting"),

    /**
     * Public ceremony or visit of national or international significance which could disrupt traffic.
     * 
     */
    @XmlEnumValue("stateOccasion")
    STATE_OCCASION("stateOccasion"),

    /**
     * Tennis tournament that could disrupt traffic.
     * 
     */
    @XmlEnumValue("tennisTournament")
    TENNIS_TOURNAMENT("tennisTournament"),

    /**
     * Sporting event or series of events of unspecified type lasting more than one day which could disrupt traffic.
     * 
     */
    @XmlEnumValue("tournament")
    TOURNAMENT("tournament"),

    /**
     * A periodic (e.g. annual), often traditional, gathering for trade promotion, which could disrupt traffic.
     * 
     */
    @XmlEnumValue("tradeFair")
    TRADE_FAIR("tradeFair"),

    /**
     * Water sports meeting that could disrupt traffic.
     * 
     */
    @XmlEnumValue("waterSportsMeeting")
    WATER_SPORTS_MEETING("waterSportsMeeting"),

    /**
     * Winter sports meeting or event (e.g. skiing, ski jumping, skating) that could disrupt traffic.
     * 
     */
    @XmlEnumValue("winterSportsMeeting")
    WINTER_SPORTS_MEETING("winterSportsMeeting"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PublicEventTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicEventTypeEnum fromValue(String v) {
        for (PublicEventTypeEnum c: PublicEventTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
