
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for disruption.
 * 
 * <p>Java class for PtConsequenceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtConsequenceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampRangeStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Condition" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.siri.org.uk/siri}SeverityEnumeration"/>
 *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure" minOccurs="0"/>
 *         &lt;element name="Suitabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Advice" type="{http://www.siri.org.uk/siri}PtAdviceStructure" minOccurs="0"/>
 *         &lt;element name="Blocking" type="{http://www.siri.org.uk/siri}BlockingStructure" minOccurs="0"/>
 *         &lt;element name="Boarding" type="{http://www.siri.org.uk/siri}BoardingStructure" minOccurs="0"/>
 *         &lt;element name="Delays" type="{http://www.siri.org.uk/siri}DelaysStructure" minOccurs="0"/>
 *         &lt;element name="Casualties" type="{http://www.siri.org.uk/siri}CasualtiesStructure" minOccurs="0"/>
 *         &lt;element name="Easements" type="{http://www.siri.org.uk/siri}EasementsStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PtConsequenceStructure", propOrder = {
    "period",
    "condition",
    "severity",
    "affects",
    "suitabilities",
    "advice",
    "blocking",
    "boarding",
    "delays",
    "casualties",
    "easements",
    "extensions"
})
public class PtConsequenceStructure {

    @XmlElement(name = "Period")
    protected HalfOpenTimestampRangeStructure period;
    @XmlElement(name = "Condition")
    protected ServiceConditionEnumeration condition;
    @XmlElement(name = "Severity", required = true)
    protected SeverityEnumeration severity;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Suitabilities")
    protected PtConsequenceStructure.Suitabilities suitabilities;
    @XmlElement(name = "Advice")
    protected PtAdviceStructure advice;
    @XmlElement(name = "Blocking")
    protected BlockingStructure blocking;
    @XmlElement(name = "Boarding")
    protected BoardingStructure boarding;
    @XmlElement(name = "Delays")
    protected DelaysStructure delays;
    @XmlElement(name = "Casualties")
    protected CasualtiesStructure casualties;
    @XmlElement(name = "Easements")
    protected List<EasementsStructure> easements;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public HalfOpenTimestampRangeStructure getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampRangeStructure }
     *     
     */
    public void setPeriod(HalfOpenTimestampRangeStructure value) {
        this.period = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConditionEnumeration }
     *     
     */
    public ServiceConditionEnumeration getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConditionEnumeration }
     *     
     */
    public void setCondition(ServiceConditionEnumeration value) {
        this.condition = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Gets the value of the affects property.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Sets the value of the affects property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Gets the value of the suitabilities property.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public PtConsequenceStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Sets the value of the suitabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(PtConsequenceStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Gets the value of the advice property.
     * 
     * @return
     *     possible object is
     *     {@link PtAdviceStructure }
     *     
     */
    public PtAdviceStructure getAdvice() {
        return advice;
    }

    /**
     * Sets the value of the advice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PtAdviceStructure }
     *     
     */
    public void setAdvice(PtAdviceStructure value) {
        this.advice = value;
    }

    /**
     * Gets the value of the blocking property.
     * 
     * @return
     *     possible object is
     *     {@link BlockingStructure }
     *     
     */
    public BlockingStructure getBlocking() {
        return blocking;
    }

    /**
     * Sets the value of the blocking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockingStructure }
     *     
     */
    public void setBlocking(BlockingStructure value) {
        this.blocking = value;
    }

    /**
     * Gets the value of the boarding property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStructure }
     *     
     */
    public BoardingStructure getBoarding() {
        return boarding;
    }

    /**
     * Sets the value of the boarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStructure }
     *     
     */
    public void setBoarding(BoardingStructure value) {
        this.boarding = value;
    }

    /**
     * Gets the value of the delays property.
     * 
     * @return
     *     possible object is
     *     {@link DelaysStructure }
     *     
     */
    public DelaysStructure getDelays() {
        return delays;
    }

    /**
     * Sets the value of the delays property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysStructure }
     *     
     */
    public void setDelays(DelaysStructure value) {
        this.delays = value;
    }

    /**
     * Gets the value of the casualties property.
     * 
     * @return
     *     possible object is
     *     {@link CasualtiesStructure }
     *     
     */
    public CasualtiesStructure getCasualties() {
        return casualties;
    }

    /**
     * Sets the value of the casualties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasualtiesStructure }
     *     
     */
    public void setCasualties(CasualtiesStructure value) {
        this.casualties = value;
    }

    /**
     * Gets the value of the easements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the easements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EasementsStructure }
     * 
     * 
     */
    public List<EasementsStructure> getEasements() {
        if (easements == null) {
            easements = new ArrayList<EasementsStructure>();
        }
        return this.easements;
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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
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
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

    }

}
