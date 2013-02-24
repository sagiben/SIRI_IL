
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeverityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti26_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti26_1"/>
 *     &lt;enumeration value="verySlight"/>
 *     &lt;enumeration value="pti26_2"/>
 *     &lt;enumeration value="slight"/>
 *     &lt;enumeration value="pti26_3"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="pti26_4"/>
 *     &lt;enumeration value="severe"/>
 *     &lt;enumeration value="pti26_5"/>
 *     &lt;enumeration value="verySevere"/>
 *     &lt;enumeration value="pti26_6"/>
 *     &lt;enumeration value="noImpact"/>
 *     &lt;enumeration value="pti26_255"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeverityEnumeration")
@XmlEnum
public enum SeverityEnumeration {

    @XmlEnumValue("pti26_0")
    PTI_26_0("pti26_0"),

    /**
     * TPEG Pti26_0:  unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti26_1")
    PTI_26_1("pti26_1"),

    /**
     * TPEG Pti26_1: very slight
     * 
     */
    @XmlEnumValue("verySlight")
    VERY_SLIGHT("verySlight"),
    @XmlEnumValue("pti26_2")
    PTI_26_2("pti26_2"),

    /**
     * TPEG Pti26_2: slight
     * 
     */
    @XmlEnumValue("slight")
    SLIGHT("slight"),
    @XmlEnumValue("pti26_3")
    PTI_26_3("pti26_3"),

    /**
     * TPEG Pti26_3: normal
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("pti26_4")
    PTI_26_4("pti26_4"),

    /**
     * TPEG Pti26_4: severe
     * 
     */
    @XmlEnumValue("severe")
    SEVERE("severe"),
    @XmlEnumValue("pti26_5")
    PTI_26_5("pti26_5"),

    /**
     * TPEG Pti26_5: verySevere
     * 
     */
    @XmlEnumValue("verySevere")
    VERY_SEVERE("verySevere"),
    @XmlEnumValue("pti26_6")
    PTI_26_6("pti26_6"),

    /**
     * TPEG Pti26_6: noImpact
     * 
     */
    @XmlEnumValue("noImpact")
    NO_IMPACT("noImpact"),
    @XmlEnumValue("pti26_255")
    PTI_26_255("pti26_255"),

    /**
     * TPEG Pti26_255: undefined
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    SeverityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityEnumeration fromValue(String v) {
        for (SeverityEnumeration c: SeverityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
