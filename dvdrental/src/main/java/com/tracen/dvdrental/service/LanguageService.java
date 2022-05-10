package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Language;
import com.tracen.dvdrental.repository.LanguageRepository;

@Service
public class LanguageService {

	@Autowired
	private LanguageRepository languageRepository;

	public Language saveLanguage(Language language) {
		return languageRepository.save(language);
	}

	public Language getLanguage(Long languageId) {
		return languageRepository.findById(languageId).orElse(null);
	}

	public List<Language> getAllLanguages() {
		return languageRepository.findAll();
	}
}
