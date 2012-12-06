
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbnormalTrafficTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AbnormalTrafficTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="queueingTraffic"/>
 *     &lt;enumeration value="stopAndGo"/>
 *     &lt;enumeration value="slowTraffic"/>
 *     &lt;enumeration value="stationaryTraffic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AbnormalTrafficTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum AbnormalTrafficTypeEnum {


    /**
     * Traffic is queueing at the specified location, although there is still some traffic movement.
     * 
     */
    @XmlEnumValue("queueingTraffic")
    QUEUEING_TRAFFIC("queueingTraffic"),

    /**
     * Current traffic conditions are of a stop and go nature with queues forming and ending continuously on the specified section of road.
     * 
     */
    @XmlEnumValue("stopAndGo")
    STOP_AND_GO("stopAndGo"),

    /**
     * Traffic is slow moving at the specified location.
     * 
     */
    @XmlEnumValue("slowTraffic")
    SLOW_TRAFFIC("slowTraffic"),

    /**
     * Traffic is stationary, or very near stationary, at the specified location.
     * 
     */
    @XmlEnumValue("stationaryTraffic")
    STATIONARY_TRAFFIC("stationaryTraffic");
    private final String value;

    AbnormalTrafficTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbnormalTrafficTypeEnum fromValue(String v) {
        for (AbnormalTrafficTypeEnum c: AbnormalTrafficTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
