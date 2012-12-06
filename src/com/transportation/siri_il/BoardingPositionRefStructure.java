
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unique reference to Identifier of Boarding Position.
 * 
 * <p>Java class for BoardingPositionRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingPositionRefStructure">
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
@XmlType(name = "BoardingPositionRefStructure", namespace = "http://www.ifopt.org.uk/ifopt")
public class BoardingPositionRefStructure
    extends StopPlaceSpaceRefStructure
{


}
