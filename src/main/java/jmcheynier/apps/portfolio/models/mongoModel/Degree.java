package jmcheynier.apps.portfolio.models.mongoModel;

import java.util.Date;
import java.util.HashMap;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public class Degree implements SAPCaiTransformable {
	
    @Id
    public String id;
    public String code;
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    public Date endDate;
    public String type;
    public String specialty;
    public HashMap<LangIsocode, String> values;
    public Institute institute;

	public String SAPCaiStringify(LangIsocode isocode) {
		if(values.containsKey(isocode)) {	
			return values.get(isocode);
		}else {
			return "error";
		}
	}

}
