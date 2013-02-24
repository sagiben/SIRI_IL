
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="broadcast"/>
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="internet"/>
 *     &lt;enumeration value="variableMessageSign"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InformationUsageEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum InformationUsageEnum {


    /**
     * For broadcast usage to any interested party.
     * 
     */
    @XmlEnumValue("broadcast")
    BROADCAST("broadcast"),

    /**
     * For internal usage within the recipient organisation.
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal"),

    /**
     * For support of Internet services.
     * 
     */
    @XmlEnumValue("internet")
    INTERNET("internet"),

    /**
     * For variable message sign usage.
     * 
     */
    @XmlEnumValue("variableMessageSign")
    VARIABLE_MESSAGE_SIGN("variableMessageSign");
    private final String value;

    InformationUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationUsageEnum fromValue(String v) {
        for (InformationUsageEnum c: InformationUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
