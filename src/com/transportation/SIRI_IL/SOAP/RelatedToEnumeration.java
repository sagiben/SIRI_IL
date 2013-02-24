
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedToEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelatedToEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="cause"/>
 *     &lt;enumeration value="effect"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="supercedes"/>
 *     &lt;enumeration value="supercededBy"/>
 *     &lt;enumeration value="associated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelatedToEnumeration")
@XmlEnum
public enum RelatedToEnumeration {

    @XmlEnumValue("cause")
    CAUSE("cause"),
    @XmlEnumValue("effect")
    EFFECT("effect"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("supercedes")
    SUPERCEDES("supercedes"),
    @XmlEnumValue("supercededBy")
    SUPERCEDED_BY("supercededBy"),
    @XmlEnumValue("associated")
    ASSOCIATED("associated");
    private final String value;

    RelatedToEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelatedToEnumeration fromValue(String v) {
        for (RelatedToEnumeration c: RelatedToEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
