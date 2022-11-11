package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Catalogue;
import com.example.demo.repository.CatalogueRepository;
import com.example.demo.services.CatalogueServices;

@Service
public class CatalogueServicesImpl implements CatalogueServices {

	@Autowired
	CatalogueRepository catalogueRepository;

	public Catalogue addCatalogue(Catalogue catalogue) {
		Catalogue catalogue1 = catalogueRepository.save(catalogue);
		System.out.println(catalogue1);
		return catalogue1;
	}

}
