
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc01AreaLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc01AreaLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="largeArea"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc01AreaLocationSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc01AreaLocationSubtypeEnum {


    /**
     * A geographic or geometric large area.
     * 
     */
    @XmlEnumValue("largeArea")
    LARGE_AREA("largeArea"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TPEGLoc01AreaLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc01AreaLocationSubtypeEnum fromValue(String v) {
        for (TPEGLoc01AreaLocationSubtypeEnum c: TPEGLoc01AreaLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
