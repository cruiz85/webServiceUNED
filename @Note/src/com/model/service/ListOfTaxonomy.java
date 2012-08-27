package com.model.service;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class ListOfTaxonomy implements Serializable {

    private List<Taxonomy> taxonomies;

	public ListOfTaxonomy() {
		this.taxonomies = new ArrayList<Taxonomy>();
	}

	
	public ListOfTaxonomy(List<Taxonomy> taxonomies) {
		this();
		this.taxonomies = taxonomies;
	}

	@XmlElement(name = "annotation_schema")
	public List<Taxonomy> getTaxonomys() {
		return taxonomies;
	}

	public void setTaxonomys(List<Taxonomy> taxonomies) {
		this.taxonomies = taxonomies;
	}





}
