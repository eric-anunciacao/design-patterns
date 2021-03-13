package com.em.model;

import java.util.UUID;

public class Mesa {

	private String id;

	public Mesa() {
		this.id = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + "]";
	}

}
