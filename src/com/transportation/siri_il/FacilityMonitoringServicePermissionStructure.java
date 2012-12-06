
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Facility Monitoring Service  Permissions
 * 
 * <p>Java class for FacilityMonitoringServicePermissionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}OperatorPermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}LinePermissions"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringServicePermissionStructure", propOrder = {
    "operatorPermissions",
    "linePermissions",
    "extensions"
})
public class FacilityMonitoringServicePermissionStructure
    extends AbstractPermissionStructure
{

    @XmlElement(name = "OperatorPermissions", required = true)
    protected OperatorPermissions operatorPermissions;
    @XmlElement(name = "LinePermissions", required = true)
    protected LinePermissions linePermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the operatorPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorPermissions }
     *     
     */
    public OperatorPermissions getOperatorPermissions() {
        return operatorPermissions;
    }

    /**
     * Sets the value of the operatorPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorPermissions }
     *     
     */
    public void setOperatorPermissions(OperatorPermissions value) {
        this.operatorPermissions = value;
    }

    /**
     * Gets the value of the linePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link LinePermissions }
     *     
     */
    public LinePermissions getLinePermissions() {
        return linePermissions;
    }

    /**
     * Sets the value of the linePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinePermissions }
     *     
     */
    public void setLinePermissions(LinePermissions value) {
        this.linePermissions = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

}
