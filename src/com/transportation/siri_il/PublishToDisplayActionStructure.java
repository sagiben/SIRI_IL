
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Action Publish situation To Web.
 * 
 * <p>Java class for PublishToDisplayActionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublishToDisplayActionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure">
 *       &lt;sequence>
 *         &lt;element name="OnPlace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToDisplayActionStructure", propOrder = {
    "onPlace",
    "onBoard"
})
public class PublishToDisplayActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "OnPlace", defaultValue = "true")
    protected Boolean onPlace;
    @XmlElement(name = "OnBoard", defaultValue = "false")
    protected Boolean onBoard;

    /**
     * Gets the value of the onPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnPlace() {
        return onPlace;
    }

    /**
     * Sets the value of the onPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnPlace(Boolean value) {
        this.onPlace = value;
    }

    /**
     * Gets the value of the onBoard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBoard() {
        return onBoard;
    }

    /**
     * Sets the value of the onBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnBoard(Boolean value) {
        this.onBoard = value;
    }

}
