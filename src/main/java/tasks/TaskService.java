package tasks;

public class TaskService {

    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void saveTask(String title){
        Task task = new Task(title);
        this.repository.save(task);

        // 1. New tarea.
        // 2. Guardat a la database.
        // 3. Notificar que s'ha creat la new tarea.

        // La nostra lògica de negoci no pot veure's afectada per l'infraestructura.

        // Volem aconseguir: Alta Cohesió de classes + Baix Acoplament entre elles (dev sobre contractes/interfícia)
    }
}
