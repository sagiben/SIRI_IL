
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonnelReasonEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonnelReasonEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti20_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti20_1"/>
 *     &lt;enumeration value="staffSickness"/>
 *     &lt;enumeration value="pti20_1_Alias_1"/>
 *     &lt;enumeration value="staffInjury"/>
 *     &lt;enumeration value="pti20_1_Alias_2"/>
 *     &lt;enumeration value="contractorStaffInjury"/>
 *     &lt;enumeration value="pti20_2"/>
 *     &lt;enumeration value="staffAbsence"/>
 *     &lt;enumeration value="pti20_3"/>
 *     &lt;enumeration value="staffInWrongPlace"/>
 *     &lt;enumeration value="pti20_4"/>
 *     &lt;enumeration value="staffShortage"/>
 *     &lt;enumeration value="pti20_5"/>
 *     &lt;enumeration value="industrialAction"/>
 *     &lt;enumeration value="pti20_5_Alias_1"/>
 *     &lt;enumeration value="unofficialIndustrialAction"/>
 *     &lt;enumeration value="pti20_6"/>
 *     &lt;enumeration value="workToRule"/>
 *     &lt;enumeration value="pti20_255"/>
 *     &lt;enumeration value="undefinedPersonnelProblem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonnelReasonEnumeration")
@XmlEnum
public enum PersonnelReasonEnumeration {

    @XmlEnumValue("pti20_0")
    PTI_20_0("pti20_0"),

    /**
     * TPEG Pti20_0   unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti20_1")
    PTI_20_1("pti20_1"),

    /**
     * TPEG Pti20_1   staff sickness
     * 
     */
    @XmlEnumValue("staffSickness")
    STAFF_SICKNESS("staffSickness"),
    @XmlEnumValue("pti20_1_Alias_1")
    PTI_20_1_ALIAS_1("pti20_1_Alias_1"),

    /**
     *   staff injury alias to TPEG Pti20_1   staff sickness
     * 
     */
    @XmlEnumValue("staffInjury")
    STAFF_INJURY("staffInjury"),
    @XmlEnumValue("pti20_1_Alias_2")
    PTI_20_1_ALIAS_2("pti20_1_Alias_2"),

    /**
     * contractor staff injury alias to TPEG Pti20_1   staff sickness
     * 
     */
    @XmlEnumValue("contractorStaffInjury")
    CONTRACTOR_STAFF_INJURY("contractorStaffInjury"),
    @XmlEnumValue("pti20_2")
    PTI_20_2("pti20_2"),

    /**
     * TPEG Pti20_2   staff absence
     * 
     */
    @XmlEnumValue("staffAbsence")
    STAFF_ABSENCE("staffAbsence"),
    @XmlEnumValue("pti20_3")
    PTI_20_3("pti20_3"),

    /**
     * TPEG Pti20_3   staff in wrong place
     * 
     */
    @XmlEnumValue("staffInWrongPlace")
    STAFF_IN_WRONG_PLACE("staffInWrongPlace"),
    @XmlEnumValue("pti20_4")
    PTI_20_4("pti20_4"),

    /**
     * TPEG Pti20_4   staff shortage
     * 
     */
    @XmlEnumValue("staffShortage")
    STAFF_SHORTAGE("staffShortage"),
    @XmlEnumValue("pti20_5")
    PTI_20_5("pti20_5"),

    /**
     * TPEG Pti20_5   industrial action
     * 
     */
    @XmlEnumValue("industrialAction")
    INDUSTRIAL_ACTION("industrialAction"),
    @XmlEnumValue("pti20_5_Alias_1")
    PTI_20_5_ALIAS_1("pti20_5_Alias_1"),

    /**
     * Unofffical action - alias to TPEG Pti20_5   industrial action
     * 
     */
    @XmlEnumValue("unofficialIndustrialAction")
    UNOFFICIAL_INDUSTRIAL_ACTION("unofficialIndustrialAction"),
    @XmlEnumValue("pti20_6")
    PTI_20_6("pti20_6"),

    /**
     * TPEG Pti20_6   work to rule
     * 
     */
    @XmlEnumValue("workToRule")
    WORK_TO_RULE("workToRule"),
    @XmlEnumValue("pti20_255")
    PTI_20_255("pti20_255"),

    /**
     * TPEG Pti20_255 undefined personnel problem 
     * 
     */
    @XmlEnumValue("undefinedPersonnelProblem")
    UNDEFINED_PERSONNEL_PROBLEM("undefinedPersonnelProblem");
    private final String value;

    PersonnelReasonEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonnelReasonEnumeration fromValue(String v) {
        for (PersonnelReasonEnumeration c: PersonnelReasonEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
