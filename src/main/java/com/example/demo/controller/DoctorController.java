package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Doctor;
import com.example.demo.services.DoctorServices;


@RestController
public class DoctorController {
	
	@Autowired
	DoctorServices newService;
	
	@GetMapping("/allDoctors")
	public List<Doctor> listAllDoctors()
	{
		return newService.getAllDoctors();
	}

	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor p)
	{
		newService.addDoctor(p);
		return(p);
	}
	
    @PutMapping("/updateDoctor/{id}")
	
	public ResponseEntity<Doctor> updateDoctor(@PathVariable(value="id") String id,@RequestBody Doctor p)
	{
		try 
		{
			Doctor existDoc = newService.getPatientById(id);
			existDoc.setName(p.getName());
			existDoc.setSpecialty(p.getSpecialty());
			existDoc.setContact(p.getContact());
			existDoc.setLicenseId(p.getLicenseId());
			
			
			return new ResponseEntity<Doctor>(newService.updateDoctor(existDoc),HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
}
