
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for version frame strcuture.
 * 
 * <p>Java class for EstimatedVersionFrameStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedVersionFrameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}VersionRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedVehicleJourney" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedVersionFrameStructure", propOrder = {
    "versionRef",
    "estimatedVehicleJourney"
})
public class EstimatedVersionFrameStructure
    extends AbstractItemStructure
{

    @XmlElement(name = "VersionRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versionRef;
    @XmlElement(name = "EstimatedVehicleJourney", required = true)
    protected List<EstimatedVehicleJourneyStructure> estimatedVehicleJourney;

    /**
     * Gets the value of the versionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionRef() {
        return versionRef;
    }

    /**
     * Sets the value of the versionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionRef(String value) {
        this.versionRef = value;
    }

    /**
     * Gets the value of the estimatedVehicleJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedVehicleJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedVehicleJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedVehicleJourneyStructure }
     * 
     * 
     */
    public List<EstimatedVehicleJourneyStructure> getEstimatedVehicleJourney() {
        if (estimatedVehicleJourney == null) {
            estimatedVehicleJourney = new ArrayList<EstimatedVehicleJourneyStructure>();
        }
        return this.estimatedVehicleJourney;
    }

}
