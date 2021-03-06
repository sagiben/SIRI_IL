
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelativeTrafficFlowEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelativeTrafficFlowEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="trafficVeryMuchHeavierThanNormal"/>
 *     &lt;enumeration value="trafficHeavierThanNormal"/>
 *     &lt;enumeration value="trafficLighterThanNormal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelativeTrafficFlowEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RelativeTrafficFlowEnum {


    /**
     * Traffic is very much heavier than normally expected at the specified location at this date/time.
     * 
     */
    @XmlEnumValue("trafficVeryMuchHeavierThanNormal")
    TRAFFIC_VERY_MUCH_HEAVIER_THAN_NORMAL("trafficVeryMuchHeavierThanNormal"),

    /**
     * Traffic is heavier than normally expected at the specified location at this date/time.
     * 
     */
    @XmlEnumValue("trafficHeavierThanNormal")
    TRAFFIC_HEAVIER_THAN_NORMAL("trafficHeavierThanNormal"),

    /**
     * Traffic is lighter than normally expected at the specified location at this date/time.
     * 
     */
    @XmlEnumValue("trafficLighterThanNormal")
    TRAFFIC_LIGHTER_THAN_NORMAL("trafficLighterThanNormal");
    private final String value;

    RelativeTrafficFlowEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelativeTrafficFlowEnum fromValue(String v) {
        for (RelativeTrafficFlowEnum c: RelativeTrafficFlowEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
