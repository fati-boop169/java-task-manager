public class Task {
    private int id;
    private String title;
    private String description;
    private boolean isCompleted;
    // constructeur
    public Task (int id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }
    // getters
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return isCompleted;
    }
    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void markAsCompleted(){
        this.isCompleted = true;
    }
    public void markAsPending(){
        this.isCompleted = false;
    }
    public void toggleStatus() {
    this.isCompleted = !this.isCompleted; // inverse true/false
    }

    //
    @Override
    public String toString(){
        return "Task" + id + ":" + title + "=>" + description + "[" + (isCompleted? "completed" : "pending") + "]" ;
    }
    }
