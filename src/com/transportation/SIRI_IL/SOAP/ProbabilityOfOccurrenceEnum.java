
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProbabilityOfOccurrenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProbabilityOfOccurrenceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certain"/>
 *     &lt;enumeration value="probable"/>
 *     &lt;enumeration value="riskOf"/>
 *     &lt;enumeration value="improbable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProbabilityOfOccurrenceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ProbabilityOfOccurrenceEnum {


    /**
     * The source is compeltely certain of the occurrence of the situation record version content.
     * 
     */
    @XmlEnumValue("certain")
    CERTAIN("certain"),

    /**
     * The source has a reasonably high level of confidence of the occurrence of the situation record version content.
     * 
     */
    @XmlEnumValue("probable")
    PROBABLE("probable"),

    /**
     * The source has a moderate level of confidence of the occurrence of the situation record version content.
     * 
     */
    @XmlEnumValue("riskOf")
    RISK_OF("riskOf"),

    /**
     * The source has a low level of confidence of the occurrence of the situation record version content.
     * 
     */
    @XmlEnumValue("improbable")
    IMPROBABLE("improbable");
    private final String value;

    ProbabilityOfOccurrenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbabilityOfOccurrenceEnum fromValue(String v) {
        for (ProbabilityOfOccurrenceEnum c: ProbabilityOfOccurrenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}