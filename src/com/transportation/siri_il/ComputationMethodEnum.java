
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComputationMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComputationMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"/>
 *     &lt;enumeration value="arithmeticAverageOfSamplesInATimePeriod"/>
 *     &lt;enumeration value="harmonicAverageOfSamplesInATimePeriod"/>
 *     &lt;enumeration value="medianOfSamplesInATimePeriod"/>
 *     &lt;enumeration value="movingAverageOfSamples"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComputationMethodEnum", namespace = "http://datex2.eu/schema/1_0/1_0")
@XmlEnum
public enum ComputationMethodEnum {


    /**
     * Arithmetic average of sample values based on a fixed number of samples.
     * 
     */
    @XmlEnumValue("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples")
    ARITHMETIC_AVERAGE_OF_SAMPLES_BASED_ON_A_FIXED_NUMBER_OF_SAMPLES("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"),

    /**
     * Arithmetic average of sample values in a time period.
     * 
     */
    @XmlEnumValue("arithmeticAverageOfSamplesInATimePeriod")
    ARITHMETIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("arithmeticAverageOfSamplesInATimePeriod"),

    /**
     * Harmonic average of sample values in a time period.
     * 
     */
    @XmlEnumValue("harmonicAverageOfSamplesInATimePeriod")
    HARMONIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("harmonicAverageOfSamplesInATimePeriod"),

    /**
     * Median of sample values taken over a time period.
     * 
     */
    @XmlEnumValue("medianOfSamplesInATimePeriod")
    MEDIAN_OF_SAMPLES_IN_A_TIME_PERIOD("medianOfSamplesInATimePeriod"),

    /**
     * Moving average of sample values.
     * 
     */
    @XmlEnumValue("movingAverageOfSamples")
    MOVING_AVERAGE_OF_SAMPLES("movingAverageOfSamples");
    private final String value;

    ComputationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComputationMethodEnum fromValue(String v) {
        for (ComputationMethodEnum c: ComputationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
