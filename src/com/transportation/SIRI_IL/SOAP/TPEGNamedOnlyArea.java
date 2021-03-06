
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An area defined by a well known name.
 * 
 * <p>Java class for TPEGNamedOnlyArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPEGNamedOnlyArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}TPEGAreaLocation">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://datex2.eu/schema/1_0/1_0}TPEGAreaDescriptor" maxOccurs="unbounded"/>
 *         &lt;element name="tpegnamedOnlyAreaExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPEGNamedOnlyArea", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "name",
    "tpegnamedOnlyAreaExtension"
})
public class TPEGNamedOnlyArea
    extends TPEGAreaLocation
{

    @XmlElement(required = true)
    protected List<TPEGAreaDescriptor> name;
    protected ExtensionType tpegnamedOnlyAreaExtension;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPEGAreaDescriptor }
     * 
     * 
     */
    public List<TPEGAreaDescriptor> getName() {
        if (name == null) {
            name = new ArrayList<TPEGAreaDescriptor>();
        }
        return this.name;
    }

    /**
     * Gets the value of the tpegnamedOnlyAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegnamedOnlyAreaExtension() {
        return tpegnamedOnlyAreaExtension;
    }

    /**
     * Sets the value of the tpegnamedOnlyAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegnamedOnlyAreaExtension(ExtensionType value) {
        this.tpegnamedOnlyAreaExtension = value;
    }

}
