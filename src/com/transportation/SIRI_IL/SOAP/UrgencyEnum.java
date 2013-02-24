
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrgencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UrgencyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="extremelyUrgent"/>
 *     &lt;enumeration value="urgent"/>
 *     &lt;enumeration value="normalUrgency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UrgencyEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum UrgencyEnum {


    /**
     * Dissemination of the information is extremely urgent.
     * 
     */
    @XmlEnumValue("extremelyUrgent")
    EXTREMELY_URGENT("extremelyUrgent"),

    /**
     * Dissemination of the information is urgent.
     * 
     */
    @XmlEnumValue("urgent")
    URGENT("urgent"),

    /**
     * Dissemination of the information is of normal urgency.
     * 
     */
    @XmlEnumValue("normalUrgency")
    NORMAL_URGENCY("normalUrgency");
    private final String value;

    UrgencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyEnum fromValue(String v) {
        for (UrgencyEnum c: UrgencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
