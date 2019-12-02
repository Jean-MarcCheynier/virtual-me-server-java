package jmcheynier.apps.portfolio.services.cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import jmcheynier.apps.portfolio.models.mongoModel.SpokenLanguage;
import jmcheynier.apps.portfolio.repositories.mongoRepositories.SpokenLanguageMongoRepository;

@Service
public class SpokenLanguageService {
	
	@Autowired
	private SpokenLanguageMongoRepository spokenLanguageMongoRepository;

    public List<SpokenLanguage> list() {
        return spokenLanguageMongoRepository.findAll();
    }  
 
    public List<SpokenLanguage> getByLevel(@PathVariable("level") String level) {
    	return spokenLanguageMongoRepository.findByLevel(level);
    }
    

    public SpokenLanguage getByIsocode(@PathVariable("isocode") String isocode) {
    	return spokenLanguageMongoRepository.findByIsocode(isocode);
    }
    
	public List<SpokenLanguage> getByIsocodeAndLevel(String isocode, String level) {
		return spokenLanguageMongoRepository.findByIsocodeAndLevel(isocode, level);
	}
   
    public void save(@RequestBody SpokenLanguage spokenLanguage) {
    	spokenLanguageMongoRepository.save(spokenLanguage);
    }



}
