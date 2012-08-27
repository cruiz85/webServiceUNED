package com.model.service;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Child implements Serializable {

	private Long id;
	private boolean file;

	public Child() {
	}

	public Child(Long id, boolean file) {
		super();
		this.id = id;
		this.file = file;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isFile() {
		return file;
	}

	public void setFile(boolean file) {
		this.file = file;
	}

	
	// {"annotationSchema":[{"id":"209","name":"gg","sons":["210","211","213"]},{"id":"212","name":"yyy","sons":["213","210"]},{"id":"211","name":"ffft","sons":"212"}]}

}
