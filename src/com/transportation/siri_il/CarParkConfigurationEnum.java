
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarParkConfigurationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarParkConfigurationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="multiStorey"/>
 *     &lt;enumeration value="parkAndRide"/>
 *     &lt;enumeration value="singleLevel"/>
 *     &lt;enumeration value="underground"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarParkConfigurationEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum CarParkConfigurationEnum {


    /**
     * Parking is on multiple levels within a car park building.
     * 
     */
    @XmlEnumValue("multiStorey")
    MULTI_STOREY("multiStorey"),

    /**
     * Car parking facility is associated with a park and ride service.
     * 
     */
    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),

    /**
     * Parking is on a single ground floor level.
     * 
     */
    @XmlEnumValue("singleLevel")
    SINGLE_LEVEL("singleLevel"),

    /**
     * Parking is on one or more floors below ground level.
     * 
     */
    @XmlEnumValue("underground")
    UNDERGROUND("underground");
    private final String value;

    CarParkConfigurationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarParkConfigurationEnum fromValue(String v) {
        for (CarParkConfigurationEnum c: CarParkConfigurationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}