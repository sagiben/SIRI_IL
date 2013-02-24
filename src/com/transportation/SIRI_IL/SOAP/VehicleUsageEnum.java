
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agricultural"/>
 *     &lt;enumeration value="commercial"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="military"/>
 *     &lt;enumeration value="nonCommercial"/>
 *     &lt;enumeration value="patrol"/>
 *     &lt;enumeration value="recoveryServices"/>
 *     &lt;enumeration value="roadMaintenanceOrConstruction"/>
 *     &lt;enumeration value="roadOperator"/>
 *     &lt;enumeration value="taxi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsageEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VehicleUsageEnum {


    /**
     * Vehicle used for agricultural purposes.
     * 
     */
    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),

    /**
     * Vehicle which is limited to non-private useage or public transport useage.
     * 
     */
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),

    /**
     * Vehicle used by the emergency services.
     * 
     */
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),

    /**
     * Vehicle used by the military.
     * 
     */
    @XmlEnumValue("military")
    MILITARY("military"),

    /**
     * Vehicle used for non-commercial or private purposes.
     * 
     */
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),

    /**
     * Vehicle used as part of a patrol service, e.g. automobile association patrols.
     * 
     */
    @XmlEnumValue("patrol")
    PATROL("patrol"),

    /**
     * Vehicle used to provide a recovery service.
     * 
     */
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),

    /**
     * Vehicle used for road maintenance or construction work purposes.
     * 
     */
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),

    /**
     * Vehicle used by the road operator.
     * 
     */
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),

    /**
     * Vehicle used to provide an authorised taxi service.
     * 
     */
    @XmlEnumValue("taxi")
    TAXI("taxi");
    private final String value;

    VehicleUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum fromValue(String v) {
        for (VehicleUsageEnum c: VehicleUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
