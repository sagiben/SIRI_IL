
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecabinSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TelecabinSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti9_0"/>
 *     &lt;enumeration value="loc14_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti9_1"/>
 *     &lt;enumeration value="loc14_1"/>
 *     &lt;enumeration value="telecabin"/>
 *     &lt;enumeration value="pti9_2"/>
 *     &lt;enumeration value="loc14_3"/>
 *     &lt;enumeration value="cableCar"/>
 *     &lt;enumeration value="pti9_3"/>
 *     &lt;enumeration value="loc14_4"/>
 *     &lt;enumeration value="lift"/>
 *     &lt;enumeration value="pti9_4"/>
 *     &lt;enumeration value="loc14_52"/>
 *     &lt;enumeration value="chairLift"/>
 *     &lt;enumeration value="pti9_5"/>
 *     &lt;enumeration value="loc14_6"/>
 *     &lt;enumeration value="dragLift"/>
 *     &lt;enumeration value="pti9_6"/>
 *     &lt;enumeration value="smallTelecabin"/>
 *     &lt;enumeration value="pti9_7"/>
 *     &lt;enumeration value="allTelecabinServices"/>
 *     &lt;enumeration value="pti9_255"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="loc14_7"/>
 *     &lt;enumeration value="eggLift"/>
 *     &lt;enumeration value="loc14_8"/>
 *     &lt;enumeration value="mineralBuckets"/>
 *     &lt;enumeration value="loc14_255"/>
 *     &lt;enumeration value="telecabinLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TelecabinSubmodesOfTransportEnumeration")
@XmlEnum
public enum TelecabinSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti9_0")
    PTI_9_0("pti9_0"),
    @XmlEnumValue("loc14_0")
    LOC_14_0("loc14_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti9_1")
    PTI_9_1("pti9_1"),
    @XmlEnumValue("loc14_1")
    LOC_14_1("loc14_1"),
    @XmlEnumValue("telecabin")
    TELECABIN("telecabin"),
    @XmlEnumValue("pti9_2")
    PTI_9_2("pti9_2"),
    @XmlEnumValue("loc14_3")
    LOC_14_3("loc14_3"),
    @XmlEnumValue("cableCar")
    CABLE_CAR("cableCar"),
    @XmlEnumValue("pti9_3")
    PTI_9_3("pti9_3"),
    @XmlEnumValue("loc14_4")
    LOC_14_4("loc14_4"),
    @XmlEnumValue("lift")
    LIFT("lift"),
    @XmlEnumValue("pti9_4")
    PTI_9_4("pti9_4"),
    @XmlEnumValue("loc14_52")
    LOC_14_52("loc14_52"),
    @XmlEnumValue("chairLift")
    CHAIR_LIFT("chairLift"),
    @XmlEnumValue("pti9_5")
    PTI_9_5("pti9_5"),
    @XmlEnumValue("loc14_6")
    LOC_14_6("loc14_6"),
    @XmlEnumValue("dragLift")
    DRAG_LIFT("dragLift"),
    @XmlEnumValue("pti9_6")
    PTI_9_6("pti9_6"),
    @XmlEnumValue("smallTelecabin")
    SMALL_TELECABIN("smallTelecabin"),
    @XmlEnumValue("pti9_7")
    PTI_9_7("pti9_7"),
    @XmlEnumValue("allTelecabinServices")
    ALL_TELECABIN_SERVICES("allTelecabinServices"),
    @XmlEnumValue("pti9_255")
    PTI_9_255("pti9_255"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("loc14_7")
    LOC_14_7("loc14_7"),
    @XmlEnumValue("eggLift")
    EGG_LIFT("eggLift"),
    @XmlEnumValue("loc14_8")
    LOC_14_8("loc14_8"),
    @XmlEnumValue("mineralBuckets")
    MINERAL_BUCKETS("mineralBuckets"),
    @XmlEnumValue("loc14_255")
    LOC_14_255("loc14_255"),
    @XmlEnumValue("telecabinLink")
    TELECABIN_LINK("telecabinLink");
    private final String value;

    TelecabinSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelecabinSubmodesOfTransportEnumeration fromValue(String v) {
        for (TelecabinSubmodesOfTransportEnumeration c: TelecabinSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
