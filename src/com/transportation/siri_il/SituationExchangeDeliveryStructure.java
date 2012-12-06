
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data type for Delivery forSituation Exchange Service. Provides information about one or more vehicles; each has its own vehicle activity element.
 * 
 * <p>Java class for SituationExchangeDeliveryStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationExchangeDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceDeliveryStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SituationExchangePayloadGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.siri.org.uk/siri}VersionString" fixed="1.3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationExchangeDeliveryStructure", propOrder = {
    "ptSituationContext",
    "situations",
    "extensions"
})
public class SituationExchangeDeliveryStructure
    extends AbstractServiceDeliveryStructure
{

    @XmlElement(name = "PtSituationContext")
    protected ContextStructure ptSituationContext;
    @XmlElement(name = "Situations")
    protected SituationExchangeDeliveryStructure.Situations situations;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the ptSituationContext property.
     * 
     * @return
     *     possible object is
     *     {@link ContextStructure }
     *     
     */
    public ContextStructure getPtSituationContext() {
        return ptSituationContext;
    }

    /**
     * Sets the value of the ptSituationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextStructure }
     *     
     */
    public void setPtSituationContext(ContextStructure value) {
        this.ptSituationContext = value;
    }

    /**
     * Gets the value of the situations property.
     * 
     * @return
     *     possible object is
     *     {@link SituationExchangeDeliveryStructure.Situations }
     *     
     */
    public SituationExchangeDeliveryStructure.Situations getSituations() {
        return situations;
    }

    /**
     * Sets the value of the situations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationExchangeDeliveryStructure.Situations }
     *     
     */
    public void setSituations(SituationExchangeDeliveryStructure.Situations value) {
        this.situations = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PtSituationElement" type="{http://www.siri.org.uk/siri}PtSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.siri.org.uk/siri}RoadSituationElement" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ptSituationElement",
        "roadSituationElement"
    })
    public static class Situations {

        @XmlElement(name = "PtSituationElement")
        protected List<PtSituationElementStructure> ptSituationElement;
        @XmlElement(name = "RoadSituationElement")
        protected List<RoadSituationElementStructure> roadSituationElement;

        /**
         * Gets the value of the ptSituationElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptSituationElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPtSituationElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PtSituationElementStructure }
         * 
         * 
         */
        public List<PtSituationElementStructure> getPtSituationElement() {
            if (ptSituationElement == null) {
                ptSituationElement = new ArrayList<PtSituationElementStructure>();
            }
            return this.ptSituationElement;
        }

        /**
         * Gets the value of the roadSituationElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roadSituationElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoadSituationElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoadSituationElementStructure }
         * 
         * 
         */
        public List<RoadSituationElementStructure> getRoadSituationElement() {
            if (roadSituationElement == null) {
                roadSituationElement = new ArrayList<RoadSituationElementStructure>();
            }
            return this.roadSituationElement;
        }

    }

}
