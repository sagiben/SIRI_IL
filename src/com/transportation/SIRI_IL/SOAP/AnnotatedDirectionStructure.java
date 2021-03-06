
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  Direction and name description.
 * 
 * <p>Java class for AnnotatedDirectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotatedDirectionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnotatedDirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure"/>
 *         &lt;element name="DirectionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotatedDirectionStructure", propOrder = {
    "annotatedDirectionRef",
    "directionName"
})
public class AnnotatedDirectionStructure {

    @XmlElement(name = "AnnotatedDirectionRef", required = true)
    protected DirectionRefStructure annotatedDirectionRef;
    @XmlElement(name = "DirectionName", required = true)
    protected NaturalLanguageStringStructure directionName;

    /**
     * Gets the value of the annotatedDirectionRef property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getAnnotatedDirectionRef() {
        return annotatedDirectionRef;
    }

    /**
     * Sets the value of the annotatedDirectionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setAnnotatedDirectionRef(DirectionRefStructure value) {
        this.annotatedDirectionRef = value;
    }

    /**
     * Gets the value of the directionName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDirectionName() {
        return directionName;
    }

    /**
     * Sets the value of the directionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDirectionName(NaturalLanguageStringStructure value) {
        this.directionName = value;
    }

}
