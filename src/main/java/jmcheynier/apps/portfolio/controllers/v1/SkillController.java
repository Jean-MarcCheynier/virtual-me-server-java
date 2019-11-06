package jmcheynier.apps.portfolio.controllers.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.models.Skill;
import jmcheynier.apps.portfolio.repositories.SkillRepository;

@RestController("SkillControllerV1")
@RequestMapping("/api/v1/skills")
public class SkillController {

	@Autowired
	private SkillRepository skillRepository;

	    @GetMapping
	    public List<Skill> list() {
	        return skillRepository.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public Skill get(@PathVariable("id") long id) {
	    	return skillRepository.getOne(id);
	    }



}


