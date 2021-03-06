
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentSubReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentSubReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="staffSickness"/>
 *     &lt;enumeration value="staffInjury"/>
 *     &lt;enumeration value="unofficialIndustrialAction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentSubReasonEnumeration")
@XmlEnum
public enum EquipmentSubReasonEnumeration {


    /**
     * TPEG Pti_19_25  bridge strike
     * 
     */
    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),

    /**
     * TPEG Pti_19_26  overhead obstruction
     * 
     */
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction");
    private final String value;

    EquipmentSubReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentSubReasonEnumeration fromValue(String v) {
        for (EquipmentSubReasonEnumeration c: EquipmentSubReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
