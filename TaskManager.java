import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TaskManager {
    //
    private ArrayList<Task> tasks;
    private int nextId = 1; // compteur automatique des IDs

    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask( String title, String description){
        Task newTask = new Task(nextId, title, description);
        tasks.add(newTask);
        nextId++; // IMPORTANT : on incrémente après création
    }

    public void showTask(){
    for (Task t : tasks) {
        System.out.println("Voici la liste des tâches :");
        System.out.println(t. toString());
    }
    }

    public void displayTask(int id){
        for (Task t : tasks){
            if(t.getId() == id){
                 System.out.println(t. toString());
                 return;// sortir de la méthode immédiatement
            }
        }
        System.out.println("tache introuvable");// s’exécute seulement si aucune tâche n’a été trouvée
    }
    public void editTask(int id, String title, String description){
        for (Task t : tasks){
            if(t.getId() == id){
                t.setTitle(title);
                t.setDescription(description);
                System.out.println("Tâche mise à jour : " + t.toString());
                return;
            }
        System.out.println("tache introuvable");
        }
    }
    public void TaskState(int id){
        for (Task t : tasks){
            if(t.getId() == id){
                t.toggleStatus();
                return;
            }
        }
    System.out.println("tache introuvable");
    }
    public void deleteTask(List<Integer> ids){
        int deletedCount = 0;
        Iterator<Task> it = tasks.iterator();
        while (it.hasNext()) {
            Task t = it.next();
            if(ids.contains(t.getId())){
                System.out.println(deletedCount +"tache supprimée"+ t.getTitle());
                it.remove();
                deletedCount++;
            }
        }
    }
}



