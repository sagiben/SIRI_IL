
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data Type for Reference to a Vehicle Feature Code. SIRI provides a recommended set of values covering most usages, intended to be TPEG comnpatible. See the SIRI facilities packaged
 * 
 * <p>Java class for VehicleFeatureRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleFeatureRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.siri.org.uk/siri>VehicleFeatureCodeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleFeatureRefStructure", propOrder = {
    "value"
})
public class VehicleFeatureRefStructure {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;

    /**
     * Data Type for Identifier of a Vehicle Feature. SIRI provides a recommended set of values covering most usages, intended to be TPEG comnpatible. See the SIRI facilities packaged
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
