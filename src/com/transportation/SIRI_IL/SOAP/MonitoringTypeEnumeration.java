
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MonitoringTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="manual"/>
 *     &lt;enumeration value="automatic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MonitoringTypeEnumeration")
@XmlEnum
public enum MonitoringTypeEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("automatic")
    AUTOMATIC("automatic");
    private final String value;

    MonitoringTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonitoringTypeEnumeration fromValue(String v) {
        for (MonitoringTypeEnumeration c: MonitoringTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
