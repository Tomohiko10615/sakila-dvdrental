package com.tracen.dvdrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tracen.dvdrental.entity.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

}
