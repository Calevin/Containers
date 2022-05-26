package com.calevin.springboothelloworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final String text;

	public Greeting() {
		id = 0;
		text = null;
	}

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.text = content;
	}

	public long getId() {
		return id;
	}

	public String getText() {
		return text;
	}
}