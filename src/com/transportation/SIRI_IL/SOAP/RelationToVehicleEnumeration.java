
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationToVehicleEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationToVehicleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="frontLeft"/>
 *     &lt;enumeration value="frontRight"/>
 *     &lt;enumeration value="backRight"/>
 *     &lt;enumeration value="backRight"/>
 *     &lt;enumeration value="driverLeft"/>
 *     &lt;enumeration value="driverRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationToVehicleEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum RelationToVehicleEnumeration {

    @XmlEnumValue("frontLeft")
    FRONT_LEFT("frontLeft"),
    @XmlEnumValue("frontRight")
    FRONT_RIGHT("frontRight"),
    @XmlEnumValue("backRight")
    BACK_RIGHT("backRight"),
    @XmlEnumValue("driverLeft")
    DRIVER_LEFT("driverLeft"),
    @XmlEnumValue("driverRight")
    DRIVER_RIGHT("driverRight");
    private final String value;

    RelationToVehicleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationToVehicleEnumeration fromValue(String v) {
        for (RelationToVehicleEnumeration c: RelationToVehicleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
