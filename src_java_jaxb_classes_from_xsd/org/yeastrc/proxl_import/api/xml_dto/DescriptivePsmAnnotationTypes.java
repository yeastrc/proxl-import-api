//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.22 at 01:16:47 PM PST 
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
 *         &lt;element ref="{}descriptive_psm_annotation_type" maxOccurs="unbounded"/&gt;
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
    "descriptivePsmAnnotationType"
})
@XmlRootElement(name = "descriptive_psm_annotation_types")
public class DescriptivePsmAnnotationTypes {

    @XmlElement(name = "descriptive_psm_annotation_type", required = true)
    protected List<DescriptivePsmAnnotationType> descriptivePsmAnnotationType;

    /**
     * Gets the value of the descriptivePsmAnnotationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptivePsmAnnotationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptivePsmAnnotationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptivePsmAnnotationType }
     * 
     * 
     */
    public List<DescriptivePsmAnnotationType> getDescriptivePsmAnnotationType() {
        if (descriptivePsmAnnotationType == null) {
            descriptivePsmAnnotationType = new ArrayList<DescriptivePsmAnnotationType>();
        }
        return this.descriptivePsmAnnotationType;
    }

}
