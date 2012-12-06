
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefreshmentFacilityEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefreshmentFacilityEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="pti23_1"/>
 *     &lt;enumeration value="restaurantService"/>
 *     &lt;enumeration value="pti23_2"/>
 *     &lt;enumeration value="snacksService"/>
 *     &lt;enumeration value="pti23"/>
 *     &lt;enumeration value="trolley"/>
 *     &lt;enumeration value="pti23_18"/>
 *     &lt;enumeration value="bar"/>
 *     &lt;enumeration value="pti23_19"/>
 *     &lt;enumeration value="foodNotAvailable"/>
 *     &lt;enumeration value="pti23_20"/>
 *     &lt;enumeration value="beveragesNotAvailable"/>
 *     &lt;enumeration value="pti23_26"/>
 *     &lt;enumeration value="bistro"/>
 *     &lt;enumeration value="foodVendingMachine"/>
 *     &lt;enumeration value="beverageVendingMachine"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefreshmentFacilityEnumeration")
@XmlEnum
public enum RefreshmentFacilityEnumeration {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("pti23_1")
    PTI_23_1("pti23_1"),
    @XmlEnumValue("restaurantService")
    RESTAURANT_SERVICE("restaurantService"),
    @XmlEnumValue("pti23_2")
    PTI_23_2("pti23_2"),
    @XmlEnumValue("snacksService")
    SNACKS_SERVICE("snacksService"),
    @XmlEnumValue("pti23")
    PTI_23("pti23"),
    @XmlEnumValue("trolley")
    TROLLEY("trolley"),
    @XmlEnumValue("pti23_18")
    PTI_23_18("pti23_18"),
    @XmlEnumValue("bar")
    BAR("bar"),
    @XmlEnumValue("pti23_19")
    PTI_23_19("pti23_19"),
    @XmlEnumValue("foodNotAvailable")
    FOOD_NOT_AVAILABLE("foodNotAvailable"),
    @XmlEnumValue("pti23_20")
    PTI_23_20("pti23_20"),
    @XmlEnumValue("beveragesNotAvailable")
    BEVERAGES_NOT_AVAILABLE("beveragesNotAvailable"),
    @XmlEnumValue("pti23_26")
    PTI_23_26("pti23_26"),
    @XmlEnumValue("bistro")
    BISTRO("bistro"),
    @XmlEnumValue("foodVendingMachine")
    FOOD_VENDING_MACHINE("foodVendingMachine"),
    @XmlEnumValue("beverageVendingMachine")
    BEVERAGE_VENDING_MACHINE("beverageVendingMachine");
    private final String value;

    RefreshmentFacilityEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefreshmentFacilityEnumeration fromValue(String v) {
        for (RefreshmentFacilityEnumeration c: RefreshmentFacilityEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}