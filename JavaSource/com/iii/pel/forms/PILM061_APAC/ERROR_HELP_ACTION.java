package com.iii.pel.forms.PILM061_APAC;

import javax.faces.component.html.HtmlCommandButton;

import com.iii.premia.common.action.CommonAction;

public class ERROR_HELP_ACTION extends CommonAction {

	private HtmlCommandButton COMP_UI_M_BUT_ERROR_CLOSE;

	private HtmlCommandButton COMP_UI_M_EDIT_BUT_ERROR_MSG;

	private ERROR_HELP ERROR_HELP_BEAN;

	public ERROR_HELP_ACTION() {
		ERROR_HELP_BEAN = new ERROR_HELP();
	}

	public HtmlCommandButton getCOMP_UI_M_BUT_ERROR_CLOSE() {
		return COMP_UI_M_BUT_ERROR_CLOSE;
	}

	public void setCOMP_UI_M_BUT_ERROR_CLOSE(HtmlCommandButton COMP_UI_M_BUT_ERROR_CLOSE) {
		this.COMP_UI_M_BUT_ERROR_CLOSE = COMP_UI_M_BUT_ERROR_CLOSE;
	}

	public HtmlCommandButton getCOMP_UI_M_EDIT_BUT_ERROR_MSG() {
		return COMP_UI_M_EDIT_BUT_ERROR_MSG;
	}

	public void setCOMP_UI_M_EDIT_BUT_ERROR_MSG(HtmlCommandButton COMP_UI_M_EDIT_BUT_ERROR_MSG) {
		this.COMP_UI_M_EDIT_BUT_ERROR_MSG = COMP_UI_M_EDIT_BUT_ERROR_MSG;
	}

	public ERROR_HELP getERROR_HELP_BEAN() {
		return ERROR_HELP_BEAN;
	}

	public void setERROR_HELP_BEAN(ERROR_HELP ERROR_HELP_BEAN) {
		this.ERROR_HELP_BEAN = ERROR_HELP_BEAN;
	}
}