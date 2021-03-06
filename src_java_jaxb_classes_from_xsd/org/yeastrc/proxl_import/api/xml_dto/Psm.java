//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.15 at 10:07:27 AM PDT 
//


package org.yeastrc.proxl_import.api.xml_dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}filterable_psm_annotations"/>
 *         &lt;element ref="{}descriptive_psm_annotations" minOccurs="0"/>
 *         &lt;element name="per_peptide_annotations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="psm_peptide" maxOccurs="2">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}filterable_psm_per_peptide_annotations"/>
 *                             &lt;element ref="{}descriptive_psm_per_peptide_annotations" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="unique_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="scan_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="linker_mass" type="{}mass" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scan_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="precursor_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="precursor_retention_time" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="precursor_m_z" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="linker_mass" type="{}mass" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterablePsmAnnotations",
    "descriptivePsmAnnotations",
    "perPeptideAnnotations"
})
@XmlRootElement(name = "psm")
public class Psm {

    @XmlElement(name = "filterable_psm_annotations", required = true)
    protected FilterablePsmAnnotations filterablePsmAnnotations;
    @XmlElement(name = "descriptive_psm_annotations")
    protected DescriptivePsmAnnotations descriptivePsmAnnotations;
    @XmlElement(name = "per_peptide_annotations")
    protected Psm.PerPeptideAnnotations perPeptideAnnotations;
    @XmlAttribute(name = "scan_file_name")
    protected String scanFileName;
    @XmlAttribute(name = "scan_number")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger scanNumber;
    @XmlAttribute(name = "precursor_charge", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger precursorCharge;
    @XmlAttribute(name = "precursor_retention_time")
    protected BigDecimal precursorRetentionTime;
    @XmlAttribute(name = "precursor_m_z")
    protected BigDecimal precursorMZ;
    @XmlAttribute(name = "linker_mass")
    protected BigDecimal linkerMass;

    /**
     * Gets the value of the filterablePsmAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link FilterablePsmAnnotations }
     *     
     */
    public FilterablePsmAnnotations getFilterablePsmAnnotations() {
        return filterablePsmAnnotations;
    }

    /**
     * Sets the value of the filterablePsmAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterablePsmAnnotations }
     *     
     */
    public void setFilterablePsmAnnotations(FilterablePsmAnnotations value) {
        this.filterablePsmAnnotations = value;
    }

    /**
     * The descriptive annotations (numeric or string) assigned to the peptide spectrum match (PSM) that are not meant to describe the quality of the match or filter out poor matches.
     * 
     * @return
     *     possible object is
     *     {@link DescriptivePsmAnnotations }
     *     
     */
    public DescriptivePsmAnnotations getDescriptivePsmAnnotations() {
        return descriptivePsmAnnotations;
    }

    /**
     * Sets the value of the descriptivePsmAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptivePsmAnnotations }
     *     
     */
    public void setDescriptivePsmAnnotations(DescriptivePsmAnnotations value) {
        this.descriptivePsmAnnotations = value;
    }

    /**
     * Gets the value of the perPeptideAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Psm.PerPeptideAnnotations }
     *     
     */
    public Psm.PerPeptideAnnotations getPerPeptideAnnotations() {
        return perPeptideAnnotations;
    }

    /**
     * Sets the value of the perPeptideAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Psm.PerPeptideAnnotations }
     *     
     */
    public void setPerPeptideAnnotations(Psm.PerPeptideAnnotations value) {
        this.perPeptideAnnotations = value;
    }

    /**
     * Gets the value of the scanFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanFileName() {
        return scanFileName;
    }

    /**
     * Sets the value of the scanFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanFileName(String value) {
        this.scanFileName = value;
    }

    /**
     * Gets the value of the scanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScanNumber() {
        return scanNumber;
    }

    /**
     * Sets the value of the scanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScanNumber(BigInteger value) {
        this.scanNumber = value;
    }

    /**
     * Gets the value of the precursorCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecursorCharge() {
        return precursorCharge;
    }

    /**
     * Sets the value of the precursorCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecursorCharge(BigInteger value) {
        this.precursorCharge = value;
    }

    /**
     * Gets the value of the precursorRetentionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecursorRetentionTime() {
        return precursorRetentionTime;
    }

    /**
     * Sets the value of the precursorRetentionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecursorRetentionTime(BigDecimal value) {
        this.precursorRetentionTime = value;
    }

    /**
     * Gets the value of the precursorMZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecursorMZ() {
        return precursorMZ;
    }

    /**
     * Sets the value of the precursorMZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecursorMZ(BigDecimal value) {
        this.precursorMZ = value;
    }

    /**
     * Gets the value of the linkerMass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLinkerMass() {
        return linkerMass;
    }

    /**
     * Sets the value of the linkerMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLinkerMass(BigDecimal value) {
        this.linkerMass = value;
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
     *         &lt;element name="psm_peptide" maxOccurs="2">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}filterable_psm_per_peptide_annotations"/>
     *                   &lt;element ref="{}descriptive_psm_per_peptide_annotations" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="unique_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="scan_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="linker_mass" type="{}mass" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "psmPeptide"
    })
    public static class PerPeptideAnnotations {

        @XmlElement(name = "psm_peptide", required = true)
        protected List<Psm.PerPeptideAnnotations.PsmPeptide> psmPeptide;

        /**
         * Gets the value of the psmPeptide property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psmPeptide property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPsmPeptide().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Psm.PerPeptideAnnotations.PsmPeptide }
         * 
         * 
         */
        public List<Psm.PerPeptideAnnotations.PsmPeptide> getPsmPeptide() {
            if (psmPeptide == null) {
                psmPeptide = new ArrayList<Psm.PerPeptideAnnotations.PsmPeptide>();
            }
            return this.psmPeptide;
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
         *         &lt;element ref="{}filterable_psm_per_peptide_annotations"/>
         *         &lt;element ref="{}descriptive_psm_per_peptide_annotations" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="unique_id" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="scan_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="scan_file_name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="linker_mass" type="{}mass" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "filterablePsmPerPeptideAnnotations",
            "descriptivePsmPerPeptideAnnotations"
        })
        public static class PsmPeptide {

