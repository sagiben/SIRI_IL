
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="revise"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModificationEnumeration", namespace = "http://www.ifopt.org.uk/ifopt")
@XmlEnum
public enum ModificationEnumeration {


    /**
     * This is a definition of a new entity
     * 
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * This is a deletion of an existing entity
     * 
     */
    @XmlEnumValue("delete")
    DELETE("delete"),

    /**
     * This is a revision to an existing entity.  All values are replaced.
     * 
     */
    @XmlEnumValue("revise")
    REVISE("revise");
    private final String value;

    ModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationEnumeration fromValue(String v) {
        for (ModificationEnumeration c: ModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
