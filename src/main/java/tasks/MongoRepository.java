package tasks;

public class MongoRepository implements TaskRepository{

    @Override
    public void save(Task task) {
        System.out.println("task is saved a MongoDB: " + task.getTitle());
    }
}
