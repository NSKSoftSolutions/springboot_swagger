package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Catalogue;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {

}
