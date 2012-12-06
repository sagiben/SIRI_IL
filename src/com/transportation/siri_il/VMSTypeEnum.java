
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMSTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMSTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="colourGraphic"/>
 *     &lt;enumeration value="continuousSign"/>
 *     &lt;enumeration value="monochromeGraphic"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMSTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VMSTypeEnum {


    /**
     * A colour graphic display.
     * 
     */
    @XmlEnumValue("colourGraphic")
    COLOUR_GRAPHIC("colourGraphic"),

    /**
     * A sign implementing fixed messages which are selected by electromechanical means.
     * 
     */
    @XmlEnumValue("continuousSign")
    CONTINUOUS_SIGN("continuousSign"),

    /**
     * A monochrome graphic display.
     * 
     */
    @XmlEnumValue("monochromeGraphic")
    MONOCHROME_GRAPHIC("monochromeGraphic"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    VMSTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMSTypeEnum fromValue(String v) {
        for (VMSTypeEnum c: VMSTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
