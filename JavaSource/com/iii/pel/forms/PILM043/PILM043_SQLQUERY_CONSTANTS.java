package com.iii.pel.forms.PILM043;

public interface PILM043_SQLQUERY_CONSTANTS {
	
	final String DELETE_PM_IL_FUND_ACCOUNT_SETUP="DELETE * FROM DELETE_PM_IL_FUND_ACCOUNT_SETUP WHERE ROWID ?";
	final String UPDATE_PM_IL_FUND_ACCOUNT_SETUP="UPDATE * FROM DELETE_PM_IL_FUND_ACCOUNT_SETUP WHERE ROWID ?";
	final String SELECT_ALL_PM_IL_RI_POOL_SETUP="select PM_IL_RI_POOL_SETUP.ROWID,RPS_CODE,RPS_DESC,RPS_SHORT_DESC,RPS_LONG_DESC,RPS_EFF_FM_DT,RPS_EFF_TO_DT from PM_IL_RI_POOL_SETUP";
}