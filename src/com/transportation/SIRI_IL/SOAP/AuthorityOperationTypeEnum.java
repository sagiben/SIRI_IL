
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityOperationTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityOperationTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="policeCheckPoint"/>
 *     &lt;enumeration value="policeInvestigation"/>
 *     &lt;enumeration value="survey"/>
 *     &lt;enumeration value="vehicleInspectionCheckPoint"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorityOperationTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum AuthorityOperationTypeEnum {


    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for use by police or other authorities.
     * 
     */
    @XmlEnumValue("policeCheckPoint")
    POLICE_CHECK_POINT("policeCheckPoint"),

    /**
     * A temporary operation established on or adjacent to the carriageway by the police associated with an ongoing investigation.
     * 
     */
    @XmlEnumValue("policeInvestigation")
    POLICE_INVESTIGATION("policeInvestigation"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for the purpose of gathering statistics or other traffic related information.
     * 
     */
    @XmlEnumValue("survey")
    SURVEY("survey"),

    /**
     * A permanent or temporary operation established on or adjacent to the carriageway for inspection of vehicles by authorities (e.g. vehicle saftey checks and tachograph checks).
     * 
     */
    @XmlEnumValue("vehicleInspectionCheckPoint")
    VEHICLE_INSPECTION_CHECK_POINT("vehicleInspectionCheckPoint"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    AuthorityOperationTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityOperationTypeEnum fromValue(String v) {
        for (AuthorityOperationTypeEnum c: AuthorityOperationTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
