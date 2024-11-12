package com.iii.pel.forms.PILT013;

public interface PILT013_QUERYCONSTANTS {

	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_1=" SELECT ASD_CHAR_VALUE FROM PM_IL_APPR_SETUP_DET WHERE ASD_CODE ='SURR_YN' AND   ASD_USER_ID =  ?  AND   ?  BETWEEN NVL( ? ,0) AND NVL( ? ,'zzzzzzzzzzzz')";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_2=" SELECT ASD_NUM_VALUE FROM PM_IL_APPR_SETUP_DET WHERE ASD_CODE ='MAX_SURR_AMT' AND   ASD_USER_ID =  ?  AND   ?  BETWEEN NVL( ? ,0) AND NVL( ? ,'zzzzzzzzzzzz')";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_3=" SELECT POL_CASH_YN FROM   PT_IL_POLICY WHERE  POL_SYS_ID =  ? ";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_4=" SELECT SMV_DATE FROM   PT_IL_SURR_MAT_VALUES WHERE  SMV_POL_SYS_ID =  ? ";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_5=" SELECT SMV_DATE FROM   PT_IL_SURR_MAT_VALUES WHERE  SMV_POL_SYS_ID =  ? ";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_UPDATE_QRY_6="UPDATE PT_IL_SURR_MAT_VALUES SET    SMV_APPRV_FLAG = 'A' WHERE  NVL(SMV_APPRV_FLAG,'N') = 'N' AND    SMV_PAID_DT IS NOT NULL AND    SMV_POL_SYS_ID =  ? ";
	String M_BUT_APPROVE$WHEN_BUTTON_PRESSED_UPDATE_QRY_7="UPDATE PT_IL_SURR_MAT_VALUES SET    SMV_APPRV_FLAG = 'A' WHERE  NVL(SMV_APPRV_FLAG,'N') = 'N' AND    SMV_PAID_DT IS NOT NULL AND    SMV_POL_SYS_ID =  ? ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_1=" SELECT POL_DS_TYPE ,POL_DS_CODE,POL_EXPIRY_DT FROM   PT_IL_POLICY WHERE  POL_SYS_ID =  ? ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_2=" SELECT DS_POST_BO FROM   PM_IL_DOC_SETUP WHERE  DS_TYPE  = M_POL_DS_TYPE1 AND    DS_CODE  = M_POL_DS_CODE1";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_3=" SELECT PLAN_TYPE FROM   PM_IL_PLAN WHERE  PLAN_CODE =M_POL_PLAN_CODE";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_4=" SELECT  SMV_FC_BAL_LOAN,SMV_LC_BAL_LOAN,SMV_LOAN_CODE,SMV_FC_LOAN_INT, SMV_LC_LOAN_INT FROM    PT_IL_SURR_MAT_VALUES WHERE   SMV_POL_SYS_ID =  ?  AND     NVL( ? ,'N') = 'N'";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_5=" SELECT SMV_LC_GROSS_VALUE, SMV_FC_GROSS_VALUE FROM   PT_IL_SURR_MAT_VALUES WHERE  NVL( ? ,'N') = 'P'--CHANGES BY SARVINDER --AND    SMV_PAID_DT@ NOT NULL AND    SMV_POL_SYS_ID =  ? ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_6=" SELECT  PS_VALUE FROM    PP_SYSTEM WHERE   PS_TYPE = 'IL_RND_TYPE'";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_7=" SELECT CONT_PREFERRED_LANG FROM   PM_IL_CONTRACTOR WHERE  CONT_CODE = (SELECT POL_CONT_CODE FROM   PT_IL_POLICY WHERE  POL_SYS_ID =  ?  AND    POL_DS_TYPE = '2') ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_INSERT_QRY_8="INSERT INTO PT_IL_POL_STATUS(PS_POL_SYS_ID, PS_END_NO_IDX, PS_STATUS_DT, PS_STATUS, PS_STATUS_UID, PS_CR_UID, PS_CR_DT, PS_STATUS_TYPE) VALUES ( ? ,M_POL_END_NO_IDX,SYSDATE, 'S02',  ? ,  ? ,SYSDATE,'S')";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_INSERT_QRY_9="INSERT INTO PT_IL_POL_STATUS(PS_POL_SYS_ID, PS_END_NO_IDX, PS_STATUS_DT, PS_STATUS, PS_STATUS_UID, PS_CR_UID, PS_CR_DT, PS_STATUS_TYPE) VALUES(M_POL_SYS_ID,M_POL_END_NO_IDX,SYSDATE, 'M002',  ? ,  ? ,SYSDATE,'S')";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_10="UPDATE PT_IL_SURR_MAT_VALUES SET SMV_LC_CHARGE_AMT= ? , SMV_FC_CHARGE_AMT= ? WHERE SMV_SYS_ID= ? ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_11="UPDATE PT_IL_SURR_MAT_VALUES SET    SMV_APPRV_FLAG          = 'A',SMV_STATUS_CODE         = 'A', SMV_PAID_DT             = SYSDATE, SMV_UPD_DT              = SYSDATE, SMV_UPD_UID             =  ? , SMV_APPRV_UID      =  ? , SMV_APPRV_DT      = SYSDATE WHERE  NVL(SMV_APPRV_FLAG,'N') = 'P' AND    SMV_POL_SYS_ID          =  ? AND    SMV_SYS_ID              = M_SMV_SYS_ID";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_12="UPDATE PT_IL_POLICY SET    POL_STATUS    =  ? , POL_APPRV_STATUS = 'A', POL_END_TYPE  = '003', POL_END_DT    = SYSDATE, POL_PAIDUP_DT = SYSDATE, POL_UPD_DT    = SYSDATE, POL_UPD_UID   =  ? , POL_ADDL_STATUS = 'S02' WHERE  POL_SYS_ID   =  ? ";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_13="UPDATE PT_IL_PREM_COLL SET    PC_PAID_FLAG   = 'Y', PC_PAID_DT     = TRUNC(SYSDATE), PC_FC_PAID_AMT = M_PC_FC_PAID_AMT_1, PC_LC_PAID_AMT = M_PC_LC_PAID_AMT_1 WHERE  PC_POL_SYS_ID  = M_POL_SYS_ID AND    PC_SYS_ID      = M_PC_SYS_ID";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_14="UPDATE PT_IL_SURR_MAT_VALUES SET    SMV_APPRV_FLAG          = 'A',SMV_STATUS_CODE         = 'A', SMV_PAID_DT             = SYSDATE, SMV_UPD_DT              = SYSDATE, SMV_UPD_UID             =  ? , SMV_APPRV_UID       =  ? , SMV_APPRV_DT       = SYSDATE WHERE  NVL(SMV_APPRV_FLAG,'N') = 'P' AND    SMV_POL_SYS_ID          =  ? AND    SMV_SYS_ID              = M_SMV_SYS_ID";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_15="UPDATE PT_IL_POLICY SET    POL_STATUS      = 'M' WHERE  POL_SYS_ID      = M_POL_SYS_ID";
	String M_BUT_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_16="UPDATE PT_IL_PREM_COLL SET    PC_PAID_FLAG = 'Y', PC_PAID_DT  = TRUNC(SYSDATE), PC_FC_PAID_AMT = M_PC_FC_PAID_AMT, PC_LC_PAID_AMT = M_PC_LC_PAID_AMT WHERE  PC_POL_SYS_ID = M_POL_SYS_ID AND    PC_SYS_ID   = M_PC_SYS_ID";
	String M_BUT_REP_POLICY$WHEN_BUTTON_PRESSED_CURSOR_QRY_1=" SELECT POAD_REF_ID1, POAD_REF_ID2 FROM   PT_IL_POL_ASSURED_DTLS WHERE  POAD_POL_SYS_ID =  ?  AND    POAD_TYPE ='R'";
	String M_BUT_RESERVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_1=" SELECT POL_SYS_ID FROM   PT_IL_POLICY WHERE  POL_NO =  ?  AND    POL_DS_TYPE ='2' ";
	String M_BUT_RESERVE$WHEN_BUTTON_PRESSED_CURSOR_QRY_2=" SELECT NVL( ? ,'X') FROM   PT_IL_SURR_MAT_VALUES WHERE  SMV_SYS_ID =  M_SMV_SYS_ID";
	String M_BUT_SURR_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_1=" SELECT ASD_CHAR_VALUE FROM PM_IL_APPR_SETUP_DET WHERE ASD_CODE ='SURR_YN' AND   ASD_USER_ID =  ?  AND   ?  BETWEEN NVL( ? ,0) AND NVL( ? ,'zzzzzzzzzzzz')  ";
	String M_BUT_SURR_OK$WHEN_BUTTON_PRESSED_CURSOR_QRY_2=" SELECT POLH_N_END_CODE,POLH_N_END_TYPE,POLH_N_END_DT,POLH_N_END_EFF_FROM_DT, POLH_N_END_EFF_TO_DT --FROM AND TO DT ADDED BY SIVARAM FROM PH_IL_POLICY WHERE POLH_SYS_ID =  ?  AND POLH_N_END_TYPE <> '003' ORDER BY POLH_N_END_NO_IDX DESC";
	String M_BUT_SURR_OK$WHEN_BUTTON_PRESSED_INSERT_QRY_3="INSERT INTO PT_IL_POL_STATUS(PS_POL_SYS_ID, PS_END_NO_IDX, PS_STATUS_DT, PS_STATUS, PS_STATUS_UID, PS_CR_UID, PS_CR_DT, PS_STATUS_TYPE, PS_REASON_CODE, PS_REMARKS) VALUES( ? ,  ? , SYSDATE,  ? ,  ? ,  ? , SYSDATE, 'S',  ? ,  ? ";
	String M_BUT_SURR_OK$WHEN_BUTTON_PRESSED_UPDATE_QRY_4="UPDATE PT_IL_POLICY SET  POL_STATUS          = 'A', POL_APPRV_STATUS    = 'A', POL_ADDL_STATUS     = 'I00', POL_END_TYPE        = M_POLH_N_END_TYPE, POL_END_DT          = M_POLH_N_END_DT, -- POL_END_NO_IDX   = POL_END_NO_IDX-1, POL_PAIDUP_DT       = NULL, POL_END_EFF_FROM_DT = M_POLH_N_END_EFF_FROM_DT, POL_END_EFF_TO_DT   = M_POLH_N_END_EFF_TO_DT WHERE POL_SYS_ID =  ? ";
	String POST_QUERY_CURSOR_QRY_1=" SELECT DTG_GROUP_DESC FROM PM_IL_DOC_TODO_GROUP WHERE DTG_DS_CODE =  ?  AND DTG_DS_TYPE =   ?  ";
	String PRE_DELETE_DELETE_QRY_1="DELETE  FROM  PT_IL_DOC_TODO_LIST_STATUS P  WHERE  P.DTLS_GROUP_CODE =  ? ";
	String DTLS_SR_NO$WHEN_VALIDATE_ITEM_CURSOR_QRY_1=" SELECT 'X' FROM   PM_IL_DOC_TODO_LIST WHERE  DTL_DS_TYPE =  ?  AND    DTL_DS_CODE =  ?  AND    DTL_DTG_GROUP_CODE =  ?  AND    DTL_SR_NO   =  ? ";
	String DTLS_SR_NO$WHEN_VALIDATE_ITEM_CURSOR_QRY_2=" SELECT DTL_TODO_LIST_ITEM FROM   PM_IL_DOC_TODO_LIST WHERE  DTL_DS_TYPE =  ?  AND    DTL_DS_CODE =  ?  AND    DTL_DTG_GROUP_CODE =  ?  AND    DTL_SR_NO   =  ? ";
	String POST_QUERY_CURSOR_QRY_1_1=" SELECT PLAN_SURR_YRS FROM   PM_IL_PLAN WHERE  PLAN_CODE =  ? ";
	String POST_QUERY_CURSOR_QRY_2=" SELECT POL_CUST_CODE,POL_CASH_YN FROM PT_IL_POLICY WHERE POL_NO =  ? ";
	String SRC_CUST_SHARE_PERC$WHEN_VALIDATE_ITEM_CURSOR_QRY_1=" SELECT  WCS_MIN_VALUE, WCS_MAX_VALUE FROM    PM_IL_WDS_CHARGES_SETUP WHERE   WCS_SETUP_TYPE  = 'S' AND     WCS_FRZ_FLAG    = 'N' AND WCS_CHARGE_CODE=  ?  AND WCS_PROD_CODE=  ? ";
	String SRC_RATE$WHEN_VALIDATE_ITEM_CURSOR_QRY_1=" SELECT  WCS_MIN_VALUE, WCS_MAX_VALUE FROM    PM_IL_WDS_CHARGES_SETUP WHERE   WCS_SETUP_TYPE  = 'S' AND     WCS_FRZ_FLAG    = 'N' AND WCS_CHARGE_CODE=  ?  AND WCS_PROD_CODE=  ? ";
	String SRC_RATE_PER$WHEN_VALIDATE_ITEM_CURSOR_QRY_1=" SELECT  WCS_MIN_VALUE, WCS_MAX_VALUE FROM    PM_IL_WDS_CHARGES_SETUP WHERE   WCS_SETUP_TYPE  = 'S' AND     WCS_FRZ_FLAG    = 'N' AND WCS_CHARGE_CODE=  ?  AND WCS_PROD_CODE=  ? ";


}