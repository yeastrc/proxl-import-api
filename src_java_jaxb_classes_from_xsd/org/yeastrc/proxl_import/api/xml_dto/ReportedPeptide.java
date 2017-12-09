//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.09 at 10:18:10 AM PST 
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}peptides"/>
 *         &lt;element ref="{}psms"/>
 *         &lt;element name="reported_peptide_annotations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_reported_peptide_annotations" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_reported_peptide_annotations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="reported_peptide_string" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{}link_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "peptides",
    "psms",
    "reportedPeptideAnnotations"
})
@XmlRootElement(name = "reported_peptide")
public class ReportedPeptide {

    @XmlElement(required = true)
    protected Peptides peptides;
    @XmlElement(required = true)
    protected Psms psms;
    @XmlElement(name = "reported_peptide_annotations")
    protected ReportedPeptide.ReportedPeptideAnnotations reportedPeptideAnnotations;
    @XmlAttribute(name = "reported_peptide_string", required = true)
    protected String reportedPeptideString;
    @XmlAttribute(name = "type", required = true)
    protected LinkType type;

    /**
     * A list of peptides associated with a reported peptide in a PSM search. For example, a reported peptide that is a crosslinked pair of peptides will have two peptides associated with it. A looplink or unlink will have one.
     * 
     * @return
     *     possible object is
     *     {@link Peptides }
     *     
     */
    public Peptides getPeptides() {
        return peptides;
    }

    /**
     * Sets the value of the peptides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Peptides }
     *     
     */
    public void setPeptides(Peptides value) {
        this.peptides = value;
    }

    /**
     * The PSMs found for this reported peptide in this search.
     * 
     * @return
     *     possible object is
     *     {@link Psms }
     *     
     */
    public Psms getPsms() {
        return psms;
    }

    /**
     * Sets the value of the psms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Psms }
     *     
     */
    public void setPsms(Psms value) {
        this.psms = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptide.ReportedPeptideAnnotations }
     *     
     */
    public ReportedPeptide.ReportedPeptideAnnotations getReportedPeptideAnnotations() {
        return reportedPeptideAnnotations;
    }

    /**
     * Sets the value of the reportedPeptideAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptide.ReportedPeptideAnnotations }
     *     
     */
    public void setReportedPeptideAnnotations(ReportedPeptide.ReportedPeptideAnnotations value) {
        this.reportedPeptideAnnotations = value;
    }

    /**
     * Gets the value of the reportedPeptideString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportedPeptideString() {
        return reportedPeptideString;
    }

    /**
     * Sets the value of the reportedPeptideString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportedPeptideString(String value) {
        this.reportedPeptideString = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setType(LinkType value) {
        this.type = value;
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
     *         &lt;element ref="{}filterable_reported_peptide_annotations" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_reported_peptide_annotations" minOccurs="0"/>
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
        "filterableReportedPeptideAnnotations",
        "descriptiveReportedPeptideAnnotations"
    })
    public static class ReportedPeptideAnnotations {

        @XmlElement(name = "filterable_reported_peptide_annotations")
        protected FilterableReportedPeptideAnnotations filterableReportedPeptideAnnotations;
        @XmlElement(name = "descriptive_reported_peptide_annotations")
        protected DescriptiveReportedPeptideAnnotations descriptiveReportedPeptideAnnotations;

        /**
         * Gets the value of the filterableReportedPeptideAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link FilterableReportedPeptideAnnotations }
         *     
         */
        public FilterableReportedPeptideAnnotations getFilterableReportedPeptideAnnotations() {
            return filterableReportedPeptideAnnotations;
        }

        /**
         * Sets the value of the filterableReportedPeptideAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterableReportedPeptideAnnotations }
         *     
         */
        public void setFilterableReportedPeptideAnnotations(FilterableReportedPeptideAnnotations value) {
            this.filterableReportedPeptideAnnotations = value;
        }

        /**
         * Gets the value of the descriptiveReportedPeptideAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptiveReportedPeptideAnnotations }
         *     
         */
        public DescriptiveReportedPeptideAnnotations getDescriptiveReportedPeptideAnnotations() {
            return descriptiveReportedPeptideAnnotations;
        }

        /**
         * Sets the value of the descriptiveReportedPeptideAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptiveReportedPeptideAnnotations }
         *     
         */
        public void setDescriptiveReportedPeptideAnnotations(DescriptiveReportedPeptideAnnotations value) {
            this.descriptiveReportedPeptideAnnotations = value;
        }

    }

}
