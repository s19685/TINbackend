package tin.projectasks.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tin.projectasks.Models.AssigmentRepo;
import tin.projectasks.Models.Entity.Assignment;


import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {


    @Autowired
    private AssigmentRepo repo;

    @GetMapping("/all")
    public List<Assignment> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Assignment updateAssignment(@Validated @RequestBody Assignment assignment){
        return repo.save(assignment);
    }

    @PutMapping
    public Assignment addAssignment(@Validated @RequestBody Assignment assignment){
        return repo.insert(assignment);
    }

    @DeleteMapping
    public void deleteAssignment(@RequestParam String id){
        repo.deleteById(id);
    }
}
