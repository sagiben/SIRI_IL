
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectTypeOfWorksEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubjectTypeOfWorksEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bridge"/>
 *     &lt;enumeration value="buriedCables"/>
 *     &lt;enumeration value="buriedServices"/>
 *     &lt;enumeration value="carriageway"/>
 *     &lt;enumeration value="centralReservation"/>
 *     &lt;enumeration value="crashBarrier"/>
 *     &lt;enumeration value="gallery"/>
 *     &lt;enumeration value="gasMainWork"/>
 *     &lt;enumeration value="interchange"/>
 *     &lt;enumeration value="junction"/>
 *     &lt;enumeration value="lane"/>
 *     &lt;enumeration value="levelCrossing"/>
 *     &lt;enumeration value="lightingSystem"/>
 *     &lt;enumeration value="measurementEquipment"/>
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="roadsideEquipment"/>
 *     &lt;enumeration value="roadSigns"/>
 *     &lt;enumeration value="roundabout"/>
 *     &lt;enumeration value="tunnel"/>
 *     &lt;enumeration value="waterMain"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubjectTypeOfWorksEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum SubjectTypeOfWorksEnum {


    /**
     * Bridge on, over or under the highway.
     * 
     */
    @XmlEnumValue("bridge")
    BRIDGE("bridge"),

    /**
     * Buried cables under or along the highway.
     * 
     */
    @XmlEnumValue("buriedCables")
    BURIED_CABLES("buriedCables"),

    /**
     * Unspecified buried services on, under or along the highway.
     * 
     */
    @XmlEnumValue("buriedServices")
    BURIED_SERVICES("buriedServices"),

    /**
     * Road carriageway comprising one or more lanes.
     * 
     */
    @XmlEnumValue("carriageway")
    CARRIAGEWAY("carriageway"),

    /**
     * Central reservation (median).
     * 
     */
    @XmlEnumValue("centralReservation")
    CENTRAL_RESERVATION("centralReservation"),

    /**
     * Crash barrier.
     * 
     */
    @XmlEnumValue("crashBarrier")
    CRASH_BARRIER("crashBarrier"),

    /**
     * Gallery.
     * 
     */
    @XmlEnumValue("gallery")
    GALLERY("gallery"),

    /**
     * Gas mains.
     * 
     */
    @XmlEnumValue("gasMainWork")
    GAS_MAIN_WORK("gasMainWork"),

    /**
     * Motorway or major road interchange.
     * 
     */
    @XmlEnumValue("interchange")
    INTERCHANGE("interchange"),

    /**
     * Motorway or major road junction.
     * 
     */
    @XmlEnumValue("junction")
    JUNCTION("junction"),

    /**
     * Lane either along or adjacent to an existing carriageway.
     * 
     */
    @XmlEnumValue("lane")
    LANE("lane"),

    /**
     * Level-crossing or associated equipment.
     * 
     */
    @XmlEnumValue("levelCrossing")
    LEVEL_CROSSING("levelCrossing"),

    /**
     * Road lighting system.
     * 
     */
    @XmlEnumValue("lightingSystem")
    LIGHTING_SYSTEM("lightingSystem"),

    /**
     * Equipment used for determining traffic measurements.
     * 
     */
    @XmlEnumValue("measurementEquipment")
    MEASUREMENT_EQUIPMENT("measurementEquipment"),

    /**
     * Road.
     * 
     */
    @XmlEnumValue("road")
    ROAD("road"),

    /**
     * Road side equipment.
     * 
     */
    @XmlEnumValue("roadsideEquipment")
    ROADSIDE_EQUIPMENT("roadsideEquipment"),

    /**
     * Road signs.
     * 
     */
    @XmlEnumValue("roadSigns")
    ROAD_SIGNS("roadSigns"),

    /**
     * Roundabout.
     * 
     */
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),

    /**
     * Road tunnel.
     * 
     */
    @XmlEnumValue("tunnel")
    TUNNEL("tunnel"),

    /**
     * Water main under or along the highway.
     * 
     */
    @XmlEnumValue("waterMain")
    WATER_MAIN("waterMain"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    SubjectTypeOfWorksEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubjectTypeOfWorksEnum fromValue(String v) {
        for (SubjectTypeOfWorksEnum c: SubjectTypeOfWorksEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
