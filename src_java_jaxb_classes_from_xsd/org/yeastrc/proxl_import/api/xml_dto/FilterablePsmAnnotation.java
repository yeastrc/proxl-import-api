//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.24 at 09:30:24 AM PDT 
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
 *       &lt;attribute name="search_program" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="annotation_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "filterable_psm_annotation")
public class FilterablePsmAnnotation {

    @XmlAttribute(name = "search_program", required = true)
    protected String searchProgram;
    @XmlAttribute(name = "annotation_name", required = true)
    protected String annotationName;
    @XmlAttribute(name = "value", required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the searchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProgram() {
        return searchProgram;
    }

    /**
     * Sets the value of the searchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProgram(String value) {
        this.searchProgram = value;
    }

    /**
     * Gets the value of the annotationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationName() {
        return annotationName;
    }

    /**
     * Sets the value of the annotationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationName(String value) {
        this.annotationName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
