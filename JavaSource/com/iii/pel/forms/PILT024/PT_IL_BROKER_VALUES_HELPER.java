package com.iii.pel.forms.PILT024;

import java.util.List;

public class PT_IL_BROKER_VALUES_HELPER {
	public void executeQuery(PILT024_COMPOSITE_ACTION compositeAction)
			throws Exception {
		try {
			new PT_IL_BROKER_VALUES_DELEGATE()
					.executeSelectStatement(compositeAction);
			List<PT_IL_BROKER_VALUES> dataList = compositeAction
					.getPT_IL_BROKER_VALUES_ACTION_BEAN()
					.getDataList_PT_IL_BROKER_VALUES();
			if (dataList != null && dataList.size() > 0) {
				PT_IL_BROKER_VALUES PT_IL_BROKER_VALUES_BEAN = dataList.get(0);
				PT_IL_BROKER_VALUES_BEAN.setRowSelected(true);
				compositeAction.getPT_IL_BROKER_VALUES_ACTION_BEAN()
						.setPT_IL_BROKER_VALUES_BEAN(PT_IL_BROKER_VALUES_BEAN);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}