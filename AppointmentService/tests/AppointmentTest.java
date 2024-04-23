package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Appointments.Appointment;

import java.util.Date;

public class AppointmentTest {

    @Test
    public void testValidAppointmentCreation() {
        // Valid appointment data
        String id = "1234567890";
        Date date = new Date(System.currentTimeMillis() + 100000); // Future date
        String desc = "Valid Description";

        // Create appointment
        Appointment appointment = new Appointment(id, date, desc);

        // Assertions
        assertEquals(id, appointment.getID());
        assertEquals(date, appointment.getDate());
        assertEquals(desc, appointment.getDesc());
    }

    @Test
    public void testInvalidId() {
        // Invalid appointment ID (too long)
        String id = "12345678901";
        Date date = new Date();
        String desc = "Valid Description";

        // Attempt to create appointment with invalid ID
        assertThrows(IllegalArgumentException.class, () -> new Appointment(id, date, desc));
    }

    @Test
    public void testInvalidDate() {
        // Invalid appointment date (past date)
        String id = "1234567890";
        Date date = new Date(System.currentTimeMillis() - 100000); // Past date
        String desc = "Valid Description";

        // Attempt to create appointment with invalid date
        assertThrows(IllegalArgumentException.class, () -> new Appointment(id, date, desc));
    }

    @Test
    public void testInvalidDescription() {
        // Invalid appointment description (too long)
        String id = "1234567890";
        Date date = new Date();
        String desc = "This is a very long description that exceeds the maximum allowed length for a description.";

        // Attempt to create appointment with invalid description
        assertThrows(IllegalArgumentException.class, () -> new Appointment(id, date, desc));
    }
}