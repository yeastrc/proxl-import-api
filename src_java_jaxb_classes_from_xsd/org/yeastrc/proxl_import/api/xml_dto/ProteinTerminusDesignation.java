//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.24 at 09:30:24 AM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for protein_terminus_designation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="protein_terminus_designation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="c"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "protein_terminus_designation")
@XmlEnum
public enum ProteinTerminusDesignation {

    @XmlEnumValue("n")
    N("n"),
    @XmlEnumValue("c")
    C("c");
    private final String value;

    ProteinTerminusDesignation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProteinTerminusDesignation fromValue(String v) {
        for (ProteinTerminusDesignation c: ProteinTerminusDesignation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}