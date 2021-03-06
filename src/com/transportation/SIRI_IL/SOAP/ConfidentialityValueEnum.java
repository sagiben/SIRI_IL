
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfidentialityValueEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfidentialityValueEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="internalUse"/>
 *     &lt;enumeration value="noRestriction"/>
 *     &lt;enumeration value="restrictedToAuthorities"/>
 *     &lt;enumeration value="restrictedToAuthoritiesAndTrafficOperators"/>
 *     &lt;enumeration value="restrictedToAuthoritiesTrafficOperatorsAndPublishers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityValueEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ConfidentialityValueEnum {


    /**
     * For internal use only of the recipient organisation.
     * 
     */
    @XmlEnumValue("internalUse")
    INTERNAL_USE("internalUse"),

    /**
     * No restriction on usage.
     * 
     */
    @XmlEnumValue("noRestriction")
    NO_RESTRICTION("noRestriction"),

    /**
     * Restricted for use only by authorities.
     * 
     */
    @XmlEnumValue("restrictedToAuthorities")
    RESTRICTED_TO_AUTHORITIES("restrictedToAuthorities"),

    /**
     * Restricted for use only by authorities and traffic operators.
     * 
     */
    @XmlEnumValue("restrictedToAuthoritiesAndTrafficOperators")
    RESTRICTED_TO_AUTHORITIES_AND_TRAFFIC_OPERATORS("restrictedToAuthoritiesAndTrafficOperators"),

    /**
     * Restricted for use only by authorities, traffic operators and publishers (service providers).
     * 
     */
    @XmlEnumValue("restrictedToAuthoritiesTrafficOperatorsAndPublishers")
    RESTRICTED_TO_AUTHORITIES_TRAFFIC_OPERATORS_AND_PUBLISHERS("restrictedToAuthoritiesTrafficOperatorsAndPublishers");
    private final String value;

    ConfidentialityValueEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfidentialityValueEnum fromValue(String v) {
        for (ConfidentialityValueEnum c: ConfidentialityValueEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
