
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="escalator"/>
 *     &lt;enumeration value="travelator"/>
 *     &lt;enumeration value="ramp"/>
 *     &lt;enumeration value="stairs"/>
 *     &lt;enumeration value="shuttle"/>
 *     &lt;enumeration value="narrowEntrance"/>
 *     &lt;enumeration value="barrier"/>
 *     &lt;enumeration value="palletAccess_lowFloor"/>
 *     &lt;enumeration value="validator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessFacilityEnumeration")
@XmlEnum
public enum AccessFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("escalator")
    ESCALATOR("escalator"),
    @XmlEnumValue("travelator")
    TRAVELATOR("travelator"),
    @XmlEnumValue("ramp")
    RAMP("ramp"),
    @XmlEnumValue("stairs")
    STAIRS("stairs"),
    @XmlEnumValue("shuttle")
    SHUTTLE("shuttle"),
    @XmlEnumValue("narrowEntrance")
    NARROW_ENTRANCE("narrowEntrance"),
    @XmlEnumValue("barrier")
    BARRIER("barrier"),
    @XmlEnumValue("palletAccess_lowFloor")
    PALLET_ACCESS_LOW_FLOOR("palletAccess_lowFloor"),
    @XmlEnumValue("validator")
    VALIDATOR("validator");
    private final String value;

    AccessFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessFacilityEnumeration fromValue(String v) {
        for (AccessFacilityEnumeration c: AccessFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
