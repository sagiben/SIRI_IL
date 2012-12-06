
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleEquipmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleEquipmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notUsingSnowChains"/>
 *     &lt;enumeration value="notUsingSnowChainsOrTyres"/>
 *     &lt;enumeration value="snowChainsInUse"/>
 *     &lt;enumeration value="snowTyresInUse"/>
 *     &lt;enumeration value="snowChainsOrTyresInUse"/>
 *     &lt;enumeration value="withoutSnowTyresOrChainsOnBoard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleEquipmentEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum VehicleEquipmentEnum {


    /**
     * Vehicle not using snow chains.
     * 
     */
    @XmlEnumValue("notUsingSnowChains")
    NOT_USING_SNOW_CHAINS("notUsingSnowChains"),

    /**
     * Vehicle not using either snow tyres or snow chains.
     * 
     */
    @XmlEnumValue("notUsingSnowChainsOrTyres")
    NOT_USING_SNOW_CHAINS_OR_TYRES("notUsingSnowChainsOrTyres"),

    /**
     * Vehicle using snow chains.
     * 
     */
    @XmlEnumValue("snowChainsInUse")
    SNOW_CHAINS_IN_USE("snowChainsInUse"),

    /**
     * Vehicle using snow tyres.
     * 
     */
    @XmlEnumValue("snowTyresInUse")
    SNOW_TYRES_IN_USE("snowTyresInUse"),

    /**
     * Vehicle using snow tyres or snow chains.
     * 
     */
    @XmlEnumValue("snowChainsOrTyresInUse")
    SNOW_CHAINS_OR_TYRES_IN_USE("snowChainsOrTyresInUse"),

    /**
     * Vehicle which is not carrying on board snow tyres or chains.
     * 
     */
    @XmlEnumValue("withoutSnowTyresOrChainsOnBoard")
    WITHOUT_SNOW_TYRES_OR_CHAINS_ON_BOARD("withoutSnowTyresOrChainsOnBoard");
    private final String value;

    VehicleEquipmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleEquipmentEnum fromValue(String v) {
        for (VehicleEquipmentEnum c: VehicleEquipmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
