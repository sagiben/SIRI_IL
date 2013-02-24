
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DangerousGoodRegulationsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DangerousGoodRegulationsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADR"/>
 *     &lt;enumeration value="iataIcao"/>
 *     &lt;enumeration value="imoImdg"/>
 *     &lt;enumeration value="railroadDangerousGoodsBook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DangerousGoodRegulationsEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DangerousGoodRegulationsEnum {


    /**
     * European agreement on the international carriage of dangerous goods on road.
     * 
     */
    ADR("ADR"),

    /**
     * Regulations covering the international transportation of dangerous goods issued by the International Air Transport Association and the International Civil Aviation Organisation.
     * 
     */
    @XmlEnumValue("iataIcao")
    IATA_ICAO("iataIcao"),

    /**
     * Regulations regarding the transportation of dangerous goods on ocean-going vessels issued by the International Maritime Organisation.
     * 
     */
    @XmlEnumValue("imoImdg")
    IMO_IMDG("imoImdg"),

    /**
     * International regulations concerning the international carriage of dangerous goods by rail.
     * 
     */
    @XmlEnumValue("railroadDangerousGoodsBook")
    RAILROAD_DANGEROUS_GOODS_BOOK("railroadDangerousGoodsBook");
    private final String value;

    DangerousGoodRegulationsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DangerousGoodRegulationsEnum fromValue(String v) {
        for (DangerousGoodRegulationsEnum c: DangerousGoodRegulationsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
