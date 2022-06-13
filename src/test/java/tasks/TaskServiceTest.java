package tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void saveTaskTest() {
        var taskService1 = new TaskService(new MySqlRepository());
        var taskService2 = new TaskService(new MongoRepository());
        taskService1.saveTask("Task 1");
        taskService2.saveTask("Task 2");
    }
}