package com.iii.pel.forms.PILM013_APAC;

public interface PM_IL_DOC_SETUP_CONSTANTS {

	String FORM_PILM013_APAC="PILM013_APAC";
	
	String PILM013_APAC$PM_IL_DOC_NO$DOC_NO="PM_IL_DOC_NO_SETUP";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_LEVEL_1="PM_IL_DOC_NO_SETUP.DNS_LEVEL_1";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_LEVEL_2="PM_IL_DOC_NO_SETUP.DNS_LEVEL_2";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_LEVEL_3="PM_IL_DOC_NO_SETUP.DNS_LEVEL_3";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_LEVEL_4="PM_IL_DOC_NO_SETUP.DNS_LEVEL_4";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_LEVEL_5="PM_IL_DOC_NO_SETUP.DNS_LEVEL_5";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_L1_ATTACH_YN="PM_IL_DOC_NO_SETUP.DNS_L1_ATTACH_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_L2_ATTACH_YN="PM_IL_DOC_NO_SETUP.DNS_L2_ATTACH_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_L3_ATTACH_YN="PM_IL_DOC_NO_SETUP.DNS_L3_ATTACH_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_L4_ATTACH_YN="PM_IL_DOC_NO_SETUP.DNS_L4_ATTACH_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_L5_ATTACH_YN="PM_IL_DOC_NO_SETUP.DNS_L5_ATTACH_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_PREFIX_YN="PM_IL_DOC_NO_SETUP.DNS_PREFIX_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_PAD_YN="PM_IL_DOC_NO_SETUP.DNS_PAD_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_CHK_DIGIT_YN="PM_IL_DOC_NO_SETUP.DNS_CHK_DIGIT_YN";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_YEAR_NUM="PM_IL_DOC_NO_SETUP.DNS_YEAR_NUM";
	
	String PILM013_APAC$PM_IL_DOC_NO$DNS_ATTACH_SEQ_LEVEL="PM_IL_DOC_NO_SETUP.DNS_ATTACH_SEQ_LEVEL";
	
	
	/* LOV Queries */
	
	/*String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY1="SELECT DIVN_CODE, DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = SUBSTR('001',1,3) AND DIVN_FRZ_FLAG = 'N'";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY2="SELECT DIVN_CODE, DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = SUBSTR('001',1,3) AND DIVN_FRZ_FLAG = 'N' AND DIVN_CODE LIKE ?";
	*/
	//[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Shankar.B 31-Mar-2009

	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY1="SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = SUBSTR('001',1,3) AND DIVN_FRZ_FLAG = 'N'";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY2="SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = SUBSTR('001',1,3) AND DIVN_FRZ_FLAG = 'N' AND DIVN_CODE LIKE ?";
	
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY3="SELECT CLASS_CODE, CLASS_NAME FROM PM_IL_CLASS WHERE  NVL(CLASS_FRZ_FLAG,'N') = 'N'";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY4="SELECT CLASS_CODE, CLASS_NAME FROM PM_IL_CLASS WHERE  NVL(CLASS_FRZ_FLAG,'N') = 'N' AND CLASS_CODE LIKE ?";
	
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY5="SELECT PLAN_CODE,COVER_DESC FROM PM_IL_COVER, PM_IL_PLAN WHERE COVER_CODE = PLAN_CODE AND COVER_TYPE = 'B' AND NVL(PLAN_FRZ_FLAG,'N') = 'N'";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY6="SELECT PLAN_CODE,COVER_DESC FROM PM_IL_COVER, PM_IL_PLAN WHERE COVER_CODE = PLAN_CODE AND COVER_TYPE = 'B' AND NVL(PLAN_FRZ_FLAG,'N') = 'N' AND PLAN_CODE LIKE ?";
	
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY7="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_CLM_TYPE'";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY8="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_CLM_TYPE' AND PS_CODE LIKE ?";
	
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY9="select PROD_CODE,PROD_DESC from PM_IL_PRODUCT";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY10="select PROD_CODE,PROD_DESC from PM_IL_PRODUCT  where  PROD_CODE LIKE ?";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$POST_QUERY$PROD_CODE="select PROD_DESC from PM_IL_PRODUCT  where  PROD_CODE = ?";
	
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY11="select DS_CODE,DS_DESC from PM_IL_DOC_SETUP";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$DNR_LEVEL1_QUERY12="select DS_CODE,DS_DESC from PM_IL_DOC_SETUP  where  DS_CODE LIKE ?";
	String PILM013_APAC$PM_IL_DOC_NO_RANGE$POST_QUERY$DOC_CODE="select DS_DESC from PM_IL_DOC_SETUP  where  DS_CODE=?";
	
