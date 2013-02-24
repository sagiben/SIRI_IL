
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for MonitoringPoint Permission.
 * 
 * <p>Java class for VehicleMonitorPermissionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitorPermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractTopicPermissionStructure">
 *       &lt;sequence>
 *         &lt;element name="VehicleMonitoringRef" type="{http://www.siri.org.uk/siri}VehicleMonitoringRefStructure"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitorPermissionStructure", propOrder = {
    "vehicleMonitoringRef"
})
public class VehicleMonitorPermissionStructure
    extends AbstractTopicPermissionStructure
{

    @XmlElement(name = "VehicleMonitoringRef", required = true)
    protected VehicleMonitoringRefStructure vehicleMonitoringRef;

    /**
     * Gets the value of the vehicleMonitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public VehicleMonitoringRefStructure getVehicleMonitoringRef() {
        return vehicleMonitoringRef;
    }

    /**
     * Sets the value of the vehicleMonitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public void setVehicleMonitoringRef(VehicleMonitoringRefStructure value) {
        this.vehicleMonitoringRef = value;
    }

}
