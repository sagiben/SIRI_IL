
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PermissionsStructure">
 *       &lt;sequence>
 *         &lt;element name="StopTimetablePermission" type="{http://www.siri.org.uk/siri}StopMonitoringServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stopTimetablePermission"
})
@XmlRootElement(name = "StopTimetablePermissions")
public class StopTimetablePermissions
    extends PermissionsStructure
{

    @XmlElement(name = "StopTimetablePermission")
    protected List<StopMonitoringServicePermissionStructure> stopTimetablePermission;

    /**
     * Gets the value of the stopTimetablePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopTimetablePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopTimetablePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringServicePermissionStructure }
     * 
     * 
     */
    public List<StopMonitoringServicePermissionStructure> getStopTimetablePermission() {
        if (stopTimetablePermission == null) {
            stopTimetablePermission = new ArrayList<StopMonitoringServicePermissionStructure>();
        }
        return this.stopTimetablePermission;
    }

}
