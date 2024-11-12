package com.iii.pel.forms.PILM022;

public interface PM_IL_PREM_ACCOUNT_SETUP_CONSTANTS {
	
	String PILM022$PM_IL_PREM_ACCOUNT$COMBO_BOX$QUERY = "SELECT LIV_CODE,LIV_CODE_DESC FROM PP_LIST_ITEM,PP_LIST_ITEM_VALUES WHERE LI_SYS_PARAM = LIV_SYS_PARAM AND LI_MODULE_NAME = ? AND LI_BLOCK_NAME = ? AND LI_ITEM_NAME = ?";
	String PILM022$PM_IL_PREM_ACCOUNT$COMBO_BOX$QUERY$PAS_ASSURED_TYPE = "SELECT LIV_CODE, LIV_CODE_DESC FROM PP_LIST_ITEM_VALUES WHERE LIV_SYS_PARAM = 'IL_ASSR_TYP'";
	String PILM022$PM_IL_PREM_ACCOUNT$SEARCH_PAGE$QUERY = "SELECT PAS_MAIN_ACNT_CODE, PAS_SUB_ACNT_CODE, PAS_DIVN_CODE, ROWID FROM PM_IL_PREM_ACCOUNT_SETUP";
	String PILM022$PM_IL_PREM_ACCOUNT$SEARCH_PAGE$NAVIGATETOMAIN$QUERY = "SELECT PAS_BUS_FM_CODE,PAS_BUS_TO_CODE,PAS_DIVN_FM_CODE,PAS_DIVN_TO_CODE,PAS_DEPT_FM_CODE,PAS_DEPT_TO_CODE,PAS_DOC_FM_TYPE,PAS_DOC_TO_TYPE,PAS_FORCE_DIVN_YN,PAS_FORCE_DEPT_YN,PAS_MAIN_ACNT_CODE,PAS_SUB_ACNT_CODE,PAS_DIVN_CODE,PAS_DEPT_CODE,PAS_ANLY_CODE_1,PAS_ANLY_CODE_2,PAS_ACTY_CODE_1,PAS_ACTY_CODE_2,PAS_FRZ_FLAG,PAS_CR_DT,PAS_CR_UID,PAS_UPD_DT,PAS_UPD_UID,PAS_PLAN_TYPE,PAS_PLAN_CODE_FM,PAS_PLAN_CODE_TO,PAS_PLAN_YRS_FM,PAS_PLAN_YRS_TO,PAS_ASSURED_TYPE,PAS_SRC_BUS_FM,PAS_SRC_BUS_TO,PAS_PROD_CODE_FM,PAS_PROD_CODE_TO,PAS_END_FM_CODE,PAS_END_TO_CODE,PAS_NB_END_FLAG,PAS_FIRST_PREM_YN,PAS_CUST_CLS_FM_CODE,PAS_CUST_CLS_TO_CODE, ROWID FROM PM_IL_PREM_ACCOUNT_SETUP WHERE ROWID = ?";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_END_CODE = "SELECT 'X' FROM  PM_IL_DOC_SETUP WHERE  DS_TYPE = 3 AND  DS_CODE = ?";
	
