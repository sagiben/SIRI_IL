
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Availaibility Change of Equipment.
 * 
 * <p>Java class for EquipmentAvailabilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentAvailabilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentRefStructure" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="EquipmentTypeRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentTypeRefStructure" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" minOccurs="0"/>
 *         &lt;element name="EquipmentStatus" type="{http://www.ifopt.org.uk/ifopt}EquipmentStatusEnumeration"/>
 *         &lt;element name="EquipmentFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "EquipmentAvailabilityStructure", propOrder = {
    "equipmentRef",
    "description",
    "equipmentTypeRef",
    "validityPeriod",
    "equipmentStatus",
    "equipmentFeatures",
    "extensions"
})
public class EquipmentAvailabilityStructure {

    @XmlElement(name = "EquipmentRef")
    protected EquipmentRefStructure equipmentRef;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "EquipmentTypeRef")
    protected EquipmentTypeRefStructure equipmentTypeRef;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampRangeStructure validityPeriod;
    @XmlElement(name = "EquipmentStatus", required = true, defaultValue = "notAvailable")
    protected EquipmentStatusEnumeration equipmentStatus;
    @XmlElement(name = "EquipmentFeatures")
    protected EquipmentAvailabilityStructure.EquipmentFeatures equipmentFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the equipmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public EquipmentRefStructure getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Sets the value of the equipmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public void setEquipmentRef(EquipmentRefStructure value) {
        this.equipmentRef = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Gets the value of the equipmentTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getEquipmentTypeRef() {
        return equipmentTypeRef;
    }

    /**
     * Sets the value of the equipmentTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setEquipmentTypeRef(EquipmentTypeRefStructure value) {
        this.equipmentTypeRef = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public HalfOpenTimestampRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the equipmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public EquipmentStatusEnumeration getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * Sets the value of the equipmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public void setEquipmentStatus(EquipmentStatusEnumeration value) {
        this.equipmentStatus = value;
    }

    /**
     * Gets the value of the equipmentFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures getEquipmentFeatures() {
        return equipmentFeatures;
    }

    /**
     * Sets the value of the equipmentFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public void setEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        this.equipmentFeatures = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "featureRef"
    })
    public static class EquipmentFeatures {

        @XmlElement(name = "FeatureRef", required = true)
        protected List<FeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureRefStructure }
         * 
         * 
         */
        public List<FeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.featureRef;
        }

    }

}