	/* Document Setup */
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_CODE="SELECT 1 FROM   PM_IL_DOC_SETUP WHERE  DS_TYPE = ? AND DS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_TYPE="SELECT 'X' FROM  PP_SYSTEM  WHERE  PS_TYPE  = 'IL_DOC_TYP'  AND PS_CODE  = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_TYPE$LOV1="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_DOC_TYP'";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_TYPE$LOV2="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_DOC_TYP' AND PS_CODE LIKE ?";
	
	
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_END_TYPE="SELECT PS_CODE_DESC FROM  PP_SYSTEM  WHERE  PS_TYPE  = 'IL_END_TYP'  AND PS_CODE  = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_END_TYPE$LOV1="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_END_TYP'";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_END_TYPE$LOV2="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_END_TYP' AND PS_CODE LIKE ?";
	
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_POL_CODE$LOV1="SELECT DS_CODE,DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_TYPE = '2' OR DS_TYPE = '1'  AND  NVL(DS_FRZ_FLAG ,'N') ='N' ORDER BY 1 ASC";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_POL_CODE$LOV2="SELECT DS_CODE,DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_CODE LIKE ? AND(DS_TYPE = '2' OR DS_TYPE = '1' ) AND  NVL(DS_FRZ_FLAG ,'N') ='N'  ORDER BY 1 ASC";
	
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_POL_CODE$WHEN_VALIDATE_ITEM_QUERY1="SELECT 'X' FROM  PM_IL_DOC_SETUP  WHERE  DS_TYPE  = '2'  AND DS_CODE  = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_POL_CODE$WHEN_VALIDATE_ITEM_QUERY2="SELECT 'X' FROM  PM_IL_DOC_SETUP  WHERE  DS_TYPE  IN ( '1'  , '2'  )  AND DS_CODE  = ?";
	
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_CLM_PAR_SET$LOV1="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_ADDL_STAT' AND PS_VALUE = '4'";
	String PILM013_APAC$PM_IL_DOC_SETUP$DS_CLM_PAR_SET$LOV2="SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_ADDL_STAT' AND PS_VALUE = '4' AND PS_CODE LIKE ?";
	
	/* SEARCH PAGE QUERIES */
	String PILM013_APAC$PM_IL_DOC_SETUP$SEARCH_PAGE$FETCH1="SELECT DS_TYPE, DS_CODE, DS_DESC, ROWID FROM PM_IL_DOC_SETUP where DS_TYPE LIKE ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$SEARCH_PAGE$FETCH2="SELECT DS_TYPE, DS_CODE, DS_DESC, ROWID FROM PM_IL_DOC_SETUP where DS_CODE LIKE ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$SEARCH_PAGE$FETCH3="SELECT DS_TYPE, DS_CODE, DS_DESC, ROWID FROM PM_IL_DOC_SETUP where DS_TYPE LIKE ? AND DS_CODE LIKE ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$SEARCH_PAGE$FETCH4="SELECT DS_TYPE, DS_CODE, DS_DESC, ROWID FROM PM_IL_DOC_SETUP";
	
	
	String BUNDLE_NAME_PATH="com.iii.premia.common.errorUtil.PELErrorMessages";
	
