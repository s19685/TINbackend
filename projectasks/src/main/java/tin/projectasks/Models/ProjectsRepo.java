package tin.projectasks.Models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tin.projectasks.Models.Entity.Project;

@Repository
public interface ProjectsRepo extends MongoRepository<Project,String> {
}
