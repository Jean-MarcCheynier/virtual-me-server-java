package jmcheynier.apps.portfolio.controllers.v2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.models.mongoModel.Skill;
import jmcheynier.apps.portfolio.repositories.mongoRepositories.SkillMongoRepository;

@RestController("SkillControllerV2")
@RequestMapping("/api/v2/skills")
public class SkillController {

	@Autowired
	private SkillMongoRepository skillMongoRepository;

	    @GetMapping
	    public List<Skill> list() {
	        return skillMongoRepository.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public Optional<Skill> get(@PathVariable("id") String id) {
	    	return skillMongoRepository.findById(id);
	    }
	   
	    @PostMapping
	    public void post(@RequestBody Skill skill) {
	    	skillMongoRepository.save(skill);
	    }



}


