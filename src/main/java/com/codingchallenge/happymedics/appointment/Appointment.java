package com.codingchallenge.happymedics.appointment;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String doctor;
    private String patient;
    private LocalDate scheduledTime;

    public Appointment() {
    }

    public Appointment(Long id, String title, String doctor, String patient, LocalDate scheduledTime) {
        this.id = id;
        this.title = title;
        this.doctor = doctor;
        this.patient = patient;
        this.scheduledTime = scheduledTime;
    }

    public Appointment(String title, String doctor, String patient, LocalDate scheduledTime) {
        this.title = title;
        this.doctor = doctor;
        this.patient = patient;
        this.scheduledTime = scheduledTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public LocalDate getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalDate scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", doctor='" + doctor + '\'' +
                ", patient='" + patient + '\'' +
                ", scheduledTime=" + scheduledTime +
                '}';
    }
}
