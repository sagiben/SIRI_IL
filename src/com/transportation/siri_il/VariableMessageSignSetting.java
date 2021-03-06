
package com.transportation.siri_il;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a variable message sign and its displayed information.
 * 
 * <p>Java class for VariableMessageSignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableMessageSignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}SignSetting">
 *       &lt;sequence>
 *         &lt;element name="numberOfCharacters" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfRows" type="{http://datex2.eu/schema/1_0/1_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/1_0/1_0}VMSFaultEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="vmsLegend" type="{http://datex2.eu/schema/1_0/1_0}String" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsType" type="{http://datex2.eu/schema/1_0/1_0}VMSTypeEnum" minOccurs="0"/>
 *         &lt;element name="variableMessageSignSettingExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableMessageSignSetting", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "numberOfCharacters",
    "numberOfRows",
    "vmsFault",
    "vmsIdentifier",
    "vmsLegend",
    "vmsType",
    "variableMessageSignSettingExtension"
})
public class VariableMessageSignSetting
    extends SignSetting
{

    protected BigInteger numberOfCharacters;
    protected BigInteger numberOfRows;
    protected List<VMSFaultEnum> vmsFault;
    protected String vmsIdentifier;
    protected List<String> vmsLegend;
    protected VMSTypeEnum vmsType;
    protected ExtensionType variableMessageSignSettingExtension;

    /**
     * Gets the value of the numberOfCharacters property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCharacters() {
        return numberOfCharacters;
    }

    /**
     * Sets the value of the numberOfCharacters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCharacters(BigInteger value) {
        this.numberOfCharacters = value;
    }

    /**
     * Gets the value of the numberOfRows property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfRows() {
        return numberOfRows;
    }

    /**
     * Sets the value of the numberOfRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfRows(BigInteger value) {
        this.numberOfRows = value;
    }

    /**
     * Gets the value of the vmsFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VMSFaultEnum }
     * 
     * 
     */
    public List<VMSFaultEnum> getVmsFault() {
        if (vmsFault == null) {
            vmsFault = new ArrayList<VMSFaultEnum>();
        }
        return this.vmsFault;
    }

    /**
     * Gets the value of the vmsIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmsIdentifier() {
        return vmsIdentifier;
    }

    /**
     * Sets the value of the vmsIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmsIdentifier(String value) {
        this.vmsIdentifier = value;
    }

    /**
     * Gets the value of the vmsLegend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsLegend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsLegend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVmsLegend() {
        if (vmsLegend == null) {
            vmsLegend = new ArrayList<String>();
        }
        return this.vmsLegend;
    }

    /**
     * Gets the value of the vmsType property.
     * 
     * @return
     *     possible object is
     *     {@link VMSTypeEnum }
     *     
     */
    public VMSTypeEnum getVmsType() {
        return vmsType;
    }

    /**
     * Sets the value of the vmsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMSTypeEnum }
     *     
     */
    public void setVmsType(VMSTypeEnum value) {
        this.vmsType = value;
    }

    /**
     * Gets the value of the variableMessageSignSettingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVariableMessageSignSettingExtension() {
        return variableMessageSignSettingExtension;
    }

    /**
     * Sets the value of the variableMessageSignSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVariableMessageSignSettingExtension(ExtensionType value) {
        this.variableMessageSignSettingExtension = value;
    }

}
