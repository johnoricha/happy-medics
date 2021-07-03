package com.codingchallenge.happymedics.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/happymedics/api")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/make-appointment")
    public void makeAppointment(@RequestBody Appointment appointment) {
        appointmentService.createAppointment(appointment);
    }

    @DeleteMapping(path = "/delete-appointment/{appointmentId}")
    public void deleteUser(@PathVariable("appointmentId") Long id) {
        appointmentService.deleteAppointment(id);
    }

}
