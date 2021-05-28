package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.PickUpTimeSlot;
import com.dhakad.repository.PickUpTimeSlotRepo;
import com.dhakad.service.PickUpTimeSlotService;

@Service
public class PickUpTimeSlotServiceImpl implements PickUpTimeSlotService{

	@Autowired
	private PickUpTimeSlotRepo pickUpTimeSlotRepo;
	
	@Override
	public PickUpTimeSlot addPickUpTimeSlot(PickUpTimeSlot pickUpTimeSlot) {
		pickUpTimeSlotRepo.save(pickUpTimeSlot);
		return pickUpTimeSlot;
	}

	@Override
	public List<PickUpTimeSlot> getAllPickUpTimeSlot() {
		List<PickUpTimeSlot> pickUpTimeSlots=pickUpTimeSlotRepo.findAll();
		return pickUpTimeSlots;
	}

	@Override
	public PickUpTimeSlot getPickUpTimeSlotById(int id) {
		PickUpTimeSlot pickUpTimeSlot=pickUpTimeSlotRepo.findById(id).get();
		return pickUpTimeSlot;
	}

	@Override
	public PickUpTimeSlot removePickUpTimeSlot(int id) {
		PickUpTimeSlot pickUpTimeSlot=pickUpTimeSlotRepo.findById(id).get();
		if(pickUpTimeSlot!=null) {
			pickUpTimeSlotRepo.deleteById(id);
		}
		return pickUpTimeSlot;
	}

	@Override
	public PickUpTimeSlot updatePickUpTimeSlot(PickUpTimeSlot pickUpTimeSlot, int id) {
		PickUpTimeSlot pickUpTimeSlot1=pickUpTimeSlotRepo.findById(id).get();
		if(pickUpTimeSlot.getPickUpTimeId()==pickUpTimeSlot1.getPickUpTimeId()) {
			pickUpTimeSlotRepo.save(pickUpTimeSlot);
		}
		return pickUpTimeSlot;
	}

}
