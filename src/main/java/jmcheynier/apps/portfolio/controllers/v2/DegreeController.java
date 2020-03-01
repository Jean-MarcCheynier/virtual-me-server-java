package jmcheynier.apps.portfolio.controllers.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	    
	    @GetMapping("/last")
	    public SAPCaiObjectWrapper<Degree> last() {   	
	    	SAPCaiObjectWrapper<Degree> res = new SAPCaiObjectWrapper<Degree>(
	    		degreeMongoRepository.findByOrderByEndDateDesc().get(0), 
	    		SAPCaiObjectTransformer.defaultLanguage);
	        return res;
	    }
	    
	    @GetMapping("/code/{code}")
	    public SAPCaiObjectWrapper<Degree> byType(@PathVariable("code") String code) {   	
	    	SAPCaiObjectWrapper<Degree> res = new SAPCaiObjectWrapper<Degree>(
	    		degreeMongoRepository.findByCode(code), 
	    		SAPCaiObjectTransformer.defaultLanguage);
	        return res;
	    }
	    
	    @GetMapping("/level/{level}")
	    public SAPCaiObjectWrapper<Degree> byLevel(@PathVariable("level") int level) {   	
	    	SAPCaiObjectWrapper<Degree> res = new SAPCaiObjectWrapper<Degree>(
	    		degreeMongoRepository.findByLevelGreaterThanQuery(Integer.toString(level)), 
	    		SAPCaiObjectTransformer.defaultLanguage);
	        return res;
	    }
	    
	    @PostMapping
	    public void post(@RequestBody Degree degree) {
	    	degreeMongoRepository.save(degree);
	    }



}



