package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Catalogue;
import com.example.demo.services.CatalogueServices;

@RestController
public class CatalogueController {

	@Autowired
	CatalogueServices catalogueServices;

	@PostMapping("/catalogue")
	public Catalogue addCat(@RequestBody Catalogue catalogue) {

		Catalogue addCatalogue = catalogueServices.addCatalogue(catalogue);
		return addCatalogue;
	}

}
