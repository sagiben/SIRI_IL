
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PermissionsStructure">
 *       &lt;sequence>
 *         &lt;element name="SituationExchangePermission" type="{http://www.siri.org.uk/siri}SituationExchangeServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "situationExchangePermission"
})
@XmlRootElement(name = "SituationExchangePermissions")
public class SituationExchangePermissions
    extends PermissionsStructure
{

    @XmlElement(name = "SituationExchangePermission")
    protected List<SituationExchangeServicePermissionStructure> situationExchangePermission;

    /**
     * Gets the value of the situationExchangePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationExchangePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationExchangePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationExchangeServicePermissionStructure }
     * 
     * 
     */
    public List<SituationExchangeServicePermissionStructure> getSituationExchangePermission() {
        if (situationExchangePermission == null) {
            situationExchangePermission = new ArrayList<SituationExchangeServicePermissionStructure>();
        }
        return this.situationExchangePermission;
    }

}