	/* Combo box and LOV related codes */
	String PILM013_APAC$PM_IL_DOC_SETUP$FORM_NAME="PILM013_APAC";
	String PILM013_APAC$PM_IL_DOC_SETUP$BLOCK_NAME="PM_IL_DOC_SETUP";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_USE_SEQ_YN="PM_IL_DOC_SETUP.DS_USE_SEQ_YN";
	
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_CURR_RATE_BS="PM_IL_DOC_SETUP.DS_CURR_RATE_BS";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_POST_BO="PM_IL_DOC_SETUP.DS_POST_BO";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_BROKER_YN="PM_IL_DOC_SETUP.DS_BROKER_YN";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_PRN_BEFORE_APPR="PM_IL_DOC_SETUP.DS_PRN_BEFORE_APPR";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_REPRINT_YN="PM_IL_DOC_SETUP.DS_REPRINT_YN";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_AGE_RECALC_YN="PM_IL_DOC_SETUP.DS_AGE_RECALC_YN";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_FUND_TYPE="PM_IL_DOC_SETUP.DS_FUND_TYPE";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_REFUND_PREM_FLAG="PM_IL_DOC_SETUP.DS_REFUND_PREM_FLAG";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_REFUND_SURPLUS_FLAG="PM_IL_DOC_SETUP.DS_REFUND_SURPLUS_FLAG";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_REFUND_DEP_FLAG="PM_IL_DOC_SETUP.DS_REFUND_DEP_FLAG";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_RECVR_CHRG_FLAG="PM_IL_DOC_SETUP.DS_RECVR_CHRG_FLAG";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_RECVR_MEDFEE_YN="PM_IL_DOC_SETUP.DS_RECVR_MEDFEE_YN";
	String PILM013_APAC$PM_IL_DOC_SETUP$FIELD_NAME$DS_RECVR_COMM_FLAG="PM_IL_DOC_SETUP.DS_RECVR_COMM_FLAG";
	String PILM013_APAC$PM_IL_DOC_SETUP$SEARCH_PAGE$NAVIGATE="SELECT DS_TYPE, DS_CODE, DS_DESC, DS_SHORT_DESC, DS_PRN_BEFORE_APPR, DS_REPRINT_YN, DS_POST_BO, " +
			"DS_CURR_RATE_BS, DS_POL_CODE, DS_END_TYPE, DS_BROKER_YN, DS_CR_DT, DS_UPD_DT," +
			" DS_FUND_TYPE, DS_REFUND_PREM_FLAG, DS_REFUND_SURPLUS_FLAG, DS_REFUND_DEP_FLAG, " +
			"DS_RECVR_CHRG_FLAG, DS_RECVR_MEDFEE_YN, DS_RECVR_COMM_FLAG, DS_AGE_RECALC_YN," +
			" DS_USE_SEQ_YN, DS_CLM_PARSET, DS_CLM_FULSET, ROWID,DS_EFF_FM_DT,DS_EFF_TO_DT,DS_END_REASON FROM PM_IL_DOC_SETUP WHERE ROWID=?";
	String PILM013_APAC$PM_IL_DOC_SETUP$COMBO_BOX$QUERY="SELECT LIV_CODE,LIV_CODE_DESC FROM PP_LIST_ITEM,PP_LIST_ITEM_VALUES WHERE LI_SYS_PARAM = LIV_SYS_PARAM AND LI_MODULE_NAME = ? AND LI_BLOCK_NAME = ? AND LI_ITEM_NAME = ?";
	
	/*
	 * Code Added by AMEETT BENDRE on 31.10.2008 12:28 PM.
	 */
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$DOC_SETUP = "DELETE FROM PM_IL_DOC_SETUP WHERE DS_TYPE = ? AND DS_CODE = ?";
	
	// Code Changed by AMEETT BENDRE on 31.10.2008 12:29
//	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$DOC_SETUP = "DELETE FROM PM_IL_DOC_NO_SETUP WHERE DNS_TYPE = ? and DNS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$DOC_NO_SETUP = "DELETE FROM PM_IL_DOC_NO_SETUP WHERE DNS_TYPE = ? and DNS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$DOC_NO_RANGE = "DELETE FROM PM_IL_DOC_NO_RANGE WHERE DNR_TYPE = ? and DNR_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$DOC_DFLT_CHRG = "DELETE FROM PM_IL_DOC_DFLT_CHARGE P WHERE P.DDCHG_DS_TYPE = ? and P.DDCHG_DS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$MED_HIST = "DELETE FROM PM_IL_DOC_MED_HIST P WHERE P.DMH_DS_TYPE = ? and P.DMH_DS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$TODO_GROUP = "DELETE FROM PM_IL_DOC_TODO_GROUP P WHERE P.DTG_DS_TYPE = ? and P.DTG_DS_CODE = ?";
	String PILM013_APAC$PM_IL_DOC_SETUP$PRE_DELETE$REMINDERS = "DELETE FROM PM_IL_DOC_REMINDERS P  WHERE P.DR_DS_TYPE = ? and P.DR_DS_CODE = ?";
}

