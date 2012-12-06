
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unique reference to Identifier of Stop Place Space.
 * 
 * <p>Java class for StopPlaceSpaceRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceSpaceRefStructure">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt>StopPlaceComponentRefStructure">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceSpaceRefStructure", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlSeeAlso({
    VehicleStoppingPlaceRefStructure.class,
    AccessSpaceRefStructure.class,
    StopPlaceEntranceRefStructure.class,
    QuayRefStructure.class,
    BoardingPositionRefStructure.class,
    VehicleStoppingPositionRefStructure.class
})
public class StopPlaceSpaceRefStructure
    extends StopPlaceComponentRefStructure
{


}
