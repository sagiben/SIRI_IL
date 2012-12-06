
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncumbranceEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncumbranceEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="luggageEncumbered"/>
 *     &lt;enumeration value="pushchair"/>
 *     &lt;enumeration value="baggageTrolley"/>
 *     &lt;enumeration value="oversizeBaggage"/>
 *     &lt;enumeration value="guideDog"/>
 *     &lt;enumeration value="otherAnimal"/>
 *     &lt;enumeration value="otherEncumbrance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncumbranceEnumeration", namespace = "http://www.ifopt.org.uk/acsb")
@XmlEnum
public enum EncumbranceEnumeration {

    @XmlEnumValue("luggageEncumbered")
    LUGGAGE_ENCUMBERED("luggageEncumbered"),
    @XmlEnumValue("pushchair")
    PUSHCHAIR("pushchair"),
    @XmlEnumValue("baggageTrolley")
    BAGGAGE_TROLLEY("baggageTrolley"),
    @XmlEnumValue("oversizeBaggage")
    OVERSIZE_BAGGAGE("oversizeBaggage"),
    @XmlEnumValue("guideDog")
    GUIDE_DOG("guideDog"),
    @XmlEnumValue("otherAnimal")
    OTHER_ANIMAL("otherAnimal"),
    @XmlEnumValue("otherEncumbrance")
    OTHER_ENCUMBRANCE("otherEncumbrance");
    private final String value;

    EncumbranceEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncumbranceEnumeration fromValue(String v) {
        for (EncumbranceEnumeration c: EncumbranceEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
