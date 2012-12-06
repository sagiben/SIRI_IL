
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Installed for equipment type
 * 
 * <p>Java class for InstalledEquipmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstalledEquipmentStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledEquipmentStructure", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlSeeAlso({
    LocalServiceStructure.class,
    PlaceEquipmentStructure.class
})
public abstract class InstalledEquipmentStructure
    extends AbstractEquipmentStructure
{


}
