
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc01SimplePointLocationSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc01SimplePointLocationSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intersection"/>
 *     &lt;enumeration value="nonLinkedPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc01SimplePointLocationSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc01SimplePointLocationSubtypeEnum {


    /**
     * An point on the road network at which one or more roads intersect.
     * 
     */
    @XmlEnumValue("intersection")
    INTERSECTION("intersection"),

    /**
     * A point on the road network which is not at a junction or intersection.
     * 
     */
    @XmlEnumValue("nonLinkedPoint")
    NON_LINKED_POINT("nonLinkedPoint");
    private final String value;

    TPEGLoc01SimplePointLocationSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc01SimplePointLocationSubtypeEnum fromValue(String v) {
        for (TPEGLoc01SimplePointLocationSubtypeEnum c: TPEGLoc01SimplePointLocationSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
