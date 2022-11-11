package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Catalogue {

	@Id
	private long catalogueId;
	private String name;

	public long getCatalogueId() {
		return catalogueId;
	}

	public void setCatalogueId(long catalogueId) {
		this.catalogueId = catalogueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
