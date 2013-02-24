
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  Local service.
 * 
 * <p>Java class for LocalServiceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalServiceStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}LocalServiceGroup"/>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalServiceStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "validityConditions",
    "featureRefs",
    "extensions"
})
public class LocalServiceStructure
    extends InstalledEquipmentStructure
{

    @XmlElement(name = "ValidityConditions")
    protected ValidityConditionsStructure validityConditions;
    @XmlElement(name = "FeatureRefs")
    protected LocalServiceStructure.FeatureRefs featureRefs;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the validityConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public ValidityConditionsStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Sets the value of the validityConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public void setValidityConditions(ValidityConditionsStructure value) {
        this.validityConditions = value;
    }

    /**
     * Gets the value of the featureRefs property.
     * 
     * @return
     *     possible object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public LocalServiceStructure.FeatureRefs getFeatureRefs() {
        return featureRefs;
    }

    /**
     * Sets the value of the featureRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public void setFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        this.featureRefs = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
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
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}ServiceFeatureRefStructure" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class FeatureRefs {

        @XmlElement(name = "FeatureRef", namespace = "http://www.ifopt.org.uk/ifopt")
        protected List<ServiceFeatureRefStructure> featureRef;

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
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<ServiceFeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<ServiceFeatureRefStructure>();
            }
            return this.featureRef;
        }

    }

}
