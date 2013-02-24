
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidityStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidityStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="definedByValidityTimeSpec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidityStatusEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ValidityStatusEnum {


    /**
     * The described event, action or item is currently active regardless of the definition of the validity time specification.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * The described event, action or item is currently suspended, that is inactive, regardless of the definition of the validity time specification.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),

    /**
     * The validity status of the described event, action or item is in accordance with the definition of the validity time specification.
     * 
     */
    @XmlEnumValue("definedByValidityTimeSpec")
    DEFINED_BY_VALIDITY_TIME_SPEC("definedByValidityTimeSpec");
    private final String value;

    ValidityStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidityStatusEnum fromValue(String v) {
        for (ValidityStatusEnum c: ValidityStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
