
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuitabilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuitabilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="suitable"/>
 *     &lt;enumeration value="notSuitable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuitabilityEnumeration", namespace = "http://www.ifopt.org.uk/acsb")
@XmlEnum
public enum SuitabilityEnumeration {

    @XmlEnumValue("suitable")
    SUITABLE("suitable"),
    @XmlEnumValue("notSuitable")
    NOT_SUITABLE("notSuitable");
    private final String value;

    SuitabilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuitabilityEnumeration fromValue(String v) {
        for (SuitabilityEnumeration c: SuitabilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
