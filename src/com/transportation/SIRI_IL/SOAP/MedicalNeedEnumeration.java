
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicalNeedEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalNeedEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="allergic"/>
 *     &lt;enumeration value="heartCondition"/>
 *     &lt;enumeration value="otherMedicalNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalNeedEnumeration", namespace = "http://www.ifopt.org.uk/acsb")
@XmlEnum
public enum MedicalNeedEnumeration {

    @XmlEnumValue("allergic")
    ALLERGIC("allergic"),
    @XmlEnumValue("heartCondition")
    HEART_CONDITION("heartCondition"),
    @XmlEnumValue("otherMedicalNeed")
    OTHER_MEDICAL_NEED("otherMedicalNeed");
    private final String value;

    MedicalNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalNeedEnumeration fromValue(String v) {
        for (MedicalNeedEnumeration c: MedicalNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
