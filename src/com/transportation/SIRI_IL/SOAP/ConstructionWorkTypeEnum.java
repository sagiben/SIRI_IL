
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionWorkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConstructionWorkTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blastingWork"/>
 *     &lt;enumeration value="constructionWork"/>
 *     &lt;enumeration value="demolitionWork"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConstructionWorkTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ConstructionWorkTypeEnum {


    /**
     * Blasting or quarrying work at the specified location.
     * 
     */
    @XmlEnumValue("blastingWork")
    BLASTING_WORK("blastingWork"),

    /**
     * Construction work of a general nature at the specified location.
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),

    /**
     * Demolition work associated with the construction work.
     * 
     */
    @XmlEnumValue("demolitionWork")
    DEMOLITION_WORK("demolitionWork");
    private final String value;

    ConstructionWorkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWorkTypeEnum fromValue(String v) {
        for (ConstructionWorkTypeEnum c: ConstructionWorkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
