
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Capability access control
 * 
 * <p>Java class for MonitoringCapabilityAccessControlStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckOperatorRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckLineRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}CheckMonitoringRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringCapabilityAccessControlStructure", propOrder = {
    "checkOperatorRef",
    "checkLineRef",
    "checkMonitoringRef"
})
public class MonitoringCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
{

    @XmlElement(name = "CheckOperatorRef", defaultValue = "true")
    protected Boolean checkOperatorRef;
    @XmlElement(name = "CheckLineRef", defaultValue = "true")
    protected Boolean checkLineRef;
    @XmlElement(name = "CheckMonitoringRef", defaultValue = "true")
    protected Boolean checkMonitoringRef;

    /**
     * Gets the value of the checkOperatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckOperatorRef() {
        return checkOperatorRef;
    }

    /**
     * Sets the value of the checkOperatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckOperatorRef(Boolean value) {
        this.checkOperatorRef = value;
    }

    /**
     * Gets the value of the checkLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckLineRef() {
        return checkLineRef;
    }

    /**
     * Sets the value of the checkLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckLineRef(Boolean value) {
        this.checkLineRef = value;
    }

    /**
     * Gets the value of the checkMonitoringRef property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckMonitoringRef() {
        return checkMonitoringRef;
    }

    /**
     * Sets the value of the checkMonitoringRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckMonitoringRef(Boolean value) {
        this.checkMonitoringRef = value;
    }

}
