
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SanitaryFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SanitaryFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_22"/>
 *     &lt;enumeration value="toilet"/>
 *     &lt;enumeration value="pti23_23"/>
 *     &lt;enumeration value="noToilet"/>
 *     &lt;enumeration value="shower"/>
 *     &lt;enumeration value="wheelchairAcccessToilet"/>
 *     &lt;enumeration value="babyChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SanitaryFacilityEnumeration")
@XmlEnum
public enum SanitaryFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_22")
    PTI_23_22("pti23_22"),
    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("pti23_23")
    PTI_23_23("pti23_23"),
    @XmlEnumValue("noToilet")
    NO_TOILET("noToilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("wheelchairAcccessToilet")
    WHEELCHAIR_ACCCESS_TOILET("wheelchairAcccessToilet"),
    @XmlEnumValue("babyChange")
    BABY_CHANGE("babyChange");
    private final String value;

    SanitaryFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SanitaryFacilityEnumeration fromValue(String v) {
        for (SanitaryFacilityEnumeration c: SanitaryFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
