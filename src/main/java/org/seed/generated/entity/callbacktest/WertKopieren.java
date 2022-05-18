package org.seed.generated.entity.callbacktest;

import org.seed.core.api.CallbackFunction;
import org.seed.core.api.CallbackFunctionContext;
import org.seed.generated.entity.CallBackTest;

public class WertKopieren implements CallbackFunction<CallBackTest> {

	public void call(CallBackTest callbacktest,CallbackFunctionContext context) {
		
		String feld1Wert = callbacktest.getFeld1();
		callbacktest.setFeld2(feld1Wert);
			
	}

}
