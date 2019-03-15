//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.15 at 01:52:47 PM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="amino_acid" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mass_change" use="required" type="{}mass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "static_modification")
public class StaticModification {

    @XmlAttribute(name = "amino_acid", required = true)
    protected String aminoAcid;
    @XmlAttribute(name = "mass_change", required = true)
    protected BigDecimal massChange;

    /**
     * Gets the value of the aminoAcid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAminoAcid() {
        return aminoAcid;
    }

    /**
     * Sets the value of the aminoAcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAminoAcid(String value) {
        this.aminoAcid = value;
    }

    /**
     * Gets the value of the massChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMassChange() {
        return massChange;
    }

    /**
     * Sets the value of the massChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMassChange(BigDecimal value) {
        this.massChange = value;
    }

}
