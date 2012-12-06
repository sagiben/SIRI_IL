
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredictorsEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredictorsEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="avmsOnly"/>
 *     &lt;enumeration value="anyone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredictorsEnumeration")
@XmlEnum
public enum PredictorsEnumeration {

    @XmlEnumValue("avmsOnly")
    AVMS_ONLY("avmsOnly"),
    @XmlEnumValue("anyone")
    ANYONE("anyone");
    private final String value;

    PredictorsEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredictorsEnumeration fromValue(String v) {
        for (PredictorsEnumeration c: PredictorsEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
