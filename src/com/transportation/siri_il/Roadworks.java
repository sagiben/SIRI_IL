
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Highway maintenance, installation and construction activities that may potentially affect traffic operations.
 * 
 * <p>Java class for Roadworks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Roadworks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/1_0/1_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="effectOnRoadLayout" type="{http://datex2.eu/schema/1_0/1_0}EffectOnRoadLayoutEnum" maxOccurs="unbounded"/>
 *         &lt;element name="roadworksDuration" type="{http://datex2.eu/schema/1_0/1_0}RoadworksDurationEnum" minOccurs="0"/>
 *         &lt;element name="roadworksScale" type="{http://datex2.eu/schema/1_0/1_0}RoadworksScaleEnum" minOccurs="0"/>
 *         &lt;element name="underTraffic" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="urgentRoadworks" type="{http://datex2.eu/schema/1_0/1_0}Boolean" minOccurs="0"/>
 *         &lt;element name="mobility" type="{http://datex2.eu/schema/1_0/1_0}Mobility" minOccurs="0"/>
 *         &lt;element name="subjectTypeOfWorks" type="{http://datex2.eu/schema/1_0/1_0}SubjectTypeOfWorks" minOccurs="0"/>
 *         &lt;element name="associatedMaintenanceVehicles" type="{http://datex2.eu/schema/1_0/1_0}AssociatedMaintenanceVehicles" minOccurs="0"/>
 *         &lt;element name="roadworksExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadworks", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "effectOnRoadLayout",
    "roadworksDuration",
    "roadworksScale",
    "underTraffic",
    "urgentRoadworks",
    "mobility",
    "subjectTypeOfWorks",
    "associatedMaintenanceVehicles",
    "roadworksExtension"
})
@XmlSeeAlso({
    ConstructionWorks.class,
    MaintenanceWorks.class
})
public abstract class Roadworks
    extends OperatorAction
{

    @XmlElement(required = true)
    protected List<EffectOnRoadLayoutEnum> effectOnRoadLayout;
    protected RoadworksDurationEnum roadworksDuration;
    protected RoadworksScaleEnum roadworksScale;
    protected Boolean underTraffic;
    protected Boolean urgentRoadworks;
    protected Mobility mobility;
    protected SubjectTypeOfWorks subjectTypeOfWorks;
    protected AssociatedMaintenanceVehicles associatedMaintenanceVehicles;
    protected ExtensionType roadworksExtension;

    /**
     * Gets the value of the effectOnRoadLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectOnRoadLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectOnRoadLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectOnRoadLayoutEnum }
     * 
     * 
     */
    public List<EffectOnRoadLayoutEnum> getEffectOnRoadLayout() {
        if (effectOnRoadLayout == null) {
            effectOnRoadLayout = new ArrayList<EffectOnRoadLayoutEnum>();
        }
        return this.effectOnRoadLayout;
    }

    /**
     * Gets the value of the roadworksDuration property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public RoadworksDurationEnum getRoadworksDuration() {
        return roadworksDuration;
    }

    /**
     * Sets the value of the roadworksDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDuration(RoadworksDurationEnum value) {
        this.roadworksDuration = value;
    }

    /**
     * Gets the value of the roadworksScale property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public RoadworksScaleEnum getRoadworksScale() {
        return roadworksScale;
    }

    /**
     * Sets the value of the roadworksScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScale(RoadworksScaleEnum value) {
        this.roadworksScale = value;
    }

    /**
     * Gets the value of the underTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderTraffic() {
        return underTraffic;
    }

    /**
     * Sets the value of the underTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderTraffic(Boolean value) {
        this.underTraffic = value;
    }

    /**
     * Gets the value of the urgentRoadworks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgentRoadworks() {
        return urgentRoadworks;
    }

    /**
     * Sets the value of the urgentRoadworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgentRoadworks(Boolean value) {
        this.urgentRoadworks = value;
    }

    /**
     * Gets the value of the mobility property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobility() {
        return mobility;
    }

    /**
     * Sets the value of the mobility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobility(Mobility value) {
        this.mobility = value;
    }

    /**
     * Gets the value of the subjectTypeOfWorks property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorks }
     *     
     */
    public SubjectTypeOfWorks getSubjectTypeOfWorks() {
        return subjectTypeOfWorks;
    }

    /**
     * Sets the value of the subjectTypeOfWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorks }
     *     
     */
    public void setSubjectTypeOfWorks(SubjectTypeOfWorks value) {
        this.subjectTypeOfWorks = value;
    }

    /**
     * Gets the value of the associatedMaintenanceVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedMaintenanceVehicles }
     *     
     */
    public AssociatedMaintenanceVehicles getAssociatedMaintenanceVehicles() {
        return associatedMaintenanceVehicles;
    }

    /**
     * Sets the value of the associatedMaintenanceVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedMaintenanceVehicles }
     *     
     */
    public void setAssociatedMaintenanceVehicles(AssociatedMaintenanceVehicles value) {
        this.associatedMaintenanceVehicles = value;
    }

    /**
     * Gets the value of the roadworksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadworksExtension() {
        return roadworksExtension;
    }

    /**
     * Sets the value of the roadworksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadworksExtension(ExtensionType value) {
        this.roadworksExtension = value;
    }

}
