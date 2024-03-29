package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Rental;
import com.tracen.dvdrental.repository.RentalRepository;

@Service
public class RentalService {

	@Autowired
	private RentalRepository rentalRepository;

	public Rental saveRental(Rental rental) {
		return rentalRepository.save(rental);
	}

	public Rental getRental(Long rentalId) {
		return rentalRepository.findById(rentalId).orElse(null);
	}

	public List<Rental> getAllRentals() {
		return rentalRepository.findAll();
	}
}
