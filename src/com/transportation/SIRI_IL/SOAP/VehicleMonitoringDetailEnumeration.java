
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleMonitoringDetailEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleMonitoringDetailEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="minimum"/>
 *     &lt;enumeration value="basic"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="calls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleMonitoringDetailEnumeration")
@XmlEnum
public enum VehicleMonitoringDetailEnumeration {


    /**
     * Return only the minimum amount of optional data for each stop event to provide a display, A time, line name  and destination name.
     * 
     */
    @XmlEnumValue("minimum")
    MINIMUM("minimum"),

    /**
     * Return  minimum and other avaialble  basic details for each stop event. Do not include data on time at next stop or destination.
     * 
     */
    @XmlEnumValue("basic")
    BASIC("basic"),

    /**
     * Return all basic  data, and also arrival times at destination.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Return all available data for each stop event, including previous and onward journey patterns passing times.
     * 
     */
    @XmlEnumValue("calls")
    CALLS("calls");
    private final String value;

    VehicleMonitoringDetailEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleMonitoringDetailEnumeration fromValue(String v) {
        for (VehicleMonitoringDetailEnumeration c: VehicleMonitoringDetailEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
