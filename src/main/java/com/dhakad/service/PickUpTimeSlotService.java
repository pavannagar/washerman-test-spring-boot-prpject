package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.entity.PickUpTimeSlot;
import java.util.List;

@Service
public interface PickUpTimeSlotService {

	public PickUpTimeSlot addPickUpTimeSlot(PickUpTimeSlot pickUpTimeSlot);
	public List<PickUpTimeSlot> getAllPickUpTimeSlot();
	public PickUpTimeSlot getPickUpTimeSlotById(int id);
	public PickUpTimeSlot removePickUpTimeSlot(int id);
	public PickUpTimeSlot updatePickUpTimeSlot(PickUpTimeSlot pickUpTimeSlot,int id);
	
	
	
	
}
