
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiversionAdviceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiversionAdviceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="compulsoryDiversionInOperation"/>
 *     &lt;enumeration value="diversionInOperation"/>
 *     &lt;enumeration value="diversionIsNoLongerRecommended"/>
 *     &lt;enumeration value="doNotFollowDiversionSigns"/>
 *     &lt;enumeration value="followDiversionSigns"/>
 *     &lt;enumeration value="followLocalDiversion"/>
 *     &lt;enumeration value="followSigns"/>
 *     &lt;enumeration value="followSpecialDiversionMarkers"/>
 *     &lt;enumeration value="heavyLorriesAreRecommendedToAvoidTheArea"/>
 *     &lt;enumeration value="localDriversAreRecommendedToAvoidTheArea"/>
 *     &lt;enumeration value="noSuitableDiversionAvailable"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiversionAdviceEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum DiversionAdviceEnum {


    /**
     * Compulsory diversion in operation.
     * 
     */
    @XmlEnumValue("compulsoryDiversionInOperation")
    COMPULSORY_DIVERSION_IN_OPERATION("compulsoryDiversionInOperation"),

    /**
     * Diversion in operation.
     * 
     */
    @XmlEnumValue("diversionInOperation")
    DIVERSION_IN_OPERATION("diversionInOperation"),

    /**
     * Diversion is no longer recommended.
     * 
     */
    @XmlEnumValue("diversionIsNoLongerRecommended")
    DIVERSION_IS_NO_LONGER_RECOMMENDED("diversionIsNoLongerRecommended"),

    /**
     * Do not follow diversion signs.
     * 
     */
    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),

    /**
     * Follow diversion signs.
     * 
     */
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),

    /**
     * Follow local diversion.
     * 
     */
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),

    /**
     * Follow signs.
     * 
     */
    @XmlEnumValue("followSigns")
    FOLLOW_SIGNS("followSigns"),

    /**
     * Follow special diversion markers.
     * 
     */
    @XmlEnumValue("followSpecialDiversionMarkers")
    FOLLOW_SPECIAL_DIVERSION_MARKERS("followSpecialDiversionMarkers"),

    /**
     * Heavy lorries are recommended to avoid the area.
     * 
     */
    @XmlEnumValue("heavyLorriesAreRecommendedToAvoidTheArea")
    HEAVY_LORRIES_ARE_RECOMMENDED_TO_AVOID_THE_AREA("heavyLorriesAreRecommendedToAvoidTheArea"),

    /**
     * Local drivers are recommended to avoid the area.
     * 
     */
    @XmlEnumValue("localDriversAreRecommendedToAvoidTheArea")
    LOCAL_DRIVERS_ARE_RECOMMENDED_TO_AVOID_THE_AREA("localDriversAreRecommendedToAvoidTheArea"),

    /**
     * No suitable diversion available.
     * 
     */
    @XmlEnumValue("noSuitableDiversionAvailable")
    NO_SUITABLE_DIVERSION_AVAILABLE("noSuitableDiversionAvailable"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    DiversionAdviceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiversionAdviceEnum fromValue(String v) {
        for (DiversionAdviceEnum c: DiversionAdviceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}