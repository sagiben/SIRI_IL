
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompressionMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="deflate"/>
 *     &lt;enumeration value="gzip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompressionMethodEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum CompressionMethodEnum {


    /**
     * A compression algorithm defined by RFC 1951.
     * 
     */
    @XmlEnumValue("deflate")
    DEFLATE("deflate"),

    /**
     * The GNU zip compression utility defined by RFC 1952: GZIP 4.3 specification.
     * 
     */
    @XmlEnumValue("gzip")
    GZIP("gzip");
    private final String value;

    CompressionMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressionMethodEnum fromValue(String v) {
        for (CompressionMethodEnum c: CompressionMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
