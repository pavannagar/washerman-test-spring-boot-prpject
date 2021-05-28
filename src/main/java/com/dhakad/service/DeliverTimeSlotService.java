package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.entity.DeliverTimeSlot;
import java.util.List;

@Service
public interface DeliverTimeSlotService {

	public DeliverTimeSlot addDeliverTimeSlot(DeliverTimeSlot deliverTimeSlot);
	public List<DeliverTimeSlot> getAllDeliverTimeSlot();
	public DeliverTimeSlot getDeliverTimeSlotById(int id);
	public DeliverTimeSlot removeDeliverTimeSlot(int id);
	public DeliverTimeSlot updateDeliverTimeSlot(DeliverTimeSlot deliverTimeSlot,int id);
	
}
