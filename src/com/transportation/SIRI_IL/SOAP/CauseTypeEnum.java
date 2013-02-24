
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accident"/>
 *     &lt;enumeration value="congestion"/>
 *     &lt;enumeration value="equipmentFailure"/>
 *     &lt;enumeration value="infrastructureFailure"/>
 *     &lt;enumeration value="obstruction"/>
 *     &lt;enumeration value="poorWeather"/>
 *     &lt;enumeration value="problemsAtBorderPost"/>
 *     &lt;enumeration value="problemsAtCustomPost"/>
 *     &lt;enumeration value="problemsOnLocalRoads"/>
 *     &lt;enumeration value="roadsideEvent"/>
 *     &lt;enumeration value="securityIncident"/>
 *     &lt;enumeration value="terrorism"/>
 *     &lt;enumeration value="vandalism"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CauseTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum CauseTypeEnum {


    /**
     * Accident.
     * 
     */
    @XmlEnumValue("accident")
    ACCIDENT("accident"),

    /**
     * Traffic congestion.
     * 
     */
    @XmlEnumValue("congestion")
    CONGESTION("congestion"),

    /**
     * Failure of roadside equipment.
     * 
     */
    @XmlEnumValue("equipmentFailure")
    EQUIPMENT_FAILURE("equipmentFailure"),

    /**
     * Failure of road infrastructure.
     * 
     */
    @XmlEnumValue("infrastructureFailure")
    INFRASTRUCTURE_FAILURE("infrastructureFailure"),

    /**
     * Obstruction (of unspecified type) on the roadway.
     * 
     */
    @XmlEnumValue("obstruction")
    OBSTRUCTION("obstruction"),

    /**
     * Poor weather conditions.
     * 
     */
    @XmlEnumValue("poorWeather")
    POOR_WEATHER("poorWeather"),

    /**
     * Problems at the border crossing.
     * 
     */
    @XmlEnumValue("problemsAtBorderPost")
    PROBLEMS_AT_BORDER_POST("problemsAtBorderPost"),

    /**
     * Problems at the customs post on the border.
     * 
     */
    @XmlEnumValue("problemsAtCustomPost")
    PROBLEMS_AT_CUSTOM_POST("problemsAtCustomPost"),

    /**
     * Problems (of an unspecified nature) on the local roads.
     * 
     */
    @XmlEnumValue("problemsOnLocalRoads")
    PROBLEMS_ON_LOCAL_ROADS("problemsOnLocalRoads"),

    /**
     * A roadside event (of unspecified nature) whether planned or not.
     * 
     */
    @XmlEnumValue("roadsideEvent")
    ROADSIDE_EVENT("roadsideEvent"),

    /**
     * A security incident.
     * 
     */
    @XmlEnumValue("securityIncident")
    SECURITY_INCIDENT("securityIncident"),

    /**
     * A terrorist incident.
     * 
     */
    @XmlEnumValue("terrorism")
    TERRORISM("terrorism"),

    /**
     * A vandalism incident.
     * 
     */
    @XmlEnumValue("vandalism")
    VANDALISM("vandalism");
    private final String value;

    CauseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CauseTypeEnum fromValue(String v) {
        for (CauseTypeEnum c: CauseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
