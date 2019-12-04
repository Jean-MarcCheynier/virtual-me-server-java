package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.Map;

import org.springframework.data.annotation.Id;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;
import jmcheynier.apps.portfolio.models.enums.LevelCode;

public class SpokenLanguage implements SAPCaiTransformable {
	
    @Id
    public String id;
    public String isocode;
    public Map<LangIsocode, String> values;
    public LevelCode level;

    public SpokenLanguage() {} 

    @Override
    public String toString() {
        return String.format(
                "SpokenLanguage[id=%s, isocode=%s, values='%s', level='%s']",
                id, values, isocode, level);
    }

	public String SAPCaiStringify(LangIsocode isocode) {
		if(values.containsKey(isocode)) {	
			return values.get(isocode);
		}else {
			return "error";
		}
		
	}

}
