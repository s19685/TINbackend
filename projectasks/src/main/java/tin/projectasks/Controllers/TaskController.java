package tin.projectasks.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tin.projectasks.Models.Entity.Task;
import tin.projectasks.Services.MongoDBService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private MongoDBService service;

    @GetMapping("/all")
    public List<Task> getAll(){  return service.getTasks(); }

    @PostMapping
    public Task updateTask(@Validated @RequestBody Task task){ return service.updateTask(task); }

    @PutMapping
    public Task addTask(@Validated @RequestBody Task task){ return service.addTask(task); }

    @DeleteMapping
    public void deleteTask(@RequestParam String id){ service.deleteTask(id); }
}
