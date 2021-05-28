package com.dhakad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.DeliverTimeSlot;
import com.dhakad.service.DeliverTimeSlotService;
import java.util.*;


@RestController
public class DeliverTimeSlotController {

	@Autowired
	private DeliverTimeSlotService deliverTimeSlotService;
	
	@PostMapping("deliver")
	public DeliverTimeSlot addDeliverTimeSlot(@RequestBody DeliverTimeSlot deliverTimeSlot) {
		return deliverTimeSlotService.addDeliverTimeSlot(deliverTimeSlot);
	}
	
	@GetMapping("deliver")
	public List<DeliverTimeSlot> getAllDeliverTimeSlots(){
		return deliverTimeSlotService.getAllDeliverTimeSlot();
	}
	
	@GetMapping("deliver/{id}")
	public DeliverTimeSlot getDeliverTimeSlotById(@PathVariable("id") int id){
		return deliverTimeSlotService.getDeliverTimeSlotById(id);
	}
	
	@PutMapping("deliver/{id}")
	public DeliverTimeSlot updateDeliverTimeSlot(@RequestBody DeliverTimeSlot deliverTimeSlot,@PathVariable("id") int id){
		return deliverTimeSlotService.updateDeliverTimeSlot(deliverTimeSlot, id);
	}
	
	@DeleteMapping("deliver/{id}")
	public DeliverTimeSlot removeDeliverTimeSlot(@PathVariable("id") int id){
		return deliverTimeSlotService.getDeliverTimeSlotById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
