package com.iii.pel.forms.PLM005;


import com.iii.premia.common.utils.CommonUtils;

public class PLM005_COMPOSITE_ACTION {
	

	
	private PM_IL_CURRENCY_ACTION PM_IL_CURRENCY_ACTION_BEAN;
	
	//private PLM005_CURRENCY_SEARCH_ACTION PLM005_CURRENCY_SEARCH_ACTION_BEAN;
	
	private PM_CURRENCY PM_CURRENCY_BEAN;
	
	private FM_EXCHANGE_RATE FM_EXCHANGE_RATE_BEAN;

	

	public PM_IL_CURRENCY_ACTION getPM_IL_CURRENCY_ACTION_BEAN() {
		return PM_IL_CURRENCY_ACTION_BEAN;
	}


	public void setPM_IL_CURRENCY_ACTION_BEAN(
			PM_IL_CURRENCY_ACTION pM_IL_CURRENCY_ACTION_BEAN) {
		PM_IL_CURRENCY_ACTION_BEAN = pM_IL_CURRENCY_ACTION_BEAN;
	}

	
	

	/*public PLM005_CURRENCY_SEARCH_ACTION getPLM005_CURRENCY_SEARCH_ACTION_BEAN() {
		return PLM005_CURRENCY_SEARCH_ACTION_BEAN;
	}


	public void setPLM005_CURRENCY_SEARCH_ACTION_BEAN(
			PLM005_CURRENCY_SEARCH_ACTION pLM005_CURRENCY_SEARCH_ACTION_BEAN) {
		PLM005_CURRENCY_SEARCH_ACTION_BEAN = pLM005_CURRENCY_SEARCH_ACTION_BEAN;
	}*/


	public PM_CURRENCY getPM_CURRENCY_BEAN() {
		return PM_CURRENCY_BEAN;
	}


	public void setPM_CURRENCY_BEAN(PM_CURRENCY pM_CURRENCY_BEAN) {
		PM_CURRENCY_BEAN = pM_CURRENCY_BEAN;
	}


	public FM_EXCHANGE_RATE getFM_EXCHANGE_RATE_BEAN() {
		return FM_EXCHANGE_RATE_BEAN;
	}


	public void setFM_EXCHANGE_RATE_BEAN(FM_EXCHANGE_RATE fM_EXCHANGE_RATE_BEAN) {
		FM_EXCHANGE_RATE_BEAN = fM_EXCHANGE_RATE_BEAN;
	}


	public PLM005_COMPOSITE_ACTION(){
		
		
		System.out.println("welcome to PLM005_COMPOSITE_ACTION");
		//this.PM_IL_CURRENCY_ACTION_BEAN = (PM_IL_CURRENCY_ACTION) new CommonUtils().getMappedBeanFromSession("PM_IL_CURRENCY_ACTION");
	
		
	PM_IL_CURRENCY_ACTION_BEAN = new PM_IL_CURRENCY_ACTION();
		
	PM_IL_CURRENCY_ACTION_BEAN.compositeAction = this;
	
		
	}
	
	
	
	
	


}