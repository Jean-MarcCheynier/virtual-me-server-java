package jmcheynier.apps.portfolio.controllers.v2.utils;

import java.util.ArrayList;
import java.util.List;

import jmcheynier.apps.portfolio.models.SAP.SAPCaiTransformable;
import jmcheynier.apps.portfolio.models.enums.LangIsocode;

public class SAPCaiObjectWrapper<T extends SAPCaiTransformable> {
	
	private List<T> results;
	private String SAPCaiStringified;
	
	
	public SAPCaiObjectWrapper(T object, LangIsocode isocode) {
		if(object != null) {
			this.results = new ArrayList<T>();
			this.results.add(object);
			this.setSAPCaiStringified(SAPCaiObjectTransformer.SAPCaiStringify(object, isocode));
		}
	}

	
	public SAPCaiObjectWrapper(List<T> object, LangIsocode isocode) {
		this.results = object;
		this.setSAPCaiStringified(SAPCaiObjectTransformer.SAPCaiStringify(object, isocode));
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	public String getSAPCaiStringified() {
		return SAPCaiStringified;
	}

	public void setSAPCaiStringified(String sAPCaiStringified) {
		SAPCaiStringified = sAPCaiStringified;
	}
	
	
	

}
