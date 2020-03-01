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

import jmcheynier.apps.portfolio.models.mongoModel.Experience;
import jmcheynier.apps.portfolio.repositories.mongoRepositories.ExperienceMongoRepository;

@RestController("ExperienceControllerV2")
@RequestMapping("/api/v2/experiences")
public class ExperienceController {

	@Autowired
	private ExperienceMongoRepository experienceMongoRepository;

    @GetMapping
    public List<Experience> list() {
        return experienceMongoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Experience> get(@PathVariable("id") String id) {
    	return experienceMongoRepository.findById(id);
    }
   
    @PostMapping
    public void post(@RequestBody Experience experience) {
    	experienceMongoRepository.save(experience);
    }
	




}
