package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.HashMap;

import org.springframework.data.annotation.Id;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;
import jmcheynier.apps.portfolio.models.enums.LevelCode;

public class Skill implements SAPCaiTransformable {
	

    @Id
    public String id;
    public String code;
    public String type;
    public LevelCode level;
    public HashMap<LangIsocode, String> values;


    public Skill() {}

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, values='%s', type='%s']",
                id, values, type);
    }

	public String SAPCaiStringify(LangIsocode isocode) {
		if(values.containsKey(isocode)) {	
			return values.get(isocode);
		}else {
			return "error";
		}
	}

}
