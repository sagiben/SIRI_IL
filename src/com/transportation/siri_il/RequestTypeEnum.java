
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="catalogue"/>
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="requestData"/>
 *     &lt;enumeration value="requestHistoricalData"/>
 *     &lt;enumeration value="subscription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RequestTypeEnum {


    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("catalogue")
    CATALOGUE("catalogue"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("filter")
    FILTER("filter"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("requestData")
    REQUEST_DATA("requestData"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("requestHistoricalData")
    REQUEST_HISTORICAL_DATA("requestHistoricalData"),

    /**
     * Self-explanatory
     * 
     */
    @XmlEnumValue("subscription")
    SUBSCRIPTION("subscription");
    private final String value;

    RequestTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestTypeEnum fromValue(String v) {
        for (RequestTypeEnum c: RequestTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
