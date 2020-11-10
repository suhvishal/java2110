package com.zycus.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book extends Item{

	

	@Column(length = 15)
	private String isbn;

	@Column(name = "nb_of_pages")
	private Integer nbOfPage;

	@Column(name = "publication_date")
	private LocalDate publicationDate;

	public Book() {
		super();
	}

	public Book(String title, String description, Float unitCost, String isbn, Integer nbOfPage,
			LocalDate publicationDate) {
		super(title, description, unitCost);
		
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
	}

	public Book(Long id, String title, String description, Float unitCost, String isbn, Integer nbOfPage,
			LocalDate publicationDate) {
		super(id, title, description, unitCost);
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
	}

	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "\n\tBook [id=" + id + ", title=" + title + ", description=" + description + ", unitCost=" + unitCost
				+ ", isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", publicationDate=" + publicationDate + "]";
	}

}
