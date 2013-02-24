
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for information about the quays affected by an Situation
 * 
 * <p>Java class for AffectedStopPlaceComponentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceComponentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure">
 *       &lt;sequence>
 *         &lt;element name="ComponentRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentRefStructure"/>
 *         &lt;element name="ComponentName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ComponentType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentTypeEnumeration" minOccurs="0"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}PlaceProjectionGroup" minOccurs="0"/>
 *         &lt;element name="Offset" type="{http://www.siri.org.uk/siri}OffsetStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopPlaceComponentStructure", propOrder = {
    "componentRef",
    "componentName",
    "componentType",
    "pointProjection",
    "linkProjection",
    "zoneProjection",
    "offset",
    "extensions"
})
public class AffectedStopPlaceComponentStructure
    extends AffectedStopPlaceElementStructure
{

    @XmlElement(name = "ComponentRef", required = true)
    protected StopPlaceComponentRefStructure componentRef;
    @XmlElement(name = "ComponentName")
    protected NaturalLanguageStringStructure componentName;
    @XmlElement(name = "ComponentType")
    protected StopPlaceComponentTypeEnumeration componentType;
    @XmlElement(name = "PointProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected PointProjectionStructure pointProjection;
    @XmlElement(name = "LinkProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "ZoneProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected ZoneProjectionStructure zoneProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the componentRef property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public StopPlaceComponentRefStructure getComponentRef() {
        return componentRef;
    }

    /**
     * Sets the value of the componentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public void setComponentRef(StopPlaceComponentRefStructure value) {
        this.componentRef = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getComponentName() {
        return componentName;
    }

    /**
     * Sets the value of the componentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setComponentName(NaturalLanguageStringStructure value) {
        this.componentName = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public StopPlaceComponentTypeEnumeration getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public void setComponentType(StopPlaceComponentTypeEnumeration value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the pointProjection property.
     * 
     * @return
     *     possible object is
     *     {@link PointProjectionStructure }
     *     
     */
    public PointProjectionStructure getPointProjection() {
        return pointProjection;
    }

    /**
     * Sets the value of the pointProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointProjectionStructure }
     *     
     */
    public void setPointProjection(PointProjectionStructure value) {
        this.pointProjection = value;
    }

    /**
     * Gets the value of the linkProjection property.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Sets the value of the linkProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Gets the value of the zoneProjection property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public ZoneProjectionStructure getZoneProjection() {
        return zoneProjection;
    }

    /**
     * Sets the value of the zoneProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public void setZoneProjection(ZoneProjectionStructure value) {
        this.zoneProjection = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
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

}
