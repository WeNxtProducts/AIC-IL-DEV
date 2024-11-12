package com.iii.pel.forms.PILQ111_APAC;

public interface PILQ111_APAC_SQL_QUERY_CONSTANTS {
	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DIVISION to FM_DIVISION. Added by : Mallika.S, 31-Mar-2009 */
	String SELECT_DIVN_CODE_LOV = "SELECT DIVN_CODE, DIVN_NAME, DIVN_BL_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND ROWNUM <= ? ORDER BY DIVN_CODE " ;
	String SELECT_DIVN_CODE_LIKE_LOV = "SELECT DIVN_CODE, DIVN_NAME, DIVN_BL_NAME FROM FM_DIVISION WHERE DIVN_COMP_CODE = ? AND DIVN_CODE LIKE ? AND ROWNUM <= ? ORDER BY DIVN_CODE ";
	
	String SELECT_SEARCH_QUERY = "SELECT ROWID,RIA_PROD_CODE,RIA_COVER_CODE,RIA_TTY_TYPE,RIA_DIVN_CODE,RIA_DEPT_CODE,RIA_FM_DT,RIA_TO_DT FROM PT_IL_RI_ALLOC WHERE RIA_PROD_CODE LIKE NVL(?,RIA_PROD_CODE) AND RIA_COVER_CODE LIKE NVL(?,RIA_COVER_CODE) AND RIA_TTY_TYPE LIKE NVL(?,RIA_TTY_TYPE) AND RIA_DIVN_CODE LIKE NVL(?,RIA_DIVN_CODE) AND RIA_DEPT_CODE LIKE NVL(?,RIA_DEPT_CODE) AND RIA_FM_DT LIKE NVL(?,RIA_FM_DT) AND RIA_TO_DT LIKE NVL(?,RIA_TO_DT) ORDER BY 6";
	//"SELECT ROWID,RIA_DIVN_CODE,RIA_DEPT_CODE,RIA_PROD_CODE,RIA_COVER_CODE,RIA_TTY_TYPE FROM PT_IL_RI_ALLOC WHERE RIA_PROD_CODE LIKE NVL(?,RIA_PROD_CODE) AND RIA_COVER_CODE LIKE NVL(?,RIA_COVER_CODE) AND RIA_TTY_TYPE LIKE NVL(?,RIA_TTY_TYPE)";
	
	String FETCH_RI_ALLOC_RECORDS_QUERY = " SELECT * FROM PT_IL_RI_ALLOC WHERE ROWID = ? ";
	
	String FETCH_RI_CUST_ALLOC_RECORDS_QUERY = " SELECT * FROM PT_IL_RI_PART_CUST_ALLOC WHERE RIPCA_RIA_SYS_ID = ? ";
	/*[BugId:TRACK_PREMIAGDC_GL.10.5-00168: modified PM_DEPARTMENT to FM_DEPARTMENT. Added by : Mallika.S, 31-Mar-2009 */
	String SELECT_DEPT_CODE_LOV = "SELECT DEPT_CODE,DEPT_NAME,DEPT_BL_NAME FROM FM_DEPARTMENT WHERE DEPT_CODE IS NOT NULL AND ROWNUM <= ? ORDER BY DEPT_CODE ";
	
	String SELECT_DEPT_CODE_LIKE_LOV = "SELECT DEPT_CODE,DEPT_NAME,DEPT_BL_NAME FROM FM_DEPARTMENT WHERE DEPT_CODE LIKE ? AND ROWNUM <= ? ORDER BY DEPT_CODE ";
	
	String SELECT_PROD_CODE_LOV = "SELECT PROD_CODE,PROD_DESC,PROD_BL_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE IS NOT NULL AND ROWNUM <= ? ORDER BY PROD_CODE";
	
	String SELECT_PROD_CODE_LIKE_LOV = "SELECT PROD_CODE,PROD_DESC,PROD_BL_DESC FROM PM_IL_PRODUCT WHERE PROD_CODE LIKE ? AND ROWNUM <= ? ORDER BY PROD_CODE";
	
	String SELECT_COVER_CODE_LOV = "SELECT COVER_CODE,COVER_DESC,COVER_BL_DESC FROM PM_IL_COVER WHERE COVER_FRZ_FLAG = 'N' AND ROWNUM <= ? ORDER BY COVER_CODE ";
	
	String SELECT_COVER_CODE_LIKE_LOV = "SELECT COVER_CODE,COVER_DESC,COVER_BL_DESC FROM PM_IL_COVER WHERE COVER_CODE LIKE ? AND COVER_FRZ_FLAG = 'N' AND ROWNUM <= ? ORDER BY COVER_CODE ";
	
	String SELECT_TREATY_TYPE_LOV = "SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES WHERE PC_TYPE = 'IL_TTY_TYP' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ROWNUM <= ? ORDER BY PC_CODE"; 
	
	String SELECT_TREATY_TYPE_LIKE_LOV = "SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES WHERE PC_CODE LIKE ? AND PC_TYPE = 'IL_TTY_TYP' AND NVL(PC_FRZ_FLAG,'N') = 'N' AND ROWNUM <= ? ORDER BY PC_CODE";
	
	
	
	
	
	
	
	
	
	
	
}