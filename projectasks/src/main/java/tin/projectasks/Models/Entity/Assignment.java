package tin.projectasks.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Assignment {

    @Id
    private String id;
    private Project project;
    private Task task;
    private Date dateFrom;
    private Date dateTo;
    private String comment;

    public Assignment() {
    }

    public Assignment(String id, Project project, Task task, Date dateFrom, Date dateTo, String comment) {
        this.id = id;
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

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
