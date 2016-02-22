//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.19 at 12:51:01 PM PST 
//


package org.yeastrc.proxl_import.api.xml_dto;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}descriptive_peptide_annotation_type" maxOccurs="unbounded"/&gt;
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
    "descriptivePeptideAnnotationType"
})
@XmlRootElement(name = "descriptive_peptide_annotation_types")
public class DescriptivePeptideAnnotationTypes {

    @XmlElement(name = "descriptive_peptide_annotation_type", required = true)
    protected List<DescriptivePeptideAnnotationType> descriptivePeptideAnnotationType;

    /**
     * An annotation of any type (numeric or string) that is not meant to be used as a possible filter for filtering out peptides based on quality of matches. Examples include calculated mass or validation status.Gets the value of the descriptivePeptideAnnotationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptivePeptideAnnotationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptivePeptideAnnotationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptivePeptideAnnotationType }
     * 
     * 
     */
    public List<DescriptivePeptideAnnotationType> getDescriptivePeptideAnnotationType() {
        if (descriptivePeptideAnnotationType == null) {
            descriptivePeptideAnnotationType = new ArrayList<DescriptivePeptideAnnotationType>();
        }
        return this.descriptivePeptideAnnotationType;
    }

}
