
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadMaintenanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadMaintenanceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="clearanceWorkOnCarriageway"/>
 *     &lt;enumeration value="clearingAction"/>
 *     &lt;enumeration value="installationWork"/>
 *     &lt;enumeration value="grassCuttingWork"/>
 *     &lt;enumeration value="maintenanceWork"/>
 *     &lt;enumeration value="overrunningRoadworks"/>
 *     &lt;enumeration value="repairWork"/>
 *     &lt;enumeration value="resurfacingWork"/>
 *     &lt;enumeration value="roadMarkingWork"/>
 *     &lt;enumeration value="roadsideWork"/>
 *     &lt;enumeration value="roadworkClearanceInProgress"/>
 *     &lt;enumeration value="roadworks"/>
 *     &lt;enumeration value="rockFallPreventativeMaintenance"/>
 *     &lt;enumeration value="saltingInProgress"/>
 *     &lt;enumeration value="snowploughsInUse"/>
 *     &lt;enumeration value="treeAndVegetationCuttingWork"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadMaintenanceTypeEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum RoadMaintenanceTypeEnum {


    /**
     * Clearance work of unspecified nature on the traffic carriageway.
     * 
     */
    @XmlEnumValue("clearanceWorkOnCarriageway")
    CLEARANCE_WORK_ON_CARRIAGEWAY("clearanceWorkOnCarriageway"),

    /**
     * Unspecified clearing action undertaken by the traffic operator.
     * 
     */
    @XmlEnumValue("clearingAction")
    CLEARING_ACTION("clearingAction"),

    /**
     * Installation of new equipments or systems on or along-side the roadway.
     * 
     */
    @XmlEnumValue("installationWork")
    INSTALLATION_WORK("installationWork"),

    /**
     * Grass cutting work in progress.
     * 
     */
    @XmlEnumValue("grassCuttingWork")
    GRASS_CUTTING_WORK("grassCuttingWork"),

    /**
     * Maintenance of road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),

    /**
     * Road maintenance work which is overrunning its planned duration.
     * 
     */
    @XmlEnumValue("overrunningRoadworks")
    OVERRUNNING_ROADWORKS("overrunningRoadworks"),

    /**
     * Repair work to road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),

    /**
     * Work associated with relaying or renewal of worn-out road surface (pavement).
     * 
     */
    @XmlEnumValue("resurfacingWork")
    RESURFACING_WORK("resurfacingWork"),

    /**
     * Striping and repainting of road markings, plus placement or replacement of reflecting studs (cats' eyes).
     * 
     */
    @XmlEnumValue("roadMarkingWork")
    ROAD_MARKING_WORK("roadMarkingWork"),

    /**
     * Road side work of an unspecified nature.
     * 
     */
    @XmlEnumValue("roadsideWork")
    ROADSIDE_WORK("roadsideWork"),

    /**
     * Roadworks are completed and are being cleared.
     * 
     */
    @XmlEnumValue("roadworkClearanceInProgress")
    ROADWORK_CLEARANCE_IN_PROGRESS("roadworkClearanceInProgress"),

    /**
     * Road maintenance or improvement activity of an unspecified nature which may potentially cause traffic disruption.
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * Rock fall preventative maintenance is in progress.
     * 
     */
    @XmlEnumValue("rockFallPreventativeMaintenance")
    ROCK_FALL_PREVENTATIVE_MAINTENANCE("rockFallPreventativeMaintenance"),

    /**
     * Spreading of salt and / or grit on the road surface is in progress to prevent or melt snow or ice.
     * 
     */
    @XmlEnumValue("saltingInProgress")
    SALTING_IN_PROGRESS("saltingInProgress"),

    /**
     * Snowploughs or other similar mechanical devices are being used to clear snow from the road.
     * 
     */
    @XmlEnumValue("snowploughsInUse")
    SNOWPLOUGHS_IN_USE("snowploughsInUse"),

    /**
     * Tree and vegetation cutting work is in progress adjacent to the roadway.
     * 
     */
    @XmlEnumValue("treeAndVegetationCuttingWork")
    TREE_AND_VEGETATION_CUTTING_WORK("treeAndVegetationCuttingWork"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RoadMaintenanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadMaintenanceTypeEnum fromValue(String v) {
        for (RoadMaintenanceTypeEnum c: RoadMaintenanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}