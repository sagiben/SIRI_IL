
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc03JunctionPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc03JunctionPointDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="junctionName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc03JunctionPointDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc03JunctionPointDescriptorSubtypeEnum {


    /**
     * Name of a road network junction where two or more roads join.
     * 
     */
    @XmlEnumValue("junctionName")
    JUNCTION_NAME("junctionName");
    private final String value;

    TPEGLoc03JunctionPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc03JunctionPointDescriptorSubtypeEnum fromValue(String v) {
        for (TPEGLoc03JunctionPointDescriptorSubtypeEnum c: TPEGLoc03JunctionPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
