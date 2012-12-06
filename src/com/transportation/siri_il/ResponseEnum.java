
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="acknowledge"/>
 *     &lt;enumeration value="catalogueRequestDenied"/>
 *     &lt;enumeration value="filterRequestDenied"/>
 *     &lt;enumeration value="requestDenied"/>
 *     &lt;enumeration value="subscriptionRequestDenied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ResponseEnum {


    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("acknowledge")
    ACKNOWLEDGE("acknowledge"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("catalogueRequestDenied")
    CATALOGUE_REQUEST_DENIED("catalogueRequestDenied"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("filterRequestDenied")
    FILTER_REQUEST_DENIED("filterRequestDenied"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("requestDenied")
    REQUEST_DENIED("requestDenied"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("subscriptionRequestDenied")
    SUBSCRIPTION_REQUEST_DENIED("subscriptionRequestDenied");
    private final String value;

    ResponseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseEnum fromValue(String v) {
        for (ResponseEnum c: ResponseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
