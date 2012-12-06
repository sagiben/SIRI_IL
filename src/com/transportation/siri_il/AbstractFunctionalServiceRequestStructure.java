
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Service Request for  SIRI  Service request
 * 
 * <p>Java class for AbstractFunctionalServiceRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFunctionalServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractServiceRequestStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFunctionalServiceRequestStructure")
@XmlSeeAlso({
    StopMonitoringMultipleRequestStructure.class,
    ProductionTimetableRequestStructure.class,
    SituationExchangeRequestStructure.class,
    FacilityMonitoringRequestStructure.class,
    EstimatedTimetableRequestStructure.class,
    StopTimetableRequestStructure.class,
    StopMonitoringRequestStructure.class,
    VehicleMonitoringRequestStructure.class,
    ConnectionTimetableRequestStructure.class,
    ConnectionMonitoringRequestStructure.class,
    GeneralMessageRequestStructure.class
})
public abstract class AbstractFunctionalServiceRequestStructure
    extends AbstractServiceRequestStructure
{


}
