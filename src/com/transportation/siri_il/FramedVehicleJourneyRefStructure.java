
package com.transportation.siri_il;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type for Identifer of a MonitoredVehicleJourney within data Horizon of a service
 * 
 * <p>Java class for FramedVehicleJourneyRefStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FramedVehicleJourneyRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataFrameRef" type="{http://www.siri.org.uk/siri}DataFrameRefStructure"/>
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FramedVehicleJourneyRefStructure", propOrder = {
    "dataFrameRef",
    "datedVehicleJourneyRef"
})
public class FramedVehicleJourneyRefStructure {

    @XmlElement(name = "DataFrameRef", required = true)
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "DatedVehicleJourneyRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datedVehicleJourneyRef;

    /**
     * Gets the value of the dataFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Sets the value of the dataFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFrameRefStructure }
     *     
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Sets the value of the datedVehicleJourneyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedVehicleJourneyRef(String value) {
        this.datedVehicleJourneyRef = value;
    }

    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
