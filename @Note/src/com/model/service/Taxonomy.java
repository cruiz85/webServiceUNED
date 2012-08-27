package com.model.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Taxonomy implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String type;
	@Basic
	private List<Long> children;

	public Taxonomy() {
		children = new ArrayList<Long>();
	}

	public Taxonomy(Long id, String name, List<Long> children, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.children = children;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	{"annotationSchema":[{"id":"209","name":"gg","sons":["210","211","213"]},{"id":"212","name":"yyy","sons":["213","210"]},{"id":"211","name":"ffft","sons":"212"}]}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@XmlElement(name = "children")
	public List<Long> getChildren() {
		return children;
	}

	public void setChildren(List<Long> children) {
		this.children = children;
	}

	

	
}
