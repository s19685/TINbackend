package tin.projectasks.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tin.projectasks.Models.Entity.Assignment;
import tin.projectasks.Models.Entity.Project;
import tin.projectasks.Models.Entity.Task;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {

    @Autowired
    private ProjectsRepo projectRepo;

    @Autowired
    private TasksRepo taskRepo;

    @Autowired
    private AssigmentRepo assignmentRepo;


    @Override
    public void run(String... args) throws Exception {

        Project p = new Project("TIN01", "ba", "nny");
        Task t = new Task("drugie", "dadada", 1);


        List<Project> projects = Arrays.asList(new Project("je", "ba", "ny"), p,
                new Project("TIN02", "ba", "nany"));

        List<Task> tasks = Arrays.asList(new Task("zadanie", "da", 5), t,
                new Task("nastepne", "dobra", 2));


        Assignment ass = new Assignment(p, t, new Date(2020, 4, 20), new Date(2020L), "wszystko git dobrze robia");


        projectRepo.deleteAll();
        taskRepo.deleteAll();
        assignmentRepo.deleteAll();

        projectRepo.saveAll(projects);
        taskRepo.saveAll(tasks);

        assignmentRepo.save(ass);
    }
}
