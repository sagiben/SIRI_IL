
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for list of effects.
 * 
 * <p>Java class for PtConsequencesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PtConsequencesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consequence" type="{http://www.siri.org.uk/siri}PtConsequenceStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequencesStructure", propOrder = {
    "consequence"
})
public class PtConsequencesStructure {

    @XmlElement(name = "Consequence", required = true)
    protected List<PtConsequenceStructure> consequence;

    /**
     * Gets the value of the consequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtConsequenceStructure }
     * 
     * 
     */
    public List<PtConsequenceStructure> getConsequence() {
        if (consequence == null) {
            consequence = new ArrayList<PtConsequenceStructure>();
        }
        return this.consequence;
    }

}
