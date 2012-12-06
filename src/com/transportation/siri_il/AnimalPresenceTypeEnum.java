
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnimalPresenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnimalPresenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="animalsOnTheRoad"/>
 *     &lt;enumeration value="herdOfAnimalsOnTheRoad"/>
 *     &lt;enumeration value="largeAnimalsOnTheRoad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnimalPresenceTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum AnimalPresenceTypeEnum {


    /**
     * Traffic may be disrupted due to animals on the roadway.
     * 
     */
    @XmlEnumValue("animalsOnTheRoad")
    ANIMALS_ON_THE_ROAD("animalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to a herd of animals on the roadway.
     * 
     */
    @XmlEnumValue("herdOfAnimalsOnTheRoad")
    HERD_OF_ANIMALS_ON_THE_ROAD("herdOfAnimalsOnTheRoad"),

    /**
     * Traffic may be disrupted due to large animals on the roadway.
     * 
     */
    @XmlEnumValue("largeAnimalsOnTheRoad")
    LARGE_ANIMALS_ON_THE_ROAD("largeAnimalsOnTheRoad");
    private final String value;

    AnimalPresenceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnimalPresenceTypeEnum fromValue(String v) {
        for (AnimalPresenceTypeEnum c: AnimalPresenceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
