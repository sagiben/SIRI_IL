
package com.transportation.siri_il;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Details of an individual vehicle.
 * 
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleColour" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vehicleCountryOfOrigin" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vehicleIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleManufacturer" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleModel" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleRegistrationPlateIdentifier" type="{http://datex2.eu/schema/1_0/1_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/1_0/1_0}VehicleStatusEnum" minOccurs="0"/>
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/1_0/1_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="axleSpacingOnVehicle" type="{http://datex2.eu/schema/1_0/1_0}AxleSpacing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="axleWeightsOfVehicle" type="{http://datex2.eu/schema/1_0/1_0}AxleWeight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hazardousGoodsAssociatedWithVehicle" type="{http://datex2.eu/schema/1_0/1_0}HazardousMaterials" minOccurs="0"/>
 *         &lt;element name="vehicleExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", namespace = "http://datex2.eu/schema/1_0/1_0", propOrder = {
    "vehicleColour",
    "vehicleCountryOfOrigin",
    "vehicleIdentifier",
    "vehicleManufacturer",
    "vehicleModel",
    "vehicleRegistrationPlateIdentifier",
    "vehicleStatus",
    "vehicleCharacteristics",
    "axleSpacingOnVehicle",
    "axleWeightsOfVehicle",
    "hazardousGoodsAssociatedWithVehicle",
    "vehicleExtension"
})
public class Vehicle {

    protected Vehicle.VehicleColour vehicleColour;
    protected Vehicle.VehicleCountryOfOrigin vehicleCountryOfOrigin;
    protected String vehicleIdentifier;
    protected String vehicleManufacturer;
    protected String vehicleModel;
    protected String vehicleRegistrationPlateIdentifier;
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected List<AxleSpacing> axleSpacingOnVehicle;
    protected List<AxleWeight> axleWeightsOfVehicle;
    protected HazardousMaterials hazardousGoodsAssociatedWithVehicle;
    protected ExtensionType vehicleExtension;

    /**
     * Gets the value of the vehicleColour property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.VehicleColour }
     *     
     */
    public Vehicle.VehicleColour getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Sets the value of the vehicleColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.VehicleColour }
     *     
     */
    public void setVehicleColour(Vehicle.VehicleColour value) {
        this.vehicleColour = value;
    }

    /**
     * Gets the value of the vehicleCountryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle.VehicleCountryOfOrigin }
     *     
     */
    public Vehicle.VehicleCountryOfOrigin getVehicleCountryOfOrigin() {
        return vehicleCountryOfOrigin;
    }

    /**
     * Sets the value of the vehicleCountryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle.VehicleCountryOfOrigin }
     *     
     */
    public void setVehicleCountryOfOrigin(Vehicle.VehicleCountryOfOrigin value) {
        this.vehicleCountryOfOrigin = value;
    }

    /**
     * Gets the value of the vehicleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Sets the value of the vehicleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentifier(String value) {
        this.vehicleIdentifier = value;
    }

    /**
     * Gets the value of the vehicleManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    /**
     * Sets the value of the vehicleManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the vehicleRegistrationPlateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationPlateIdentifier() {
        return vehicleRegistrationPlateIdentifier;
    }

    /**
     * Sets the value of the vehicleRegistrationPlateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationPlateIdentifier(String value) {
        this.vehicleRegistrationPlateIdentifier = value;
    }

    /**
     * Gets the value of the vehicleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Sets the value of the vehicleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    /**
     * Gets the value of the vehicleCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Sets the value of the vehicleCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    /**
     * Gets the value of the axleSpacingOnVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axleSpacingOnVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleSpacingOnVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleSpacing }
     * 
     * 
     */
    public List<AxleSpacing> getAxleSpacingOnVehicle() {
        if (axleSpacingOnVehicle == null) {
            axleSpacingOnVehicle = new ArrayList<AxleSpacing>();
        }
        return this.axleSpacingOnVehicle;
    }

    /**
     * Gets the value of the axleWeightsOfVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axleWeightsOfVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleWeightsOfVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleWeight }
     * 
     * 
     */
    public List<AxleWeight> getAxleWeightsOfVehicle() {
        if (axleWeightsOfVehicle == null) {
            axleWeightsOfVehicle = new ArrayList<AxleWeight>();
        }
        return this.axleWeightsOfVehicle;
    }

    /**
     * Gets the value of the hazardousGoodsAssociatedWithVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
        return hazardousGoodsAssociatedWithVehicle;
    }

    /**
     * Sets the value of the hazardousGoodsAssociatedWithVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        this.hazardousGoodsAssociatedWithVehicle = value;
    }

    /**
     * Gets the value of the vehicleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleExtension() {
        return vehicleExtension;
    }

    /**
     * Sets the value of the vehicleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleExtension(ExtensionType value) {
        this.vehicleExtension = value;
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
     *       &lt;sequence>
     *         &lt;element name="value" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VehicleColour {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<Vehicle.VehicleColour.Value> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vehicle.VehicleColour.Value }
         * 
         * 
         */
        public List<Vehicle.VehicleColour.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Vehicle.VehicleColour.Value>();
            }
            return this.value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Value {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="value" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class VehicleCountryOfOrigin {

        @XmlElement(namespace = "http://datex2.eu/schema/1_0/1_0", required = true)
        protected List<Vehicle.VehicleCountryOfOrigin.Value> value;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vehicle.VehicleCountryOfOrigin.Value }
         * 
         * 
         */
        public List<Vehicle.VehicleCountryOfOrigin.Value> getValue() {
            if (value == null) {
                value = new ArrayList<Vehicle.VehicleCountryOfOrigin.Value>();
            }
            return this.value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://datex2.eu/schema/1_0/1_0>MultiLingualString">
         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}language" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Value {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String lang;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the lang property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Sets the value of the lang property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
