
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatrixFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatrixFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="communicationsFailure"/>
 *     &lt;enumeration value="incorrectAspectDisplayed"/>
 *     &lt;enumeration value="powerFailure"/>
 *     &lt;enumeration value="unableToClearDown"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatrixFaultEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum MatrixFaultEnum {


    /**
     * Comunications failure affecting matrix sign.
     * 
     */
    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),

    /**
     * Incorrect aspect (face) is being displayed.
     * 
     */
    @XmlEnumValue("incorrectAspectDisplayed")
    INCORRECT_ASPECT_DISPLAYED("incorrectAspectDisplayed"),

    /**
     * Power to matrix sign has failed.
     * 
     */
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),

    /**
     * Unable to clear down aspect displayed on matrix sign.
     * 
     */
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),

    /**
     * Unknown matrix sign fault.
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MatrixFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatrixFaultEnum fromValue(String v) {
        for (MatrixFaultEnum c: MatrixFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
