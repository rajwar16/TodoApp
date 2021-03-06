package com.bridgeit.TodoApp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@Entity
@Table(name="ToDo_Notes")

public class ToDoNotes implements Serializable
{
	@Id
	@GenericGenerator(name="id", strategy="increment")
	@GeneratedValue(generator="id")
	
	private long Noteid;
	private String title;
	private String description;
	private Date noteCreatedDate;
	private Date noteEditedDate;
	private String color;
	private String pin;
	private String isDelete;
	private String isArchive;
	private String isReminder;
	
	@Transient
	private List<PageScrapedata> pageScrapedata;
	
	public List<PageScrapedata> getPageScrapedata() {
		return pageScrapedata;
	}

	public void setPageScrapedata(List<PageScrapedata> pageScrapedata) {
		this.pageScrapedata = pageScrapedata;
	}

	@Lob
    @Column(name="IMAGE", columnDefinition="mediumblob")
	private String addImage;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private User user;

	public long getNoteid() {
		return Noteid;
	}

	public void setNoteid(long noteid) {
		this.Noteid = noteid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getNoteCreatedDate() {
		return noteCreatedDate;
	}

	public void setNoteCreatedDate(Date noteCreatedDate) {
		this.noteCreatedDate = noteCreatedDate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public Date getNoteEditedDate() {
		return noteEditedDate;
	}

	public void setNoteEditedDate(Date noteEditedDate) {
		this.noteEditedDate = noteEditedDate;
	}
	

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	
	public String getIsArchive() {
		return isArchive;
	}

	public void setIsArchive(String isArchive) {
		this.isArchive = isArchive;
	}

	public String getIsReminder() {
		return isReminder;
	}

	public void setIsReminder(String isReminder) {
		this.isReminder = isReminder;
	}

	public String getAddImage() {
		return addImage;
	}

	public void setAddImage(String addImage) {
		this.addImage = addImage;
	}

	@Override
	public String toString() {
		return "ToDoNotes [Noteid=" + Noteid + ", title=" + title + ", description=" + description
				+ ", noteCreatedDate=" + noteCreatedDate + ", noteEditedDate=" + noteEditedDate + ", color=" + color
				+ ", pin=" + pin + ", isDelete=" + isDelete + ", isArchive=" + isArchive + ", isReminder=" + isReminder
				+ ", addImage=" + addImage + ", user=" + user + "]";
	}

	
}