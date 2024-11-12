package com.iii.pel.forms.PILQ003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.component.UIData;
import javax.faces.component.UIInput;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import org.richfaces.component.html.HtmlCalendar;

import com.iii.apps.persistence.CRUDHandler;
import com.iii.premia.common.action.CommonAction;
import com.iii.premia.common.constants.PELConstants;
import com.iii.premia.common.errorUtil.ErrorHelpUtil;
import com.iii.premia.common.errorUtil.Messages;
import com.iii.premia.common.utils.CommonUtils;

public class PT_IL_POL_STATUS_2_ACTION extends CommonAction {

    private HtmlOutputLabel COMP_PS_STATUS_DT_LABEL;

    private HtmlCalendar COMP_PS_STATUS_DT;

    private HtmlOutputLabel COMP_PS_STATUS_UID_LABEL;

    private HtmlInputText COMP_PS_STATUS_UID;

    private HtmlOutputLabel COMP_PS_REMARKS_LABEL;

    private HtmlInputText COMP_PS_REMARKS;

    private PT_IL_POL_STATUS_2 PT_IL_POL_STATUS_2_BEAN;

    public PILQ003_COMPOSITE_ACTION compositeAction;

    private PT_IL_POL_STATUS_2_HELPER helper;

    private List<PT_IL_POL_STATUS_2> dataList_PT_IL_POL_STATUS_2 = new ArrayList<PT_IL_POL_STATUS_2>();

    private UIData dataTable;

    public PT_IL_POL_STATUS_2_ACTION() {

	PT_IL_POL_STATUS_2_BEAN = new PT_IL_POL_STATUS_2();
	helper = new PT_IL_POL_STATUS_2_HELPER();
	instantiateAllComponent();
    }

    public HtmlOutputLabel getCOMP_PS_STATUS_DT_LABEL() {
	return COMP_PS_STATUS_DT_LABEL;
    }

    public HtmlCalendar getCOMP_PS_STATUS_DT() {
	return COMP_PS_STATUS_DT;
    }

    public void setCOMP_PS_STATUS_DT_LABEL(
	    HtmlOutputLabel COMP_PS_STATUS_DT_LABEL) {
	this.COMP_PS_STATUS_DT_LABEL = COMP_PS_STATUS_DT_LABEL;
    }

    public void setCOMP_PS_STATUS_DT(HtmlCalendar COMP_PS_STATUS_DT) {
	this.COMP_PS_STATUS_DT = COMP_PS_STATUS_DT;
    }

    public HtmlOutputLabel getCOMP_PS_STATUS_UID_LABEL() {
	return COMP_PS_STATUS_UID_LABEL;
    }

    public HtmlInputText getCOMP_PS_STATUS_UID() {
	return COMP_PS_STATUS_UID;
    }

    public void setCOMP_PS_STATUS_UID_LABEL(
	    HtmlOutputLabel COMP_PS_STATUS_UID_LABEL) {
	this.COMP_PS_STATUS_UID_LABEL = COMP_PS_STATUS_UID_LABEL;
    }

    public void setCOMP_PS_STATUS_UID(HtmlInputText COMP_PS_STATUS_UID) {
	this.COMP_PS_STATUS_UID = COMP_PS_STATUS_UID;
    }

    public HtmlOutputLabel getCOMP_PS_REMARKS_LABEL() {
	return COMP_PS_REMARKS_LABEL;
    }

    public HtmlInputText getCOMP_PS_REMARKS() {
	return COMP_PS_REMARKS;
    }

    public void setCOMP_PS_REMARKS_LABEL(HtmlOutputLabel COMP_PS_REMARKS_LABEL) {
	this.COMP_PS_REMARKS_LABEL = COMP_PS_REMARKS_LABEL;
    }

    public void setCOMP_PS_REMARKS(HtmlInputText COMP_PS_REMARKS) {
	this.COMP_PS_REMARKS = COMP_PS_REMARKS;
    }

