package tin.projectasks.Models.Entity;

import com.mongodb.lang.NonNull;
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

    public Project(String name, String description, String objective) {
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
