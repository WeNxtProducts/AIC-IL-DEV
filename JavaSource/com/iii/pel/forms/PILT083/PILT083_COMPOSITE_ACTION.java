package com.iii.pel.forms.PILT083;

import com.iii.premia.common.commonimpl.searchpageimpl.SearchConstants;




/**
 * @author 56180 
 *
 */
public class PILT083_COMPOSITE_ACTION {
	
	private SRST_HDR_ACTION SRST_HDR_ACTION_BEAN;
	private SUBSCRIPTION_ACTION SUBSCRIPTION_ACTION_BEAN;
	private SRST_REDEMPTION_ACTION REDEMPTION_ACTION_BEAN;
	private SRST_TOPUP_ACTION TOPUP_ACTION_BEAN;
	private SWITCHING_ACTION SWITCHING_ACTION_BEAN; 
	
	

	public PILT083_COMPOSITE_ACTION(){
		SRST_HDR_ACTION_BEAN=new SRST_HDR_ACTION();
		SRST_HDR_ACTION_BEAN.setCompositeAction(this);
		SUBSCRIPTION_ACTION_BEAN=new SUBSCRIPTION_ACTION();
		REDEMPTION_ACTION_BEAN=new SRST_REDEMPTION_ACTION();
		TOPUP_ACTION_BEAN=new SRST_TOPUP_ACTION();
		SWITCHING_ACTION_BEAN=new SWITCHING_ACTION();
	}

	public SUBSCRIPTION_ACTION getSUBSCRIPTION_ACTION_BEAN() {
		return SUBSCRIPTION_ACTION_BEAN;
	}

	public void setSUBSCRIPTION_ACTION_BEAN(
			SUBSCRIPTION_ACTION subscription_action_bean) {
		SUBSCRIPTION_ACTION_BEAN = subscription_action_bean;
	}

	

	public SRST_REDEMPTION_ACTION getREDEMPTION_ACTION_BEAN() {
		return REDEMPTION_ACTION_BEAN;
	}

	public void setREDEMPTION_ACTION_BEAN(
			SRST_REDEMPTION_ACTION rEDEMPTION_ACTION_BEAN) {
		REDEMPTION_ACTION_BEAN = rEDEMPTION_ACTION_BEAN;
	}

	

	public SRST_TOPUP_ACTION getTOPUP_ACTION_BEAN() {
		return TOPUP_ACTION_BEAN;
	}

	public void setTOPUP_ACTION_BEAN(SRST_TOPUP_ACTION tOPUP_ACTION_BEAN) {
		TOPUP_ACTION_BEAN = tOPUP_ACTION_BEAN;
	}

	public SWITCHING_ACTION getSWITCHING_ACTION_BEAN() {
		return SWITCHING_ACTION_BEAN;
	}

	public void setSWITCHING_ACTION_BEAN(SWITCHING_ACTION switching_action_bean) {
		SWITCHING_ACTION_BEAN = switching_action_bean;
	}




	public SRST_HDR_ACTION getSRST_HDR_ACTION_BEAN() {
		return SRST_HDR_ACTION_BEAN;
	}

	public String backToSearch() {
		return SearchConstants.BACK_TO_SEARCH_PAGE;

	}


	public void setSRST_HDR_ACTION_BEAN(SRST_HDR_ACTION srst_hdr_action_bean) {
		SRST_HDR_ACTION_BEAN = srst_hdr_action_bean;
	}

}