//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.15 at 03:56:11 PM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}monolink_masses" minOccurs="0"/>
 *         &lt;element ref="{}crosslink_masses" minOccurs="0"/>
 *         &lt;element ref="{}linked_ends" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spacer_arm_length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "monolinkMasses",
    "crosslinkMasses",
    "linkedEnds"
})
@XmlRootElement(name = "linker")
public class Linker {

    @XmlElement(name = "monolink_masses")
    protected MonolinkMasses monolinkMasses;
    @XmlElement(name = "crosslink_masses")
    protected CrosslinkMasses crosslinkMasses;
    @XmlElement(name = "linked_ends")
    protected LinkedEnds linkedEnds;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "spacer_arm_length")
    protected BigDecimal spacerArmLength;

    /**
     * The list of possible masses that monolinks may be reported as having in this search. 
     * 
     * @return
     *     possible object is
     *     {@link MonolinkMasses }
     *     
     */
    public MonolinkMasses getMonolinkMasses() {
        return monolinkMasses;
    }

    /**
     * Sets the value of the monolinkMasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonolinkMasses }
     *     
     */
    public void setMonolinkMasses(MonolinkMasses value) {
        this.monolinkMasses = value;
    }

    /**
     * The list of possible masses of this linker in this experiment. Required if cross-links or loop-links were searched for and if spectra are being imported.
     * 
     * @return
     *     possible object is
     *     {@link CrosslinkMasses }
     *     
     */
    public CrosslinkMasses getCrosslinkMasses() {
        return crosslinkMasses;
    }

    /**
     * Sets the value of the crosslinkMasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrosslinkMasses }
     *     
     */
    public void setCrosslinkMasses(CrosslinkMasses value) {
        this.crosslinkMasses = value;
    }

    /**
     * Define where each end of the cross-linker may bind with proteins.
     * 
     * @return
     *     possible object is
     *     {@link LinkedEnds }
     *     
     */
    public LinkedEnds getLinkedEnds() {
        return linkedEnds;
    }

    /**
     * Sets the value of the linkedEnds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedEnds }
     *     
     */
    public void setLinkedEnds(LinkedEnds value) {
        this.linkedEnds = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the spacerArmLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpacerArmLength() {
        return spacerArmLength;
    }

    /**
     * Sets the value of the spacerArmLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpacerArmLength(BigDecimal value) {
        this.spacerArmLength = value;
    }

}
