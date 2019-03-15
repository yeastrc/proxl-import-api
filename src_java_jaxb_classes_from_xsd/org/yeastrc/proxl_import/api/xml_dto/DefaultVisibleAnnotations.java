//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.15 at 03:56:11 PM PDT 
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}visible_psm_annotations"/>
 *         &lt;element ref="{}visible_psm_per_peptide_annotations" minOccurs="0"/>
 *         &lt;element ref="{}visible_reported_peptide_annotations" minOccurs="0"/>
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
    "visiblePsmAnnotations",
    "visiblePsmPerPeptideAnnotations",
    "visibleReportedPeptideAnnotations"
})
@XmlRootElement(name = "default_visible_annotations")
public class DefaultVisibleAnnotations {

    @XmlElement(name = "visible_psm_annotations", required = true)
    protected VisiblePsmAnnotations visiblePsmAnnotations;
    @XmlElement(name = "visible_psm_per_peptide_annotations")
    protected VisiblePsmPerPeptideAnnotations visiblePsmPerPeptideAnnotations;
    @XmlElement(name = "visible_reported_peptide_annotations")
    protected VisibleReportedPeptideAnnotations visibleReportedPeptideAnnotations;

    /**
     * Gets the value of the visiblePsmAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link VisiblePsmAnnotations }
     *     
     */
    public VisiblePsmAnnotations getVisiblePsmAnnotations() {
        return visiblePsmAnnotations;
    }

    /**
     * Sets the value of the visiblePsmAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisiblePsmAnnotations }
     *     
     */
    public void setVisiblePsmAnnotations(VisiblePsmAnnotations value) {
        this.visiblePsmAnnotations = value;
    }

    /**
     * Optional. The PSM-level annotations that are associated individual with each peptide (for example, each separate peptide in a cross-link) that should be visible by default when viewing PSM-level data.
     * 
     * @return
     *     possible object is
     *     {@link VisiblePsmPerPeptideAnnotations }
     *     
     */
    public VisiblePsmPerPeptideAnnotations getVisiblePsmPerPeptideAnnotations() {
        return visiblePsmPerPeptideAnnotations;
    }

    /**
     * Sets the value of the visiblePsmPerPeptideAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisiblePsmPerPeptideAnnotations }
     *     
     */
    public void setVisiblePsmPerPeptideAnnotations(VisiblePsmPerPeptideAnnotations value) {
        this.visiblePsmPerPeptideAnnotations = value;
    }

    /**
     * Optional. The peptide-level annotations that are visible by default.
     * 
     * @return
     *     possible object is
     *     {@link VisibleReportedPeptideAnnotations }
     *     
     */
    public VisibleReportedPeptideAnnotations getVisibleReportedPeptideAnnotations() {
        return visibleReportedPeptideAnnotations;
    }

    /**
     * Sets the value of the visibleReportedPeptideAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibleReportedPeptideAnnotations }
     *     
     */
    public void setVisibleReportedPeptideAnnotations(VisibleReportedPeptideAnnotations value) {
        this.visibleReportedPeptideAnnotations = value;
    }

}
