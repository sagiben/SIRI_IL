
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterEquipmentAdviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WinterEquipmentAdviceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="snowChainsOrTyresRecommended"/>
 *     &lt;enumeration value="snowChainsRecommended"/>
 *     &lt;enumeration value="snowTyresRecommended"/>
 *     &lt;enumeration value="studTyresMayBeUsed"/>
 *     &lt;enumeration value="winterEquipmentRecommended"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentAdviceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum WinterEquipmentAdviceEnum {


    /**
     * Snow chains or tyres are recommended.
     * 
     */
    @XmlEnumValue("snowChainsOrTyresRecommended")
    SNOW_CHAINS_OR_TYRES_RECOMMENDED("snowChainsOrTyresRecommended"),

    /**
     * Snow chains are recommended.
     * 
     */
    @XmlEnumValue("snowChainsRecommended")
    SNOW_CHAINS_RECOMMENDED("snowChainsRecommended"),

    /**
     * Snow tyres are recommended.
     * 
     */
    @XmlEnumValue("snowTyresRecommended")
    SNOW_TYRES_RECOMMENDED("snowTyresRecommended"),

    /**
     * Stud tyres may be used.
     * 
     */
    @XmlEnumValue("studTyresMayBeUsed")
    STUD_TYRES_MAY_BE_USED("studTyresMayBeUsed"),

    /**
     * Carrying of winter equipment (snow chains and/or snow tyres) is recommended.
     * 
     */
    @XmlEnumValue("winterEquipmentRecommended")
    WINTER_EQUIPMENT_RECOMMENDED("winterEquipmentRecommended"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentAdviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentAdviceEnum fromValue(String v) {
        for (WinterEquipmentAdviceEnum c: WinterEquipmentAdviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
