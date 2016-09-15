//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.09 at 11:23:11 AM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}modifications" minOccurs="0"/&gt;
 *         &lt;element ref="{}linked_positions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sequence" use="required" type="{}sequence_type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifications",
    "linkedPositions"
})
@XmlRootElement(name = "peptide")
public class Peptide {

    protected Modifications modifications;
    @XmlElement(name = "linked_positions")
    protected LinkedPositions linkedPositions;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;

    /**
     * Gets the value of the modifications property.
     * 
     * @return
     *     possible object is
     *     {@link Modifications }
     *     
     */
    public Modifications getModifications() {
        return modifications;
    }

    /**
     * Sets the value of the modifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifications }
     *     
     */
    public void setModifications(Modifications value) {
        this.modifications = value;
    }

    /**
     * The list of linked positions in a peptide. Do not include monolinks here, they are listed as modifications in the modifications element. Only list looplinked and crosslinked positions.
     * 
     * @return
     *     possible object is
     *     {@link LinkedPositions }
     *     
     */
    public LinkedPositions getLinkedPositions() {
        return linkedPositions;
    }

    /**
     * Sets the value of the linkedPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedPositions }
     *     
     */
    public void setLinkedPositions(LinkedPositions value) {
        this.linkedPositions = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}
