package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.bean.Doctor;
import com.example.demo.repository.doctorRepo;

public class DoctorServices {
	
	@Autowired
	doctorRepo newRepo;
	

	
	public List<Doctor> getAllDoctors()
	{
		return newRepo.findAll();
	}
	
	public int getMaxId()
	{
		return newRepo.findAll().size()+1;
	}
	
	public Doctor addDoctor(Doctor p)
	{
		p.setDoctorId(Integer.toString(getMaxId()));
		newRepo.save(p);
		
		return(p);
	}
	
	public Doctor updateDoctor(Doctor p)
	{
		newRepo.save(p);
		return p;
	}
	
	public Doctor getPatientById(String id)
	{
		return newRepo.findById(id).get();
	}


}
