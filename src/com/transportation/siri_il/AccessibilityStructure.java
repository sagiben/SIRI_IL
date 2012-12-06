
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for accessibility
 * 
 * <p>Java class for AccessibilityStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/acsb>AccessibilityEnumeration">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityStructure", namespace = "http://www.ifopt.org.uk/acsb", propOrder = {
    "value"
})
public class AccessibilityStructure {

    @XmlValue
    protected AccessibilityEnumeration value;

    /**
     * Enumeration of values for an accessibility value.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityEnumeration }
     *     
     */
    public AccessibilityEnumeration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityEnumeration }
     *     
     */
    public void setValue(AccessibilityEnumeration value) {
        this.value = value;
    }

}
