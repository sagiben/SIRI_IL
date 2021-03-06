
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoorRoadInfrastructureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PoorRoadInfrastructureEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="automaticPaymentLaneNotWorking"/>
 *     &lt;enumeration value="automaticTollSystemNotWorkingPayManually"/>
 *     &lt;enumeration value="bridgeViaductDamage"/>
 *     &lt;enumeration value="damageToRoadInfrastructure"/>
 *     &lt;enumeration value="emergencyTelephoneNumberNotWorking"/>
 *     &lt;enumeration value="emergencyTelephonesNotWorking"/>
 *     &lt;enumeration value="galleryLightsNotWorking"/>
 *     &lt;enumeration value="laneControlSignsNotWorking"/>
 *     &lt;enumeration value="laneControlSignsWorkingIncorrectly"/>
 *     &lt;enumeration value="levelCrossingFailure"/>
 *     &lt;enumeration value="levelCrossingNotWorkingNormally"/>
 *     &lt;enumeration value="opticFiberDamage"/>
 *     &lt;enumeration value="powerFailure"/>
 *     &lt;enumeration value="rampControlSignalsNotWorking"/>
 *     &lt;enumeration value="rampControlSignalsWorkingIncorrectly"/>
 *     &lt;enumeration value="safetyBarrierDamage"/>
 *     &lt;enumeration value="temporaryTrafficLightsNotWorking"/>
 *     &lt;enumeration value="temporaryTrafficLightsWorkingIncorrectly"/>
 *     &lt;enumeration value="trafficLightsNotWorking"/>
 *     &lt;enumeration value="trafficLightsWorkingIncorrectly"/>
 *     &lt;enumeration value="trafficSignalControlComputerNotWorking"/>
 *     &lt;enumeration value="trafficSignalsNotWorkingProperly"/>
 *     &lt;enumeration value="trafficSignalTimingsChanged"/>
 *     &lt;enumeration value="tunnelLightsNotWorking"/>
 *     &lt;enumeration value="tunnelVentilationNotWorking"/>
 *     &lt;enumeration value="variableMessageSignsNotWorking"/>
 *     &lt;enumeration value="variableMessageSignsWorkingIncorrectly"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PoorRoadInfrastructureEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PoorRoadInfrastructureEnum {


    /**
     * Automatic payment lane not working at toll plaza.
     * 
     */
    @XmlEnumValue("automaticPaymentLaneNotWorking")
    AUTOMATIC_PAYMENT_LANE_NOT_WORKING("automaticPaymentLaneNotWorking"),

    /**
     * Automatic payment system not working at toll plaza. Pay manually instead.
     * 
     */
    @XmlEnumValue("automaticTollSystemNotWorkingPayManually")
    AUTOMATIC_TOLL_SYSTEM_NOT_WORKING_PAY_MANUALLY("automaticTollSystemNotWorkingPayManually"),

    /**
     * Damage to bridge or viaduct.
     * 
     */
    @XmlEnumValue("bridgeViaductDamage")
    BRIDGE_VIADUCT_DAMAGE("bridgeViaductDamage"),

    /**
     * Unspecified damage to road infrastructure.
     * 
     */
    @XmlEnumValue("damageToRoadInfrastructure")
    DAMAGE_TO_ROAD_INFRASTRUCTURE("damageToRoadInfrastructure"),

    /**
     * The designated telephone number for reporting problems or requesting assistance is not working.
     * 
     */
    @XmlEnumValue("emergencyTelephoneNumberNotWorking")
    EMERGENCY_TELEPHONE_NUMBER_NOT_WORKING("emergencyTelephoneNumberNotWorking"),

    /**
     * Emergency telephones within a specified length of road are not working.
     * 
     */
    @XmlEnumValue("emergencyTelephonesNotWorking")
    EMERGENCY_TELEPHONES_NOT_WORKING("emergencyTelephonesNotWorking"),

    /**
     * Lights within the gallery are not working.
     * 
     */
    @XmlEnumValue("galleryLightsNotWorking")
    GALLERY_LIGHTS_NOT_WORKING("galleryLightsNotWorking"),

    /**
     * Electronic traffic lane control signals are not working.
     * 
     */
    @XmlEnumValue("laneControlSignsNotWorking")
    LANE_CONTROL_SIGNS_NOT_WORKING("laneControlSignsNotWorking"),

    /**
     * Electronic traffic lane control signals are not working correctly (such that misleading or incorrect information may be provided).
     * 
     */
    @XmlEnumValue("laneControlSignsWorkingIncorrectly")
    LANE_CONTROL_SIGNS_WORKING_INCORRECTLY("laneControlSignsWorkingIncorrectly"),

    /**
     * The traffic control equipment where a railway crosses the road is not working.
     * 
     */
    @XmlEnumValue("levelCrossingFailure")
    LEVEL_CROSSING_FAILURE("levelCrossingFailure"),

    /**
     * The traffic control equipment where a railway crosses the road is not working correctly, presenting a potential hazard to motorists.
     * 
     */
    @XmlEnumValue("levelCrossingNotWorkingNormally")
    LEVEL_CROSSING_NOT_WORKING_NORMALLY("levelCrossingNotWorkingNormally"),

    /**
     * Damage to fibre optic comunications which may cause failures or malfunctuions of other systems.
     * 
     */
    @XmlEnumValue("opticFiberDamage")
    OPTIC_FIBER_DAMAGE("opticFiberDamage"),

    /**
     * Power failure.
     * 
     */
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),

    /**
     * The ramp control signals that control the entry and exit of vehicles to and from carriageways at the specified location are not working (i.e. they appear to be switched off).
     * 
     */
    @XmlEnumValue("rampControlSignalsNotWorking")
    RAMP_CONTROL_SIGNALS_NOT_WORKING("rampControlSignalsNotWorking"),

    /**
     * The traffic lights that control the entry and exit of vehicles to and from a carriageway at the specified location are working incorrectly, presenting a potential hazard to motorists.
     * 
     */
    @XmlEnumValue("rampControlSignalsWorkingIncorrectly")
    RAMP_CONTROL_SIGNALS_WORKING_INCORRECTLY("rampControlSignalsWorkingIncorrectly"),

    /**
     * Damage to the safety barrier.
     * 
     */
    @XmlEnumValue("safetyBarrierDamage")
    SAFETY_BARRIER_DAMAGE("safetyBarrierDamage"),

    /**
     * The temporary traffic lights at the specified location are not working (i.e. they appear to be switched off).
     * 
     */
    @XmlEnumValue("temporaryTrafficLightsNotWorking")
    TEMPORARY_TRAFFIC_LIGHTS_NOT_WORKING("temporaryTrafficLightsNotWorking"),

    /**
     * The temporary traffic lights at the specified location are working incorrectly, presenting a potential hazard to motorists.
     * 
     */
    @XmlEnumValue("temporaryTrafficLightsWorkingIncorrectly")
    TEMPORARY_TRAFFIC_LIGHTS_WORKING_INCORRECTLY("temporaryTrafficLightsWorkingIncorrectly"),

    /**
     * The traffic lights at the specified location are not working (i.e. they appear to be switched off).
     * 
     */
    @XmlEnumValue("trafficLightsNotWorking")
    TRAFFIC_LIGHTS_NOT_WORKING("trafficLightsNotWorking"),

    /**
     * The traffic lights at the specified location are working incorrectly, presenting a potential hazard to motorists.
     * 
     */
    @XmlEnumValue("trafficLightsWorkingIncorrectly")
    TRAFFIC_LIGHTS_WORKING_INCORRECTLY("trafficLightsWorkingIncorrectly"),

    /**
     * The traffic signal timing computer is not working possibly causing greater disruption to traffic than under normal conditions.
     * 
     */
    @XmlEnumValue("trafficSignalControlComputerNotWorking")
    TRAFFIC_SIGNAL_CONTROL_COMPUTER_NOT_WORKING("trafficSignalControlComputerNotWorking"),

    /**
     * The traffic signals at the specified location are working incorrectly, presenting a potential hazard to motorists.
     * 
     */
    @XmlEnumValue("trafficSignalsNotWorkingProperly")
    TRAFFIC_SIGNALS_NOT_WORKING_PROPERLY("trafficSignalsNotWorkingProperly"),

    /**
     * Traffic signal phase timings or sequence have been altered which may cause a hazard to road users.
     * 
     */
    @XmlEnumValue("trafficSignalTimingsChanged")
    TRAFFIC_SIGNAL_TIMINGS_CHANGED("trafficSignalTimingsChanged"),

    /**
     * Lights within the tunnel are not working.
     * 
     */
    @XmlEnumValue("tunnelLightsNotWorking")
    TUNNEL_LIGHTS_NOT_WORKING("tunnelLightsNotWorking"),

    /**
     * Ventilation equipment in the tunnel is not working, possibly causing pollution problems and poor air quality.
     * 
     */
    @XmlEnumValue("tunnelVentilationNotWorking")
    TUNNEL_VENTILATION_NOT_WORKING("tunnelVentilationNotWorking"),

    /**
     * Variable message signs at the specified location are not working.
     * 
     */
    @XmlEnumValue("variableMessageSignsNotWorking")
    VARIABLE_MESSAGE_SIGNS_NOT_WORKING("variableMessageSignsNotWorking"),

    /**
     * Variable message signs at the specified location are not working correctly (such that misleading or incorrect information may be provided).
     * 
     */
    @XmlEnumValue("variableMessageSignsWorkingIncorrectly")
    VARIABLE_MESSAGE_SIGNS_WORKING_INCORRECTLY("variableMessageSignsWorkingIncorrectly"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PoorRoadInfrastructureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PoorRoadInfrastructureEnum fromValue(String v) {
        for (PoorRoadInfrastructureEnum c: PoorRoadInfrastructureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
