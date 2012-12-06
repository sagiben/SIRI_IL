
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for abstract permissions.
 * 
 * <p>Java class for PermissionsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PermissionVersionRef" type="{http://www.siri.org.uk/siri}VersionRefStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionsStructure", propOrder = {
    "permissionVersionRef"
})
@XmlSeeAlso({
    com.transportation.siri_il.ConnectionTimetableCapabilitiesResponseStructure.ConnectionTimetablePermissions.class,
    StopMonitoringPermissions.class,
    GeneralMessagePermissions.class,
    EstimatedTimetablePermissions.class,
    SituationExchangePermissions.class,
    FacilityMonitoringPermissions.class,
    ProductionTimetablePermissions.class,
    StopTimetablePermissions.class,
    VehicleMonitoringPermissions.class
})
public class PermissionsStructure {

    @XmlElement(name = "PermissionVersionRef")
    protected VersionRefStructure permissionVersionRef;

    /**
     * Gets the value of the permissionVersionRef property.
     * 
     * @return
     *     possible object is
     *     {@link VersionRefStructure }
     *     
     */
    public VersionRefStructure getPermissionVersionRef() {
        return permissionVersionRef;
    }

    /**
     * Sets the value of the permissionVersionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionRefStructure }
     *     
     */
    public void setPermissionVersionRef(VersionRefStructure value) {
        this.permissionVersionRef = value;
    }

}
