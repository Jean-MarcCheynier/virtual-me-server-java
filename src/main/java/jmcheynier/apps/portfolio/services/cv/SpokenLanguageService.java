package jmcheynier.apps.portfolio.services.cv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import jmcheynier.apps.portfolio.models.enums.LangIsocode;
import jmcheynier.apps.portfolio.models.enums.LevelCode;
import jmcheynier.apps.portfolio.models.mongoModel.SpokenLanguage;
import jmcheynier.apps.portfolio.repositories.mongoRepositories.SpokenLanguageMongoRepository;

@Service
public class SpokenLanguageService {
	
	@Autowired
	private SpokenLanguageMongoRepository spokenLanguageMongoRepository;

    public List<SpokenLanguage> list() {
        return spokenLanguageMongoRepository.findAll();
    }  
 
    public List<SpokenLanguage> getByLevel(LevelCode level) {
    	return spokenLanguageMongoRepository.findByLevel(level.name());
    }
    

    public SpokenLanguage getByIsocode(LangIsocode isocode) {
    	return spokenLanguageMongoRepository.findByIsocode(isocode.name());
    }
    
	public List<SpokenLanguage> getByIsocodeAndLevel(LangIsocode isocode, LevelCode level) {
		return spokenLanguageMongoRepository.findByIsocodeAndLevel(isocode.name(), level.name());
	}
   
    public void save(@RequestBody SpokenLanguage spokenLanguage) {
    	spokenLanguageMongoRepository.save(spokenLanguage);
    }



}
