/**
 * 
 */
package com.pricer.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fangbe
 *
 */
public class AuditHelper {
	
	private static Logger logger = LoggerFactory.getLogger(AuditHelper.class);
	

	/**
	 * 
	 */
	public AuditHelper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param message
	 * @return
	 * @throws AuditException
	 */
	public static String addToAuditTrail(String message) throws AuditException {
		try {
			String auditMessage = "AUDIT_TRAIL : " + message;
			logger.info(auditMessage);
			return auditMessage;
		} catch (Exception e) {
			throw new AuditException("Unable to add message to audit trail - " + e.getMessage(), e);
		}
	}

}
