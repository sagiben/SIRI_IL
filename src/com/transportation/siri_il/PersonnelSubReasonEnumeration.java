
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonnelSubReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonnelSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="staffSickness"/>
 *     &lt;enumeration value="staffInjury"/>
 *     &lt;enumeration value="unofficialIndustrialAction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonnelSubReasonEnumeration")
@XmlEnum
public enum PersonnelSubReasonEnumeration {

    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction");
    private final String value;

    PersonnelSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonnelSubReasonEnumeration fromValue(String v) {
        for (PersonnelSubReasonEnumeration c: PersonnelSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
