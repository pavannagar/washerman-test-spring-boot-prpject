package com.dhakad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhakad.entity.Status;

@Service
public interface StatusService {

	public Status addStatus(Status status);
	public List<Status> getAllStatus();
	public Status getStatusById(int id);
	public Status removeStatus(int id);
	public Status updateStatus(Status status,int id);
	
	
}
