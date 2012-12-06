
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for stop reference data  for use in service requests.
 * 
 * <p>Java class for AbstractDiscoveryRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDiscoveryRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}RequestStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDiscoveryRequestStructure")
@XmlSeeAlso({
    LinesDiscoveryRequestStructure.class,
    ProductCategoriesDiscoveryRequestStructure.class,
    InfoChannelDiscoveryRequestStructure.class,
    FacilityRequestStructure.class,
    ServiceFeaturesDiscoveryRequestStructure.class,
    VehicleFeaturesDiscoveryRequestStructure.class,
    StopPointsDiscoveryRequestStructure.class
})
public abstract class AbstractDiscoveryRequestStructure
    extends RequestStructure
{


}
