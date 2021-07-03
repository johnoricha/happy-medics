package com.codingchallenge.happymedics.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void createAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Long id) {
        boolean exists = appointmentRepository.existsById(id);

        if(!exists) {
            throw new IllegalStateException("appointment with id " + id + " does not exist");
        }

        appointmentRepository.deleteById(id);
    }
}
