
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for  deliveries  of production timetable service. Used in WSDL.
 * 
 * <p>Java class for ProductionTimetableDeliveriesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableDeliveriesStructure", propOrder = {
    "productionTimetableDelivery"
})
public class ProductionTimetableDeliveriesStructure {

    @XmlElement(name = "ProductionTimetableDelivery", required = true)
    protected List<ProductionTimetableDeliveryStructure> productionTimetableDelivery;

    /**
     * Gets the value of the productionTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTimetableDeliveryStructure }
     * 
     * 
     */
    public List<ProductionTimetableDeliveryStructure> getProductionTimetableDelivery() {
        if (productionTimetableDelivery == null) {
            productionTimetableDelivery = new ArrayList<ProductionTimetableDeliveryStructure>();
        }
        return this.productionTimetableDelivery;
    }

}