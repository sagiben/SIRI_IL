
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityIndexEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityIndexEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="certain"/>
 *     &lt;enumeration value="veryReliable"/>
 *     &lt;enumeration value="reliable"/>
 *     &lt;enumeration value="probablyReliable"/>
 *     &lt;enumeration value="unconfirmed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualityIndexEnumeration")
@XmlEnum
public enum QualityIndexEnumeration {


    /**
     * Data is certain (1/5).
     * 
     */
    @XmlEnumValue("certain")
    CERTAIN("certain"),

    /**
     * Data has confidence level of very reliable (2/5).
     * 
     */
    @XmlEnumValue("veryReliable")
    VERY_RELIABLE("veryReliable"),

    /**
     * Data has confidence lvel of reliabel (3/5).
     * 
     */
    @XmlEnumValue("reliable")
    RELIABLE("reliable"),

    /**
     * Data is thought to be reliable (4/5)
     * 
     */
    @XmlEnumValue("probablyReliable")
    PROBABLY_RELIABLE("probablyReliable"),

    /**
     * Data is unconfirmed (5/5).
     * 
     */
    @XmlEnumValue("unconfirmed")
    UNCONFIRMED("unconfirmed");
    private final String value;

    QualityIndexEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityIndexEnumeration fromValue(String v) {
        for (QualityIndexEnumeration c: QualityIndexEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
