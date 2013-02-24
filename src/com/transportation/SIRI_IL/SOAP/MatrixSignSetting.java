
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a matrix sign and its displayed aspect.
 * 
 * <p>Java class for MatrixSignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatrixSignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}SignSetting">
 *       &lt;sequence>
 *         &lt;element name="aspectDisplayed" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="matrixFault" type="{http://datex2.eu/schema/1_0/1_0}MatrixFaultEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matrixIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String"/>
 *         &lt;element name="matrixSignSettingExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixSignSetting", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "aspectDisplayed",
    "matrixFault",
    "matrixIdentifier",
    "matrixSignSettingExtension"
})
public class MatrixSignSetting
    extends SignSetting
{

    @XmlElement(required = true)
    protected String aspectDisplayed;
    protected List<MatrixFaultEnum> matrixFault;
    @XmlElement(required = true)
    protected String matrixIdentifier;
    protected ExtensionType matrixSignSettingExtension;

    /**
     * Gets the value of the aspectDisplayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectDisplayed() {
        return aspectDisplayed;
    }

    /**
     * Sets the value of the aspectDisplayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectDisplayed(String value) {
        this.aspectDisplayed = value;
    }

    /**
     * Gets the value of the matrixFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matrixFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixFaultEnum }
     * 
     * 
     */
    public List<MatrixFaultEnum> getMatrixFault() {
        if (matrixFault == null) {
            matrixFault = new ArrayList<MatrixFaultEnum>();
        }
        return this.matrixFault;
    }

    /**
     * Gets the value of the matrixIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixIdentifier() {
        return matrixIdentifier;
    }

    /**
     * Sets the value of the matrixIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixIdentifier(String value) {
        this.matrixIdentifier = value;
    }

    /**
     * Gets the value of the matrixSignSettingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMatrixSignSettingExtension() {
        return matrixSignSettingExtension;
    }

    /**
     * Sets the value of the matrixSignSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMatrixSignSettingExtension(ExtensionType value) {
        this.matrixSignSettingExtension = value;
    }

}
