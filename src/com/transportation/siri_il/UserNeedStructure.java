
package com.transportation.siri_il;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for of a specific need
 * 
 * <p>Java class for UserNeedStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserNeedStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}UserNeedGroup"/>
 *         &lt;element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NeedRanking" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserNeedStructure", namespace = "http://www.ifopt.org.uk/acsb", propOrder = {
    "mobilityNeed",
    "psychosensoryNeed",
    "medicalNeed",
    "encumbranceNeed",
    "excluded",
    "needRanking",
    "extensions"
})
public class UserNeedStructure {

    @XmlElement(name = "MobilityNeed")
    protected MobilityEnumeration mobilityNeed;
    @XmlElement(name = "PsychosensoryNeed")
    protected PyschosensoryNeedEnumeration psychosensoryNeed;
    @XmlElement(name = "MedicalNeed")
    protected MedicalNeedEnumeration medicalNeed;
    @XmlElement(name = "EncumbranceNeed")
    protected EncumbranceEnumeration encumbranceNeed;
    @XmlElement(name = "Excluded")
    protected Boolean excluded;
    @XmlElement(name = "NeedRanking")
    protected BigInteger needRanking;
    @XmlElement(name = "Extensions")
    protected Object extensions;

    /**
     * Gets the value of the mobilityNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnumeration }
     *     
     */
    public MobilityEnumeration getMobilityNeed() {
        return mobilityNeed;
    }

    /**
     * Sets the value of the mobilityNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnumeration }
     *     
     */
    public void setMobilityNeed(MobilityEnumeration value) {
        this.mobilityNeed = value;
    }

    /**
     * Gets the value of the psychosensoryNeed property.
     * 
     * @return
     *     possible object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public PyschosensoryNeedEnumeration getPsychosensoryNeed() {
        return psychosensoryNeed;
    }

    /**
     * Sets the value of the psychosensoryNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PyschosensoryNeedEnumeration }
     *     
     */
    public void setPsychosensoryNeed(PyschosensoryNeedEnumeration value) {
        this.psychosensoryNeed = value;
    }

    /**
     * Gets the value of the medicalNeed property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public MedicalNeedEnumeration getMedicalNeed() {
        return medicalNeed;
    }

    /**
     * Sets the value of the medicalNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalNeedEnumeration }
     *     
     */
    public void setMedicalNeed(MedicalNeedEnumeration value) {
        this.medicalNeed = value;
    }

    /**
     * Gets the value of the encumbranceNeed property.
     * 
     * @return
     *     possible object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public EncumbranceEnumeration getEncumbranceNeed() {
        return encumbranceNeed;
    }

    /**
     * Sets the value of the encumbranceNeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncumbranceEnumeration }
     *     
     */
    public void setEncumbranceNeed(EncumbranceEnumeration value) {
        this.encumbranceNeed = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the needRanking property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNeedRanking() {
        return needRanking;
    }

    /**
     * Sets the value of the needRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNeedRanking(BigInteger value) {
        this.needRanking = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtensions(Object value) {
        this.extensions = value;
    }

}
