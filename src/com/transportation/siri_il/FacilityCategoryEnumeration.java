
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FacilityCategoryEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityCategoryEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="fixedEquipment"/>
 *     &lt;enumeration value="serviceProvidedByIndividual"/>
 *     &lt;enumeration value="serviceForPersonalDevice"/>
 *     &lt;enumeration value="reservedArea"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityCategoryEnumeration")
@XmlEnum
public enum FacilityCategoryEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("fixedEquipment")
    FIXED_EQUIPMENT("fixedEquipment"),
    @XmlEnumValue("serviceProvidedByIndividual")
    SERVICE_PROVIDED_BY_INDIVIDUAL("serviceProvidedByIndividual"),
    @XmlEnumValue("serviceForPersonalDevice")
    SERVICE_FOR_PERSONAL_DEVICE("serviceForPersonalDevice"),
    @XmlEnumValue("reservedArea")
    RESERVED_AREA("reservedArea");
    private final String value;

    FacilityCategoryEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityCategoryEnumeration fromValue(String v) {
        for (FacilityCategoryEnumeration c: FacilityCategoryEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
