
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Subscription Request for Production Timetable Service.
 * 
 * <p>Java class for ProductionTimetableSubscriptionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableSubscriptionStructure", propOrder = {
    "productionTimetableRequest"
})
@XmlSeeAlso({
    ProductionTimetableSubscriptionRequest.class
})
public class ProductionTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
{

    @XmlElement(name = "ProductionTimetableRequest", required = true)
    protected ProductionTimetableRequestStructure productionTimetableRequest;

    /**
     * Gets the value of the productionTimetableRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableRequestStructure }
     *     
     */
    public ProductionTimetableRequestStructure getProductionTimetableRequest() {
        return productionTimetableRequest;
    }

    /**
     * Sets the value of the productionTimetableRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableRequestStructure }
     *     
     */
    public void setProductionTimetableRequest(ProductionTimetableRequestStructure value) {
        this.productionTimetableRequest = value;
    }

}
