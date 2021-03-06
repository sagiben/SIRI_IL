
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a text that may be overridden.
 * 
 * <p>Java class for DefaultedTextStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultedTextStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.siri.org.uk/siri>NaturalLanguageStringStructure">
 *       &lt;attribute name="overridden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultedTextStructure")
public class DefaultedTextStructure
    extends NaturalLanguageStringStructure
{

    @XmlAttribute(name = "overridden")
    protected Boolean overridden;

    /**
     * Gets the value of the overridden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverridden() {
        if (overridden == null) {
            return true;
        } else {
            return overridden;
        }
    }

    /**
     * Sets the value of the overridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverridden(Boolean value) {
        this.overridden = value;
    }

}
