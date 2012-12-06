
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unique reference to Identifier of Vehicle Stopping Position
 * 
 * <p>Java class for VehicleStoppingPositionRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleStoppingPositionRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>StopPlaceSpaceRefStructure">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleStoppingPositionRefStructure", namespace = "http://www.ifopt.org.uk/ifopt")
public class VehicleStoppingPositionRefStructure
    extends StopPlaceSpaceRefStructure
{


}
