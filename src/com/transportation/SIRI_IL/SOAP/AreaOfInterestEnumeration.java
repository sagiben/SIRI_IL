
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaOfInterestEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfInterestEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="continentWide"/>
 *     &lt;enumeration value="national "/>
 *     &lt;enumeration value="neighboroughingCountries"/>
 *     &lt;enumeration value="regional"/>
 *     &lt;enumeration value="notSpecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaOfInterestEnumeration")
@XmlEnum
public enum AreaOfInterestEnumeration {

    @XmlEnumValue("continentWide")
    CONTINENT_WIDE("continentWide"),
    @XmlEnumValue("national ")
    NATIONAL("national "),
    @XmlEnumValue("neighboroughingCountries")
    NEIGHBOROUGHING_COUNTRIES("neighboroughingCountries"),
    @XmlEnumValue("regional")
    REGIONAL("regional"),
    @XmlEnumValue("notSpecified")
    NOT_SPECIFIED("notSpecified");
    private final String value;

    AreaOfInterestEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfInterestEnumeration fromValue(String v) {
        for (AreaOfInterestEnumeration c: AreaOfInterestEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
