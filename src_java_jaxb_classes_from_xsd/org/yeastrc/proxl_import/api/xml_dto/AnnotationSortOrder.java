//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.18 at 02:24:47 PM PST 
//


package org.yeastrc.proxl_import.api.xml_dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}psm_annotation_sort_order" minOccurs="0"/&gt;
 *         &lt;element ref="{}reported_peptide_annotation_sort_order" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psmAnnotationSortOrder",
    "reportedPeptideAnnotationSortOrder"
})
@XmlRootElement(name = "annotation_sort_order")
public class AnnotationSortOrder {

    @XmlElement(name = "psm_annotation_sort_order")
    protected PsmAnnotationSortOrder psmAnnotationSortOrder;
    @XmlElement(name = "reported_peptide_annotation_sort_order")
    protected ReportedPeptideAnnotationSortOrder reportedPeptideAnnotationSortOrder;

    /**
     * Gets the value of the psmAnnotationSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PsmAnnotationSortOrder }
     *     
     */
    public PsmAnnotationSortOrder getPsmAnnotationSortOrder() {
        return psmAnnotationSortOrder;
    }

    /**
     * Sets the value of the psmAnnotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmAnnotationSortOrder }
     *     
     */
    public void setPsmAnnotationSortOrder(PsmAnnotationSortOrder value) {
        this.psmAnnotationSortOrder = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotationSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptideAnnotationSortOrder }
     *     
     */
    public ReportedPeptideAnnotationSortOrder getReportedPeptideAnnotationSortOrder() {
        return reportedPeptideAnnotationSortOrder;
    }

    /**
     * Sets the value of the reportedPeptideAnnotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptideAnnotationSortOrder }
     *     
     */
    public void setReportedPeptideAnnotationSortOrder(ReportedPeptideAnnotationSortOrder value) {
        this.reportedPeptideAnnotationSortOrder = value;
    }

}