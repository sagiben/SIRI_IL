
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentDamageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentDamageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="burstPipe"/>
 *     &lt;enumeration value="burstWaterMain"/>
 *     &lt;enumeration value="fallenPowerCables"/>
 *     &lt;enumeration value="gasLeak"/>
 *     &lt;enumeration value="roadInfrastructureDamage"/>
 *     &lt;enumeration value="sewerCollapse"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentDamageTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum EquipmentDamageTypeEnum {


    /**
     * The road surface has sunken or collapsed in places due to burst pipes.
     * 
     */
    @XmlEnumValue("burstPipe")
    BURST_PIPE("burstPipe"),

    /**
     * Traffic may be disrupted due to local flooding and/or subsidence because of a broken water main.
     * 
     */
    @XmlEnumValue("burstWaterMain")
    BURST_WATER_MAIN("burstWaterMain"),

    /**
     * The road is obstructed or partially obstructed by one or more fallen power cables.
     * 
     */
    @XmlEnumValue("fallenPowerCables")
    FALLEN_POWER_CABLES("fallenPowerCables"),

    /**
     * Traffic may be disrupted due to an explosion hazard from gas escaping in or near the roadway.
     * 
     */
    @XmlEnumValue("gasLeak")
    GAS_LEAK("gasLeak"),

    /**
     * The road infrastructure has been damaged.
     * 
     */
    @XmlEnumValue("roadInfrastructureDamage")
    ROAD_INFRASTRUCTURE_DAMAGE("roadInfrastructureDamage"),

    /**
     * The road surface has sunken or collapsed in places due to sewer failure.
     * 
     */
    @XmlEnumValue("sewerCollapse")
    SEWER_COLLAPSE("sewerCollapse"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EquipmentDamageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentDamageTypeEnum fromValue(String v) {
        for (EquipmentDamageTypeEnum c: EquipmentDamageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
