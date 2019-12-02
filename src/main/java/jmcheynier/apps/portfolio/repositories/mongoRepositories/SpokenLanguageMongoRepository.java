package jmcheynier.apps.portfolio.repositories.mongoRepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import jmcheynier.apps.portfolio.models.mongoModel.SpokenLanguage;

public interface SpokenLanguageMongoRepository extends MongoRepository<SpokenLanguage, String> {

	public SpokenLanguage findByIsocode(String isocode);
	public List<SpokenLanguage> findByLevel(String level);
	public List<SpokenLanguage> findByIsocodeAndLevel(String isocode, String level);
	

}
