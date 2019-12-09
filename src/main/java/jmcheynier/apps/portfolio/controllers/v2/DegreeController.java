package jmcheynier.apps.portfolio.controllers.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.controllers.v2.utils.SAPCaiObjectTransformer;
import jmcheynier.apps.portfolio.controllers.v2.utils.SAPCaiObjectWrapper;
import jmcheynier.apps.portfolio.models.mongoModel.Degree;
import jmcheynier.apps.portfolio.repositories.mongoRepositories.DegreeMongoRepository;

@RestController("DegreeControllerV2")
@RequestMapping("/api/v2/degrees")
public class DegreeController {

	@Autowired
	private DegreeMongoRepository degreeMongoRepository;

	    @GetMapping
	    public SAPCaiObjectWrapper<Degree> list() {   	
	    	SAPCaiObjectWrapper<Degree> res = new SAPCaiObjectWrapper<Degree>(
	    		degreeMongoRepository.findByOrderByEndDateDesc(), 
	    		SAPCaiObjectTransformer.defaultLanguage);
	        return res;
	    }
	    
	    @PostMapping
	    public void post(@RequestBody Degree degree) {
	    	degreeMongoRepository.save(degree);
	    }



}



