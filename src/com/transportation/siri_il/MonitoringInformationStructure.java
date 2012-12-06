
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Description of the monitoring conditions (frequency of mesurement, etc): an automatic monitoring of the satus of a lift with pushed alert in case of incident is very different from a daily manual/visual check ....
 * 
 * <p>Java class for MonitoringInformationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringInformationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonitoringInterval" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="MonitoringType" type="{http://www.siri.org.uk/siri}MonitoringTypeEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoringValidityCondition"/>
 *         &lt;element name="MonitoringPeriod" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringInformationStructure", propOrder = {
    "monitoringInterval",
    "monitoringType",
    "monitoringPeriod",
    "extensions"
})
public class MonitoringInformationStructure {

    @XmlElement(name = "MonitoringInterval")
    protected Duration monitoringInterval;
    @XmlElement(name = "MonitoringType")
    protected MonitoringTypeEnumeration monitoringType;
    @XmlElement(name = "MonitoringPeriod")
    protected MonitoringValidityConditionStructure monitoringPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the monitoringInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * Sets the value of the monitoringInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMonitoringInterval(Duration value) {
        this.monitoringInterval = value;
    }

    /**
     * Gets the value of the monitoringType property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public MonitoringTypeEnumeration getMonitoringType() {
        return monitoringType;
    }

    /**
     * Sets the value of the monitoringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringTypeEnumeration }
     *     
     */
    public void setMonitoringType(MonitoringTypeEnumeration value) {
        this.monitoringType = value;
    }

    /**
     * Gets the value of the monitoringPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getMonitoringPeriod() {
        return monitoringPeriod;
    }

    /**
     * Sets the value of the monitoringPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setMonitoringPeriod(MonitoringValidityConditionStructure value) {
        this.monitoringPeriod = value;
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
