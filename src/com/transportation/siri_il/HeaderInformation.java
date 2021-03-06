
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Management information relating to the data contained within a publication.
 * 
 * <p>Java class for HeaderInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaOfInterest" type="{http://datex2.eu/schema/1_0/1_0}AreaOfInterestEnum" minOccurs="0"/>
 *         &lt;element name="confidentiality" type="{http://datex2.eu/schema/1_0/1_0}ConfidentialityValueEnum"/>
 *         &lt;element name="informationUsage" type="{http://datex2.eu/schema/1_0/1_0}InformationUsageEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="informationStatus" type="{http://datex2.eu/schema/1_0/1_0}InformationStatusEnum"/>
 *         &lt;element name="urgency" type="{http://datex2.eu/schema/1_0/1_0}UrgencyEnum" minOccurs="0"/>
 *         &lt;element name="headerInformationExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInformation", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "areaOfInterest",
    "confidentiality",
    "informationUsage",
    "informationStatus",
    "urgency",
    "headerInformationExtension"
})
public class HeaderInformation {

    protected AreaOfInterestEnum areaOfInterest;
    @XmlElement(required = true)
    protected ConfidentialityValueEnum confidentiality;
    protected List<InformationUsageEnum> informationUsage;
    @XmlElement(required = true)
    protected InformationStatusEnum informationStatus;
    protected UrgencyEnum urgency;
    protected ExtensionType headerInformationExtension;

    /**
     * Gets the value of the areaOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public AreaOfInterestEnum getAreaOfInterest() {
        return areaOfInterest;
    }

    /**
     * Sets the value of the areaOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaOfInterestEnum }
     *     
     */
    public void setAreaOfInterest(AreaOfInterestEnum value) {
        this.areaOfInterest = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public ConfidentialityValueEnum getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidentialityValueEnum }
     *     
     */
    public void setConfidentiality(ConfidentialityValueEnum value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the informationUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationUsageEnum }
     * 
     * 
     */
    public List<InformationUsageEnum> getInformationUsage() {
        if (informationUsage == null) {
            informationUsage = new ArrayList<InformationUsageEnum>();
        }
        return this.informationUsage;
    }

    /**
     * Gets the value of the informationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InformationStatusEnum }
     *     
     */
    public InformationStatusEnum getInformationStatus() {
        return informationStatus;
    }

    /**
     * Sets the value of the informationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationStatusEnum }
     *     
     */
    public void setInformationStatus(InformationStatusEnum value) {
        this.informationStatus = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyEnum }
     *     
     */
    public UrgencyEnum getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyEnum }
     *     
     */
    public void setUrgency(UrgencyEnum value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the headerInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaderInformationExtension() {
        return headerInformationExtension;
    }

    /**
     * Sets the value of the headerInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaderInformationExtension(ExtensionType value) {
        this.headerInformationExtension = value;
    }

}
