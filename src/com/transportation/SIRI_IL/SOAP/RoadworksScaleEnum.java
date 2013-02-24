
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksScaleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadworksScaleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="major"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="minor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadworksScaleEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RoadworksScaleEnum {


    /**
     * The roadworks are of a major scale.
     * 
     */
    @XmlEnumValue("major")
    MAJOR("major"),

    /**
     * The roadworks are of a medium scale.
     * 
     */
    @XmlEnumValue("medium")
    MEDIUM("medium"),

    /**
     * The roadworks are of a minor scale.
     * 
     */
    @XmlEnumValue("minor")
    MINOR("minor");
    private final String value;

    RoadworksScaleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksScaleEnum fromValue(String v) {
        for (RoadworksScaleEnum c: RoadworksScaleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
