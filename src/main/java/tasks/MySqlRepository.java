package tasks;

import javax.annotation.processing.SupportedSourceVersion;

public class MySqlRepository implements TaskRepository {

    public void save(Task task){
        System.out.println("task is saved a SQL: " + task.getTitle());
    }
}
