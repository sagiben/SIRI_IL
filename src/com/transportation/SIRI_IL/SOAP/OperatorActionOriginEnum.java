
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatorActionOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatorActionOriginEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="external"/>
 *     &lt;enumeration value="internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatorActionOriginEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum OperatorActionOriginEnum {


    /**
     * Operator action originated externally to the authority which is taking the action.
     * 
     */
    @XmlEnumValue("external")
    EXTERNAL("external"),

    /**
     * Operator action originated within the authority which is taking the action.
     * 
     */
    @XmlEnumValue("internal")
    INTERNAL("internal");
    private final String value;

    OperatorActionOriginEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatorActionOriginEnum fromValue(String v) {
        for (OperatorActionOriginEnum c: OperatorActionOriginEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
