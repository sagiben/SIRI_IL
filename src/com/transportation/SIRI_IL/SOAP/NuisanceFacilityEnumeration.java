
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NuisanceFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NuisanceFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="smoking"/>
 *     &lt;enumeration value="noSmoking"/>
 *     &lt;enumeration value="mobilePhoneUseZone"/>
 *     &lt;enumeration value="mobilePhoneFreeZone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NuisanceFacilityEnumeration")
@XmlEnum
public enum NuisanceFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("smoking")
    SMOKING("smoking"),
    @XmlEnumValue("noSmoking")
    NO_SMOKING("noSmoking"),
    @XmlEnumValue("mobilePhoneUseZone")
    MOBILE_PHONE_USE_ZONE("mobilePhoneUseZone"),
    @XmlEnumValue("mobilePhoneFreeZone")
    MOBILE_PHONE_FREE_ZONE("mobilePhoneFreeZone");
    private final String value;

    NuisanceFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NuisanceFacilityEnumeration fromValue(String v) {
        for (NuisanceFacilityEnumeration c: NuisanceFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
