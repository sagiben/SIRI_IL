
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterchangeManagementEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeManagementEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Planned"/>
 *     &lt;enumeration value="Advertised"/>
 *     &lt;enumeration value="Controlled"/>
 *     &lt;enumeration value="Guaranteed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterchangeManagementEnumeration")
@XmlEnum
public enum InterchangeManagementEnumeration {


    /**
     * Interchange is considered a possible connection between journeys.
     * 
     */
    @XmlEnumValue("Planned")
    PLANNED("Planned"),

    /**
     * Interchange is advertised to public as a possible connection between journeys.
     * 
     */
    @XmlEnumValue("Advertised")
    ADVERTISED("Advertised"),

    /**
     * Interchange is actively managed as a possible connection between journeys and passengers are informed of real-time alterations.
     * 
     */
    @XmlEnumValue("Controlled")
    CONTROLLED("Controlled"),

    /**
     * Interchange is actively managed as a possible connection between journeys and distributor may be delayed in order to make a transfer possible.
     * 
     */
    @XmlEnumValue("Guaranteed")
    GUARANTEED("Guaranteed");
    private final String value;

    InterchangeManagementEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeManagementEnumeration fromValue(String v) {
        for (InterchangeManagementEnumeration c: InterchangeManagementEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
