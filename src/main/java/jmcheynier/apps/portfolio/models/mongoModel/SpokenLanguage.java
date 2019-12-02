package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.HashMap;

import org.springframework.data.annotation.Id;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;

public class SpokenLanguage extends SAPCaiTransformable {
	
    @Id
    public String id;
    public String isocode;
    public HashMap<String, String> values;
    public String level;

    public SpokenLanguage() {} 

    @Override
    public String toString() {
        return String.format(
                "SpokenLanguage[id=%s, isocode=%s, values='%s', level='%s']",
                id, values, isocode, level);
    }

	@Override
	public String SAPCaiStringify(String isocode) {
		if(values.containsKey(isocode)) {	
			return values.get(isocode);
		}else {
			return "error";
		}
		
	}

}