    public PT_IL_POL_STATUS_2 getPT_IL_POL_STATUS_2_BEAN() {
	return PT_IL_POL_STATUS_2_BEAN;
    }

    public void setPT_IL_POL_STATUS_2_BEAN(
	    PT_IL_POL_STATUS_2 PT_IL_POL_STATUS_2_BEAN) {
	this.PT_IL_POL_STATUS_2_BEAN = PT_IL_POL_STATUS_2_BEAN;
    }

    public List<PT_IL_POL_STATUS_2> getDataList_PT_IL_POL_STATUS_2() {
	return dataList_PT_IL_POL_STATUS_2;
    }

    public void setDataListPT_IL_POL_STATUS_2(
	    List<PT_IL_POL_STATUS_2> dataList_PT_IL_POL_STATUS_2) {
	this.dataList_PT_IL_POL_STATUS_2 = dataList_PT_IL_POL_STATUS_2;
    }

    public void addRow(ActionEvent event) {
	try {
	    if (isINSERT_ALLOWED()) {

		PT_IL_POL_STATUS_2_BEAN = new PT_IL_POL_STATUS_2();
		resetAllComponent();
		resetSelectedRow();
	    } else {

		getErrorMap().put(
			"addRow",
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$insertnotallowed"));
		getErrorMap().put(
			PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$insertnotallowed"));
	    }

	} catch (Exception exc) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    exc.getMessage());
	    getErrorMap().put("addRow", exc.getMessage());
	}

    }

