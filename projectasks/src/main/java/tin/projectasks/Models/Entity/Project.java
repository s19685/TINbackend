package tin.projectasks.Models.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Projects")
public class Project {

    @Id
    private String id;
    private String name;
    private String description;
    private String Objective;


    public Project() {
    }

    public Project(String id, String name, String description, String objective) {
        this.id = id;
        this.name = name;
        this.description = description;
        Objective = objective;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjective() {
        return Objective;
    }

    public void setObjective(String objective) {
        Objective = objective;
    }




}
