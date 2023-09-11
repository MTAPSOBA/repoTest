package com.taps.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.taps.location.entities.Location;
import com.taps.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String savelocation(@ModelAttribute("location")Location location,ModelMap modelmap) {
		Location LocationSaved = service.saveLocation(location);
		String msg = "Location Saved with Id : "+ LocationSaved.getId();
		modelmap.addAttribute("msg", msg);
		return "createLocation";
		
			}
	@RequestMapping("/displayLocations")
	public String displaylocation(ModelMap modelmap) {
		
		List<Location> location =service.getAlllocation();
		modelmap.addAttribute("locations", location);
		
		return"displaylocations";		
	}
	
	
	
	
	@RequestMapping("/deleteLocation")
	public String deletelocation(@RequestParam("id") int id, ModelMap modelmap) {	
	//	Location location = service.getLocationbyId(id);
		
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		

		List<Location> locations =service.getAlllocation();
		modelmap.addAttribute("location", locations);
		
		return "displaylocation";
		
	}
	
	@RequestMapping("/updatlocation")
	public  String ShowUpdate(@RequestParam("id")int id, ModelMap modelMap) {
		
		Location location = service.getLocationbyId(id);
		
		modelMap.addAttribute("location", location);
		return "editLocation";
		
	}
	
	
}
