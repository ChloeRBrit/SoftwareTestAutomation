package Test;

import static org.junit.jupiter.api.Assertions.*;
import TaskService.*;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

@Test
void testAdd() {
Task testing = new Task("12345678", "ReqName", "Custom description ");
assertEquals(false, TaskService.addTask(testing));
}

@Test
void NoDuplicate() {
Task testing = new Task("12345678", "ReqName", "Custom description");
TaskService.addTask(testing);
Task testing2 = new Task("12345678", "Name", "Description of thing");
assertEquals(true, TaskService.addTask(testing2));
}

@Test
void deleteTest() {
Task testing = new Task("12345678", "ReqName", "Custom description");
TaskService.addTask(testing);
assertEquals(true, TaskService.deleteTask(testing));
}

@Test
void updateTest() {
Task testing = new Task("12345678", "ReqName", "Custom description");
TaskService.addTask(testing);
Task testing2 = new Task("12345678", "Name", "Description of thing");
TaskService.updateTask(testing2);
}

}