package com.iii.pel.forms.PILQ137;


public class PILQ137_COMPOSITE_ACTION {
	
	private PW_IL_AAA_PROCESS_DTLS_ACTION PW_IL_AAA_PROCESS_DTLS_ACTION_BEAN;
	
	public PW_IL_AAA_PROCESS_DTLS_ACTION getPW_IL_AAA_PROCESS_DTLS_ACTION_BEAN() {
		return PW_IL_AAA_PROCESS_DTLS_ACTION_BEAN;
	}

	public void setPW_IL_AAA_PROCESS_DTLS_ACTION_BEAN(
			PW_IL_AAA_PROCESS_DTLS_ACTION pW_IL_AAA_PROCESS_DTLS_ACTION_BEAN) {
		PW_IL_AAA_PROCESS_DTLS_ACTION_BEAN = pW_IL_AAA_PROCESS_DTLS_ACTION_BEAN;
	}

	public PILQ137_COMPOSITE_ACTION(){
		
		PW_IL_AAA_PROCESS_DTLS_ACTION_BEAN=new PW_IL_AAA_PROCESS_DTLS_ACTION();
		
		PW_IL_AAA_PROCESS_DTLS_ACTION_BEAN.compositeAction=this;
	}
	

}
