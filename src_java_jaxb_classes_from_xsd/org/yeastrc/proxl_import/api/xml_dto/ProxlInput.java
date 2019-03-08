//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.08 at 03:37:51 PM PST 
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
 *         &lt;element ref="{}search_program_info"/>
 *         &lt;element ref="{}linkers"/>
 *         &lt;element ref="{}reported_peptides"/>
 *         &lt;element ref="{}matched_proteins" minOccurs="0"/>
 *         &lt;element ref="{}static_modifications" minOccurs="0"/>
 *         &lt;element ref="{}decoy_labels" minOccurs="0"/>
 *         &lt;element ref="{}configuration_files" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fasta_filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchProgramInfo",
    "linkers",
    "reportedPeptides",
    "matchedProteins",
    "staticModifications",
    "decoyLabels",
    "configurationFiles"
})
@XmlRootElement(name = "proxl_input")
public class ProxlInput {

    @XmlElement(name = "search_program_info", required = true)
    protected SearchProgramInfo searchProgramInfo;
    @XmlElement(required = true)
    protected Linkers linkers;
    @XmlElement(name = "reported_peptides", required = true)
    protected ReportedPeptides reportedPeptides;
    @XmlElement(name = "matched_proteins")
    protected MatchedProteins matchedProteins;
    @XmlElement(name = "static_modifications")
    protected StaticModifications staticModifications;
    @XmlElement(name = "decoy_labels")
    protected DecoyLabels decoyLabels;
    @XmlElement(name = "configuration_files")
    protected ConfigurationFiles configurationFiles;
    @XmlAttribute(name = "fasta_filename", required = true)
    protected String fastaFilename;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the searchProgramInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SearchProgramInfo }
     *     
     */
    public SearchProgramInfo getSearchProgramInfo() {
        return searchProgramInfo;
    }

    /**
     * Sets the value of the searchProgramInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchProgramInfo }
     *     
     */
    public void setSearchProgramInfo(SearchProgramInfo value) {
        this.searchProgramInfo = value;
    }

    /**
     * The chemical linkers used in this experiment. There must be at least one.
     * 
     * @return
     *     possible object is
     *     {@link Linkers }
     *     
     */
    public Linkers getLinkers() {
        return linkers;
    }

    /**
     * Sets the value of the linkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkers }
     *     
     */
    public void setLinkers(Linkers value) {
        this.linkers = value;
    }

    /**
     * All the reported peptides from a PSM search. A reported peptide is a string that uniquely identifies an identified peptide (or linked pair of peptides) IN THIS SEARCH. (This string is not used by ProXL for this purpose.) A unique peptide i this context is one or two peptide sequences linked together at specific positions in those sequences, and with modifications at specific sites. E.g. PEP[16.01]TIDE would uniquely ID a peptide with this sequence with the given mass shift on the given position. or KEKTIDE(3)--PEPT[16.1]IDE(2) would uniquely identify the crosslink between two peptides with these ssequences at positions 3 and 2 (respectively) and where the second peptide has the shown modification. There is no syntax expected for reported peptide, but the reported peptide string must be unique, and no two reported peptides must describe the same peptide or pair of peptides linked at the same positions with the same modifications.
     * 
     * @return
     *     possible object is
     *     {@link ReportedPeptides }
     *     
     */
    public ReportedPeptides getReportedPeptides() {
        return reportedPeptides;
    }

    /**
     * Sets the value of the reportedPeptides property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedPeptides }
     *     
     */
    public void setReportedPeptides(ReportedPeptides value) {
        this.reportedPeptides = value;
    }

    /**
     * Contains the protein sequences matched by peptides found in the experiment, and associated names, descriptions, and taxonomy IDs for those proteins. This will typically come from the FASTA file used to search the data. Only the proteins matched by the data should be included, not all the proteins in the FASTA file.
     * 
     * @return
     *     possible object is
     *     {@link MatchedProteins }
     *     
     */
    public MatchedProteins getMatchedProteins() {
        return matchedProteins;
    }

    /**
     * Sets the value of the matchedProteins property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchedProteins }
     *     
     */
    public void setMatchedProteins(MatchedProteins value) {
        this.matchedProteins = value;
    }

    /**
     * Gets the value of the staticModifications property.
     * 
     * @return
     *     possible object is
     *     {@link StaticModifications }
     *     
     */
    public StaticModifications getStaticModifications() {
        return staticModifications;
    }

    /**
     * Sets the value of the staticModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticModifications }
     *     
     */
    public void setStaticModifications(StaticModifications value) {
        this.staticModifications = value;
    }

    /**
     * An optional list of decoy labels (strings that are prefixes on protein names that indicate the given protein is a decoy (e.g., "DECOY_") 
     * 
     * @return
     *     possible object is
     *     {@link DecoyLabels }
     *     
     */
    public DecoyLabels getDecoyLabels() {
        return decoyLabels;
    }

    /**
     * Sets the value of the decoyLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecoyLabels }
     *     
     */
    public void setDecoyLabels(DecoyLabels value) {
        this.decoyLabels = value;
    }

    /**
     * (Optional) The configuration files associated with the search.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationFiles }
     *     
     */
    public ConfigurationFiles getConfigurationFiles() {
        return configurationFiles;
    }

    /**
     * Sets the value of the configurationFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationFiles }
     *     
     */
    public void setConfigurationFiles(ConfigurationFiles value) {
        this.configurationFiles = value;
    }

    /**
     * Gets the value of the fastaFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastaFilename() {
        return fastaFilename;
    }

    /**
     * Sets the value of the fastaFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastaFilename(String value) {
        this.fastaFilename = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
