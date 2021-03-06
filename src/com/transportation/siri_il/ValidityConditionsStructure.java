
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of one or more validity conditions
 * 
 * <p>Java class for ValidityConditionsStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidityConditionsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValidityCondition" type="{http://www.ifopt.org.uk/ifopt}ValidityConditionStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityConditionsStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "validityCondition"
})
public class ValidityConditionsStructure {

    @XmlElement(name = "ValidityCondition", required = true)
    protected List<ValidityConditionStructure> validityCondition;

    /**
     * Gets the value of the validityCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityConditionStructure }
     * 
     * 
     */
    public List<ValidityConditionStructure> getValidityCondition() {
        if (validityCondition == null) {
            validityCondition = new ArrayList<ValidityConditionStructure>();
        }
        return this.validityCondition;
    }

}
