
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a timeband.
 * 
 * <p>Java class for TimebandStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimebandStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}HalfOpenTimeRangeStructure">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimebandStructure", namespace = "http://www.ifopt.org.uk/ifopt")
public class TimebandStructure
    extends HalfOpenTimeRangeStructure2
{


}
