
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformationStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InformationStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="real"/>
 *     &lt;enumeration value="securityExercise"/>
 *     &lt;enumeration value="technicalExercise"/>
 *     &lt;enumeration value="test"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InformationStatusEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum InformationStatusEnum {


    /**
     * The information is real. It is not a test or exercise.
     * 
     */
    @XmlEnumValue("real")
    REAL("real"),

    /**
     * The information is part of an exercise which is for testing security.
     * 
     */
    @XmlEnumValue("securityExercise")
    SECURITY_EXERCISE("securityExercise"),

    /**
     * The information is part of an exercise which includes tests of associated technical subsystems.
     * 
     */
    @XmlEnumValue("technicalExercise")
    TECHNICAL_EXERCISE("technicalExercise"),

    /**
     * The information is part of a test for checking the exchange of this type of information.
     * 
     */
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    InformationStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InformationStatusEnum fromValue(String v) {
        for (InformationStatusEnum c: InformationStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