            @XmlElement(name = "filterable_psm_per_peptide_annotations", required = true)
            protected FilterablePsmPerPeptideAnnotations filterablePsmPerPeptideAnnotations;
            @XmlElement(name = "descriptive_psm_per_peptide_annotations")
            protected DescriptivePsmPerPeptideAnnotations descriptivePsmPerPeptideAnnotations;
            @XmlAttribute(name = "unique_id", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String uniqueId;
            @XmlAttribute(name = "scan_number")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger scanNumber;
            @XmlAttribute(name = "scan_file_name")
            protected String scanFileName;
            @XmlAttribute(name = "linker_mass")
            protected BigDecimal linkerMass;

            /**
             * The numeric annotations (usually scores of some type) assigned to a specific peptide that is part of a peptide spectrum match (PSM) that are meant to describe the quality of the match and may be used to filter out poor matches. Examples include p-value, q-value, XCorr
             * 
             * @return
             *     possible object is
             *     {@link FilterablePsmPerPeptideAnnotations }
             *     
             */
            public FilterablePsmPerPeptideAnnotations getFilterablePsmPerPeptideAnnotations() {
                return filterablePsmPerPeptideAnnotations;
            }

            /**
             * Sets the value of the filterablePsmPerPeptideAnnotations property.
             * 
             * @param value
             *     allowed object is
             *     {@link FilterablePsmPerPeptideAnnotations }
             *     
             */
            public void setFilterablePsmPerPeptideAnnotations(FilterablePsmPerPeptideAnnotations value) {
                this.filterablePsmPerPeptideAnnotations = value;
            }

            /**
             * The descriptive annotations (numeric or string) assigned to a specific peptide that is part of the peptide spectrum match (PSM) that are not meant to describe the quality of the match or filter out poor matches. Examples include scan number of precursor charge state.
             * 
             * @return
             *     possible object is
             *     {@link DescriptivePsmPerPeptideAnnotations }
             *     
             */
            public DescriptivePsmPerPeptideAnnotations getDescriptivePsmPerPeptideAnnotations() {
                return descriptivePsmPerPeptideAnnotations;
            }

            /**
             * Sets the value of the descriptivePsmPerPeptideAnnotations property.
             * 
             * @param value
             *     allowed object is
             *     {@link DescriptivePsmPerPeptideAnnotations }
             *     
             */
            public void setDescriptivePsmPerPeptideAnnotations(DescriptivePsmPerPeptideAnnotations value) {
                this.descriptivePsmPerPeptideAnnotations = value;
            }

            /**
             * Gets the value of the uniqueId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueId() {
                return uniqueId;
            }

            /**
             * Sets the value of the uniqueId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueId(String value) {
                this.uniqueId = value;
            }

            /**
             * Gets the value of the scanNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getScanNumber() {
                return scanNumber;
            }

            /**
             * Sets the value of the scanNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setScanNumber(BigInteger value) {
                this.scanNumber = value;
            }

            /**
             * Gets the value of the scanFileName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScanFileName() {
                return scanFileName;
            }

            /**
             * Sets the value of the scanFileName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScanFileName(String value) {
                this.scanFileName = value;
            }

            /**
             * Gets the value of the linkerMass property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLinkerMass() {
                return linkerMass;
            }

            /**
             * Sets the value of the linkerMass property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLinkerMass(BigDecimal value) {
                this.linkerMass = value;
            }

        }

    }

}
