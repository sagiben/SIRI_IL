
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for list of situations.
 * 
 * <p>Java class for ActionDataStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDataStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/>
 *         &lt;element name="Prompt" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDataStructure", propOrder = {
    "name",
    "type",
    "value",
    "prompt"
})
public class ActionDataStructure {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String type;
    @XmlElement(name = "Value", required = true)
    protected List<Object> value;
    @XmlElement(name = "Prompt")
    protected NaturalLanguageStringStructure prompt;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPrompt(NaturalLanguageStringStructure value) {
        this.prompt = value;
    }

}
