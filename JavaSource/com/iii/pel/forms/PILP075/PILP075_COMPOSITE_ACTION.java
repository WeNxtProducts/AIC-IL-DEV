package com.iii.pel.forms.PILP075;

public class PILP075_COMPOSITE_ACTION {

	private PT_IL_POL_CANC_REFN_ACTION PT_IL_POL_CANC_REFN_ACTION_BEAN;
	
	
	public PT_IL_POL_CANC_REFN_ACTION getPT_IL_POL_CANC_REFN_ACTION_BEAN() {
		return PT_IL_POL_CANC_REFN_ACTION_BEAN;
	}


	public void setPT_IL_POL_CANC_REFN_ACTION_BEAN(
			PT_IL_POL_CANC_REFN_ACTION pT_IL_POL_CANC_REFN_ACTION_BEAN) {
		PT_IL_POL_CANC_REFN_ACTION_BEAN = pT_IL_POL_CANC_REFN_ACTION_BEAN;
	}




	public PILP075_COMPOSITE_ACTION() {
		PT_IL_POL_CANC_REFN_ACTION_BEAN = new PT_IL_POL_CANC_REFN_ACTION();
		PT_IL_POL_CANC_REFN_ACTION_BEAN.compositeAction=this;
	
	}
}
