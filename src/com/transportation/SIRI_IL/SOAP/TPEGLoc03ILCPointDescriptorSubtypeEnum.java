
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPEGLoc03ILCPointDescriptorSubtypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TPEGLoc03ILCPointDescriptorSubtypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tpegILCName1"/>
 *     &lt;enumeration value="tpegILCName2"/>
 *     &lt;enumeration value="tpegILCName3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TPEGLoc03ILCPointDescriptorSubtypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum TPEGLoc03ILCPointDescriptorSubtypeEnum {


    /**
     * The name of the road on which the junction point is located.
     * 
     */
    @XmlEnumValue("tpegILCName1")
    TPEG_ILC_NAME_1("tpegILCName1"),

    /**
     * The name of the first intersecting road at the junction.
     * 
     */
    @XmlEnumValue("tpegILCName2")
    TPEG_ILC_NAME_2("tpegILCName2"),

    /**
     * The name of the second intersecting road (if one exists) at the junction.
     * 
     */
    @XmlEnumValue("tpegILCName3")
    TPEG_ILC_NAME_3("tpegILCName3");
    private final String value;

    TPEGLoc03ILCPointDescriptorSubtypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TPEGLoc03ILCPointDescriptorSubtypeEnum fromValue(String v) {
        for (TPEGLoc03ILCPointDescriptorSubtypeEnum c: TPEGLoc03ILCPointDescriptorSubtypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
