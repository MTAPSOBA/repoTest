package com.taps.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taps.location.entities.Location;
import com.taps.location.repos.Locationrepository;
@Service
public class LocationServiceIMPL implements LocationService {
	
	
@Autowired
	private Locationrepository repository;
	
	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationbyId(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAlllocation() {
		
		return repository.findAll();
	}

}
