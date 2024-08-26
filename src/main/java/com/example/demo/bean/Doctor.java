
package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctors")
public class Doctor {

    @Id
    @Column(name = "doctor_id", nullable = false)
    private String doctorId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "contact")
    private String contact;

    @Column(name = "license_id", nullable = false, unique = true)
    private String licenseId;

    // Getters and setters
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
