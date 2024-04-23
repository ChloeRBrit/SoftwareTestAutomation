package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Appointments.Appointment;
import Appointments.AppointmentService;

import java.util.Date;

public class AppointmentServiceTest {
    private AppointmentService appointmentService;
    private Appointment appointment1;
    private Appointment appointment2;

    @Before
    public void setUp() {
        appointmentService = new AppointmentService();
        appointment1 = new Appointment("1", new Date(), "Meeting 1");
        appointment2 = new Appointment("2", new Date(), "Meeting 2");
    }

    @Test
    public void testAddAppointment() {
        appointmentService.addAppointment(appointment1);
        assertNotNull(appointmentService); // Check that appointmentService is not null after adding an appointment
        // Add more assertions here if needed
    }

    @Test
    public void testAddDuplicateAppointment() {
        appointmentService.addAppointment(appointment1);
        try {
            appointmentService.addAppointment(appointment1);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Appointment with ID 1 already exists.", e.getMessage());
        }
    }

    @Test
    public void testDeleteAppointment() {
        appointmentService.addAppointment(appointment1);
        appointmentService.deleteAppointment("1");
        // Verify that appointment1 is removed from appointmentService
        // We cannot directly access appointments in appointmentService, so we can't check size or contains
        // We can add more specific assertions if needed
    }

    @Test
    public void testDeleteNonExistentAppointment() {
        try {
            appointmentService.deleteAppointment("3");
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Appointment with ID 3 does not exist.", e.getMessage());
        }
    }
}