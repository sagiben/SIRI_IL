
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemedyTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemedyTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="repair"/>
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="otherRoute"/>
 *     &lt;enumeration value="otherLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemedyTypeEnumeration")
@XmlEnum
public enum RemedyTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("repair")
    REPAIR("repair"),
    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("otherRoute")
    OTHER_ROUTE("otherRoute"),
    @XmlEnumValue("otherLocation")
    OTHER_LOCATION("otherLocation");
    private final String value;

    RemedyTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemedyTypeEnumeration fromValue(String v) {
        for (RemedyTypeEnumeration c: RemedyTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
