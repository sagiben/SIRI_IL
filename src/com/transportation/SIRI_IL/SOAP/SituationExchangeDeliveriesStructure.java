
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries forSituation Exchange services Used in WSDL.
 * 
 * <p>Java class for SituationExchangeDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationExchangeDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeDeliveriesStructure", propOrder = {
    "situationExchangeDelivery"
})
public class SituationExchangeDeliveriesStructure {

    @XmlElement(name = "SituationExchangeDelivery", required = true)
    protected List<SituationExchangeDeliveryStructure> situationExchangeDelivery;

    /**
     * Delviery for Vehicle Activity Service Gets the value of the situationExchangeDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangeDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangeDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeDeliveryStructure }
     * 
     * 
     */
    public List<SituationExchangeDeliveryStructure> getSituationExchangeDelivery() {
        if (situationExchangeDelivery == null) {
            situationExchangeDelivery = new ArrayList<SituationExchangeDeliveryStructure>();
        }
        return this.situationExchangeDelivery;
    }

}
