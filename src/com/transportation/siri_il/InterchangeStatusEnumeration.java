
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterchangeStatusEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterchangeStatusEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti31_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti31_1"/>
 *     &lt;enumeration value="connection"/>
 *     &lt;enumeration value="pti31_2"/>
 *     &lt;enumeration value="replacement"/>
 *     &lt;enumeration value="pti31_3"/>
 *     &lt;enumeration value="alternative"/>
 *     &lt;enumeration value="pti31_4"/>
 *     &lt;enumeration value="connectionNotHeld"/>
 *     &lt;enumeration value="pti31_5"/>
 *     &lt;enumeration value="connectionHeld"/>
 *     &lt;enumeration value="pti31_6"/>
 *     &lt;enumeration value="statusOfConenctionUndecided"/>
 *     &lt;enumeration value="pti31_255"/>
 *     &lt;enumeration value="undefinedCrossReferenceInformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InterchangeStatusEnumeration")
@XmlEnum
public enum InterchangeStatusEnumeration {

    @XmlEnumValue("pti31_0")
    PTI_31_0("pti31_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti31_1")
    PTI_31_1("pti31_1"),
    @XmlEnumValue("connection")
    CONNECTION("connection"),
    @XmlEnumValue("pti31_2")
    PTI_31_2("pti31_2"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),
    @XmlEnumValue("pti31_3")
    PTI_31_3("pti31_3"),
    @XmlEnumValue("alternative")
    ALTERNATIVE("alternative"),
    @XmlEnumValue("pti31_4")
    PTI_31_4("pti31_4"),
    @XmlEnumValue("connectionNotHeld")
    CONNECTION_NOT_HELD("connectionNotHeld"),
    @XmlEnumValue("pti31_5")
    PTI_31_5("pti31_5"),
    @XmlEnumValue("connectionHeld")
    CONNECTION_HELD("connectionHeld"),
    @XmlEnumValue("pti31_6")
    PTI_31_6("pti31_6"),
    @XmlEnumValue("statusOfConenctionUndecided")
    STATUS_OF_CONENCTION_UNDECIDED("statusOfConenctionUndecided"),
    @XmlEnumValue("pti31_255")
    PTI_31_255("pti31_255"),
    @XmlEnumValue("undefinedCrossReferenceInformation")
    UNDEFINED_CROSS_REFERENCE_INFORMATION("undefinedCrossReferenceInformation");
    private final String value;

    InterchangeStatusEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterchangeStatusEnumeration fromValue(String v) {
        for (InterchangeStatusEnumeration c: InterchangeStatusEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
