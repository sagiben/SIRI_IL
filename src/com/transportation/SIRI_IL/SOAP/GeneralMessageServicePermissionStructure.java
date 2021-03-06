
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for General MessageService  Permission.
 * 
 * <p>Java class for GeneralMessageServicePermissionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageServicePermissionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractPermissionStructure">
 *       &lt;sequence>
 *         &lt;element name="InfoChannelPermissions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
 *                   &lt;element name="InfoChannelPermission" type="{http://www.siri.org.uk/siri}InfoChannelPermissionStructure" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "GeneralMessageServicePermissionStructure", propOrder = {
    "infoChannelPermissions",
    "extensions"
})
public class GeneralMessageServicePermissionStructure
    extends AbstractPermissionStructure
{

    @XmlElement(name = "InfoChannelPermissions", required = true)
    protected GeneralMessageServicePermissionStructure.InfoChannelPermissions infoChannelPermissions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the infoChannelPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageServicePermissionStructure.InfoChannelPermissions }
     *     
     */
    public GeneralMessageServicePermissionStructure.InfoChannelPermissions getInfoChannelPermissions() {
        return infoChannelPermissions;
    }

    /**
     * Sets the value of the infoChannelPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageServicePermissionStructure.InfoChannelPermissions }
     *     
     */
    public void setInfoChannelPermissions(GeneralMessageServicePermissionStructure.InfoChannelPermissions value) {
        this.infoChannelPermissions = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.siri.org.uk/siri}AllowAll"/>
     *         &lt;element name="InfoChannelPermission" type="{http://www.siri.org.uk/siri}InfoChannelPermissionStructure" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "allowAll",
        "infoChannelPermission"
    })
    public static class InfoChannelPermissions {

        @XmlElement(name = "AllowAll")
        protected Boolean allowAll;
        @XmlElement(name = "InfoChannelPermission")
        protected List<InfoChannelPermissionStructure> infoChannelPermission;

        /**
         * Gets the value of the allowAll property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllowAll() {
            return allowAll;
        }

        /**
         * Sets the value of the allowAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllowAll(Boolean value) {
            this.allowAll = value;
        }

        /**
         * Gets the value of the infoChannelPermission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoChannelPermission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoChannelPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InfoChannelPermissionStructure }
         * 
         * 
         */
        public List<InfoChannelPermissionStructure> getInfoChannelPermission() {
            if (infoChannelPermission == null) {
                infoChannelPermission = new ArrayList<InfoChannelPermissionStructure>();
            }
            return this.infoChannelPermission;
        }

    }

}
