package jmcheynier.apps.portfolio.controllers.v2.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;

public abstract class SAPCaiObjectTransformer {
	
	public static final String defaultLanguage = "fr";
	static final String comaSeparator = ", ";
	static final HashMap<String, String> andSeparator = new HashMap<String , String>() {
		private static final long serialVersionUID = 1L;
	{
	    put("en",    " and ");
	    put("fr", " et ");
	}};
    
	
	public static String SAPCaiStringify(List<? extends SAPCaiTransformable> tList, String isocode) {
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
	
	public static String SAPCaiStringify(SAPCaiTransformable t, String isocode) {
		if(isocode==null) {
			isocode = defaultLanguage;
		}
		if(isocode==null) {
			return null;
		}
		return t.SAPCaiStringify(isocode);
	}
}
