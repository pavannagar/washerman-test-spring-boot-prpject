package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Status;
import com.dhakad.repository.StatusRepo;
import com.dhakad.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{

	@Autowired
	private StatusRepo statusRepo;
	
	@Override
	public Status addStatus(Status status) {
		statusRepo.save(status);
		return status;
	}

	@Override
	public List<Status> getAllStatus() {
		List<Status> status=statusRepo.findAll();
		return status;
	}

	@Override
	public Status getStatusById(int id) {
		
		return statusRepo.findById(id).get();
	}

	@Override
	public Status removeStatus(int id) {
		Status status=statusRepo.findById(id).get();
		if(status!=null) {
			statusRepo.deleteById(id);
		}
		return status;
	}

	@Override
	public Status updateStatus(Status status, int id) {
		
		if(status.getStatusId()==statusRepo.findById(id).get().getStatusId()) {
			statusRepo.save(status);
		}
		return status;
	}

	
}
