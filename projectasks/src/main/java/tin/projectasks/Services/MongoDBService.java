package tin.projectasks.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tin.projectasks.Models.AssigmentRepo;
import tin.projectasks.Models.Entity.Project;
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

    public List<Project> getProjects(){ return projects.findAll(); }


    public void deleteProject(String id){

        projects.deleteById(id);

//        for (Assignment a: assigments.findAll()) {
//            if (a.getProject().getId().equals(id)){
//                assigments.deleteById(a.getId());
//            }
//        }

        assigments.findAll().forEach(a -> {
            if (a.getProject().getId().equals(id)) assigments.deleteById(a.getId());

        });

    }

    public void deleteTask(String id){
        tasks.deleteById(id);

        assigments.findAll().forEach(a -> {
            if (a.getTask().getId().equals(id)) assigments.deleteById(a.getId());
        });
    }


}
