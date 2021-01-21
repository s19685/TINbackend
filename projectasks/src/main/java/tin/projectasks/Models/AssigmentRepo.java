package tin.projectasks.Models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tin.projectasks.Models.Entity.Assignment;

@Repository
public interface AssigmentRepo extends MongoRepository<Assignment, String> {
}
