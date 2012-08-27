package com.model.service;

import com.google.appengine.api.datastore.Text;
import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import lector.client.reader.TextSelector;

@Entity
@XmlRootElement
@Table(name = "annotation")
public class AnnotationExport implements Serializable, IsSerializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String bookId;
	private Long userId;

	private Integer pageNumber;

	@OneToMany(cascade = CascadeType.ALL)
	@Basic
	private ArrayList<TextSelector> textSelectors;
	@Basic
	private String comment;
	@Basic
	private ArrayList<Long> fileIds;

	private Long readingActivity;
	public AnnotationExport() {
		this.textSelectors = new ArrayList<TextSelector>();
	}

	public AnnotationExport(Long id, String bookId, Long userId,
			Integer pageNumber, ArrayList<TextSelector> textSelectors,
			String comment, ArrayList<Long> fileIds, Long readingActivity) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.userId = userId;
		this.pageNumber = pageNumber;
		this.textSelectors = textSelectors;
		this.comment = comment;
		this.fileIds = fileIds;
		this.readingActivity = readingActivity;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public ArrayList<TextSelector> getTextSelectors() {
		return textSelectors;
	}

	public void setTextSelectors(ArrayList<TextSelector> textSelectors) {
		this.textSelectors = textSelectors;
	}

	public ArrayList<Long> getFileIds() {
		return fileIds;
	}

	public void setFileIds(ArrayList<Long> fileIds) {
		this.fileIds = fileIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	

	public Long getReadingActivity() {
		return readingActivity;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setReadingActivity(Long readingActivity) {
		this.readingActivity = readingActivity;
	}

}
