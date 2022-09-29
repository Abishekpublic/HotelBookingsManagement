package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Hotel;
import com.service.HotelService;

@RestController
@RequestMapping("/api")
public class HotelController {
	
	
	
	@Autowired
	HotelService hotelservice;
	
	
	@PostMapping("/addhotel")
	public Hotel addHotel(@RequestBody Hotel hotel)
	{
		return hotelservice.addHotel(hotel);
	}
	
	
	@PutMapping("/updatehotel")
	public Hotel updateHotel(@RequestBody Hotel hotel)
	{
		return hotelservice.updateHotel(hotel);
	}
	
	
	@DeleteMapping("/removehotel")
	public Hotel removeHotel(@RequestBody Hotel hotel)
	{
		return hotelservice.removeHotel(hotel);
		
	}
	
	
	@GetMapping("/showhotel/{id}")
	public Hotel showHotel(@PathVariable int id)
	{
		return hotelservice.showHotel(id);
	}
	
	
	@GetMapping("/showhotels")
	public List<Hotel> showAllHotels()
	{
		return hotelservice.showAllHotels();
	}
	
	
	
	
}
