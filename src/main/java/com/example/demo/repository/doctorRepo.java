package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Doctor;

public interface doctorRepo extends JpaRepository<Doctor, String>{

}
