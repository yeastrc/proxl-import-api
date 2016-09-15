//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.09 at 11:23:11 AM PDT 
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
 *         &lt;element ref="{}psm_annotation_cutoffs_on_import"/&gt;
 *         &lt;element ref="{}reported_peptide_annotation_cutoffs_on_import" minOccurs="0"/&gt;
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
    "psmAnnotationCutoffsOnImport",
    "reportedPeptideAnnotationCutoffsOnImport"
})
@XmlRootElement(name = "annotation_cutoffs_on_import")
public class AnnotationCutoffsOnImport {

    @XmlElement(name = "psm_annotation_cutoffs_on_import", required = true)
    protected PsmAnnotationCutoffsOnImport psmAnnotationCutoffsOnImport;
    @XmlElement(name = "reported_peptide_annotation_cutoffs_on_import")
    protected ReportedPeptideAnnotationCutoffsOnImport reportedPeptideAnnotationCutoffsOnImport;

    /**
     * Gets the value of the psmAnnotationCutoffsOnImport property.
     * 
     * @return
     *     possible object is
     *     {@link PsmAnnotationCutoffsOnImport }
     *     
     */
    public PsmAnnotationCutoffsOnImport getPsmAnnotationCutoffsOnImport() {
        return psmAnnotationCutoffsOnImport;
    }

    /**
     * Sets the value of the psmAnnotationCutoffsOnImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsmAnnotationCutoffsOnImport }
     *     
     */
    public void setPsmAnnotationCutoffsOnImport(PsmAnnotationCutoffsOnImport value) {
        this.psmAnnotationCutoffsOnImport = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotationCutoffsOnImport property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptideAnnotationCutoffsOnImport }
     *     
     */
    public ReportedPeptideAnnotationCutoffsOnImport getReportedPeptideAnnotationCutoffsOnImport() {
        return reportedPeptideAnnotationCutoffsOnImport;
    }

    /**
     * Sets the value of the reportedPeptideAnnotationCutoffsOnImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptideAnnotationCutoffsOnImport }
     *     
     */
    public void setReportedPeptideAnnotationCutoffsOnImport(ReportedPeptideAnnotationCutoffsOnImport value) {
        this.reportedPeptideAnnotationCutoffsOnImport = value;
    }

}
