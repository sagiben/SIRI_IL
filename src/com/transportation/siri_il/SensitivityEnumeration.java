
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensitivityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="veryHigh"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="veryLow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SensitivityEnumeration")
@XmlEnum
public enum SensitivityEnumeration {

    @XmlEnumValue("veryHigh")
    VERY_HIGH("veryHigh"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("veryLow")
    VERY_LOW("veryLow");
    private final String value;

    SensitivityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensitivityEnumeration fromValue(String v) {
        for (SensitivityEnumeration c: SensitivityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
