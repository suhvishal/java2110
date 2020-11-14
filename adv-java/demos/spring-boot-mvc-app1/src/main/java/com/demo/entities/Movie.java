package com.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;



@Entity
public class Movie {
	
	@Id
	@GeneratedValue
	private Long _id;
	
	@NotNull(message = "title cannot be null")
	private String title;
	
	@NotNull(message = "numberInstock cannot be null")
	@Column(name = "numberInStock")
	private Integer numberInStock;
	
	@NotNull(message = "dailyRentalRate cannot be null")
	@Column(name = "dailyRentalRate")
	private Integer dailyRentalRate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "genreId")
	private Genre genre;

	public Movie() {
		super();
	}

	public Movie(Long _id, String title, Integer numberInStock, Integer dailyRentalRate, Genre genre) {
		super();
		this._id = _id;
		this.title = title;
		this.numberInStock = numberInStock;
		this.dailyRentalRate = dailyRentalRate;
		this.genre = genre;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(Integer numberInStock) {
		this.numberInStock = numberInStock;
	}

	public Integer getDailyRentalRate() {
		return dailyRentalRate;
	}

	public void setDailyRentalRate(Integer dailyRentalRate) {
		this.dailyRentalRate = dailyRentalRate;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	

	
	
}
