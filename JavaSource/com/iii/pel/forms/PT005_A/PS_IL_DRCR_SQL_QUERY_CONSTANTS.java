package com.iii.pel.forms.PT005_A;

public interface PS_IL_DRCR_SQL_QUERY_CONSTANTS {

	String PS_IL_DRCR_SERCH_PAGE_SELECT_ALL="SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR";
	String PS_GL_DRCR_SERCH_PAGE_SELECT_ALL="SELECT ROWID,PS_GL_DRCR.* FROM PS_GL_DRCR";
	String PS_GP_DRCR_SERCH_PAGE_SELECT_ALL="SELECT ROWID,PS_GP_DRCR.* FROM PS_GP_DRCR";
	
	//String PS_IL_DRCR_SERCH_PAGE_SELECT_WHERE_POLICY_NO_LIKE="SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR WHERE UPPER(DRCR_POL_NO) LIKE ?";
	//String PS_IL_DRCR_SERCH_PAGE_SELECT_WHERE_POLICY_NO_LIKE="SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR WHERE ROWID = ?";
	String PS_IL_DRCR_SERCH_PAGE_SELECT_WHERE_POLICY_NO_LIKE="SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR ";
	String PS_GL_DRCR_SERCH_PAGE_SELECT_WHERE_POLICY_NO_LIKE="SELECT ROWID,PS_GL_DRCR.* FROM PS_GL_DRCR ";
	String PS_GP_DRCR_SERCH_PAGE_SELECT_WHERE_POLICY_NO_LIKE="SELECT ROWID,PS_GP_DRCR.* FROM PS_GP_DRCR ";

	String PS_IL_DRCR_SEARCH_PAGE_SELECT_DETAILS_FOR_ROWID="SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR WHERE ROWID=?";
	String PS_GL_DRCR_SEARCH_PAGE_SELECT_DETAILS_FOR_ROWID="SELECT ROWID,PS_GL_DRCR.* FROM PS_GL_DRCR WHERE ROWID=?";
	String PS_GP_DRCR_SEARCH_PAGE_SELECT_DETAILS_FOR_ROWID="SELECT ROWID,PS_GP_DRCR.* FROM PS_GP_DRCR WHERE ROWID=?";
	
	String PS_IL_DRCR_POST_QUERY_MAIN_ACNT_NAME=" SELECT MAIN_ACNT_NAME   FROM   FM_MAIN_ACCOUNT   WHERE  MAIN_ACNT_CODE = ?";
	
	String PS_IL_DRCR_POST_QUERY_SUB_ACNT_NAME="SELECT SUB_ACNT_NAME FROM   FM_SUB_ACCOUNT WHERE  SUB_ACNT_CODE =?";
	
	String PS_IL_DRCR_SEARCH_PAGE_SELECT_WHERE_DETAILS_LIKE=
		"SELECT ROWID,PS_IL_DRCR.* FROM PS_IL_DRCR"+ 
		" WHERE NVL(DRCR_POL_NO,'X') LIKE NVL(?,NVL(DRCR_POL_NO,'X')) "+
		" AND NVL(DRCR_CUST_CODE,'X') LIKE NVL(?,NVL(DRCR_CUST_CODE,'X'))"+
		" AND NVL(DRCR_CLAIM_NO,'X') LIKE NVL(?,NVL(DRCR_CLAIM_NO,'X'))"+
		" AND NVL(DRCR_END_NO,'X') LIKE NVL(?,NVL(DRCR_END_NO,'X'))"+
		" AND NVL(DRCR_DOC_NO,1) LIKE NVL(?,NVL(DRCR_DOC_NO,1))";
	String PS_GL_DRCR_SEARCH_PAGE_SELECT_WHERE_DETAILS_LIKE=
		"SELECT ROWID,PS_GL_DRCR.* FROM PS_GL_DRCR"+ 
		" WHERE NVL(DRCR_POL_NO,'X') LIKE NVL(?,NVL(DRCR_POL_NO,'X')) "+
		" AND NVL(DRCR_CUST_CODE,'X') LIKE NVL(?,NVL(DRCR_CUST_CODE,'X'))"+
		" AND NVL(DRCR_CLAIM_NO,'X') LIKE NVL(?,NVL(DRCR_CLAIM_NO,'X'))"+
		" AND NVL(DRCR_END_NO,'X') LIKE NVL(?,NVL(DRCR_END_NO,'X'))"+
		" AND NVL(DRCR_DOC_NO,1) LIKE NVL(?,NVL(DRCR_DOC_NO,1))";
	String PS_GP_DRCR_SEARCH_PAGE_SELECT_WHERE_DETAILS_LIKE=
		"SELECT ROWID,PS_GP_DRCR.* FROM PS_GP_DRCR"+ 
		" WHERE NVL(DRCR_POL_NO,'X') LIKE NVL(?,NVL(DRCR_POL_NO,'X')) "+
		" AND NVL(DRCR_CUST_CODE,'X') LIKE NVL(?,NVL(DRCR_CUST_CODE,'X'))"+
		" AND NVL(DRCR_CLAIM_NO,'X') LIKE NVL(?,NVL(DRCR_CLAIM_NO,'X'))"+
		" AND NVL(DRCR_END_NO,'X') LIKE NVL(?,NVL(DRCR_END_NO,'X'))"+
		" AND NVL(DRCR_DOC_NO,1) LIKE NVL(?,NVL(DRCR_DOC_NO,1))";
}