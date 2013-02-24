
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="automobileClubPatrol"/>
 *     &lt;enumeration value="cameraObservation"/>
 *     &lt;enumeration value="freightVehicleOperator"/>
 *     &lt;enumeration value="inductionLoopMonitoringStation"/>
 *     &lt;enumeration value="infraredMonitoringStation"/>
 *     &lt;enumeration value="microwaveMonitoringStation"/>
 *     &lt;enumeration value="mobileTelephoneCaller"/>
 *     &lt;enumeration value="nonPoliceEmergencyServicePatrol"/>
 *     &lt;enumeration value="otherInformation"/>
 *     &lt;enumeration value="otherOfficialVehicle"/>
 *     &lt;enumeration value="policePatrol"/>
 *     &lt;enumeration value="privateBreakdownService"/>
 *     &lt;enumeration value="publicAndPrivateUtilities"/>
 *     &lt;enumeration value="registeredMotoristObserver"/>
 *     &lt;enumeration value="roadAuthorities"/>
 *     &lt;enumeration value="roadOperatorPatrol"/>
 *     &lt;enumeration value="roadsideTelephoneCaller"/>
 *     &lt;enumeration value="spotterAircraft"/>
 *     &lt;enumeration value="trafficMonitoringStation"/>
 *     &lt;enumeration value="transitOperator"/>
 *     &lt;enumeration value="vehicleProbeMeasurement"/>
 *     &lt;enumeration value="videoProcessingMonitoringStation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum SourceTypeEnum {


    /**
     * A patrol of an automobile club.
     * 
     */
    @XmlEnumValue("automobileClubPatrol")
    AUTOMOBILE_CLUB_PATROL("automobileClubPatrol"),

    /**
     * A camera observation (either still or video camera).
     * 
     */
    @XmlEnumValue("cameraObservation")
    CAMERA_OBSERVATION("cameraObservation"),

    /**
     * An operator of freight vehicles.
     * 
     */
    @XmlEnumValue("freightVehicleOperator")
    FREIGHT_VEHICLE_OPERATOR("freightVehicleOperator"),

    /**
     * A station dedicated to the monitoring of the road network by processing inductive loop information.
     * 
     */
    @XmlEnumValue("inductionLoopMonitoringStation")
    INDUCTION_LOOP_MONITORING_STATION("inductionLoopMonitoringStation"),

    /**
     * A station dedicated to the monitoring of the road network by processing infrared image information.
     * 
     */
    @XmlEnumValue("infraredMonitoringStation")
    INFRARED_MONITORING_STATION("infraredMonitoringStation"),

    /**
     * A station dedicated to the monitoring of the road network by processing microwave information.
     * 
     */
    @XmlEnumValue("microwaveMonitoringStation")
    MICROWAVE_MONITORING_STATION("microwaveMonitoringStation"),

    /**
     * A caller using a mobile telephone (who may or may not be on the road network).
     * 
     */
    @XmlEnumValue("mobileTelephoneCaller")
    MOBILE_TELEPHONE_CALLER("mobileTelephoneCaller"),

    /**
     * Emergency service patrols other than police.
     * 
     */
    @XmlEnumValue("nonPoliceEmergencyServicePatrol")
    NON_POLICE_EMERGENCY_SERVICE_PATROL("nonPoliceEmergencyServicePatrol"),

    /**
     * Other sources of information.
     * 
     */
    @XmlEnumValue("otherInformation")
    OTHER_INFORMATION("otherInformation"),

    /**
     * Personnel from a vehicle belonging to the road operator or authority or any emergency service, including authorised breakdown service organisations.
     * 
     */
    @XmlEnumValue("otherOfficialVehicle")
    OTHER_OFFICIAL_VEHICLE("otherOfficialVehicle"),

    /**
     * A police patrol.
     * 
     */
    @XmlEnumValue("policePatrol")
    POLICE_PATROL("policePatrol"),

    /**
     * A private breakdown service.
     * 
     */
    @XmlEnumValue("privateBreakdownService")
    PRIVATE_BREAKDOWN_SERVICE("privateBreakdownService"),

    /**
     * A utility organisation, either public or private.
     * 
     */
    @XmlEnumValue("publicAndPrivateUtilities")
    PUBLIC_AND_PRIVATE_UTILITIES("publicAndPrivateUtilities"),

    /**
     * A motorist who is an officially registered observer.
     * 
     */
    @XmlEnumValue("registeredMotoristObserver")
    REGISTERED_MOTORIST_OBSERVER("registeredMotoristObserver"),

    /**
     * A road authority.
     * 
     */
    @XmlEnumValue("roadAuthorities")
    ROAD_AUTHORITIES("roadAuthorities"),

    /**
     * A patrol of the road operator or authority.
     * 
     */
    @XmlEnumValue("roadOperatorPatrol")
    ROAD_OPERATOR_PATROL("roadOperatorPatrol"),

    /**
     * A caller who is using an emergency roadside telephone.
     * 
     */
    @XmlEnumValue("roadsideTelephoneCaller")
    ROADSIDE_TELEPHONE_CALLER("roadsideTelephoneCaller"),

    /**
     * A spotter aircraft of an organisation specifically assigned to the monitoring of the traffic network.
     * 
     */
    @XmlEnumValue("spotterAircraft")
    SPOTTER_AIRCRAFT("spotterAircraft"),

    /**
     * A station, usually automatic, dedicated to the monitoring of the road network.
     * 
     */
    @XmlEnumValue("trafficMonitoringStation")
    TRAFFIC_MONITORING_STATION("trafficMonitoringStation"),

    /**
     * An operator of a transit service, e.g. bus link operator.
     * 
     */
    @XmlEnumValue("transitOperator")
    TRANSIT_OPERATOR("transitOperator"),

    /**
     * A specially equipped vehicle used to provide measurements.
     * 
     */
    @XmlEnumValue("vehicleProbeMeasurement")
    VEHICLE_PROBE_MEASUREMENT("vehicleProbeMeasurement"),

    /**
     * A station dedicated to the monitoring of the road network by processing video image information.
     * 
     */
    @XmlEnumValue("videoProcessingMonitoringStation")
    VIDEO_PROCESSING_MONITORING_STATION("videoProcessingMonitoringStation");
    private final String value;

    SourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceTypeEnum fromValue(String v) {
        for (SourceTypeEnum c: SourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
