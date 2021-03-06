
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunicularSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunicularSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti10_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti10_1"/>
 *     &lt;enumeration value="loc14_2"/>
 *     &lt;enumeration value="funicular"/>
 *     &lt;enumeration value="pti10_2"/>
 *     &lt;enumeration value="allFunicularServices"/>
 *     &lt;enumeration value="pti10_255"/>
 *     &lt;enumeration value="undefinedFunicular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunicularSubmodesOfTransportEnumeration")
@XmlEnum
public enum FunicularSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti10_0")
    PTI_10_0("pti10_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti10_1")
    PTI_10_1("pti10_1"),
    @XmlEnumValue("loc14_2")
    LOC_14_2("loc14_2"),
    @XmlEnumValue("funicular")
    FUNICULAR("funicular"),
    @XmlEnumValue("pti10_2")
    PTI_10_2("pti10_2"),
    @XmlEnumValue("allFunicularServices")
    ALL_FUNICULAR_SERVICES("allFunicularServices"),
    @XmlEnumValue("pti10_255")
    PTI_10_255("pti10_255"),
    @XmlEnumValue("undefinedFunicular")
    UNDEFINED_FUNICULAR("undefinedFunicular");
    private final String value;

    FunicularSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunicularSubmodesOfTransportEnumeration fromValue(String v) {
        for (FunicularSubmodesOfTransportEnumeration c: FunicularSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
