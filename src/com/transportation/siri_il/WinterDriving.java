
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Supplementary winter driving advice.
 * 
 * <p>Java class for WinterDriving complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WinterDriving">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Advice">
 *       &lt;sequence>
 *         &lt;element name="winterDrivingAdvice" type="{http://datex2.eu/schema/1_0/1_0}WinterEquipmentAdviceEnum"/>
 *         &lt;element name="winterDrivingExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDriving", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "winterDrivingAdvice",
    "winterDrivingExtension"
})
public class WinterDriving
    extends Advice
{

    @XmlElement(required = true)
    protected WinterEquipmentAdviceEnum winterDrivingAdvice;
    protected ExtensionType winterDrivingExtension;

    /**
     * Gets the value of the winterDrivingAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentAdviceEnum }
     *     
     */
    public WinterEquipmentAdviceEnum getWinterDrivingAdvice() {
        return winterDrivingAdvice;
    }

    /**
     * Sets the value of the winterDrivingAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentAdviceEnum }
     *     
     */
    public void setWinterDrivingAdvice(WinterEquipmentAdviceEnum value) {
        this.winterDrivingAdvice = value;
    }

    /**
     * Gets the value of the winterDrivingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingExtension() {
        return winterDrivingExtension;
    }

    /**
     * Sets the value of the winterDrivingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingExtension(ExtensionType value) {
        this.winterDrivingExtension = value;
    }

}
