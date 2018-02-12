/**
 * 
 */
package com.pricer.little;

import com.pricer.audit.AuditException;
import com.pricer.product.ProductType;
import com.pricer.scheme.ProductNotSupportedException;

/**
 * @author fangbe
 *
 */
public interface Pricer {

	/**
	 * Calculate Price according product type
	 * 
	 * @param productType
	 * @param count
	 * @return
	 * @throws ProductNotSupportedException 
	 * @throws AuditException 
	 */
	double getPrice(ProductType productType, double count) throws ProductNotSupportedException, AuditException;

}
