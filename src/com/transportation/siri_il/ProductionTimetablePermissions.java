
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
 *         &lt;element name="ProductionTimetablePermission" type="{http://www.siri.org.uk/siri}ConnectionServicePermissionStructure" maxOccurs="unbounded" minOccurs="0"/>
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
    "productionTimetablePermission"
})
@XmlRootElement(name = "ProductionTimetablePermissions")
public class ProductionTimetablePermissions
    extends PermissionsStructure
{

    @XmlElement(name = "ProductionTimetablePermission")
    protected List<ConnectionServicePermissionStructure> productionTimetablePermission;

    /**
     * Gets the value of the productionTimetablePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTimetablePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionTimetablePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionServicePermissionStructure }
     * 
     * 
     */
    public List<ConnectionServicePermissionStructure> getProductionTimetablePermission() {
        if (productionTimetablePermission == null) {
            productionTimetablePermission = new ArrayList<ConnectionServicePermissionStructure>();
        }
        return this.productionTimetablePermission;
    }

}
