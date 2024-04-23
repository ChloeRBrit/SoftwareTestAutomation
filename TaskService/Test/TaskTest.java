package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import TaskService.Task;

import org.junit.jupiter.api.Assertions;

class TaskTest{
	
	@Test
	void testTask() {
		Task Task = new Task("45345","Name","description");
		assertTrue(Task.getreqName().equals("Name"));
		assertTrue(Task.getreqDesc().equals("description"));
		assertTrue(Task.getID().equals("45345"));
	}
	 @Test
	    void testTaskIDTooLong() {
	        // Task ID longer than 10 characters
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task("12345678901", "Task Name", "Task Description");
	        });
	    }

	    @Test
	    void testNullTaskID() {
	        // Null task ID
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task(null, "Task Name", "Task Description");
	        });
	    }

	    @Test
	    void testNullTaskName() {
	        // Null task name
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task("1234567890", null, "Task Description");
	        });
	    }

	    @Test
	    void testTaskNameTooLong() {
	        // Task name longer than 20 characters
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task("1234567890", "Task Name Longer Than Twenty Characters", "Task Description");
	        });
	    }

	    @Test
	    void testNullTaskDesc() {
	        // Null task description
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task("1234567890", "Task Name", null);
	        });
	    }

	    @Test
	    void testTaskDescTooLong() {
	        // Task description longer than 50 characters
	        assertThrows(IllegalArgumentException.class, () -> {
	            new Task("1234567890", "Task Name", "Task Description Longer Than Fifty Characters Task Description Longer Than Fifty Characters");
	        });
	        
	    }
	}