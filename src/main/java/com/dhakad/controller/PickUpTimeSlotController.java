package com.dhakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.PickUpTimeSlot;
import com.dhakad.repository.PickUpTimeSlotRepo;
import com.dhakad.service.PickUpTimeSlotService;

@RestController
public class PickUpTimeSlotController {

	@Autowired
	private PickUpTimeSlotService pickUpTimeSlotService;
	
	@PostMapping("pickup")
	public PickUpTimeSlot addPickUpTimeSlot(@RequestBody PickUpTimeSlot pickUpTimeSlot) {
		return pickUpTimeSlotService.addPickUpTimeSlot(pickUpTimeSlot);
	}
	
	@GetMapping("pickup")
	public List<PickUpTimeSlot> getAllPickUpTimeSlot(){
		return pickUpTimeSlotService.getAllPickUpTimeSlot();
	}
	
	@GetMapping("pickup/{id}")
	public PickUpTimeSlot getPickUpTimeSlotById(@PathVariable("id") int id){
		return pickUpTimeSlotService.getPickUpTimeSlotById(id);
	}
	@PutMapping("pickup/{id}")
	public PickUpTimeSlot updatePickUpTimeSlot(@RequestBody PickUpTimeSlot pickUpTimeSlot,@PathVariable("id") int id) {
		return pickUpTimeSlotService.updatePickUpTimeSlot(pickUpTimeSlot, id);
	}
	@DeleteMapping("pickup/{id}")
	public PickUpTimeSlot removePickUpTimeSlot(@PathVariable("id") int id) {
		return pickUpTimeSlotService.removePickUpTimeSlot(id);
	}
	
}
