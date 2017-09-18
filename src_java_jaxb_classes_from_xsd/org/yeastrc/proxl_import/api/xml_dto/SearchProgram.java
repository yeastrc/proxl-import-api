//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.18 at 03:17:37 PM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="psm_annotation_types"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}filterable_psm_annotation_types"/&gt;
 *                   &lt;element ref="{}descriptive_psm_annotation_types" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reported_peptide_annotation_types" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}filterable_peptide_annotation_types" minOccurs="0"/&gt;
 *                   &lt;element ref="{}descriptive_peptide_annotation_types" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="display_name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "psmAnnotationTypes",
    "reportedPeptideAnnotationTypes"
})
@XmlRootElement(name = "search_program")
public class SearchProgram {

    @XmlElement(name = "psm_annotation_types", required = true)
    protected SearchProgram.PsmAnnotationTypes psmAnnotationTypes;
    @XmlElement(name = "reported_peptide_annotation_types")
    protected SearchProgram.ReportedPeptideAnnotationTypes reportedPeptideAnnotationTypes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "display_name")
    @XmlSchemaType(name = "anySimpleType")
    protected String displayName;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the psmAnnotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgram.PsmAnnotationTypes }
     *     
     */
    public SearchProgram.PsmAnnotationTypes getPsmAnnotationTypes() {
        return psmAnnotationTypes;
    }

    /**
     * Sets the value of the psmAnnotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgram.PsmAnnotationTypes }
     *     
     */
    public void setPsmAnnotationTypes(SearchProgram.PsmAnnotationTypes value) {
        this.psmAnnotationTypes = value;
    }

    /**
     * Gets the value of the reportedPeptideAnnotationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgram.ReportedPeptideAnnotationTypes }
     *     
     */
    public SearchProgram.ReportedPeptideAnnotationTypes getReportedPeptideAnnotationTypes() {
        return reportedPeptideAnnotationTypes;
    }

    /**
     * Sets the value of the reportedPeptideAnnotationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgram.ReportedPeptideAnnotationTypes }
     *     
     */
    public void setReportedPeptideAnnotationTypes(SearchProgram.ReportedPeptideAnnotationTypes value) {
        this.reportedPeptideAnnotationTypes = value;
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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }


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
     *         &lt;element ref="{}filterable_psm_annotation_types"/&gt;
     *         &lt;element ref="{}descriptive_psm_annotation_types" minOccurs="0"/&gt;
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
        "filterablePsmAnnotationTypes",
        "descriptivePsmAnnotationTypes"
    })
    public static class PsmAnnotationTypes {

        @XmlElement(name = "filterable_psm_annotation_types", required = true)
        protected FilterablePsmAnnotationTypes filterablePsmAnnotationTypes;
        @XmlElement(name = "descriptive_psm_annotation_types")
        protected DescriptivePsmAnnotationTypes descriptivePsmAnnotationTypes;

        /**
         * Gets the value of the filterablePsmAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link FilterablePsmAnnotationTypes }
         *     
         */
        public FilterablePsmAnnotationTypes getFilterablePsmAnnotationTypes() {
            return filterablePsmAnnotationTypes;
        }

        /**
         * Sets the value of the filterablePsmAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterablePsmAnnotationTypes }
         *     
         */
        public void setFilterablePsmAnnotationTypes(FilterablePsmAnnotationTypes value) {
            this.filterablePsmAnnotationTypes = value;
        }

        /**
         * Gets the value of the descriptivePsmAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptivePsmAnnotationTypes }
         *     
         */
        public DescriptivePsmAnnotationTypes getDescriptivePsmAnnotationTypes() {
            return descriptivePsmAnnotationTypes;
        }

        /**
         * Sets the value of the descriptivePsmAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptivePsmAnnotationTypes }
         *     
         */
        public void setDescriptivePsmAnnotationTypes(DescriptivePsmAnnotationTypes value) {
            this.descriptivePsmAnnotationTypes = value;
        }

    }


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
     *         &lt;element ref="{}filterable_peptide_annotation_types" minOccurs="0"/&gt;
     *         &lt;element ref="{}descriptive_peptide_annotation_types" minOccurs="0"/&gt;
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
        "filterablePeptideAnnotationTypes",
        "descriptivePeptideAnnotationTypes"
    })
    public static class ReportedPeptideAnnotationTypes {

        @XmlElement(name = "filterable_peptide_annotation_types")
        protected FilterablePeptideAnnotationTypes filterablePeptideAnnotationTypes;
        @XmlElement(name = "descriptive_peptide_annotation_types")
        protected DescriptivePeptideAnnotationTypes descriptivePeptideAnnotationTypes;

        /**
         * Gets the value of the filterablePeptideAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link FilterablePeptideAnnotationTypes }
         *     
         */
        public FilterablePeptideAnnotationTypes getFilterablePeptideAnnotationTypes() {
            return filterablePeptideAnnotationTypes;
        }

        /**
         * Sets the value of the filterablePeptideAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterablePeptideAnnotationTypes }
         *     
         */
        public void setFilterablePeptideAnnotationTypes(FilterablePeptideAnnotationTypes value) {
            this.filterablePeptideAnnotationTypes = value;
        }

        /**
         * Gets the value of the descriptivePeptideAnnotationTypes property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptivePeptideAnnotationTypes }
         *     
         */
        public DescriptivePeptideAnnotationTypes getDescriptivePeptideAnnotationTypes() {
            return descriptivePeptideAnnotationTypes;
        }

        /**
         * Sets the value of the descriptivePeptideAnnotationTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptivePeptideAnnotationTypes }
         *     
         */
        public void setDescriptivePeptideAnnotationTypes(DescriptivePeptideAnnotationTypes value) {
            this.descriptivePeptideAnnotationTypes = value;
        }

    }

}
