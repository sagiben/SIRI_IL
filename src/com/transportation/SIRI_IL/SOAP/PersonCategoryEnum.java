
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonCategoryEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="adult"/>
 *     &lt;enumeration value="child"/>
 *     &lt;enumeration value="emergencyServicesPerson"/>
 *     &lt;enumeration value="infant"/>
 *     &lt;enumeration value="medicalStaff"/>
 *     &lt;enumeration value="police"/>
 *     &lt;enumeration value="politician"/>
 *     &lt;enumeration value="publicTransportPassenger"/>
 *     &lt;enumeration value="sickPerson"/>
 *     &lt;enumeration value="trafficPatrolOfficer"/>
 *     &lt;enumeration value="veryImportantPerson"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonCategoryEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum PersonCategoryEnum {


    /**
     * Adult.
     * 
     */
    @XmlEnumValue("adult")
    ADULT("adult"),

    /**
     * Child (age 4 to 17).
     * 
     */
    @XmlEnumValue("child")
    CHILD("child"),

    /**
     * A member of the emergency services, other than the police.
     * 
     */
    @XmlEnumValue("emergencyServicesPerson")
    EMERGENCY_SERVICES_PERSON("emergencyServicesPerson"),

    /**
     * Infant (age 0 to 3).
     * 
     */
    @XmlEnumValue("infant")
    INFANT("infant"),

    /**
     * A member of the medical staff.
     * 
     */
    @XmlEnumValue("medicalStaff")
    MEDICAL_STAFF("medicalStaff"),

    /**
     * A member of the police force.
     * 
     */
    @XmlEnumValue("police")
    POLICE("police"),

    /**
     * A politician.
     * 
     */
    @XmlEnumValue("politician")
    POLITICIAN("politician"),

    /**
     * A passenger on or from a public transport vehicle.
     * 
     */
    @XmlEnumValue("publicTransportPassenger")
    PUBLIC_TRANSPORT_PASSENGER("publicTransportPassenger"),

    /**
     * A sick person.
     * 
     */
    @XmlEnumValue("sickPerson")
    SICK_PERSON("sickPerson"),

    /**
     * A traffic patrol officer of the road authority.
     * 
     */
    @XmlEnumValue("trafficPatrolOfficer")
    TRAFFIC_PATROL_OFFICER("trafficPatrolOfficer"),

    /**
     * A very important person.
     * 
     */
    @XmlEnumValue("veryImportantPerson")
    VERY_IMPORTANT_PERSON("veryImportantPerson");
    private final String value;

    PersonCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonCategoryEnum fromValue(String v) {
        for (PersonCategoryEnum c: PersonCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
