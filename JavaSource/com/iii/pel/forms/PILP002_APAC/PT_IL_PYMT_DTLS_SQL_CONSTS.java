package com.iii.pel.forms.PILP002_APAC;

public interface PT_IL_PYMT_DTLS_SQL_CONSTS {
	
	String L_DUP_SERIAL_NO_SQL_C1 = "SELECT 'X' FROM  PT_IL_PYMT_DTLS  WHERE  PD_SR_NO  = ?  AND PD_TXN_TYPE  = ?  AND PD_TXN_SYS_ID  = ? ";
	
	String L_DUP_SERIAL_NO_SQL_C2 = "SELECT 'X' FROM  PT_IL_PYMT_DTLS  WHERE  PD_SR_NO  = ?  AND PD_TXN_TYPE  = ? AND PD_TXN_SYS_ID  = ?  AND ROWID  != ? ";

	String PT_IL_PYMT_DTLS_PRE_INSERT_SQLC1 = "SELECT PIL_PD_SYS_ID.NEXTVAL FROM  DUAL ";
	
	String WHEN_NEW_RECORD_INSTANCE_SQLC1 = "SELECT PD_PAY_MODE FROM PT_IL_PYMT_DTLS AND PD_TXN_SYS_ID = ? ";
	
	String WHEN_NEW_RECORD_INSTANCE_SQLC2 = "SELECT BCSH_CUST_SHARE_PERC FROM  PM_BANK_CHARGE_SETUP_HDR  WHERE  BCSH_PAY_MODE  = ? ";
	
	String WHEN_CREATE_RECORD_SQLC1 = "SELECT PD_PAY_MODE FROM PT_IL_PYMT_DTLS AND PD_TXN_SYS_ID = ? ";
	
	String REF_ID_WHEN_VALIDATE_SQLC1 = "SELECT (DPD_LC_DEP_AMT - DPD_LC_UTIL_AMT) FC_AMT,DPD_CHQ_NO,DPD_CHQ_DT,DPD_BANK_NAME,DPD_BRANCH_NAME,DPD_CC_NO,DPD_CC_NAME,DPD_CC_EXP_DT,DPD_CC_TYPE,DPD_REMARKS FROM  PT_IL_DEPOSIT_PYMT_DTLS  WHERE  DPD_REF_ID  = ? ";
	
	String REF_ID_WHEN_VALIDATE_SQLC2 = "SELECT DECODE(? , 'ENG', BANK_NAME, BANK_NAME_BL) FROM  FM_BANK  WHERE  BANK_CODE  = ? ";
	
	String REF_ID_WHEN_VALIDATE_SQLC3 = "SELECT PD_CUST_NAME,PD_ADDR_01,PD_ADDR_02,PD_ADDR_03 FROM  PT_IL_PYMT_DTLS  WHERE  PD_DPD_REF_ID  = ? ";
	
	String PD_PAID_FOR_WHEN_LIST_CHANGED_SQLC1 = "SELECT NVL(PTP_LC_MIN_AMT, 0),NVL(PTP_LC_MAX_AMT, 0) FROM PM_IL_PROD_TOPUP_PARAM,PT_IL_POLICY WHERE PT_IL_POLICY.POL_PROD_CODE  = PM_IL_PROD_TOPUP_PARAM.PTP_PROD_CODE  AND PT_IL_POLICY.POL_MODE_OF_PYMT  = PM_IL_PROD_TOPUP_PARAM.PTP_MODE_OF_PYMT  AND PT_IL_POLICY.POL_NO  = ? ";
	
	String PD_PAID_FOR_WHEN_LIST_CHANGED_SQLC2 = "SELECT PROD_TOPUP_YN FROM PM_IL_PRODUCT WHERE  PROD_CODE  =  (SELECT POL_PROD_CODE  FROM  PT_IL_POLICY WHERE  POL_NO = ?  ) ";
		
	String PD_PAID_FOR_WHEN_LIST_CHANGED_SQLC3 = "SELECT NVL(POL_NO_YRS_PREM_PAID, 0) FROM  PT_IL_POLICY  WHERE  POL_NO  = ? ";	
	
	String L_DUP_CHQ_NO_SQLC1 = "SELECT 'X' FROM PT_IL_PYMT_DTLS AND PD_BANK_NAME = ? AND PD_PAY_MODE IN ( 'C' , 'D' , 'L' , 'H' , 'O' , 'SD')";
	
	String L_DUP_CHQ_NO_SQLC2 = "SELECT 'X' FROM PT_IL_PYMT_DTLS AND PD_BANK_NAME = ? AND PD_PAY_MODE IN ( 'C' , 'D' , 'L' , 'H' , 'O' , 'SD') AND ROWID != ? "; 
	
	String PD_BANK_NAME_WHEN_VALIDATE_SQLC1 = "SELECT DECODE(?,'ENG', BANK_NAME, BANK_NAME_BL),BANK_BR_CODE FROM FM_BANK WHERE BANK_CODE  = ? ";
	
	
	
	
	
	
	
	
}
