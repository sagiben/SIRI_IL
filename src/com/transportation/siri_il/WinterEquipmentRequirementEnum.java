
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WinterEquipmentRequirementEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WinterEquipmentRequirementEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="snowChainsMandatory"/>
 *     &lt;enumeration value="snowChainsOrTyresMandatory"/>
 *     &lt;enumeration value="snowTyresMandatory"/>
 *     &lt;enumeration value="studTyresAreNotAllowed"/>
 *     &lt;enumeration value="winterEquipmentMandatory"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WinterEquipmentRequirementEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum WinterEquipmentRequirementEnum {


    /**
     * Snow chains fitted to vehicle are mandatory.
     * 
     */
    @XmlEnumValue("snowChainsMandatory")
    SNOW_CHAINS_MANDATORY("snowChainsMandatory"),

    /**
     * Snow chains or snow tyres fitted to the vehicle are mandatory.
     * 
     */
    @XmlEnumValue("snowChainsOrTyresMandatory")
    SNOW_CHAINS_OR_TYRES_MANDATORY("snowChainsOrTyresMandatory"),

    /**
     * Snow tyres fitted to the vehicle are mandatory.
     * 
     */
    @XmlEnumValue("snowTyresMandatory")
    SNOW_TYRES_MANDATORY("snowTyresMandatory"),

    /**
     * Stud tyres are not authorised.
     * 
     */
    @XmlEnumValue("studTyresAreNotAllowed")
    STUD_TYRES_ARE_NOT_ALLOWED("studTyresAreNotAllowed"),

    /**
     * Carrying of winter equipment (snow chains and/or snow tyres) is mandatory.
     * 
     */
    @XmlEnumValue("winterEquipmentMandatory")
    WINTER_EQUIPMENT_MANDATORY("winterEquipmentMandatory"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WinterEquipmentRequirementEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WinterEquipmentRequirementEnum fromValue(String v) {
        for (WinterEquipmentRequirementEnum c: WinterEquipmentRequirementEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
