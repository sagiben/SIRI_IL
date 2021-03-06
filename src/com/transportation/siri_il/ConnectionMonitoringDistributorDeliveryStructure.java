
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Distributor Delivery for Connection Monitoring Service.
 * 
 * <p>Java class for ConnectionMonitoringDistributorDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionMonitoringDistributorDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConnectionMonitoringDistributorPayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionMonitoringDistributorDeliveryStructure", propOrder = {
    "waitProlongedDeparture",
    "stoppingPositionChangedDeparture",
    "distributorDepartureCancellation",
    "extensions"
})
public class ConnectionMonitoringDistributorDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "WaitProlongedDeparture")
    protected List<WaitProlongedDepartureStructure> waitProlongedDeparture;
    @XmlElement(name = "StoppingPositionChangedDeparture")
    protected List<StoppingPositionChangedDepartureStructure> stoppingPositionChangedDeparture;
    @XmlElement(name = "DistributorDepartureCancellation")
    protected List<DistributorDepartureCancellationStructure> distributorDepartureCancellation;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the waitProlongedDeparture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waitProlongedDeparture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaitProlongedDeparture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaitProlongedDepartureStructure }
     * 
     * 
     */
    public List<WaitProlongedDepartureStructure> getWaitProlongedDeparture() {
        if (waitProlongedDeparture == null) {
            waitProlongedDeparture = new ArrayList<WaitProlongedDepartureStructure>();
        }
        return this.waitProlongedDeparture;
    }

    /**
     * Gets the value of the stoppingPositionChangedDeparture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stoppingPositionChangedDeparture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoppingPositionChangedDeparture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoppingPositionChangedDepartureStructure }
     * 
     * 
     */
    public List<StoppingPositionChangedDepartureStructure> getStoppingPositionChangedDeparture() {
        if (stoppingPositionChangedDeparture == null) {
            stoppingPositionChangedDeparture = new ArrayList<StoppingPositionChangedDepartureStructure>();
        }
        return this.stoppingPositionChangedDeparture;
    }

    /**
     * Gets the value of the distributorDepartureCancellation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorDepartureCancellation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorDepartureCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributorDepartureCancellationStructure }
     * 
     * 
     */
    public List<DistributorDepartureCancellationStructure> getDistributorDepartureCancellation() {
        if (distributorDepartureCancellation == null) {
            distributorDepartureCancellation = new ArrayList<DistributorDepartureCancellationStructure>();
        }
        return this.distributorDepartureCancellation;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
