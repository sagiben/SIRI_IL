
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Type for reference to a Country Identifier. 
 * 
 * <p>Java class for CountryRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>CountryCodeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryRefStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "value"
})
public class CountryRefStructure {

    @XmlValue
    protected IanaCountryTldEnumeration value;

    /**
     * Type for Country Identifier.
     * 
     * @return
     *     possible object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public IanaCountryTldEnumeration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link IanaCountryTldEnumeration }
     *     
     */
    public void setValue(IanaCountryTldEnumeration value) {
        this.value = value;
    }

}