	// Suggestion Box Queries
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SRC_BUS_FM$LOV1 = "SELECT PC_CODE, PC_DESC FROM PM_CODES WHERE PC_TYPE = 'SRC_BUS_TY'  AND NVL(PC_FRZ_FLAG,'N') = 'N' ORDER BY PC_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SRC_BUS_FM$LOV2 = "SELECT PC_CODE, PC_DESC FROM PM_CODES WHERE PC_TYPE = 'SRC_BUS_TY'  AND NVL(PC_FRZ_FLAG,'N') = 'N' AND PC_CODE LIKE ? ORDER BY PC_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SRC_BUS_TO$LOV1 = "SELECT PC_CODE, PC_DESC FROM PM_CODES WHERE PC_TYPE = 'SRC_BUS_TY' AND NVL(PC_FRZ_FLAG,'N') = 'N' ORDER BY PC_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SRC_BUS_TO$LOV2 = "SELECT PC_CODE, PC_DESC FROM PM_CODES WHERE PC_TYPE = 'SRC_BUS_TY' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND PC_CODE LIKE ? ORDER BY PC_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_BUS_FM_CODE$LOV1 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_BUSINES' ORDER BY PS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_BUS_FM_CODE$LOV2 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_BUSINES' AND PS_CODE LIKE ? ORDER BY PS_CODE";
	
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_BUS_TO_CODE$LOV1 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_BUSINES' ORDER BY PS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_BUS_TO_CODE$LOV2 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_BUSINES' AND PS_CODE LIKE ? ORDER BY PS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_FM_CODE$COMPANY_CODE = "001";
	//[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Shankar.B 31-Mar-2009
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_FM_CODE$LOV1 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL ,ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') ORDER BY DIVN_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_FM_CODE$LOV2 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL ,ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DIVN_CODE LIKE ? ORDER BY DIVN_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_TO_CODE$LOV1 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') ORDER BY DIVN_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_TO_CODE$LOV2 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DIVN_CODE LIKE ? ORDER BY DIVN_CODE";

	//[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DEPARTMENT to FM_DEPARTMENT. Added by : Shankar.B 31-Mar-2009
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_FM_CODE$LOV1 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') ORDER BY DEPT_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_FM_CODE$LOV2 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DEPT_CODE LIKE ? ORDER BY DEPT_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_TO_CODE$LOV1 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') ORDER BY DEPT_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_TO_CODE$LOV2 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DEPT_CODE LIKE ? ORDER BY DEPT_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DOC_FM_TYPE$LOV1 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_TYPE = '2' OR DS_TYPE = NULL  AND  NVL(DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DOC_FM_TYPE$LOV2 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE NVL(DS_TYPE,'2') = '2' AND DS_CODE LIKE ? AND  NVL (DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DOC_TO_TYPE$LOV1 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_TYPE = '2' OR DS_TYPE = NULL AND  NVL(DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DOC_TO_TYPE$LOV2 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE NVL(DS_TYPE,'2') = '2' AND DS_CODE LIKE ? AND  NVL (DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PROD_CODE_FM$LOV1 = "SELECT PROD_CODE, PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL ORDER BY PROD_CODE ASC";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PROD_CODE_FM$LOV2 = "SELECT PROD_CODE, PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL AND PROD_CODE LIKE ? ORDER BY PROD_CODE ASC";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PROD_CODE_TO$LOV1 = "SELECT PROD_CODE, PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL ORDER BY PROD_CODE ASC";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PROD_CODE_TO$LOV2 = "SELECT PROD_CODE, PROD_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL AND PROD_CODE LIKE ? ORDER BY PROD_CODE ASC";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_CODE_FM$LOV1 = "SELECT COVER_CODE, COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG='N' AND COVER_CODE IN (SELECT PAC_COVER_CODE FROM PM_IL_PROD_APPL_COVER WHERE PAC_PROD_CODE  BETWEEN ? AND ?) ORDER BY COVER_CODE ASC";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_CODE_FM$LOV2 = "SELECT COVER_CODE, COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG='N' AND COVER_CODE LIKE ? AND COVER_CODE IN (SELECT PAC_COVER_CODE FROM PM_IL_PROD_APPL_COVER WHERE PAC_PROD_CODE  BETWEEN ? AND ?) ORDER BY COVER_CODE ASC";
	
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_CODE_TO$LOV1 = "SELECT COVER_CODE, COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG='N' AND COVER_CODE IN (SELECT PAC_COVER_CODE FROM PM_IL_PROD_APPL_COVER WHERE PAC_PROD_CODE  BETWEEN ? AND ?) ORDER BY COVER_CODE ASC";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_CODE_TO$LOV2 = "SELECT COVER_CODE, COVER_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG='N' AND COVER_CODE LIKE ? AND COVER_CODE IN (SELECT PAC_COVER_CODE FROM PM_IL_PROD_APPL_COVER WHERE PAC_PROD_CODE  BETWEEN ? AND ?) ORDER BY COVER_CODE ASC";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_CUST_CLS_FM_CODE$LOV1 = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG='N' ORDER BY CCLAS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_CUST_CLS_FM_CODE$LOV2 = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG='N' AND CCLAS_CODE LIKE ? ORDER BY CCLAS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_CUST_CLS_TO_CODE$LOV1 = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG='N' ORDER BY CCLAS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_CUST_CLS_TO_CODE$LOV2 = "SELECT CCLAS_CODE,CCLAS_CLASS_DESC FROM PM_CUST_CLASS WHERE CCLAS_FRZ_FLAG='N' AND CCLAS_CODE LIKE ? ORDER BY CCLAS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_END_FM_CODE$LOV1 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_TYPE = '3' OR DS_TYPE = NULL  AND  NVL(DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_END_FM_CODE$LOV2 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE NVL(DS_TYPE,'3') = '3' AND DS_CODE LIKE ? AND  NVL (DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_END_TO_CODE$LOV1 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE DS_TYPE = '3' OR DS_TYPE = NULL AND  NVL(DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_END_TO_CODE$LOV2 = "SELECT DS_CODE, DS_DESC FROM PM_IL_DOC_SETUP WHERE NVL(DS_TYPE,'3') = '3' AND DS_CODE LIKE ? AND  NVL (DS_FRZ_FLAG ,'N') ='N' ORDER BY DS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_TYPE$LOV1 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'ILPLANTYPE' ORDER BY PS_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_PLAN_TYPE$LOV2 = "SELECT PS_CODE, PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'ILPLANTYPE' AND PS_CODE LIKE ? ORDER BY PS_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_MAIN_ACNT_CODE$LOV1 = "SELECT MAIN_ACNT_CODE, MAIN_ACNT_NAME FROM FM_MAIN_ACCOUNT WHERE NVL(MAIN_FRZ_FLAG,'N') = 'N' AND ROWNUM < 20 ORDER BY MAIN_ACNT_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_MAIN_ACNT_CODE$LOV2 = "SELECT MAIN_ACNT_CODE, MAIN_ACNT_NAME FROM FM_MAIN_ACCOUNT WHERE NVL(MAIN_FRZ_FLAG,'N') = 'N' AND MAIN_ACNT_CODE LIKE ? ORDER BY MAIN_ACNT_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SUB_ACNT_CODE$LOV1 = "SELECT SUB_ACNT_CODE, SUB_ACNT_NAME FROM FM_SUB_ACCOUNT WHERE SUB_ACNT_CODE IN (SELECT MS_SUB_ACNT_CODE FROM  FM_MAIN_SUB WHERE MS_MAIN_ACNT_CODE = ?) AND NVL(SUB_FRZ_FLAG,'N') = 'N' AND ROWNUM < 20 ORDER BY SUB_ACNT_CODE ";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_SUB_ACNT_CODE$LOV2 = "SELECT SUB_ACNT_CODE, SUB_ACNT_NAME FROM FM_SUB_ACCOUNT WHERE SUB_ACNT_CODE IN (SELECT MS_SUB_ACNT_CODE FROM  FM_MAIN_SUB WHERE MS_MAIN_ACNT_CODE = ?) AND NVL(SUB_FRZ_FLAG,'N') = 'N' AND SUB_ACNT_CODE LIKE ? AND ROWNUM < 20 ORDER BY SUB_ACNT_CODE AND";
	//[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Shankar.B 31-Mar-2009
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_CODE$LOV1 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N')  AND ROWNUM < 20 ORDER BY DIVN_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DIVN_CODE$LOV2 = "SELECT DIVN_CODE, DIVN_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND NVL(DIVN_FRZ_FLAG, 'N') = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DIVN_CODE AND ADS_USER_ID = NVL(NULL, ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DIVN_CODE LIKE ?   AND ROWNUM < 20 ORDER BY DIVN_CODE";
	//[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DEPARTMENT to FM_DEPARTMENT. Added by : Shankar.B 31-Mar-2009
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_CODE$LOV1 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND	ADS_USER_ID = NVL(NULL ,ADS_USER_ID) AND ADS_FRZ_FLAG = 'N')  AND ROWNUM < 20 ORDER BY DEPT_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_DEPT_CODE$LOV2 = "SELECT DEPT_CODE, DEPT_NAME FROM FM_DEPARTMENT WHERE DEPT_COMP_CODE = ? AND DEPT_DIVN_CODE = ? AND DEPT_FRZ_FLAG  = 'N' AND EXISTS (SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE ADS_DIVN_CODE = DEPT_DIVN_CODE AND ADS_DEPT_CODE = DEPT_CODE AND	ADS_USER_ID = NVL(NULL ,ADS_USER_ID) AND ADS_FRZ_FLAG = 'N') AND DEPT_CODE LIKE ?  AND ROWNUM < 20 ORDER BY DEPT_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ANLY_CODE_1$LOV1 = "SELECT ANLY_CODE, ANLY_NAME FROM FM_ANALYSIS WHERE ANLY_HEAD_NO = '1' AND NVL(ANLY_FRZ_FLAG,'N') = 'N'  AND ROWNUM < 20 ORDER BY ANLY_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ANLY_CODE_1$LOV2 = "SELECT ANLY_CODE, ANLY_NAME FROM FM_ANALYSIS WHERE ANLY_HEAD_NO = '1' AND NVL(ANLY_FRZ_FLAG,'N') = 'N' AND ANLY_CODE LIKE ?  AND ROWNUM < 20 ORDER BY ANLY_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ANLY_CODE_2$LOV1 = "SELECT ANLY_CODE, ANLY_NAME FROM FM_ANALYSIS WHERE ANLY_HEAD_NO = '2' AND NVL(ANLY_FRZ_FLAG,'N') = 'N'   AND  ROWNUM < 20 ORDER BY ANLY_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ANLY_CODE_2$LOV2 = "SELECT ANLY_CODE, ANLY_NAME FROM FM_ANALYSIS WHERE ANLY_HEAD_NO = '2' AND NVL(ANLY_FRZ_FLAG,'N') = 'N' AND ANLY_CODE LIKE ? AND ROWNUM < 20 ORDER BY ANLY_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ACTY_CODE_1$LOV1 = "SELECT PROD_CODE, PROD_DESC FROM PM_GL_PRODUCT WHERE 1=1  AND ROWNUM < 20 ORDER BY PROD_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ACTY_CODE_1$LOV2 = "SELECT PROD_CODE, PROD_DESC FROM PM_GL_PRODUCT WHERE 1=1 AND PROD_CODE LIKE ? AND ROWNUM < 20 ORDER BY PROD_CODE";

	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ACTY_CODE_2$LOV1 = "SELECT PROD_CODE, PROD_DESC FROM PM_GL_PRODUCT WHERE 1=1 AND ROWNUM < 20 ORDER BY PROD_CODE";
	String PILM022$PM_IL_PREM_ACCOUNT$PAS_ACTY_CODE_2$LOV2 = "SELECT PROD_CODE, PROD_DESC FROM PM_GL_PRODUCT WHERE 1=1 AND PROD_CODE LIKE ? AND ROWNUM < 20 ORDER BY PROD_CODE";

	String PILM023$PM_IL_PREM_ACCOUNTS$DEFAULT_ZZZZZZ="zzzzzz";
}