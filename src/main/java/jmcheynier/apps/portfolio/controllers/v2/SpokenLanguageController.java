package jmcheynier.apps.portfolio.controllers.v2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmcheynier.apps.portfolio.controllers.v2.exceptions.ItemNotFoundException;
import jmcheynier.apps.portfolio.controllers.v2.utils.SAPCaiObjectTransformer;
import jmcheynier.apps.portfolio.controllers.v2.utils.SAPCaiObjectWrapper;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;
import jmcheynier.apps.portfolio.models.enums.LevelCode;
import jmcheynier.apps.portfolio.models.mongoModel.SpokenLanguage;
import jmcheynier.apps.portfolio.services.cv.SpokenLanguageService;

@RestController("SpokenLanguageControllerV2")
@RequestMapping(path = {"/api/v2/spokenLanguage", "/api/v2/{apiLang}/spokenLanguage"})
public class SpokenLanguageController {
	
	@Autowired
	private SpokenLanguageService spokenLanguageService;

    @GetMapping
    public SAPCaiObjectWrapper<SpokenLanguage> list(
    		@PathVariable("apiLang") Optional<LangIsocode> apiLang) {
        
    	return new SAPCaiObjectWrapper<SpokenLanguage>(spokenLanguageService.list(), apiLang.orElse(null));
    }
    
    @GetMapping("/isocode/{isocode}")
    public SAPCaiObjectWrapper<SpokenLanguage> getByIsocode(
    		@PathVariable("isocode") LangIsocode isocode,
    		@PathVariable("apiLang") Optional<LangIsocode> apiLang) {
    	
    	SAPCaiObjectWrapper<SpokenLanguage> res = new SAPCaiObjectWrapper<SpokenLanguage>(
    			spokenLanguageService.getByIsocode(isocode), 
    			apiLang.orElse(SAPCaiObjectTransformer.defaultLanguage));
    	if(res == null || res.getResults() == null || res.getResults().isEmpty()) {
    		throw new ItemNotFoundException();
    	}
    	return res;
    }
    
    @GetMapping("/level/{level}")
    public SAPCaiObjectWrapper<SpokenLanguage> getByLevel(
    		@PathVariable("level") LevelCode level,
    		@PathVariable("apiLang") Optional<LangIsocode> apiLang) {
    	
    	SAPCaiObjectWrapper<SpokenLanguage> res = new SAPCaiObjectWrapper<SpokenLanguage>(
    			spokenLanguageService.getByLevel(level), 
    			apiLang.orElse(SAPCaiObjectTransformer.defaultLanguage));
    	
    	if(res == null || res.getResults() == null || res.getResults().isEmpty()) {
    		throw new ItemNotFoundException();
    	}
    	return res;
    }
    
    @GetMapping("/isocode/{isocode}/level/{level}")
    public SAPCaiObjectWrapper<SpokenLanguage> getByIsocodeAnLevel(
    		@PathVariable("isocode") LangIsocode isocode,
    		@PathVariable("level") LevelCode level,
    		@PathVariable("apiLang") Optional<LangIsocode> apiLang) {
    	SAPCaiObjectWrapper<SpokenLanguage> res = new SAPCaiObjectWrapper<SpokenLanguage>(
    			spokenLanguageService.getByIsocodeAndLevel(isocode, level), 
    			apiLang.orElse(SAPCaiObjectTransformer.defaultLanguage));
    	
    	if(res == null || res.getResults() == null || res.getResults().isEmpty()) {
    		throw new ItemNotFoundException();
    	}
    	return res;
    }
    
    @PostMapping
    public void post(@RequestBody SpokenLanguage spokenLanguage) {
    	spokenLanguageService.save(spokenLanguage);
    }
    
}
