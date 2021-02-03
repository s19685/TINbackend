package tin.projectasks.Models.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import tin.projectasks.Constraints.ValiDATES;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@ValiDATES
@Document
public class Assignment {

    @Id
    private String id;
    @NotNull
    private Project project;
    @NotNull
    private Task task;
    @NotNull
    private LocalDate dateFrom;
    @NotNull
    private LocalDate dateTo;
    private String comment;

    public Assignment() {
    }

    public Assignment(Project project, Task task, LocalDate dateFrom, LocalDate dateTo, String comment) {
        this.project = project;
        this.task = task;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getDateFrom() { return dateFrom; }

    public void setDateFrom(LocalDate dateFrom) { this.dateFrom = dateFrom; }

    public LocalDate getDateTo() { return dateTo; }

    public void setDateTo(LocalDate dateTo) { this.dateTo = dateTo; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }
}
