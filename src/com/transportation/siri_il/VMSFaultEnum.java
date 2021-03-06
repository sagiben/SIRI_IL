
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VMSFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VMSFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="communicationsFailure"/>
 *     &lt;enumeration value="incorrectMessageDisplayed"/>
 *     &lt;enumeration value="incorrectPictogramDisplayed"/>
 *     &lt;enumeration value="powerFailure"/>
 *     &lt;enumeration value="unableToClearDown"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VMSFaultEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VMSFaultEnum {


    /**
     * Comunications failure affecting VMS.
     * 
     */
    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),

    /**
     * Incorrect message is being displayed.
     * 
     */
    @XmlEnumValue("incorrectMessageDisplayed")
    INCORRECT_MESSAGE_DISPLAYED("incorrectMessageDisplayed"),

    /**
     * Incorrect pictogram is being displayed.
     * 
     */
    @XmlEnumValue("incorrectPictogramDisplayed")
    INCORRECT_PICTOGRAM_DISPLAYED("incorrectPictogramDisplayed"),

    /**
     * Power to VMS has failed.
     * 
     */
    @XmlEnumValue("powerFailure")
    POWER_FAILURE("powerFailure"),

    /**
     * Unable to clear down information displayed on VMS.
     * 
     */
    @XmlEnumValue("unableToClearDown")
    UNABLE_TO_CLEAR_DOWN("unableToClearDown"),

    /**
     * Unknown VMS fault.
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

    VMSFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VMSFaultEnum fromValue(String v) {
        for (VMSFaultEnum c: VMSFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
