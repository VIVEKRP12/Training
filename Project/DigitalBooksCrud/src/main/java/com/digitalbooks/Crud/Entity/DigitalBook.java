package com.digitalbooks.Crud.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "digitalbooks")
public class DigitalBook {
	@Id // primary key for column
	@GeneratedValue(strategy = GenerationType.AUTO) // Default key for generating the primary key
	@Column(name = "digitalBook_id")
	private Integer digitalBookId;

	@Column(name = "author_id")
	private Integer authorId;

	@Column(name = "logo")
	private String logo;

	@Column(name = "title")
	private String title;

	@Column(name = "catogory")
	private String category;

	@Column(name = "author")
	private String author;

	@Column(name = "price")
	private double price;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "date_Of_Published")
	private Date dateofpublished;

	@Column(name = "content")
	private String content;

	private Boolean active;

	public DigitalBook() {
		super();

	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public DigitalBook(Integer digitalBookId, Integer authorId, String logo, String title, String category,
			String author, double price, String publisher, Date dateofpublished, String content, Boolean active) {
		super();
		this.digitalBookId = digitalBookId;
		this.authorId = authorId;
		this.logo = logo;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.dateofpublished = dateofpublished;
		this.content = content;
		this.active = active;
	}

	public Integer getDigitalBookId() {
		return digitalBookId;
	}

	public void setDigitalBookId(Integer digitalBookId) {
		this.digitalBookId = digitalBookId;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDateofpublished() {
		return dateofpublished;
	}

	public void setDateofpublished(Date dateofpublished) {
		this.dateofpublished = dateofpublished;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
