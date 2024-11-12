package com.iii.pel.forms.PILQ020;

import java.util.List;

public class PT_IL_PYMT_DTLS2_HELPER {

	public void executeQuery(PILQ020_COMPOSITE_ACTION compositeAction)
			throws Exception {
		new PT_IL_PYMT_DTLS2_DELEGATE().executeSelectStatement(compositeAction);

		List<PT_IL_PYMT_DTLS2> dataList = compositeAction
				.getPT_IL_PYMT_DTLS2_ACTION_BEAN()
				.getDataList_PT_IL_PYMT_DTLS2();
		if (dataList != null && dataList.size() > 0) {
			PT_IL_PYMT_DTLS2 PT_IL_PYMT_DTLS2_BEAN = dataList.get(0);
			PT_IL_PYMT_DTLS2_BEAN.setRowSelected(true);
			compositeAction.getPT_IL_PYMT_DTLS2_ACTION_BEAN()
					.setPT_IL_PYMT_DTLS2_BEAN(PT_IL_PYMT_DTLS2_BEAN);

		}
	}
}