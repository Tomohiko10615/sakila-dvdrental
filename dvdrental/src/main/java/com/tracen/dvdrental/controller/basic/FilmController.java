package com.tracen.dvdrental.controller.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracen.dvdrental.entity.Film;
import com.tracen.dvdrental.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	@PostMapping("/save")
	public ResponseEntity<Film> saveFilm(@RequestBody Film film) {
		return ResponseEntity.ok(filmService.saveFilm(film));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Film> getFilm(@PathVariable("id") Long filmId) {
		Film film = filmService.getFilm(filmId);
		if (film == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(film);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Film>> getAllFilms() {
		List<Film> films = filmService.getAllFilms();
		if (films.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(films);
	}
	
}
