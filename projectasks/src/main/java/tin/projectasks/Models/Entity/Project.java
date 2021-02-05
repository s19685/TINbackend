package tin.projectasks.Models.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Document(collection = "Projects")
public class Project {

    @Id
    private String id;
    @NotNull
    @NotEmpty
    @Size(min=2, max=12)
    private String name;
    @NotNull
    @NotEmpty
    private String desc;
    @NotNull
    @NotEmpty
    private String objective;
    @Min(0)
    @Max(5)
    private Integer diff;


    public Project() {
    }

    public Project(String name, String desc, String objective, Integer diff) {
        this.name = name;
        this.desc = desc;
        this.objective = objective;
        this.diff = diff;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Integer getDiff() {
        return diff;
    }

    public void setDiff(Integer diff) {
        this.diff = diff;
    }

}
