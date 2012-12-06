
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxiSubmodesOfTransportEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxiSubmodesOfTransportEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="pti11_0"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti11_1"/>
 *     &lt;enumeration value="communalTaxi"/>
 *     &lt;enumeration value="pti11_2"/>
 *     &lt;enumeration value="waterTaxi"/>
 *     &lt;enumeration value="pti11_3"/>
 *     &lt;enumeration value="railTaxi"/>
 *     &lt;enumeration value="pti11_4"/>
 *     &lt;enumeration value="bikeTaxi"/>
 *     &lt;enumeration value="pti11_5"/>
 *     &lt;enumeration value="blackCab"/>
 *     &lt;enumeration value="pti11_6"/>
 *     &lt;enumeration value="miniCab"/>
 *     &lt;enumeration value="pti11_7"/>
 *     &lt;enumeration value="allTaxiServices"/>
 *     &lt;enumeration value="pti11_255"/>
 *     &lt;enumeration value="undefinedTaxiService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxiSubmodesOfTransportEnumeration")
@XmlEnum
public enum TaxiSubmodesOfTransportEnumeration {

    @XmlEnumValue("pti11_0")
    PTI_11_0("pti11_0"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti11_1")
    PTI_11_1("pti11_1"),
    @XmlEnumValue("communalTaxi")
    COMMUNAL_TAXI("communalTaxi"),
    @XmlEnumValue("pti11_2")
    PTI_11_2("pti11_2"),
    @XmlEnumValue("waterTaxi")
    WATER_TAXI("waterTaxi"),
    @XmlEnumValue("pti11_3")
    PTI_11_3("pti11_3"),
    @XmlEnumValue("railTaxi")
    RAIL_TAXI("railTaxi"),
    @XmlEnumValue("pti11_4")
    PTI_11_4("pti11_4"),
    @XmlEnumValue("bikeTaxi")
    BIKE_TAXI("bikeTaxi"),
    @XmlEnumValue("pti11_5")
    PTI_11_5("pti11_5"),
    @XmlEnumValue("blackCab")
    BLACK_CAB("blackCab"),
    @XmlEnumValue("pti11_6")
    PTI_11_6("pti11_6"),
    @XmlEnumValue("miniCab")
    MINI_CAB("miniCab"),
    @XmlEnumValue("pti11_7")
    PTI_11_7("pti11_7"),
    @XmlEnumValue("allTaxiServices")
    ALL_TAXI_SERVICES("allTaxiServices"),
    @XmlEnumValue("pti11_255")
    PTI_11_255("pti11_255"),
    @XmlEnumValue("undefinedTaxiService")
    UNDEFINED_TAXI_SERVICE("undefinedTaxiService");
    private final String value;

    TaxiSubmodesOfTransportEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxiSubmodesOfTransportEnumeration fromValue(String v) {
        for (TaxiSubmodesOfTransportEnumeration c: TaxiSubmodesOfTransportEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}