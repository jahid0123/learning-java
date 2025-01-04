package taskManagementSystem;

import java.time.LocalDate;

public class Task {

    public enum Status{
        Pending,
        In_Progress,
        Completed
    }

    private int id;
    private String title;
    private String description;
    private Status status;
    private LocalDate dueDate;

    public Task(int id, String title, String description, Status status, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return
                "\nId :    \t\t" + id +
                "\nTitle : \t\t" + title +
                "\nDescription : \t" + description +
                "\nStatus : \t\t" + status +
                "\nDueDate : \t\t" + dueDate;
    }

    public static void main(String[] args) {

        Task task = new Task(1, "WebList", "Creating web site", Status.Pending, LocalDate.of(2025,1,4));

        System.out.println(task);
        System.out.println();

        task.setStatus(Status.In_Progress);
        System.out.println("Updated task: "+task.toString());
    }
}
