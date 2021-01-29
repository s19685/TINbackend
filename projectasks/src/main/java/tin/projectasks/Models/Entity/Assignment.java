package tin.projectasks.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;

@Document
public class Assignment {


    @Id
    private String id;
    @NonNull
    private Project project;
    @NonNull
    private Task task;
    @NonNull
    private String dateFrom;
    @NonNull
    private String dateTo;
    private String comment;

    public Assignment() {
    }

    public Assignment(Project project, Task task, String dateFrom, String dateTo, String comment) {
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

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String  getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
