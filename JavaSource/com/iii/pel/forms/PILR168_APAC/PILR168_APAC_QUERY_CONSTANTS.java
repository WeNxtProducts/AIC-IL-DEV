package com.iii.pel.forms.PILR168_APAC;

public interface PILR168_APAC_QUERY_CONSTANTS {

	
	String DIVISION_QUERY=
		" SELECT DIVN_CODE,DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = '001'" +
		" AND DIVN_FRZ_FLAG = 'N' AND ROWNUM<=? ORDER BY 1 ";
	
	String DIVISION_QUERY_LIKE=
		" SELECT DIVN_CODE,DIVN_NAME FROM PM_DIVISION WHERE DIVN_COMP_CODE = '001'" +
		" AND DIVN_FRZ_FLAG = 'N' AND (DIVN_CODE LIKE ?  OR DIVN_NAME LIKE ?) AND ROWNUM<=? ORDER BY 1 ";
	
	String DEPARTMENT_QUERY=
		" SELECT DEPT_CODE,DEPT_NAME,DEPT_DIVN_CODE FROM PM_DEPARTMENT WHERE DEPT_COMP_CODE = '001' AND " +
		" DEPT_FRZ_FLAG = 'N' AND DEPT_DIVN_CODE BETWEEN ? AND ?  AND ROWNUM<=? ORDER BY 1 ";
	
	String DEPARTMENT_QUERY_LIKE=
		" SELECT DEPT_CODE,DEPT_NAME,DEPT_DIVN_CODE FROM PM_DEPARTMENT WHERE DEPT_COMP_CODE = '001' AND " +
		" DEPT_FRZ_FLAG = 'N' AND DEPT_DIVN_CODE BETWEEN ? AND ?  AND (DEPT_CODE LIKE ? OR DEPT_NAME LIKE ?) AND  ROWNUM<=? ORDER BY 1 ";
	
	String CLASS_QUERY=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE PM_IL_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND ROWNUM <=? ORDER BY 1";

	String CLASS_QUERY_LIKE=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE PM_IL_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND (CLASS_CODE LIKE ? OR CLASS_NAME LIKE ?) AND ROWNUM <=? ORDER BY 1";
	
	String USER_ID_QUERY=
		"SELECT USER_ID, USER_DESC FROM MENU_USER WHERE MENU_USER.USER_FRZ_FLAG = 'N' AND ROWNUM<=? ORDER BY 1";
	
	String USER_ID_QUERY_LIKE=
		" SELECT USER_ID, USER_DESC FROM MENU_USER WHERE MENU_USER.USER_FRZ_FLAG = 'N' AND (USER_ID LIKE ? OR USER_DESC LIKE ?)" +
		" AND ROWNUM<=? ORDER BY 1";


	String BANK_CODE_QUERY=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE PM_IL_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND ROWNUM <=? ORDER BY 1";

	String BANK_CODE_QUERY_LIKE=
		" SELECT CLASS_CODE,CLASS_NAME FROM PM_IL_CLASS WHERE PM_IL_CLASS.CLASS_FRZ_FLAG = 'N' " +
		" AND (CLASS_CODE LIKE ? OR CLASS_NAME LIKE ?) AND ROWNUM <=? ORDER BY 1";

	String POL_NO = "SELECT POL_NO FROM PT_IL_POLICY WHERE ROWNUM<?";
	
	String POL_NO_LIKE = "SELECT POL_NO FROM PT_IL_POLICY WHERE POL_NO LIKE ? AND ROWNUM<?";


}
