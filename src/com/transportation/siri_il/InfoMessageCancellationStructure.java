
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Revocation of a previous message.
 * 
 * <p>Java class for InfoMessageCancellationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoMessageCancellationStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractReferencingItemStructure">
 *       &lt;sequence>
 *         &lt;element name="InfoMessageIdentifier" type="{http://www.siri.org.uk/siri}InfoMessageRefStructure"/>
 *         &lt;element name="InfoChannelRef" type="{http://www.siri.org.uk/siri}InfoChannelRefStructure" minOccurs="0"/>
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
@XmlType(name = "InfoMessageCancellationStructure", propOrder = {
    "infoMessageIdentifier",
    "infoChannelRef",
    "extensions"
})
public class InfoMessageCancellationStructure
    extends AbstractReferencingItemStructure
{

    @XmlElement(name = "InfoMessageIdentifier", required = true)
    protected InfoMessageRefStructure infoMessageIdentifier;
    @XmlElement(name = "InfoChannelRef")
    protected InfoChannelRefStructure infoChannelRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the infoMessageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public InfoMessageRefStructure getInfoMessageIdentifier() {
        return infoMessageIdentifier;
    }

    /**
     * Sets the value of the infoMessageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMessageRefStructure }
     *     
     */
    public void setInfoMessageIdentifier(InfoMessageRefStructure value) {
        this.infoMessageIdentifier = value;
    }

    /**
     * Gets the value of the infoChannelRef property.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public InfoChannelRefStructure getInfoChannelRef() {
        return infoChannelRef;
    }

    /**
     * Sets the value of the infoChannelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelRefStructure }
     *     
     */
    public void setInfoChannelRef(InfoChannelRefStructure value) {
        this.infoChannelRef = value;
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
