
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for references.
 * 
 * <p>Java class for ReferencesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedToRef" type="{http://www.siri.org.uk/siri}RelatedSituationStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencesStructure", propOrder = {
    "relatedToRef"
})
public class ReferencesStructure {

    @XmlElement(name = "RelatedToRef", required = true)
    protected List<RelatedSituationStructure> relatedToRef;

    /**
     * Gets the value of the relatedToRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedToRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedToRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedSituationStructure }
     * 
     * 
     */
    public List<RelatedSituationStructure> getRelatedToRef() {
        if (relatedToRef == null) {
            relatedToRef = new ArrayList<RelatedSituationStructure>();
        }
        return this.relatedToRef;
    }

}
