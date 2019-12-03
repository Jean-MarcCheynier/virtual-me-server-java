package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.Date;
import java.util.HashMap;

import org.springframework.data.annotation.Id;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public class Degree implements SAPCaiTransformable {
	
    @Id
    public String id;
    public String code;
    public Date startDate;
    public Date endDate;
    public String type;
    public HashMap<LangIsocode, String> values;

	@Override
	public String SAPCaiStringify(LangIsocode isocode) {
		// TODO Auto-generated method stub
		return null;
	}

}
