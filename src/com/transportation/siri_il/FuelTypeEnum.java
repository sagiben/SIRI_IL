
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuelTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuelTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="diesel"/>
 *     &lt;enumeration value="liquidGas"/>
 *     &lt;enumeration value="lPG"/>
 *     &lt;enumeration value="methane"/>
 *     &lt;enumeration value="petrol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FuelTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum FuelTypeEnum {


    /**
     * Diesel.
     * 
     */
    @XmlEnumValue("diesel")
    DIESEL("diesel"),

    /**
     * Liquid gas of any type including LPG.
     * 
     */
    @XmlEnumValue("liquidGas")
    LIQUID_GAS("liquidGas"),

    /**
     * Liquid petroleum gas.
     * 
     */
    @XmlEnumValue("lPG")
    L_PG("lPG"),

    /**
     * Methane gas.
     * 
     */
    @XmlEnumValue("methane")
    METHANE("methane"),

    /**
     * Petroleum.
     * 
     */
    @XmlEnumValue("petrol")
    PETROL("petrol");
    private final String value;

    FuelTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuelTypeEnum fromValue(String v) {
        for (FuelTypeEnum c: FuelTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
