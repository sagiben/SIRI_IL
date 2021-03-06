
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="public"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="staff"/>
 *     &lt;enumeration value="stationStaff"/>
 *     &lt;enumeration value="management"/>
 *     &lt;enumeration value="infoServices"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceEnumeration")
@XmlEnum
public enum AudienceEnumeration {

    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("stationStaff")
    STATION_STAFF("stationStaff"),
    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("infoServices")
    INFO_SERVICES("infoServices");
    private final String value;

    AudienceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudienceEnumeration fromValue(String v) {
        for (AudienceEnumeration c: AudienceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
