package com.ust.bookapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Book {
	@Id
	private int id;
	@Column(name="title_name",length=50,nullable=false)
	private String title;
	private String author;
	@Column(unique=true)
	private String isbn;
	private int year;
	private double price;

}
