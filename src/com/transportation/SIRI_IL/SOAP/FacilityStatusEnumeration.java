
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="notAvailable"/>
 *     &lt;enumeration value="partiallyAvailable"/>
 *     &lt;enumeration value="added"/>
 *     &lt;enumeration value="removed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityStatusEnumeration")
@XmlEnum
public enum FacilityStatusEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable"),
    @XmlEnumValue("partiallyAvailable")
    PARTIALLY_AVAILABLE("partiallyAvailable"),
    @XmlEnumValue("added")
    ADDED("added"),
    @XmlEnumValue("removed")
    REMOVED("removed");
    private final String value;

    FacilityStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityStatusEnumeration fromValue(String v) {
        for (FacilityStatusEnumeration c: FacilityStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
