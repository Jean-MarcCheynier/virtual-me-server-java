package jmcheynier.apps.portfolio.repositories.mongoRepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import jmcheynier.apps.portfolio.models.mongoModel.Skill;

public interface SkillMongoRepository extends MongoRepository<Skill, String> {

	public Skill findByCode(String code);
	public List<Skill> findByType(String type);
	
}
