
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PyschosensoryNeedEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PyschosensoryNeedEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="visualImpairment"/>
 *     &lt;enumeration value="auditoryImpairment"/>
 *     &lt;enumeration value="cognitiveInputImpairment"/>
 *     &lt;enumeration value="averseToLifts"/>
 *     &lt;enumeration value="averseToEscalators"/>
 *     &lt;enumeration value="averseToConfinedSpaces"/>
 *     &lt;enumeration value="averseToCrowds"/>
 *     &lt;enumeration value="otherPsychosensoryNeed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PyschosensoryNeedEnumeration", namespace = "http://www.ifopt.org.uk/acsb")
@XmlEnum
public enum PyschosensoryNeedEnumeration {

    @XmlEnumValue("visualImpairment")
    VISUAL_IMPAIRMENT("visualImpairment"),
    @XmlEnumValue("auditoryImpairment")
    AUDITORY_IMPAIRMENT("auditoryImpairment"),
    @XmlEnumValue("cognitiveInputImpairment")
    COGNITIVE_INPUT_IMPAIRMENT("cognitiveInputImpairment"),
    @XmlEnumValue("averseToLifts")
    AVERSE_TO_LIFTS("averseToLifts"),
    @XmlEnumValue("averseToEscalators")
    AVERSE_TO_ESCALATORS("averseToEscalators"),
    @XmlEnumValue("averseToConfinedSpaces")
    AVERSE_TO_CONFINED_SPACES("averseToConfinedSpaces"),
    @XmlEnumValue("averseToCrowds")
    AVERSE_TO_CROWDS("averseToCrowds"),
    @XmlEnumValue("otherPsychosensoryNeed")
    OTHER_PSYCHOSENSORY_NEED("otherPsychosensoryNeed");
    private final String value;

    PyschosensoryNeedEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PyschosensoryNeedEnumeration fromValue(String v) {
        for (PyschosensoryNeedEnumeration c: PyschosensoryNeedEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
