package com.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.RoomDetails;
import com.service.RoomDetailsService;

@RestController
@RequestMapping("/api")
public class RoomDetailsController {
	Log logger=LogFactory.getLog(RoomDetailsController.class);
	
	@Autowired
	RoomDetailsService roomdetailsservice;
	
	@PostMapping("/addroomdetails")
	public RoomDetails addRoomDetails(@RequestBody RoomDetails roomDetails)
	{
		return roomdetailsservice.addRoomDetails(roomDetails);
		
	}
	
	@PutMapping("/updateroomdetails")
	public RoomDetails updateRoomDetails(@RequestBody RoomDetails roomDetails)
	{
		return roomdetailsservice.updateRoomDetails(roomDetails);
		
	}
	
	@DeleteMapping("/removeroomdetails")
	public RoomDetails removeDetails(@RequestBody RoomDetails roomDetails)
	{
		return roomdetailsservice.removeRoomDetails(roomDetails);
		
	}
	
	@GetMapping("/showroomdetails/{id}")
	public RoomDetails showRoomDetails(@PathVariable int id)
	{
		return roomdetailsservice.showRoomDetails(id);
		
	}
	
	@GetMapping("/showroomdetails")
	public List<RoomDetails> showAllRoomDetails()
	{
		return roomdetailsservice.showAllRoomDetails();
		
	}
	
//	@GetMapping("/getroomdetailsbyroomtype/{room_type}")
//	public List<RoomDetails> getRoomDetailsByRoomType(@PathVariable String room_type)
//	{
//		return roomdetailsservice.getRoomDetailsByRoomType(room_type);
//		
//	}
	
}
