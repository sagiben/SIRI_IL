
package com.transportation.SIRI_IL.SOAP;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationsTransportMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationsTransportMethodEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="httpPost"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="wsdlSoap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommunicationsTransportMethodEnumeration")
@XmlEnum
public enum CommunicationsTransportMethodEnumeration {

    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("wsdlSoap")
    WSDL_SOAP("wsdlSoap");
    private final String value;

    CommunicationsTransportMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationsTransportMethodEnumeration fromValue(String v) {
        for (CommunicationsTransportMethodEnumeration c: CommunicationsTransportMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
