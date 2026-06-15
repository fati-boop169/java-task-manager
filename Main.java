import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        TaskManager t = new TaskManager();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        while(running == true){
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher toutes les tâches");
            System.out.println("3. Afficher une tâches spécifiques");
            System.out.println("4. Modifier une tâche");
            System.out.println("5. Supprimer des tâches");
            System.out.println("6. Quitter");
            System.out.println("votre choix:");
            int choice = input.nextInt();
            input.nextLine(); // consommer le retour ligne
            switch (choice) {
                case 1:
                 // 1. demander le titre
                    System.out.println("Titre de la tâche :");
                    String title = input.nextLine();

                // 2. demander la description
                    System.out.println("Description :");
                    String description = input.nextLine();
                    t.addTask(title, description);
                    break;
                case 2:
                    // 1. demander le titre
                    t.showTask();
                    break;
                case 3:
                    System.out.println("Entrez l'ID de la tâche à afficher :");
                    int id = input.nextInt();
                    t.displayTask(id);
                    break;
                case 4:
                    System.out.println("Entrez l'ID de la tâche à modifier :");
                    int Id = input.nextInt();
                    input.nextLine();
                    System.out.println("enter task new title");
                    String newtitle = input.nextLine();
                    System.out.println("enter task new description");
                    String newdescription = input.nextLine();
                    t.editTask(Id, newtitle, newdescription);
                    break;
                case 5:
                    System.out.println("Entrez les IDs à supprimer (séparés par des virgules) :");
                    String line = input.nextLine();
                    String[] parts = line.split(",");
                    ArrayList<Integer> ids = new ArrayList<>();
                    for(int i =0; i< parts.length;i++){
                        int n = Integer.parseInt(parts[i].trim());
                        ids.add(n);   
                    }
                    t.deleteTask(ids);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Numéro de jour invalide (1 à 6 uniquement).");
                    break;
            }
        }
    }
}