
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="direct"/>
 *     &lt;enumeration value="fetched"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryMethodEnumeration")
@XmlEnum
public enum DeliveryMethodEnumeration {

    @XmlEnumValue("direct")
    DIRECT("direct"),
    @XmlEnumValue("fetched")
    FETCHED("fetched");
    private final String value;

    DeliveryMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryMethodEnumeration fromValue(String v) {
        for (DeliveryMethodEnumeration c: DeliveryMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
