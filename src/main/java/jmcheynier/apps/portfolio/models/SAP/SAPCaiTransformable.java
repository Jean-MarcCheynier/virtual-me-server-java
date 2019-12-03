package jmcheynier.apps.portfolio.models.SAP;

import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public interface SAPCaiTransformable {
	
	/**
	 * @author jmchey
	 * @param language isocode
	 * @return Stringified object
	 */
	public String SAPCaiStringify(LangIsocode isocode);

}
