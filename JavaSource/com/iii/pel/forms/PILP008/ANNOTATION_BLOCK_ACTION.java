package com.iii.pel.forms.PILP008;

import javax.faces.component.html.HtmlInputText;

public class ANNOTATION_BLOCK_ACTION {

	private HtmlInputText COMP_UI_M_M_ANNOTATION;

	private HtmlInputText COMP_ROWID;

	private ANNOTATION_BLOCK ANNOTATION_BLOCK_BEAN;

	public ANNOTATION_BLOCK_ACTION() {
		ANNOTATION_BLOCK_BEAN = new ANNOTATION_BLOCK();
	}

	public HtmlInputText getCOMP_UI_M_M_ANNOTATION() {
		return COMP_UI_M_M_ANNOTATION;
	}

	public void setCOMP_UI_M_M_ANNOTATION(HtmlInputText COMP_UI_M_M_ANNOTATION) {
		this.COMP_UI_M_M_ANNOTATION = COMP_UI_M_M_ANNOTATION;
	}

	public HtmlInputText getCOMP_ROWID() {
		return COMP_ROWID;
	}

	public void setCOMP_ROWID(HtmlInputText COMP_ROWID) {
		this.COMP_ROWID = COMP_ROWID;
	}

	public ANNOTATION_BLOCK getANNOTATION_BLOCK_BEAN() {
		return ANNOTATION_BLOCK_BEAN;
	}

	public void setANNOTATION_BLOCK_BEAN(ANNOTATION_BLOCK ANNOTATION_BLOCK_BEAN) {
		this.ANNOTATION_BLOCK_BEAN = ANNOTATION_BLOCK_BEAN;
	}
}
