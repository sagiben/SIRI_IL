
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for an Activity that can be referenced. 
 * 
 * <p>Java class for AbstractIdentifiedItemStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractIdentifiedItemStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ItemIdentifier" type="{http://www.siri.org.uk/siri}ItemIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractIdentifiedItemStructure", propOrder = {
    "itemIdentifier"
})
@XmlSeeAlso({
    InfoMessageStructure.class,
    VehicleActivityStructure.class,
    StopLineNoticeStructure.class,
    MonitoredStopVisitStructure.class,
    TimetabledStopVisitStructure.class,
    AbstractFeederItemStructure.class
})
public class AbstractIdentifiedItemStructure
    extends AbstractItemStructure
{

    @XmlElement(name = "ItemIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemIdentifier;

    /**
     * Gets the value of the itemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * Sets the value of the itemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIdentifier(String value) {
        this.itemIdentifier = value;
    }

}
