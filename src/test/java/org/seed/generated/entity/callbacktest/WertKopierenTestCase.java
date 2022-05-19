package org.seed.generated.entity.callbacktest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.seed.core.api.CallbackFunctionContext;
import org.seed.generated.entity.CallBackTest;
import org.seed.generated.entity.callbacktest.WertKopieren;


public class WertKopierenTestCase {
	
	private WertKopieren classUnterTest = new WertKopieren();
	
    @Test
    void testCopy() {
    	// Test Data Setup
    	CallBackTest dataMock = new CallBackTest();
    	dataMock.setFeld1("XYZ");
    	dataMock.setFeld2(null);
    	CallbackFunctionContext contextMock = null;
		
    	// invoke tested method
		classUnterTest.call(dataMock, contextMock);
    			
		// check test result
		assertEquals("XYZ", dataMock.getFeld2());
    }
	
}
