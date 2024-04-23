package Appointments;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments;

    public AppointmentService() {
        appointments = new HashMap<>();
    }

    public void addAppointment(Appointment appointment) {
        String appointmentId = appointment.getID(); // Here's where getID() is used
        if (appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment with ID " + appointmentId + " already exists.");
        }
        appointments.put(appointmentId, appointment);
    }

    public void deleteAppointment(String appointmentId) {
        if (!appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment with ID " + appointmentId + " does not exist.");
        }
        appointments.remove(appointmentId);
    }
}