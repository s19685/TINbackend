package tin.projectasks.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tin.projectasks.Models.AssigmentRepo;
import tin.projectasks.Models.Entity.Project;
import tin.projectasks.Models.Entity.Task;
import tin.projectasks.Models.ProjectsRepo;
import tin.projectasks.Models.TasksRepo;

import java.util.List;

@Service
public class MongoDBService {

    @Autowired
    private ProjectsRepo projects;

    @Autowired
    private TasksRepo tasks;

    @Autowired
    private AssigmentRepo assigments;

    //PROJECTS

    public List<Project> getProjects(){ return projects.findAll(); }

    public Project updateProject(Project project){ return projects.save(project); }

    public Project addProject(Project project){ return projects.insert(project); }

    public void deleteProject(String id){
        projects.deleteById(id);
        assigments.findAll().forEach(a -> { if (a.getProject().getId().equals(id)) assigments.deleteById(a.getId()); });
    }

    //TASKS

    public List<Task> getTasks(){ return tasks.findAll(); }

    public Task updateTask(Task task){ return tasks.save(task); }

    public Task addTask(Task task){ return tasks.insert(task); }

    public void deleteTask(String id){
        tasks.deleteById(id);
        assigments.findAll().forEach(a -> { if (a.getTask().getId().equals(id)) assigments.deleteById(a.getId()); });
    }


}
