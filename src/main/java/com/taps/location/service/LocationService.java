package com.taps.location.service;

import java.util.List;

import com.taps.location.entities.Location;

public interface LocationService {
	
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationbyId(int Id);
	List<Location> getAlllocation();

}
