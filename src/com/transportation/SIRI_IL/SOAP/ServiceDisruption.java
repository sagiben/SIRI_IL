
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of disruption to normal services (e.g. specific services at a service areas).
 * 
 * <p>Java class for ServiceDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDisruption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="serviceDisruptionType" type="{http://datex2.eu/schema/1_0/1_0}ServiceDisruptionTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="serviceDisruptionExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDisruption", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "serviceDisruptionType",
    "serviceDisruptionExtension"
})
public class ServiceDisruption
    extends NonRoadEventInformation
{

    @XmlElement(required = true)
    protected List<ServiceDisruptionTypeEnum> serviceDisruptionType;
    protected ExtensionType serviceDisruptionExtension;

    /**
     * Gets the value of the serviceDisruptionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDisruptionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDisruptionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDisruptionTypeEnum }
     * 
     * 
     */
    public List<ServiceDisruptionTypeEnum> getServiceDisruptionType() {
        if (serviceDisruptionType == null) {
            serviceDisruptionType = new ArrayList<ServiceDisruptionTypeEnum>();
        }
        return this.serviceDisruptionType;
    }

    /**
     * Gets the value of the serviceDisruptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getServiceDisruptionExtension() {
        return serviceDisruptionExtension;
    }

    /**
     * Sets the value of the serviceDisruptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setServiceDisruptionExtension(ExtensionType value) {
        this.serviceDisruptionExtension = value;
    }

}
