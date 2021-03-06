
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityStatusChangeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityStatusChangeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="added"/>
 *     &lt;enumeration value="removed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityStatusChangeEnumeration")
@XmlEnum
public enum FacilityStatusChangeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("added")
    ADDED("added"),
    @XmlEnumValue("removed")
    REMOVED("removed");
    private final String value;

    FacilityStatusChangeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityStatusChangeEnumeration fromValue(String v) {
        for (FacilityStatusChangeEnumeration c: FacilityStatusChangeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
