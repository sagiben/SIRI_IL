
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The type of subject to which the roadworks are associated.
 * 
 * <p>Java class for SubjectTypeOfWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectTypeOfWorks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectTypeOfWorks" type="{http://datex2.eu/schema/1_0/1_0}SubjectTypeOfWorksEnum"/>
 *         &lt;element name="numberOfSubjects" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="subjectTypeOfWorksExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectTypeOfWorks", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "subjectTypeOfWorks",
    "numberOfSubjects",
    "subjectTypeOfWorksExtension"
})
public class SubjectTypeOfWorks {

    @XmlElement(required = true)
    protected SubjectTypeOfWorksEnum subjectTypeOfWorks;
    protected BigInteger numberOfSubjects;
    protected ExtensionType subjectTypeOfWorksExtension;

    /**
     * Gets the value of the subjectTypeOfWorks property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public SubjectTypeOfWorksEnum getSubjectTypeOfWorks() {
        return subjectTypeOfWorks;
    }

    /**
     * Sets the value of the subjectTypeOfWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public void setSubjectTypeOfWorks(SubjectTypeOfWorksEnum value) {
        this.subjectTypeOfWorks = value;
    }

    /**
     * Gets the value of the numberOfSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubjects() {
        return numberOfSubjects;
    }

    /**
     * Sets the value of the numberOfSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubjects(BigInteger value) {
        this.numberOfSubjects = value;
    }

    /**
     * Gets the value of the subjectTypeOfWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSubjectTypeOfWorksExtension() {
        return subjectTypeOfWorksExtension;
    }

    /**
     * Sets the value of the subjectTypeOfWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSubjectTypeOfWorksExtension(ExtensionType value) {
        this.subjectTypeOfWorksExtension = value;
    }

}
