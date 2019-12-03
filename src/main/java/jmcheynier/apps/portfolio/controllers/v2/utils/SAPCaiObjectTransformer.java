package jmcheynier.apps.portfolio.controllers.v2.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public abstract class SAPCaiObjectTransformer {
	
	public static final LangIsocode defaultLanguage = LangIsocode.FR;
	static final String comaSeparator = ", ";
	static final HashMap<LangIsocode, String> andSeparator = new HashMap<LangIsocode , String>() {
		private static final long serialVersionUID = 1L;
	{
	    put(LangIsocode.EN,    " and ");
	    put(LangIsocode.FR, " et ");
	}};
    
	
	public static String SAPCaiStringify(List<? extends SAPCaiTransformable> tList, LangIsocode isocode) {
		if(tList==null || tList.isEmpty()) {
			return "";
		}
		if(isocode==null) {
			isocode = defaultLanguage;
		}
		StringBuilder strBuild = new StringBuilder();
		Iterator<? extends SAPCaiTransformable> it = tList.iterator();
		strBuild.append(SAPCaiStringify(it.next(), isocode));
		while(it.hasNext()){
			String next = SAPCaiStringify(it.next(), isocode);
			if(it.hasNext()) {
				strBuild.append(comaSeparator);
			}else {
				strBuild.append(andSeparator.get(isocode));
			}
			strBuild.append(next);	
		}		
		return  strBuild.toString();
	}
	
	public static String SAPCaiStringify(SAPCaiTransformable t, LangIsocode isocode) {
		if(isocode==null) {
			isocode = defaultLanguage;
		}
		if(isocode==null) {
			return null;
		}
		return t.SAPCaiStringify(isocode);
	}
}
