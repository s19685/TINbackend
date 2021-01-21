package tin.projectasks.Models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tin.projectasks.Models.Entity.Task;

@Repository
public interface TasksRepo extends MongoRepository<Task, String> {
}
