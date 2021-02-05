package tin.projectasks.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tin.projectasks.Models.Entity.Assignment;
import tin.projectasks.Models.Entity.Project;
import tin.projectasks.Models.Entity.Task;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
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

        Project p = new Project("TIN Project", "Building web app", "Learn to develop in frontend and backend technologies",5);
        Task t = new Task("MPP0", "Create UML diagram", 4);


        List<Project> projects = Arrays.asList(new Project("BYT Project", "Documentation", "Learn to do proper documentation",5), p,
                new Project("ZPR", "Plan zarzadzania projektem", "planowanie projektami",null));

        List<Task> tasks = Arrays.asList(new Task("MPP1", "Create HTML+CSS documents", 5), t,
                new Task("MPP2", "Server Side", 5));


        String pattern = "yyyy-mm-dd";
        SimpleDateFormat sp = new SimpleDateFormat(pattern);


//        Assignment ass = new Assignment(p, t, "2021-01-19", "2021-02-12", "wszystko dobrze ");
        Assignment ass = new Assignment(p, t, LocalDate.now(), LocalDate.now().plusWeeks(1), "wszystko dobrze ");


        projectRepo.deleteAll();
        taskRepo.deleteAll();
        assignmentRepo.deleteAll();

        projectRepo.saveAll(projects);
        taskRepo.saveAll(tasks);

        assignmentRepo.save(ass);
    }
}
