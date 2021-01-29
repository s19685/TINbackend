package tin.projectasks.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tin.projectasks.Models.Entity.Task;
import tin.projectasks.Models.TasksRepo;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TasksRepo repo;

    @GetMapping("/all")
    public List<Task> getAll(){  return repo.findAll(); }

    @PostMapping
    public Task addTask(@RequestBody Task task){ return repo.save(task); }

    @PutMapping
    public Task updateTask(@RequestBody Task task){ return repo.insert(task); }

    @DeleteMapping
    public void deleteTask(@RequestParam String id){ repo.deleteById(id); }

}
