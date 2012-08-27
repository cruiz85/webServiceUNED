package com.model.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;

import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Activity implements Serializable {

	@Basic
	private List<Long> activities;

	public Activity() {
		this.activities = new ArrayList<Long>();
	}

	public Activity(List<Long> activities) {
		super();
		this.activities = activities;
	}

	public List<Long> getActivities() {
		return activities;
	}

	public void setActivities(List<Long> activities) {
		this.activities = activities;
	}


}
