
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatexPictogramEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatexPictogramEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="advisorySpeed"/>
 *     &lt;enumeration value="blankVoid"/>
 *     &lt;enumeration value="chainsOrSnowTyresRecommended"/>
 *     &lt;enumeration value="crossWind"/>
 *     &lt;enumeration value="drivingOfVehiclesLessThanXMetresApartProhibited"/>
 *     &lt;enumeration value="endOfAdvisorySpeed"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertaking"/>
 *     &lt;enumeration value="endOfProhibitionOfOvertakingForGoodsVehicles"/>
 *     &lt;enumeration value="endOfSpeedLimit"/>
 *     &lt;enumeration value="exitClosed"/>
 *     &lt;enumeration value="fog"/>
 *     &lt;enumeration value="keepASafeDistance"/>
 *     &lt;enumeration value="maximumSpeedLimit"/>
 *     &lt;enumeration value="noEntry"/>
 *     &lt;enumeration value="noEntryForGoodsVehicles"/>
 *     &lt;enumeration value="noEntryForVehiclesExceedingXTonnesLadenMass"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"/>
 *     &lt;enumeration value="noEntryForVehiclesCarryingDangerousGoods"/>
 *     &lt;enumeration value="otherDanger"/>
 *     &lt;enumeration value="overtakingByGoodsVehiclesProhibited"/>
 *     &lt;enumeration value="overtakingProhibited"/>
 *     &lt;enumeration value="roadClosedAhead"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="snow"/>
 *     &lt;enumeration value="snowTyresCompulsory"/>
 *     &lt;enumeration value="trafficCongestion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatexPictogramEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DatexPictogramEnum {


    /**
     * Advisory speed limit.
     * 
     */
    @XmlEnumValue("advisorySpeed")
    ADVISORY_SPEED("advisorySpeed"),

    /**
     * Blank or void.
     * 
     */
    @XmlEnumValue("blankVoid")
    BLANK_VOID("blankVoid"),

    /**
     * Chains or snow tyres are recommended.
     * 
     */
    @XmlEnumValue("chainsOrSnowTyresRecommended")
    CHAINS_OR_SNOW_TYRES_RECOMMENDED("chainsOrSnowTyresRecommended"),

    /**
     * Cross wind.
     * 
     */
    @XmlEnumValue("crossWind")
    CROSS_WIND("crossWind"),

    /**
     * The driving of vehicles less than X metres apart is prohibited.
     * 
     */
    @XmlEnumValue("drivingOfVehiclesLessThanXMetresApartProhibited")
    DRIVING_OF_VEHICLES_LESS_THAN_X_METRES_APART_PROHIBITED("drivingOfVehiclesLessThanXMetresApartProhibited"),

    /**
     * End of advisory speed limit.
     * 
     */
    @XmlEnumValue("endOfAdvisorySpeed")
    END_OF_ADVISORY_SPEED("endOfAdvisorySpeed"),

    /**
     * End of prohibition of overtaking.
     * 
     */
    @XmlEnumValue("endOfProhibitionOfOvertaking")
    END_OF_PROHIBITION_OF_OVERTAKING("endOfProhibitionOfOvertaking"),

    /**
     * End of prohibition of overtaking for goods vehicles.
     * 
     */
    @XmlEnumValue("endOfProhibitionOfOvertakingForGoodsVehicles")
    END_OF_PROHIBITION_OF_OVERTAKING_FOR_GOODS_VEHICLES("endOfProhibitionOfOvertakingForGoodsVehicles"),

    /**
     * End of mandatory speed limit.
     * 
     */
    @XmlEnumValue("endOfSpeedLimit")
    END_OF_SPEED_LIMIT("endOfSpeedLimit"),

    /**
     * Exit closed.
     * 
     */
    @XmlEnumValue("exitClosed")
    EXIT_CLOSED("exitClosed"),

    /**
     * Fog.
     * 
     */
    @XmlEnumValue("fog")
    FOG("fog"),

    /**
     * Keep a safe distance.
     * 
     */
    @XmlEnumValue("keepASafeDistance")
    KEEP_A_SAFE_DISTANCE("keepASafeDistance"),

    /**
     * Mandatory speed limit.
     * 
     */
    @XmlEnumValue("maximumSpeedLimit")
    MAXIMUM_SPEED_LIMIT("maximumSpeedLimit"),

    /**
     * No entry.
     * 
     */
    @XmlEnumValue("noEntry")
    NO_ENTRY("noEntry"),

    /**
     * No entry for goods vehicles.
     * 
     */
    @XmlEnumValue("noEntryForGoodsVehicles")
    NO_ENTRY_FOR_GOODS_VEHICLES("noEntryForGoodsVehicles"),

    /**
     * No entry for vehicles exceeding X tonnes laden mass.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesExceedingXTonnesLadenMass")
    NO_ENTRY_FOR_VEHICLES_EXCEEDING_X_TONNES_LADEN_MASS("noEntryForVehiclesExceedingXTonnesLadenMass"),

    /**
     * No entry for vehicles having a mass exceeding X tonnes on a single axle.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle")
    NO_ENTRY_FOR_VEHICLES_HAVING_A_MASS_EXCEEDING_X_TONNES_ON_ONE_AXLE("noEntryForVehiclesHavingAMassExceedingXTonnesOnOneAxle"),

    /**
     * No entry for vehicles having an overall height exceeding X metres.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_HEIGHT_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallHeightExceedingXMetres"),

    /**
     * No entry for vehicles having an overall length exceeding X metres.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres")
    NO_ENTRY_FOR_VEHICLES_HAVING_AN_OVERALL_LENGTH_EXCEEDING_X_METRES("noEntryForVehiclesHavingAnOverallLengthExceedingXMetres"),

    /**
     * No entry for vehicles carrying dangerous goods.
     * 
     */
    @XmlEnumValue("noEntryForVehiclesCarryingDangerousGoods")
    NO_ENTRY_FOR_VEHICLES_CARRYING_DANGEROUS_GOODS("noEntryForVehiclesCarryingDangerousGoods"),

    /**
     * Danger ahead.
     * 
     */
    @XmlEnumValue("otherDanger")
    OTHER_DANGER("otherDanger"),

    /**
     * Overtaking prohibited for goods vehicles.
     * 
     */
    @XmlEnumValue("overtakingByGoodsVehiclesProhibited")
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED("overtakingByGoodsVehiclesProhibited"),

    /**
     * Overtaking prohibited.
     * 
     */
    @XmlEnumValue("overtakingProhibited")
    OVERTAKING_PROHIBITED("overtakingProhibited"),

    /**
     * Road closed ahead.
     * 
     */
    @XmlEnumValue("roadClosedAhead")
    ROAD_CLOSED_AHEAD("roadClosedAhead"),

    /**
     * Roadworks.
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * Slippery road.
     * 
     */
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),

    /**
     * Snow.
     * 
     */
    @XmlEnumValue("snow")
    SNOW("snow"),

    /**
     * Snow types compulsory.
     * 
     */
    @XmlEnumValue("snowTyresCompulsory")
    SNOW_TYRES_COMPULSORY("snowTyresCompulsory"),

    /**
     * Traffic congestion and possible queues.
     * 
     */
    @XmlEnumValue("trafficCongestion")
    TRAFFIC_CONGESTION("trafficCongestion");
    private final String value;

    DatexPictogramEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatexPictogramEnum fromValue(String v) {
        for (DatexPictogramEnum c: DatexPictogramEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
