package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {

	@Id
	private Long _id;
	private String name;
	
	public Genre() {
		super();
	}

	public Genre(Long _id, String name) {
		super();
		this._id = _id;
		this.name = name;
	}

	public Long get_id() {
		return _id;
	}

	public void set_id(Long _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
