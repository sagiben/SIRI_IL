
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allElementUpdate"/>
 *     &lt;enumeration value="singleElementUpdate"/>
 *     &lt;enumeration value="snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateMethodEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum UpdateMethodEnum {


    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("singleElementUpdate")
    SINGLE_ELEMENT_UPDATE("singleElementUpdate"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot");
    private final String value;

    UpdateMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum fromValue(String v) {
        for (UpdateMethodEnum c: UpdateMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
