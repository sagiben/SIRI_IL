
package com.transportation.SIRI_IL.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Projection as a geospatial zone.
 * 
 * <p>Java class for ZoneProjectionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZoneProjectionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractProjection">
 *       &lt;sequence>
 *         &lt;element name="Boundary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZoneProjectionStructure", namespace = "http://www.ifopt.org.uk/ifopt", propOrder = {
    "boundary"
})
public class ZoneProjectionStructure
    extends AbstractProjection
{

    @XmlElement(name = "Boundary", required = true)
    protected List<ZoneProjectionStructure.Boundary> boundary;

    /**
     * Gets the value of the boundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZoneProjectionStructure.Boundary }
     * 
     * 
     */
    public List<ZoneProjectionStructure.Boundary> getBoundary() {
        if (boundary == null) {
            boundary = new ArrayList<ZoneProjectionStructure.Boundary>();
        }
        return this.boundary;
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
     *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}PointProjection" maxOccurs="unbounded" minOccurs="3"/>
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
        "pointProjection"
    })
    public static class Boundary {

        @XmlElement(name = "PointProjection", namespace = "http://www.ifopt.org.uk/ifopt", required = true)
        protected List<PointProjectionStructure> pointProjection;

        /**
         * Gets the value of the pointProjection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pointProjection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPointProjection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PointProjectionStructure }
         * 
         * 
         */
        public List<PointProjectionStructure> getPointProjection() {
            if (pointProjection == null) {
                pointProjection = new ArrayList<PointProjectionStructure>();
            }
            return this.pointProjection;
        }

    }

}
