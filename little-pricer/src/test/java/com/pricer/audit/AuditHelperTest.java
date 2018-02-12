/**
 * 
 */
package com.pricer.audit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author fangbe
 *
 */
public class AuditHelperTest {
	
	/**
	 * 
	 */
	@Test
	public void testAddToAuditTrail(){
		try {
			String message = "an audit message";
			String messageAdded = AuditHelper.addToAuditTrail(message);
			Assert.assertEquals(messageAdded, "AUDIT_TRAIL : " + message);
		} catch (AuditException e) {
			Assert.fail(e.getMessage());
		}
	}

}
