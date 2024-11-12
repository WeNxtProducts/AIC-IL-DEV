package com.iii.pel.forms.PILM013_APAC;

public interface PM_IL_DOC_DFLT_CHARGE_CONSTANTS {

	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$DDCHG_CODE$P_VAL_CODES$CODE_TYPE="IL_CHARGE";
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$DDCHG_CODE$QUERY="SELECT PC_VALUE FROM  PM_CODES  WHERE  PC_TYPE  = 'IL_CHARGE'  AND PC_CODE  = ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_CHARGE$QUERY1="SELECT 'X' FROM PM_IL_DOC_DFLT_CHARGE" +
			" WHERE  DDCHG_DS_CODE = :?  AND  DDCHG_DS_TYPE = ?" +
			"  AND    DDCHG_CODE    = ?  AND  (NVL(?,'01-JAN-1900')  >= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900')" +
			" OR NVL(?,'01-JAN-1900')  <= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900'))" +
			" AND  NVL(?,'01-JAN-1900')  <= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999') " +
			"AND NVL(?,'31-DEC-2999')  >= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900')" +
			"  AND    (NVL(?,'31-DEC-2999')  <= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999')" +
			"OR NVL(?,'31-DEC-2999')  >= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999'))";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_CHARGE$QUERY2=" SELECT 'X' FROM PM_IL_DOC_DFLT_CHARGE" +
			"  WHERE  DDCHG_DS_CODE = ?" +
			"  AND	   DDCHG_DS_TYPE = ? AND" +
			" DDCHG_CODE    = ? AND" +
			" (NVL(?,'01-JAN-1900')  >= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900')" +
			" OR NVL(?,'01-JAN-1900')  <= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900'))" +
			"  AND    NVL(?,'01-JAN-1900')  <= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999')" +
			"  AND    NVL(?,'31-DEC-2999')  >= NVL(DDCHG_EFF_FM_DT,'01-JAN-1900')" +
			"  AND    (NVL(?,'31-DEC-2999')  <= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999') " +
			"OR NVL(?,'31-DEC-2999')  >= NVL(DDCHG_EFF_TO_DT,'31-DEC-2999'))" +
			"  AND    ROWID <> ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_DFLT_CHARGE1=" SELECT 'X'" +
			" FROM PM_IL_DOC_DFLT_CHARGE WHERE DDCHG_DS_CODE " +
			"= ?  AND DDCHG_DS_TYPE = ?" +
			"  AND   DDCHG_SR_NO   = ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_TODO_LIST1="SELECT 'X' FROM " +
			"PM_IL_DOC_TODO_LIST  WHERE DTL_DS_CODE = ?" +
			"   AND		DTL_DS_TYPE = ? AND" +
			"  DTL_SR_NO   = ?  AND    DTL_DTG_GROUP_CODE = ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_TODO_LIST2=" SELECT 'X'  FROM " +
			"PM_IL_DOC_TODO_LIST  WHERE	DTL_DS_CODE = ?" +
			"  AND		DTL_DS_TYPE = ?  AND  " +
			" DTL_SR_NO   = ?  AND DTL_DTG_GROUP_CODE = ?" +
			"   AND    ROWID <> ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_MED_HIST1="SELECT 'X'  FROM " +
			"	PM_IL_DOC_MED_HIST WHERE DMH_DS_CODE = ?  AND	DMH_DS_TYPE = ?" +
			" AND    DMH_SR_NO   = ?";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_MED_HIST2="SELECT 'X'  FROM " +
			"PM_IL_DOC_MED_HIST WHERE 	DMH_DS_CODE = ? AND DMH_DS_TYPE = ? " +
			"AND    DMH_SR_NO   = ?  AND    ROWID <> ?";
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$L_DUP_SRLNO$PM_IL_DOC_DFLT_CHARGE2=" SELECT 'X' FROM " +
			"PM_IL_DOC_DFLT_CHARGE WHERE DDCHG_DS_CODE = ?  " +
			"AND	DDCHG_DS_TYPE = ?  AND" +
			"  DDCHG_SR_NO   = ? AND   ROWID NOT IN (?)";
	
	String PILM013_APAC$PM_IL_DOC_DFLT_CHARGE$POST_DELETE$QUERY="UPDATE   PM_IL_DOC_DFLT_CHARGE   " +
			" SET DDCHG_SR_NO = DDCHG_SR_NO - 1  WHERE  DDCHG_SR_NO  > ?  AND DDCHG_DS_TYPE  = ? " +
			" AND DDCHG_DS_CODE  = ?";
	
	String MSG$PILM013_APAC = "PILM013_APAC";
	String PILM013_APAC$PM_IL_DOC_SETUP$DFLT_CHARGE = "PM_IL_DOC_DFLT_CHARGE";
	String PILM013_APAC$PM_IL_DOC_SETUP$DDCHG_APPLIED_ON ="PM_IL_DOC_DFLT_CHARGE.DDCHG_APPLIED_ON";
	String PILM013_APAC$PM_IL_DOC_SETUP$DDCHG_APPLY_PERIOD ="PM_IL_DOC_DFLT_CHARGE.DDCHG_APPLY_PERIOD";
	
	/*Modified by Janani on 06.09.2017 for ZBILQC-1732454*/
	/*String QUERY$PILM013_APAC$DFLT_CHRG_CODE="SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_CHARGE' AND NVL(PC_FRZ_FLAG,'N') = 'N' UNION SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE='IL_CHARGE'";
	String QUERY1$PILM013_APAC$DFLT_CHRG_CODE="SELECT PC_CODE,PC_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_CHARGE' AND PC_CODE LIKE ? AND NVL(PC_FRZ_FLAG,'N') = 'N' UNION SELECT PS_CODE,PS_CODE_DESC FROM PP_SYSTEM WHERE PS_TYPE='IL_CHARGE'";*/
	
	String QUERY$PILM013_APAC$DFLT_CHRG_CODE="SELECT DDCHG_CODE, PC_DESC FROM PM_IL_DOC_DFLT_CHARGE, PM_CODES WHERE DDCHG_DS_TYPE = '4' AND DDCHG_DS_CODE = 'CLM' AND PC_TYPE = 'IL_CHARGE' AND PC_CODE = DDCHG_CODE AND ? BETWEEN DDCHG_PROD_CODE_FM AND DDCHG_PROD_CODE_TO";
	String QUERY1$PILM013_APAC$DFLT_CHRG_CODE="SELECT DDCHG_CODE, PC_DESC FROM PM_IL_DOC_DFLT_CHARGE, PM_CODES WHERE DDCHG_DS_TYPE = '4' AND DDCHG_DS_CODE = 'CLM' AND PC_TYPE = 'IL_CHARGE' AND PC_CODE LIKE ? AND PC_CODE = DDCHG_CODE AND ? BETWEEN DDCHG_PROD_CODE_FM AND DDCHG_PROD_CODE_TO";
	
	/*End*/
	
}
