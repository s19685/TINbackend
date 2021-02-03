package tin.projectasks.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tin.projectasks.Models.Entity.Project;
import tin.projectasks.Models.ProjectsRepo;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private ProjectsRepo repo;

    @GetMapping("/all")
    public List<Project> getAll(){ return repo.findAll(); }

    @PostMapping
    public Project updateProject(@Validated @RequestBody Project project){ return repo.save(project); }

    @PutMapping
    public Project addProject(@Validated @RequestBody Project project){ return repo.insert(project); }

    @DeleteMapping
    public void deleteProject(@RequestParam String id){ repo.deleteById(id); }
}
