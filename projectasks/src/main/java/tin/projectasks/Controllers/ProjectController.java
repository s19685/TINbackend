package tin.projectasks.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tin.projectasks.Models.Entity.Project;
import tin.projectasks.Models.ProjectsRepo;
import tin.projectasks.Services.MongoDBService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/projects")
public class ProjectController {


    @Autowired
    private MongoDBService service;

    @GetMapping("/all")
    public List<Project> getAll(){ return service.getProjects(); }

    @PostMapping
    public Project updateProject(@Validated @RequestBody Project project){ return service.updateProject(project); }

    @PutMapping
    public Project addProject(@Validated @RequestBody Project project){ return service.addProject(project); }

    @DeleteMapping
    public void deleteProject(@RequestParam String id){ service.deleteProject(id); }
}