    public void deleteRow(ActionEvent event) {
	try {
	    if (isDELETE_ALLOWED()) {

		new CRUDHandler().executeDelete(PT_IL_POL_STATUS_2_BEAN,
			CommonUtils.getConnection());
		getWarningMap().put(
			"deleteRow",
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$delete"));
		getWarningMap().put(
			PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$delete"));
		dataList_PT_IL_POL_STATUS_2.remove(PT_IL_POL_STATUS_2_BEAN);
		if (dataList_PT_IL_POL_STATUS_2.size() > 0) {

		    PT_IL_POL_STATUS_2_BEAN = dataList_PT_IL_POL_STATUS_2
			    .get(0);
		} else if (dataList_PT_IL_POL_STATUS_2.size() == 0) {

		    addRow(null);
		}

		resetAllComponent();
		PT_IL_POL_STATUS_2_BEAN.setRowSelected(true);
	    } else {

		getErrorMap().put(
			"deleteRow",
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$deletenotallowed"));
		getErrorMap().put(
			PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
			Messages.getString(
				PELConstants.pelMessagePropertiesPath,
				"errorPanel$message$deletenotallowed"));
	    }

	} catch (Exception exc) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    exc.getMessage());
	    getErrorMap().put("deleteRow", exc.getMessage());
	}

    }

    public void postRecord(ActionEvent event) {
    	String message = null;
	try {
	    if (PT_IL_POL_STATUS_2_BEAN.getROWID() == null && isINSERT_ALLOWED()) {
	    	helper.preInsert(compositeAction);
		new CRUDHandler().executeInsert(PT_IL_POL_STATUS_2_BEAN,CommonUtils.getConnection());
		message = Messages.getString(PELConstants.pelMessagePropertiesPath,"errorPanel$message$insert");
		dataList_PT_IL_POL_STATUS_2.add(PT_IL_POL_STATUS_2_BEAN);
		
	    } else if (PT_IL_POL_STATUS_2_BEAN.getROWID() != null && isUPDATE_ALLOWED()) {

		new CRUDHandler().executeUpdate(PT_IL_POL_STATUS_2_BEAN, CommonUtils.getConnection());
		message = Messages.getString(PELConstants.pelMessagePropertiesPath,"errorPanel$message$update");
	    }
	    getWarningMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,message);
		getWarningMap().put("postRecord", message);
	    PT_IL_POL_STATUS_2_BEAN.setRowSelected(true);
	} catch (Exception exc) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    "Record not Inserted/Updated :: " + exc.getMessage());
	    getErrorMap().put("postRecord",
		    "Record not Inserted/Updated :: " + exc.getMessage());
	}

    }

    public void displayRecords() {
	CommonUtils.clearMaps(this);
	try {
	    resetSelectedRow();
	    PT_IL_POL_STATUS_2_BEAN = (PT_IL_POL_STATUS_2) dataTable
		    .getRowData();
	    PT_IL_POL_STATUS_2_BEAN.setRowSelected(true);
	    resetAllComponent();
	} catch (Exception exc) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    exc.getMessage());
	    getErrorMap().put("displayRecords", exc.getMessage());
	}

    }

    private void resetSelectedRow() {
	Iterator<PT_IL_POL_STATUS_2> PT_IL_POL_STATUS_2_ITR = dataList_PT_IL_POL_STATUS_2
		.iterator();
	while (PT_IL_POL_STATUS_2_ITR.hasNext()) {
	    PT_IL_POL_STATUS_2_ITR.next().setRowSelected(false);
	}
    }

    private void resetAllComponent() {
	COMP_PS_STATUS_DT.resetValue();
	COMP_PS_STATUS_UID.resetValue();
	COMP_PS_REMARKS.resetValue();
    }

    public void setDataTable(UIData dataTable) {
	this.dataTable = dataTable;
    }

    public UIData getDataTable() {
	return dataTable;
    }

    public void saveRecord() {
    	String message = null;
	try {
		getErrorMap().clear();
		getWarningMap().clear();
		CommonUtils.getConnection().commit();
		message =Messages.getString(PELConstants.pelMessagePropertiesPath,"errorPanel$message$save");
		getWarningMap().put("SAVE",message);
		getWarningMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,message);
	} catch (Exception e) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    e.getMessage());
	    getErrorMap().put("SAVE", e.getMessage());
	}
    }

    
    public void fireFieldValidation(ActionEvent actionEvent) {
	UIInput input = (UIInput) actionEvent.getComponent().getParent();
	ErrorHelpUtil.validate(input, getErrorMap());
    }

    public void onLoad(PhaseEvent event) {
	try {
	    if (isBlockFlag()) {
		helper.executeQuery(compositeAction);
		/* The below trigger no need to call -- srinivas */
		//helper.whenNewBlockInstance(compositeAction);
		if (PT_IL_POL_STATUS_2_BEAN.getROWID()==null){
			helper.whenCreateRecord(compositeAction);
		}
		setBlockFlag(false);
	    }
	} catch (Exception e) {
	    getErrorMap().put(PELConstants.PEL_ERROR_WARNING_CURRENT_KEY,
		    e.getMessage());
	    getErrorMap().put("onLoad", e.getMessage());
	}
    }
    

	/**
	 * Disables all components in PT_IL_POL_STATUS_2_ACTION
	 */
	public void disableAllComponent(boolean disabled){
		// Disabling HtmlInputText
		COMP_PS_STATUS_UID.setDisabled(disabled);
		COMP_PS_REMARKS.setDisabled(disabled);

		// Disabling HtmlCalendar
		COMP_PS_STATUS_DT.setDisabled(disabled);

	}


	/**
	 * Instantiates all components in PT_IL_POL_STATUS_2_ACTION
	 */
	public void instantiateAllComponent(){
		// Instantiating HtmlInputText
		COMP_PS_STATUS_UID				 = new HtmlInputText();
		COMP_PS_REMARKS					 = new HtmlInputText();

		// Instantiating HtmlOutputLabel
		COMP_PS_STATUS_DT_LABEL				 = new HtmlOutputLabel();
		COMP_PS_STATUS_UID_LABEL			 = new HtmlOutputLabel();
		COMP_PS_REMARKS_LABEL				 = new HtmlOutputLabel();

		// Instantiating HtmlCalendar
		COMP_PS_STATUS_DT				 = new HtmlCalendar();

	}



}
