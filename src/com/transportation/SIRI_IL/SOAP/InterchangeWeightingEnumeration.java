
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterchangeWeightingEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeWeightingEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noInterchange"/>
 *     &lt;enumeration value="interchangeAllowed"/>
 *     &lt;enumeration value="recommendedInterchange"/>
 *     &lt;enumeration value="preferredInterchange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterchangeWeightingEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum InterchangeWeightingEnumeration {

    @XmlEnumValue("noInterchange")
    NO_INTERCHANGE("noInterchange"),
    @XmlEnumValue("interchangeAllowed")
    INTERCHANGE_ALLOWED("interchangeAllowed"),
    @XmlEnumValue("recommendedInterchange")
    RECOMMENDED_INTERCHANGE("recommendedInterchange"),
    @XmlEnumValue("preferredInterchange")
    PREFERRED_INTERCHANGE("preferredInterchange");
    private final String value;

    InterchangeWeightingEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeWeightingEnumeration fromValue(String v) {
        for (InterchangeWeightingEnumeration c: InterchangeWeightingEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
