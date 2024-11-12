package com.iii.pel.forms.PILT006_APAC;

public interface PILT006_APAC_SQL_CONSTANTS {
	
	String SETTLEMENT_WHEN_BUT_PRESSED_SELECT_QUERY = "SELECT 'X' FROM  PT_IL_CLAIM_PAID WHERE CP_CLAIM_SYS_ID = ? AND CP_APPR_FLAG = 'A' AND CP_CLM_PAID_STATUS  = 'A' ";
	
	String CLOSE_WHEN_BUT_PRESSED_SELECT_QUERY = "SELECT 'X' FROM  PM_IL_APPR_SETUP_DET  WHERE  ASD_USER_ID  = ?  AND ASD_CODE  = 'CLM_CLO_OPEN'  AND ASD_CHAR_VALUE  = 'Y' ";
	
	String FREEZE_WHEN_BUT_PRESSED_SELECT_QUERY1 = "SELECT POL_FAC_YN FROM  PT_IL_POLICY  WHERE  POL_SYS_ID  = ? ";
	
	String FREEZE_WHEN_BUT_PRESSED_SELECT_QUERY2 = "SELECT CCD_COVER_CODE,CCD_LOSS_TYPE, CCD_DISAB_TYPE FROM PT_IL_CLAIM_COVER_DTLS WHERE CCD_CLAIM_SYS_ID  = ? ";
	
	String FREEZE_WHEN_BUT_PRESSED_SELECT_QUERY3 = "SELECT CR_POLICY_VALID_YN,CR_PREM_PAYABLE_YN FROM  PM_IL_CLM_REPAY  WHERE CR_COVER_CODE  = ?  AND CR_LOSS_TYPE  = ?  AND CR_DISABLE_TYPE  = ? AND NVL(CR_POLICY_VALID_YN, 'N')  = 'Y'  AND NVL(CR_PREM_PAYABLE_YN, 'N')  = 'N' ";
	
	String FREEZE_WHEN_BUT_PRESSED_UPDATE_QUERY1 = "UPDATE PT_IL_POLICY SET POL_PREM_WAIVE_YN = 'Y' WHERE POL_SYS_ID  = ? ";
	
	String FREEZE_WHEN_BUT_PRESSED_UPDATE_QUERY2 = "UPDATE PT_IL_POLICY SET POL_STATUS = 'D' WHERE POL_NO = ? ";
	
	String FREEZE_WHEN_BUT_PRESSED_UPDATE_QUERY3 = "UPDATE PT_IL_PREM_COLL SET PC_PAID_FLAG = 'Y', PC_PAID_DT = ? WHERE PC_SCHD_PYMT_DT < ? AND PC_POL_SYS_ID  = ? AND NVL(PC_PAID_FLAG, 'N')  != 'A'  ";
	
	String FREEZE_WHEN_BUT_PRESSED_DELETE_QUERY = "DELETE FROM PT_IL_PREM_COLL WHERE PC_SCHD_PYMT_DT  >= ?  AND PC_POL_SYS_ID  = ? ";
	
	String POLICY_DTLS_WHEN_BUT_PRESSED_SELECT_QUERY = "SELECT POL_DS_CODE,POL_DS_TYPE,POL_PLAN_CODE,POL_PROD_CODE FROM PT_IL_POLICY WHERE POL_SYS_ID  = ? ";
	
	String PT_IL_CLAIM_STATUS_CODE_LOV_QUERY = "SELECT PS_CODE, PS_CODE_DESC, PS_BL_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_ADDL_STAT' AND PS_VALUE = '4' ";
	
	String PT_IL_CLAIM_STATUS_CODE_LOV_SUGGESTION_QUERY = "SELECT PS_CODE, PS_CODE_DESC, PS_BL_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE = 'IL_ADDL_STAT' AND PS_VALUE = '4' AND PS_CODE LIKE ? ";
	
	String PT_IL_CLAIM_REASON_CODE_LOV_QUERY = "SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES WHERE PC_TYPE= 'IL_REASON' AND NVL(PC_FRZ_FLAG,'N') = 'N'";

	String PT_IL_CLAIM_REASON_CODE_LOV_SUGGESTION_QUERY = "SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES WHERE PC_TYPE= 'IL_REASON' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND PC_CODE LIKE ? ";



}
