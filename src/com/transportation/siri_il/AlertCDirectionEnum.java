
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertCDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="negative"/>
 *     &lt;enumeration value="positive"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertCDirectionEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum AlertCDirectionEnum {


    /**
     * Indicates that both directions of traffic flow are affected by the situation or relate to the traffic data.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both"),

    /**
     * The direction of traffic flow concerned by a situation or traffic data. In Alert C the negative direction corresponds to the negative offset direction within the RDS location table.
     * 
     */
    @XmlEnumValue("negative")
    NEGATIVE("negative"),

    /**
     * The direction of traffic flow concerned by a situation or traffic data. In Alert C the positive direction corresponds to the positive offset direction within the RDS location table.
     * 
     */
    @XmlEnumValue("positive")
    POSITIVE("positive"),

    /**
     * Unknown direction.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AlertCDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCDirectionEnum fromValue(String v) {
        for (AlertCDirectionEnum c: AlertCDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
