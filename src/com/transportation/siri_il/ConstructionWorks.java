
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Roadworks involving the construction of new infrastructure.
 * 
 * <p>Java class for ConstructionWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionWorks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}Roadworks">
 *       &lt;sequence>
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/1_0/1_0}ConstructionWorkTypeEnum" minOccurs="0"/>
 *         &lt;element name="constructionWorksExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionWorks", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "constructionWorkType",
    "constructionWorksExtension"
})
public class ConstructionWorks
    extends Roadworks
{

    protected ConstructionWorkTypeEnum constructionWorkType;
    protected ExtensionType constructionWorksExtension;

    /**
     * Gets the value of the constructionWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Sets the value of the constructionWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Gets the value of the constructionWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConstructionWorksExtension() {
        return constructionWorksExtension;
    }

    /**
     * Sets the value of the constructionWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConstructionWorksExtension(ExtensionType value) {
        this.constructionWorksExtension = value;
    }

}
