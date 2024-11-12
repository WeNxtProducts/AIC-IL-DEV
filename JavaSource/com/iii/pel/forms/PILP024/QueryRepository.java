package com.iii.pel.forms.PILP024;

public interface QueryRepository {
	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Mallika.S, 31-Mar-2009 */
String PM_IL_BANK_ACCOUNT_SETUP_DIVISION_LOV = "SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION";
String PM_IL_BANK_ACCOUNT_SETUP_DIVISION_LOV_LIKE = "SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE DIVN_CODE LIKE '";
String PM_IL_BANK_ACCOUNT_SETUP_DEPARTMENT_LOV = "SELECT PC_CODE,PC_LONG_DESC,PC_BL_LONG_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_PVOU_DTYP'";
String PM_IL_BANK_ACCOUNT_SETUP_DEPARTMENT_LOV_LIKE ="SELECT PC_CODE,PC_LONG_DESC,PC_BL_LONG_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_PVOU_DTYP' AND PC_CODE LIKE '";
String PM_IL_BANK_ACCOUNT_SETUP_BANK_LOV = "SELECT BANK_CODE,BANK_NAME,BANK_NAME_BL FROM FM_BANK";
String PM_IL_BANK_ACCOUNT_SETUP_BANK_lOV_LIKE ="SELECT BANK_CODE,BANK_NAME,BANK_NAME_BL FROM FM_BANK WHERE BANK_CODE LIKE '";
String PM_IL_BANK_ACCOUNT_SETUP_MAIN_ACCOUNT_CODE_LOV="SELECT MAIN_ACNT_CODE,MAIN_ACNT_NAME,MAIN_BL_ACNT_NAME  FROM FM_MAIN_ACCOUNT  WHERE NVL(MAIN_FRZ_FLAG,'N') = 'N'";
String PM_IL_BANK_ACCOUNT_SETUP_MAIN_ACCOUNT_CODE_LOV_LIKE="SELECT MAIN_ACNT_CODE,MAIN_ACNT_NAME,MAIN_BL_ACNT_NAME  FROM FM_MAIN_ACCOUNT  WHERE NVL(MAIN_FRZ_FLAG,'N') = 'N' AND MAIN_ACNT_CODE LIKE '";
/*String PM_IL_BANK_ACCOUNT_SETUP_SUB_ACCOUNT_LOV="SELECT SUB_ACNT_CODE,SUB_ACNT_NAME,SUB_BL_ACNT_NAME FROM FM_SUB_ACCOUNT WHERE SUB_ACNT_CODE IN"
	+"(SELECT MS_SUB_ACNT_CODE"
	+ "FROM  FM_MAIN_SUB"
	+ "WHERE MS_MAIN_ACNT_CODE = 'temp') AND"
	+ "NVL(SUB_FRZ_FLAG,'N') = 'N'";*/
/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Mallika.S, 31-Mar-2009 */
String PM_IL_BANK_ACCOUNT_SETUP_BRANCH_LOV="SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION";
String PM_IL_BANK_ACCOUNT_SETUP_BRANCH_LOV_LIKE="SELECT DIVN_CODE,DIVN_NAME FROM FM_DIVISION WHERE DIVN_CODE LIKE '";
String PM_IL_BANK_ACCOUNT_SETUP_ANLY_CODE_1="SELECT ANLY_CODE,ANLY_NAME,ANLY_BL_NAME   FROM FM_ANALYSIS  WHERE ANLY_HEAD_NO  = '1' AND NVL(ANLY_FRZ_FLAG,'N') = 'N'";
String PM_IL_BANK_ACCOUNT_SETUP_ANLY_CODE_1_LIKE="SELECT ANLY_CODE,ANLY_NAME,ANLY_BL_NAME   FROM FM_ANALYSIS  WHERE ANLY_HEAD_NO  = '1' AND NVL(ANLY_FRZ_FLAG,'N') = 'N' AND ANLY_CODE LIKE  '";
String PM_IL_BANK_ACCOUNT_SETUP_ANLY_CODE_2="SELECT ANLY_CODE,ANLY_NAME,ANLY_BL_NAME   FROM FM_ANALYSIS  WHERE ANLY_HEAD_NO  = '2' AND NVL(ANLY_FRZ_FLAG,'N') = 'N'";
String PM_IL_BANK_ACCOUNT_SETUP_ANLY_CODE_2_LIKE="SELECT ANLY_CODE,ANLY_NAME,ANLY_BL_NAME   FROM FM_ANALYSIS  WHERE ANLY_HEAD_NO  = '2' AND NVL(ANLY_FRZ_FLAG,'N') = 'N' AND ANLY_CODE LIKE '";
/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DEPARTMENT to FM_DEPARTMENT. Added by : Mallika.S, 31-Mar-2009 */
String PM_IL_BANK_ACCOUNT_SETUP_DEPARTMENT ="SELECT DEPT_CODE,DEPT_NAME,DEPT_BL_NAME FROM FM_DEPARTMENT"
  + " WHERE  DEPT_COMP_CODE = '001' AND DEPT_DIVN_CODE = 'HO' AND DEPT_FRZ_FLAG  = 'N' AND EXISTS"  
  + "(SELECT 1 FROM PM_APPR_DEPT_SETUP WHERE "  
  + " ADS_DIVN_CODE = DEPT_DIVN_CODE AND " 
  + " ADS_DEPT_CODE = DEPT_CODE AND" 
  + " ADS_USER_ID = NVL('LIFEALL',ADS_USER_ID) AND "
  + " ADS_FRZ_FLAG = 'N')";
String sql_C1="SELECT PC_VALUE FROM  PM_CODES  WHERE  PC_CODE  = '";
String PM_IL_BANK_ACCOUNT_SETUP_PRE_INSERT_sql_C1 = "SELECT 1 FROM  PM_IL_BANK_ACCOUNT_SETUP  WHERE  BAS_DIVN_FM_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DIVN_FM_CODE  AND BAS_DIVN_TO_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DIVN_TO_CODE  AND BAS_DEPT_FM_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DEPT_FM_CODE  AND BAS_DEPT_TO_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DEPT_TO_CODE  AND BAS_TXN_TYPE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_TXN_TYPE  AND BAS_SETUP_FOR  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_SETUP_FOR  AND BAS_ASSURED_TYPE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_ASSURED_TYPE  AND NVL(BAS_CUST_BANK_CODE, 'X')  = NVL(:PM_IL_BANK_ACCOUNT_SETUP.BAS_CUST_BANK_CODE, 'X')  AND NVL(BAS_OUR_BANK_CODE, 'X')  = NVL(:PM_IL_BANK_ACCOUNT_SETUP.BAS_OUR_BANK_CODE, 'X')";
String PM_IL_BANK_ACCOUNT_SETUP_PRE_INSERT_sql_C2 ="SELECT 1 FROM  PM_IL_BANK_ACCOUNT_SETUP  WHERE  BAS_DIVN_FM_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DIVN_FM_CODE  AND BAS_DIVN_TO_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DIVN_TO_CODE  AND BAS_DEPT_FM_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DEPT_FM_CODE  AND BAS_DEPT_TO_CODE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_DEPT_TO_CODE  AND BAS_TXN_TYPE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_TXN_TYPE  AND BAS_SETUP_FOR  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_SETUP_FOR  AND BAS_ASSURED_TYPE  = :PM_IL_BANK_ACCOUNT_SETUP.BAS_ASSURED_TYPE  AND NVL(BAS_CUST_BANK_CODE, 'X')  = NVL(:PM_IL_BANK_ACCOUNT_SETUP.BAS_CUST_BANK_CODE, 'X')  AND NVL(BAS_OUR_BANK_CODE, 'X')  = NVL(:PM_IL_BANK_ACCOUNT_SETUP.BAS_OUR_BANK_CODE, 'X')  AND ROWID  <> :PM_IL_BANK_ACCOUNT_SETUP.ROWID ";
String PM_IL_PM_IL_BANK_ACCOUNT_SETUP_POST_QUERY_sql_C1 = "SELECT BANK_NAME FROM  FM_BANK  WHERE  BANK_CODE  ='";
String PM_IL_PM_IL_BANK_ACCOUNT_SETUP_POST_QUERY_sql_C2="SELECT BANK_NAME FROM  FM_BANK  WHERE  BANK_CODE  = '";
}
