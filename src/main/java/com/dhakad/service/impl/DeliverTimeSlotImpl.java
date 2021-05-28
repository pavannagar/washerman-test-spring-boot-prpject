package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.DeliverTimeSlot;
import com.dhakad.repository.DeliverTimeSlotRepo;
import com.dhakad.service.DeliverTimeSlotService;

@Service
public class DeliverTimeSlotImpl implements DeliverTimeSlotService{

	
	@Autowired
	private DeliverTimeSlotRepo deliverTimeSlotRepo;
	@Override
	public DeliverTimeSlot addDeliverTimeSlot(DeliverTimeSlot deliverTimeSlot) {
		deliverTimeSlotRepo.save(deliverTimeSlot);
		return deliverTimeSlot;
	}

	@Override
	public List<DeliverTimeSlot> getAllDeliverTimeSlot() {
		List<DeliverTimeSlot> deliverTimeSlots=deliverTimeSlotRepo.findAll();
		return deliverTimeSlots;
	}

	@Override
	public DeliverTimeSlot getDeliverTimeSlotById(int id) {
		DeliverTimeSlot deliverTimeSlot=deliverTimeSlotRepo.findById(id).get();
		return deliverTimeSlot;
	}

	@Override
	public DeliverTimeSlot removeDeliverTimeSlot(int id) {
		DeliverTimeSlot deliverTimeSlot=deliverTimeSlotRepo.findById(id).get();
		if(deliverTimeSlot!=null) {
			deliverTimeSlotRepo.deleteById(id);
		}
		return deliverTimeSlot;
	}

	@Override
	public DeliverTimeSlot updateDeliverTimeSlot(DeliverTimeSlot deliverTimeSlot, int id) {
		if(deliverTimeSlot.getDeliverTimeId()==deliverTimeSlotRepo.findById(id).get().getDeliverTimeId()) {
			deliverTimeSlotRepo.save(deliverTimeSlot);
		}
		
		return deliverTimeSlot;
	}

	
}
