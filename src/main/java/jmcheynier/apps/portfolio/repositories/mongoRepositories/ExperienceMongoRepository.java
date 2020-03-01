package jmcheynier.apps.portfolio.repositories.mongoRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import jmcheynier.apps.portfolio.models.mongoModel.Experience;

public interface ExperienceMongoRepository extends MongoRepository<Experience, String>  {
	
	

}
