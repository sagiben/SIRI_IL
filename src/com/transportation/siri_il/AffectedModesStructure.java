
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a Affected modes to stop.
 * 
 * <p>Java class for AffectedModesStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedModesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AllModes" type="{http://www.siri.org.uk/siri}EmptyType" minOccurs="0"/>
 *         &lt;element name="Mode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedModesStructure", propOrder = {
    "allModes",
    "mode"
})
public class AffectedModesStructure {

    @XmlElement(name = "AllModes")
    protected String allModes;
    @XmlElement(name = "Mode")
    protected List<AffectedModesStructure.Mode> mode;

    /**
     * Gets the value of the allModes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllModes() {
        return allModes;
    }

    /**
     * Sets the value of the allModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllModes(String value) {
        this.allModes = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedModesStructure.Mode }
     * 
     * 
     */
    public List<AffectedModesStructure.Mode> getMode() {
        if (mode == null) {
            mode = new ArrayList<AffectedModesStructure.Mode>();
        }
        return this.mode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.siri.org.uk/siri}AffectedModeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicleMode",
        "airSubmode",
        "busSubmode",
        "coachSubmode",
        "metroSubmode",
        "railSubmode",
        "tramSubmode",
        "waterSubmode",
        "accessMode"
    })
    public static class Mode {

        @XmlElement(name = "VehicleMode", defaultValue = "unknown")
        protected VehicleModesOfTransportEnumeration vehicleMode;
        @XmlElement(name = "AirSubmode", defaultValue = "unknown")
        protected AirSubmodesOfTransportEnumeration airSubmode;
        @XmlElement(name = "BusSubmode", defaultValue = "unknown")
        protected BusSubmodesOfTransportEnumeration busSubmode;
        @XmlElement(name = "CoachSubmode", defaultValue = "unknown")
        protected CoachSubmodesOfTransportEnumeration coachSubmode;
        @XmlElement(name = "MetroSubmode", defaultValue = "unknown")
        protected MetroSubmodesOfTransportEnumeration metroSubmode;
        @XmlElement(name = "RailSubmode", defaultValue = "unknown")
        protected RailSubmodesOfTransportEnumeration railSubmode;
        @XmlElement(name = "TramSubmode", defaultValue = "unknown")
        protected TramSubmodesOfTransportEnumeration tramSubmode;
        @XmlElement(name = "WaterSubmode", defaultValue = "unknown")
        protected WaterSubmodesOfTransportEnumeration waterSubmode;
        @XmlElement(name = "AccessMode")
        protected AccessModesEnumeration accessMode;

        /**
         * Gets the value of the vehicleMode property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleModesOfTransportEnumeration }
         *     
         */
        public VehicleModesOfTransportEnumeration getVehicleMode() {
            return vehicleMode;
        }

        /**
         * Sets the value of the vehicleMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleModesOfTransportEnumeration }
         *     
         */
        public void setVehicleMode(VehicleModesOfTransportEnumeration value) {
            this.vehicleMode = value;
        }

        /**
         * Gets the value of the airSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link AirSubmodesOfTransportEnumeration }
         *     
         */
        public AirSubmodesOfTransportEnumeration getAirSubmode() {
            return airSubmode;
        }

        /**
         * Sets the value of the airSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirSubmodesOfTransportEnumeration }
         *     
         */
        public void setAirSubmode(AirSubmodesOfTransportEnumeration value) {
            this.airSubmode = value;
        }

        /**
         * Gets the value of the busSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link BusSubmodesOfTransportEnumeration }
         *     
         */
        public BusSubmodesOfTransportEnumeration getBusSubmode() {
            return busSubmode;
        }

        /**
         * Sets the value of the busSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusSubmodesOfTransportEnumeration }
         *     
         */
        public void setBusSubmode(BusSubmodesOfTransportEnumeration value) {
            this.busSubmode = value;
        }

        /**
         * Gets the value of the coachSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link CoachSubmodesOfTransportEnumeration }
         *     
         */
        public CoachSubmodesOfTransportEnumeration getCoachSubmode() {
            return coachSubmode;
        }

        /**
         * Sets the value of the coachSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CoachSubmodesOfTransportEnumeration }
         *     
         */
        public void setCoachSubmode(CoachSubmodesOfTransportEnumeration value) {
            this.coachSubmode = value;
        }

        /**
         * Gets the value of the metroSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link MetroSubmodesOfTransportEnumeration }
         *     
         */
        public MetroSubmodesOfTransportEnumeration getMetroSubmode() {
            return metroSubmode;
        }

        /**
         * Sets the value of the metroSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link MetroSubmodesOfTransportEnumeration }
         *     
         */
        public void setMetroSubmode(MetroSubmodesOfTransportEnumeration value) {
            this.metroSubmode = value;
        }

        /**
         * Gets the value of the railSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link RailSubmodesOfTransportEnumeration }
         *     
         */
        public RailSubmodesOfTransportEnumeration getRailSubmode() {
            return railSubmode;
        }

        /**
         * Sets the value of the railSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailSubmodesOfTransportEnumeration }
         *     
         */
        public void setRailSubmode(RailSubmodesOfTransportEnumeration value) {
            this.railSubmode = value;
        }

        /**
         * Gets the value of the tramSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link TramSubmodesOfTransportEnumeration }
         *     
         */
        public TramSubmodesOfTransportEnumeration getTramSubmode() {
            return tramSubmode;
        }

        /**
         * Sets the value of the tramSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link TramSubmodesOfTransportEnumeration }
         *     
         */
        public void setTramSubmode(TramSubmodesOfTransportEnumeration value) {
            this.tramSubmode = value;
        }

        /**
         * Gets the value of the waterSubmode property.
         * 
         * @return
         *     possible object is
         *     {@link WaterSubmodesOfTransportEnumeration }
         *     
         */
        public WaterSubmodesOfTransportEnumeration getWaterSubmode() {
            return waterSubmode;
        }

        /**
         * Sets the value of the waterSubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link WaterSubmodesOfTransportEnumeration }
         *     
         */
        public void setWaterSubmode(WaterSubmodesOfTransportEnumeration value) {
            this.waterSubmode = value;
        }

        /**
         * Gets the value of the accessMode property.
         * 
         * @return
         *     possible object is
         *     {@link AccessModesEnumeration }
         *     
         */
        public AccessModesEnumeration getAccessMode() {
            return accessMode;
        }

        /**
         * Sets the value of the accessMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccessModesEnumeration }
         *     
         */
        public void setAccessMode(AccessModesEnumeration value) {
            this.accessMode = value;
        }

    }

}