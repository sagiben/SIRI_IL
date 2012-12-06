
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelaysTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelaysTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="delays"/>
 *     &lt;enumeration value="delaysOfUncertainDuration"/>
 *     &lt;enumeration value="longDelays"/>
 *     &lt;enumeration value="veryLongDelays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelaysTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DelaysTypeEnum {


    /**
     * Delays on the road network as a result of any situation which causes hold-ups.
     * 
     */
    @XmlEnumValue("delays")
    DELAYS("delays"),

    /**
     * Delays on the road network whose predicted duration cannot be estimated.
     * 
     */
    @XmlEnumValue("delaysOfUncertainDuration")
    DELAYS_OF_UNCERTAIN_DURATION("delaysOfUncertainDuration"),

    /**
     * Delays on the road network of unusual severity.
     * 
     */
    @XmlEnumValue("longDelays")
    LONG_DELAYS("longDelays"),

    /**
     * Delays on the road network of abnormally unusual severity.
     * 
     */
    @XmlEnumValue("veryLongDelays")
    VERY_LONG_DELAYS("veryLongDelays");
    private final String value;

    DelaysTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelaysTypeEnum fromValue(String v) {
        for (DelaysTypeEnum c: DelaysTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
