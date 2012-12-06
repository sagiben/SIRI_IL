
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for collection of info links.
 * 
 * <p>Java class for InfoLinksStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoLinksStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}InfoLink" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinksStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "infoLink"
})
public class InfoLinksStructure {

    @XmlElement(name = "InfoLink", required = true)
    protected List<InfoLinkStructure2> infoLink;

    /**
     * Gets the value of the infoLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoLinkStructure2 }
     * 
     * 
     */
    public List<InfoLinkStructure2> getInfoLink() {
        if (infoLink == null) {
            infoLink = new ArrayList<InfoLinkStructure2>();
        }
        return this.infoLink;
    }

}
