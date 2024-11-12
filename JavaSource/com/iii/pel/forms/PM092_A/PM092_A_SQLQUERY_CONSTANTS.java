package com.iii.pel.forms.PM092_A;

public interface PM092_A_SQLQUERY_CONSTANTS {
	final String FETCH_ROW_COUNT="25";
	
	final String SELECT_ALL_PM_AGENT_CONTEST = "SELECT ROWID, PM_AGENT_CONTEST_HDR.* " +
			"FROM PM_AGENT_CONTEST_HDR WHERE 1=1";
	
	final String SELECT_PM_AGENT_CONTEST_DTL_BY_ACH_CODE= "SELECT ROWID,PM_AGENT_CONTEST_DTL.* " +
			"FROM PM_AGENT_CONTEST_DTL WHERE ACD_ACH_CODE=?";
	
	final String SELECT_PM_AGENT_CONTEST_APPL_RANK_BY_ACH_CODE="SELECT ROWID,PM_AGENT_CONTEST_APPL_RANK.* " +
			"FROM PM_AGENT_CONTEST_APPL_RANK WHERE ACAR_ACH_CODE=?";
	
	final String LOV_ACAR_RANK_CODE="SELECT PC_CODE,PC_DESC,PC_BL_DESC FROM PM_CODES " +
			"WHERE PC_TYPE = 'AGNRANK' AND ROWNUM <= ?";
	
	final String SELECT_PM_AGENT_CONTEST_AWARD_BY_ACH_CODE="SELECT ROWID,PM_AGENT_CONTEST_AWARD.* " +
			"FROM PM_AGENT_CONTEST_AWARD WHERE ACA_ACH_CODE = ?";
	
	final String LOV_ACA_AWARD_CODE="SELECT PC_CODE,PC_SHORT_DESC FROM PM_CODES " +
			"WHERE PC_TYPE = 'AGT_AWARDS' AND ROWNUM <= ?";
	
	final String DELETE_PM_AGENT_CONTEST_DTL_BY_ACH_CODE= "DELETE FROM PM_AGENT_CONTEST_DTL WHERE " +
			"ACD_ACH_CODE=?";
	
	final String DELETE_PM_AGENT_CONTEST_APPL_RANK_BY_ACH_CODE= "DELETE FROM PM_AGENT_CONTEST_APPL_RANK WHERE " +
			"ACAR_ACH_CODE=?";
	
	final String DELETE_PM_AGENT_CONTEST_AWARD_BY_ACH_CODE= "DELETE FROM PM_AGENT_CONTEST_AWARD WHERE " +
			"ACA_ACH_CODE=?";
	
	final String DELETE_PM_AGENT_CONTEST_DTL_BY_ACH_CODE_IN_PRE_DELETE=
					"DELETE FROM PM_AGENT_CONTEST_DTL P WHERE P.ACD_ACH_CODE = ?";
	
	final String DELETE_PM_AGENT_CONTEST_AWARD_BY_ACH_CODE_IN_PRE_DELETE=
					"DELETE FROM PM_AGENT_CONTEST_AWARD P WHERE P.ACA_ACH_CODE = ?";
	
	final String SELECT_X_FOR_PM_AGENT_CONTEST_DTL_DETAILS=	
			"SELECT 'X' FROM  PM_AGENT_CONTEST_DTL  WHERE" +
			"  ACD_ACH_CODE  = ?  AND ACD_PROD_TYPE  = ? " +
			" AND (((?  BETWEEN ACD_LC_FYC_FM  AND  ACD_LC_FYC_TO)  OR (?  " +
			" BETWEEN ACD_LC_FYC_FM  AND  ACD_LC_FYC_TO))  OR ((ACD_LC_FYC_FM " +
			" BETWEEN ?  AND  ?)  OR (ACD_LC_FYC_TO  BETWEEN ?  AND " +
			" ?)))  AND (((?  BETWEEN ACD_NO_OF_POL_FM  AND  ACD_NO_OF_POL_TO)  OR (? " +
			" BETWEEN ACD_NO_OF_POL_FM  AND  ACD_NO_OF_POL_TO))  OR ((ACD_NO_OF_POL_FM  BETWEEN " +
			" ?  AND  ?)   OR (ACD_NO_OF_POL_TO  BETWEEN ?  AND  ?))) ";
	
	final String SELECT_X_FOR_PM_AGENT_CONTEST_DTL_DETAILS_AND_ROWID=
			"SELECT 'X' FROM  PM_AGENT_CONTEST_DTL  WHERE  ACD_ACH_CODE  " +
			" = ?  AND ACD_PROD_TYPE  = ? AND (((?  BETWEEN ACD_LC_FYC_FM  AND  ACD_LC_FYC_TO)  OR" +
			" (?  BETWEEN ACD_LC_FYC_FM  AND  ACD_LC_FYC_TO))  OR  ((ACD_LC_FYC_FM  BETWEEN ?  AND  ?)  " +
			" OR (ACD_LC_FYC_TO  BETWEEN ?  AND  ?)))  AND (((?  BETWEEN ACD_NO_OF_POL_FM  AND  ACD_NO_OF_POL_TO)  " +
			" OR (?  BETWEEN ACD_NO_OF_POL_FM  AND  ACD_NO_OF_POL_TO)) OR ((ACD_NO_OF_POL_FM  BETWEEN ?  AND  ?)" +
			"  OR (ACD_NO_OF_POL_TO  BETWEEN ?  AND  ?))) AND ROWID  != ? ";
	
	
	final String SELECT_X_FOR_PM_AGENT_CONTEST_APPL_RANK_FOR_ACH_AND_RANK_CODE=
					"SELECT 'X'   FROM   PM_AGENT_CONTEST_APPL_RANK"+
				    " WHERE  ACAR_ACH_CODE = ? AND    ACAR_RANK_CODE = ?";
	
	final String PM092_A$PM_AGENT_CONTEST_HDR$ACH_CODE =
					"SELECT 'X' FROM PM_AGENT_CONTEST_HDR WHERE ACH_CODE = ?";
	
	final String PM092_A$PM_AGENT_CONTEST_AWARD$SELECT_X_FOR_PM_AGENT_CONTEST_AWARD_ACH_AND_AWARD_CODE=
			" SELECT 'X' FROM   PM_AGENT_CONTEST_AWARD   WHERE  ACA_ACH_CODE = ?"+
		    " AND    ACA_AWARD_CODE = ?";
	
	/**
	 * [ BugId:PREMIAGDC-INTERNALFIX-0027 VARUN DM 04-FEB-09 
	 * QUERIES ADDED TO FETCH ROWID FOR ENTERED RECORD DETAILS
	 */
	final String PM092_A$PM_AGENT_CONTEST_AWARD$SELECT_ROWID_FOR_PM_AGENT_CONTEST_AWARD_ACH_AND_AWARD_CODE=
		" SELECT ROWID FROM   PM_AGENT_CONTEST_AWARD   WHERE  ACA_ACH_CODE = ?"+
	    " AND    ACA_AWARD_CODE = ?";
	 
	final String SELECT_ROWID_FOR_PM_AGENT_CONTEST_APPL_RANK_FOR_ACH_AND_RANK_CODE=
		"SELECT ROWID   FROM   PM_AGENT_CONTEST_APPL_RANK"+
	    " WHERE  ACAR_ACH_CODE = ? AND    ACAR_RANK_CODE = ?";
	
	/**
	 * BugId:PREMIAGDC-INTERNALFIX-0027 VARUN DM 04-FEB-09 
	 * QUERIES ADDED TO FETCH ROWID FOR ENTERED RECORD DETAILS]
	 */
}