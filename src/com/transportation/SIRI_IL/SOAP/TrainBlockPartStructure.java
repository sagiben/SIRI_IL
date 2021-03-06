
package com.transportation.SIRI_IL.SOAP;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Block part elements of Vehicle journey.
 * 
 * <p>Java class for TrainBlockPartStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainBlockPartStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberOfBlockParts" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="TrainPartRef" type="{http://www.siri.org.uk/siri}TrainPartRefStructure"/>
 *         &lt;element name="PositionOfTrainBlockPart" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainBlockPartStructure", propOrder = {
    "numberOfBlockParts",
    "trainPartRef",
    "positionOfTrainBlockPart"
})
public class TrainBlockPartStructure {

    @XmlElement(name = "NumberOfBlockParts", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfBlockParts;
    @XmlElement(name = "TrainPartRef", required = true)
    protected TrainPartRefStructure trainPartRef;
    @XmlElement(name = "PositionOfTrainBlockPart")
    protected NaturalLanguageStringStructure positionOfTrainBlockPart;

    /**
     * Gets the value of the numberOfBlockParts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBlockParts() {
        return numberOfBlockParts;
    }

    /**
     * Sets the value of the numberOfBlockParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBlockParts(BigInteger value) {
        this.numberOfBlockParts = value;
    }

    /**
     * Gets the value of the trainPartRef property.
     * 
     * @return
     *     possible object is
     *     {@link TrainPartRefStructure }
     *     
     */
    public TrainPartRefStructure getTrainPartRef() {
        return trainPartRef;
    }

    /**
     * Sets the value of the trainPartRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainPartRefStructure }
     *     
     */
    public void setTrainPartRef(TrainPartRefStructure value) {
        this.trainPartRef = value;
    }

    /**
     * Gets the value of the positionOfTrainBlockPart property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPositionOfTrainBlockPart() {
        return positionOfTrainBlockPart;
    }

    /**
     * Sets the value of the positionOfTrainBlockPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPositionOfTrainBlockPart(NaturalLanguageStringStructure value) {
        this.positionOfTrainBlockPart = value;
    }

}
