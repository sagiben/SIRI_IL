
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedAdviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedAdviceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mandatorySpeedLimitInForce"/>
 *     &lt;enumeration value="observeRecommendedSpeed"/>
 *     &lt;enumeration value="observeSpeedLimits"/>
 *     &lt;enumeration value="policeSpeedChecksInOperation"/>
 *     &lt;enumeration value="reduceYourSpeed"/>
 *     &lt;enumeration value="speedLimitInForceForHeavyVehicles"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedAdviceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum SpeedAdviceEnum {


    /**
     * Mandatory speed limit in force.
     * 
     */
    @XmlEnumValue("mandatorySpeedLimitInForce")
    MANDATORY_SPEED_LIMIT_IN_FORCE("mandatorySpeedLimitInForce"),

    /**
     * Observe recommended speed.
     * 
     */
    @XmlEnumValue("observeRecommendedSpeed")
    OBSERVE_RECOMMENDED_SPEED("observeRecommendedSpeed"),

    /**
     * Observe speed limits.
     * 
     */
    @XmlEnumValue("observeSpeedLimits")
    OBSERVE_SPEED_LIMITS("observeSpeedLimits"),

    /**
     * Police speed checks in operation.
     * 
     */
    @XmlEnumValue("policeSpeedChecksInOperation")
    POLICE_SPEED_CHECKS_IN_OPERATION("policeSpeedChecksInOperation"),

    /**
     * Reduce your speed.
     * 
     */
    @XmlEnumValue("reduceYourSpeed")
    REDUCE_YOUR_SPEED("reduceYourSpeed"),

    /**
     * Speed limit in force for heavy vehicles.
     * 
     */
    @XmlEnumValue("speedLimitInForceForHeavyVehicles")
    SPEED_LIMIT_IN_FORCE_FOR_HEAVY_VEHICLES("speedLimitInForceForHeavyVehicles"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SpeedAdviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedAdviceEnum fromValue(String v) {
        for (SpeedAdviceEnum c: SpeedAdviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
