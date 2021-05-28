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

import com.dhakad.entity.Status;
import com.dhakad.service.StatusService;

@RestController
public class StatusController {

	@Autowired
	private StatusService statusService;
	
	@PostMapping("status")
	public Status addStatus(@RequestBody Status status) {
		
		return statusService.addStatus(status);
	}
	@GetMapping("status")
	public List<Status> getAllStatus(){
		return statusService.getAllStatus();
	}
	
	@GetMapping("status/{id}")
	public Status getStatusById(@PathVariable("id") int id) {
		return statusService.getStatusById(id);
	}
	@PutMapping("status/{id}")
	public Status updateStatus(@RequestBody Status status,@PathVariable("id") int id) {
		return statusService.updateStatus(status, id);
	}
	@DeleteMapping("status/{id}")
	public Status removeStatus(@PathVariable("id") int id) {
		return statusService.removeStatus(id);
	}
	
	
}
